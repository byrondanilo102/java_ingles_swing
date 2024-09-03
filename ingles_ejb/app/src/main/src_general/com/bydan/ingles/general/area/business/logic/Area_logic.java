/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.ingles.general.area.business.logic;


import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.Date;
import java.util.Calendar;



import java.util.logging.Logger;


//VALIDACION

import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.ingles.business.entity.GeneralEntityLogic;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.DatoGeneralMaximo;
import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;
import com.bydan.ingles.general.area.util.*;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.util.Area_param_return;
//import com.bydan.ingles.general.area.util.AreaParameterGeneral;
import com.bydan.ingles.general.area.business.entity.Area;
//import com.bydan.ingles.general.area.business.logic.Area_logic_add;
import com.bydan.ingles.general.area.business.data.*;
import com.bydan.ingles.general.area.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.business.data.VerboIrregular_data;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.data.Expresion_data;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.business.data.Diccionario_data;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.VerboCompuesto_data;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.subarea.util.SubArea_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;

//REL DETALLES


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;










@SuppressWarnings({"unused"})
public class Area_logic  extends GeneralEntityLogic implements Area_logicI {
	static Logger logger = Logger.getLogger("Area_logic.class");	

	protected Area_data areaDataAccess; 	
	protected Area area;
	protected List<Area> areas;
	protected Object areaObject;	
	protected List<Object> areasObject;
	
	public ArrayList<Object> invalidValues=new ArrayList<Object>();
	
	public StringBuilder stringBuilder=new StringBuilder();
	public Boolean conMostrarMensajesStringBuilder=true;
		
	/*
	protected ArrayList<DatoGeneral> arrDatoGeneral;
	protected Connexion connexion;
	protected DatosCliente datosCliente;
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected EntityManagerFactory entityManagerFactory;
	
	protected DatosDeep datosDeep;
	protected Boolean isConDeep=false;
	*/
	
	
	
	
	
	
	public Area_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.areaDataAccess = new Area_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Area_data.ActualizarQueries();
			
			//this.areaDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.areas= new ArrayList<Area>();
			this.area= new Area();
			
			this.areaObject=new Object();
			this.areasObject=new ArrayList<Object>();
				
			/*
			this.connexion=new Connexion();
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.areaDataAccess.setConnexionType(this.connexionType);
			this.areaDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Area_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.areaDataAccess = new Area_data();
			this.areas= new ArrayList<Area>();
			this.area= new Area();
			this.areaObject=new Object();
			this.areasObject=new ArrayList<Object>();
			
			/*
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.areaDataAccess.setConnexionType(this.connexionType);
			this.areaDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Area getArea() throws Exception {	
		//Area_logic_add.checkAreaToGet(area,this.datosCliente,this.arrDatoGeneral);
		//Area_logic_add.updateAreaToGet(area,this.arrDatoGeneral);
		
		return area;
	}
	
	public List<Area> getAreas() throws Exception {		
		if(this.areas==null) {
			this.areas= new ArrayList<Area>();
		}
		
		this.quitarsNulos();
		
		//Area_logic_add.checkAreaToGets(areas,this.datosCliente,this.arrDatoGeneral);
		
		for (Area areaLocal: areas ) {
			//Area_logic_add.updateAreaToGet(areaLocal,this.arrDatoGeneral);
		}
		
		return areas;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.areaDataAccess!=null) {
			this.areaDataAccess.setDatosCliente(datosCliente);
		}
	}
			
	public void setDatosDeepParametros(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String strTituloMensaje) {
		this.datosDeep.setIsDeep(isDeep);
		this.datosDeep.setDeepLoadType(deepLoadType);
		this.datosDeep.setClases(clases);
		this.datosDeep.setSTituloMensaje(strTituloMensaje);
	}
	
			
	
	public void getNewConnexionToDeep()throws Exception {
		//this.getNewConnexionToDeep();
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,"");
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void getNewConnexionToDeep(String sDetalle)throws Exception {
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,sDetalle);
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void commitNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.commit();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void rollbackNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.rollback();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void closeNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.close();
			}
			
		} 
		catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} 
		catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void executeQueryWithConnection(String sQueryExecute) throws Exception {
		try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			areaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void executeQuery(String sQueryExecute) throws Exception {
		try {			
			areaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		area = new  Area();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			area=areaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntity(Long id) throws Exception {
		area = new  Area();
		  		  
        try {
			
			area=areaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		area = new  Area();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			area=areaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntityWithConnection(String sFinalQuery) throws Exception {
		area = new  Area();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntityWithConnection(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
					
		}
	}
	
	public void getEntity(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		area = new  Area();
		  		  
        try {
			
			area=areaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		area = new  Area();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntity(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =areaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMinimo;
	}
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=areaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =areaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=areaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =areaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMaximos;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		area = new  Area();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=areaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
	}
	
	public void getEntitiesWithConnection(String sFinalQuery)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntitiesWithConnection(queryWhereSelectParameters);    	       	 
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
		}
	}
	
	public void getEntities(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntities(queryWhereSelectParameters);    	       	 			
		
		} catch(Exception e) {	
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntitiesWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	/**
	* Trae cualquier tipo de query select
	* @conMapGenerico  Si es true, trae todo como objeto generico, Si es false trae query en campos de la clase, usando unicamente los determinados en listColumns y deepLoadType
	* @deepLoadType  Si conMapGenerico es false trae query select con las columnas de listColumns, incluyento o excludendo deacuerdo a deepLoadType
	*/
	public void getEntitiesWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		areas = new  ArrayList<Area>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		areas = new  ArrayList<Area>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		area = new  Area();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			area=areaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(area);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntity(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		area = new  Area();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			area=areaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(area);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntitiesSimpleQueryBuild(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		areas = new  ArrayList<Area>();
		  		  
        try {
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		areas = new  ArrayList<Area>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {	
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}		
	}
	
	public void  getTodos(String sFinalQuery,Pagination pagination)throws Exception {
		areas = new  ArrayList<Area>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			areas=areaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(areas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Area area) throws Exception {
		Boolean estaValidado=false;
		
		if(area.getIsNew() || area.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Area> Areas) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Area areaLocal:areas) {				
			estaValidadoObjeto=this.validarGuardar(areaLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Area> Areas) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(areas)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Area Area) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(area)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Area area) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+area.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"area","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Area_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Area_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Area_logic_add.checkAreaToSave(this.area,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Area_logic_add.updateAreaToSave(this.area,this.arrDatoGeneral);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.area,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Area_util.permiteMantenimiento(this.area) && this.validarGuardar(this.area)) {
				Area_data.save(this.area, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Area_util.refrescarFKsDescripciones(this.area);				
			}

			//Area_logic_add.checkAreaToSaveAfter(this.area,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.area.getIsDeleted()) {
				this.area=null;
			}
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void save()throws Exception {	
		try {	
			
			//Area_logic_add.checkAreaToSave(this.area,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Area_logic_add.updateAreaToSave(this.area,this.arrDatoGeneral);
			
			Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.area,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Area_util.permiteMantenimiento(this.area) && this.validarGuardar(this.area)) {			
				Area_data.save(this.area, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.area,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Area_util.refrescarFKsDescripciones(this.area);				
			}
			
			//Area_logic_add.checkAreaToSaveAfter(this.area,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.area.getIsDeleted()) {
				this.area=null;
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void savesWithConnection()throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Area_logic_add.checkAreaToSaves(areas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosArea=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Area areaLocal:areas) {		
				
				if(!Area_util.permiteMantenimiento(areaLocal)) {
					continue;
				}
				
				//Area_logic_add.updateAreaToSave(areaLocal,this.arrDatoGeneral);
	        	
				Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),areaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(areaLocal)) {
					Area_data.save(areaLocal, connexion);				
				} else {
					validadoTodosArea=false;
				}
			}
			
			if(!validadoTodosArea) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}
			
			//Area_logic_add.checkAreaToSavesAfter(areas,this.datosCliente,connexion,this.arrDatoGeneral);
					
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRows();
			
			this.connexion.commit();		
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void saves()throws Exception {				
		 try {	
			//Area_logic_add.checkAreaToSaves(areas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosArea=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Area areaLocal:areas) {				
				if(!Area_util.permiteMantenimiento(areaLocal)) {
					continue;
				}
				
				//Area_logic_add.updateAreaToSave(areaLocal,this.arrDatoGeneral);
	        	
				Area_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),areaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(areaLocal)) {				
					Area_data.save(areaLocal, connexion);				
				} else {
					validadoTodosArea=false;
				}
			}
			
			if(!validadoTodosArea) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Area_util.refrescarFKsDescripciones(this.areas);
			}

			//Area_logic_add.checkAreaToSavesAfter(areas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Area_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Area> areas,Area_param_return areaParameterGeneral)throws Exception {
		 try {	
			Area_param_return areaReturnGeneral=new Area_param_return();
	
			
			return areaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Area_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Area> areas,Area_param_return areaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Area_param_return areaReturnGeneral=new Area_param_return();
	
			
			this.connexion.commit();
			
			return areaReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Area_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Area> areas,Area area,Area_param_return areaParameterGeneral,Boolean isEsNuevoArea,ArrayList<Classe> clases)throws Exception {
		 try {	
			Area_param_return areaReturnGeneral=new Area_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				areaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return areaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Area_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Area> areas,Area area,Area_param_return areaParameterGeneral,Boolean isEsNuevoArea,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Area_param_return areaReturnGeneral=new Area_param_return();
	
			areaReturnGeneral.setArea(area);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				areaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return areaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Area_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Area_param_return areaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Area_param_return areaReturnGeneral=new Area_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.areas=new ArrayList<Area>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.area=new Area();
				
				
				if(conColumnasBase) {this.area.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.area.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.area.setnombre(arrColumnas[iColumn++]);
				
				this.areas.add(this.area);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			areaReturnGeneral.setConRetornoEstaProcesado(true);
			areaReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return areaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Area> areasAux= new ArrayList<Area>();
		
		for(Area area:areas) {
			if(!area.getIsDeleted()) {
				areasAux.add(area);
			}
		}
		
		areas=areasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Area> areasAux= new ArrayList<Area>();
		
		for(Area area : this.areas) {
			if(area==null) {
				areasAux.add(area);
			}
		}
		
		//this.areas=areasAux;
		
		this.areas.removeAll(areasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(area.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((area.getIsDeleted() || (area.getIsChanged()&&!area.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=areaDataAccess.getSetVersionRow(connexion,area.getId());
				
				if(!area.getVersionRow().equals(timestamp)) {	
					area.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				area.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(area.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((area.getIsDeleted() || (area.getIsChanged()&&!area.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=areaDataAccess.getSetVersionRow(connexion,area.getId());
			
			try {							
				if(!area.getVersionRow().equals(timestamp)) {	
					area.setVersionRow(timestamp);
				}
				
				area.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(areas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Area areaAux:areas) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(areaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(areaAux.getIsDeleted() || (areaAux.getIsChanged()&&!areaAux.getIsNew())) {
						
						timestamp=areaDataAccess.getSetVersionRow(connexion,areaAux.getId());
						
						if(!area.getVersionRow().equals(timestamp)) {	
							areaAux.setVersionRow(timestamp);
						}
								
						areaAux.setIsChangedAuxiliar(false);														
					//}
				}
				
				this.connexion.commit();									
				
			} catch(Exception e) {
				this.connexion.rollback();							
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRows()throws Exception {	
		if(areas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Area areaAux:areas) {
					if(areaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(areaAux.getIsDeleted() || (areaAux.getIsChanged()&&!areaAux.getIsNew())) {
						
						timestamp=areaDataAccess.getSetVersionRow(connexion,areaAux.getId());
						
						if(!areaAux.getVersionRow().equals(timestamp)) {	
							areaAux.setVersionRow(timestamp);
						}
						
													
						areaAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VerboIrregular_logic verboirregularLogic=new VerboIrregular_logic();
			Expresion_logic expresionLogic=new Expresion_logic();
			Diccionario_logic diccionarioLogic=new Diccionario_logic();
			VerboCompuesto_logic verbocompuestoLogic=new VerboCompuesto_logic();
			SubArea_logic subareaLogic=new SubArea_logic();
			Vocabulario_logic vocabularioLogic=new Vocabulario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Area.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyAreaWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VerboIrregular.class));
			classes.add(new Classe(Expresion.class));
			classes.add(new Classe(Diccionario.class));
			classes.add(new Classe(VerboCompuesto.class));
			classes.add(new Classe(SubArea.class));
			classes.add(new Classe(Vocabulario.class));
											
			

			verboirregularLogic.setConnexion(this.getConnexion());
			verboirregularLogic.setDatosCliente(this.datosCliente);
			verboirregularLogic.setIsConRefrescarForeignKeys(true);

			expresionLogic.setConnexion(this.getConnexion());
			expresionLogic.setDatosCliente(this.datosCliente);
			expresionLogic.setIsConRefrescarForeignKeys(true);

			diccionarioLogic.setConnexion(this.getConnexion());
			diccionarioLogic.setDatosCliente(this.datosCliente);
			diccionarioLogic.setIsConRefrescarForeignKeys(true);

			verbocompuestoLogic.setConnexion(this.getConnexion());
			verbocompuestoLogic.setDatosCliente(this.datosCliente);
			verbocompuestoLogic.setIsConRefrescarForeignKeys(true);

			subareaLogic.setConnexion(this.getConnexion());
			subareaLogic.setDatosCliente(this.datosCliente);
			subareaLogic.setIsConRefrescarForeignKeys(true);

			vocabularioLogic.setConnexion(this.getConnexion());
			vocabularioLogic.setDatosCliente(this.datosCliente);
			vocabularioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Area area:this.areas) {
				

				classes=new ArrayList<Classe>();
				classes=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verboirregularLogic.setVerboIrregulars(area.verboirregulars);
				verboirregularLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				expresionLogic.setExpresions(area.expresions);
				expresionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Diccionario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				diccionarioLogic.setDiccionarios(area.diccionarios);
				diccionarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verbocompuestoLogic.setVerboCompuestos(area.verbocompuestos);
				verbocompuestoLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=SubArea_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				subareaLogic.setSubAreas(area.subareas);
				subareaLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				vocabularioLogic.setVocabularios(area.vocabularios);
				vocabularioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
	}
	
	public void deepLoad(Area area,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Area_logic_add.updateAreaToGet(area,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));
		area.setExpresions(areaDataAccess.getExpresions(connexion,area));
		area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));
		area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));
		area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));
		area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));

				if(this.isConDeep) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(this.connexion);
					verboirregularLogic.setVerboIrregulars(area.getVerboIrregulars());
					ArrayList<Classe> classesLocal=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verboirregularLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboIrregular_util.refrescarFKsDescripciones(verboirregularLogic.getVerboIrregulars());
					area.setVerboIrregulars(verboirregularLogic.getVerboIrregulars());
				}

				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setExpresions(areaDataAccess.getExpresions(connexion,area));

				if(this.isConDeep) {
					Expresion_logic expresionLogic= new Expresion_logic(this.connexion);
					expresionLogic.setExpresions(area.getExpresions());
					ArrayList<Classe> classesLocal=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					expresionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Expresion_util.refrescarFKsDescripciones(expresionLogic.getExpresions());
					area.setExpresions(expresionLogic.getExpresions());
				}

				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));

				if(this.isConDeep) {
					Diccionario_logic diccionarioLogic= new Diccionario_logic(this.connexion);
					diccionarioLogic.setDiccionarios(area.getDiccionarios());
					ArrayList<Classe> classesLocal=Diccionario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					diccionarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Diccionario_util.refrescarFKsDescripciones(diccionarioLogic.getDiccionarios());
					area.setDiccionarios(diccionarioLogic.getDiccionarios());
				}

				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));

				if(this.isConDeep) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(this.connexion);
					verbocompuestoLogic.setVerboCompuestos(area.getVerboCompuestos());
					ArrayList<Classe> classesLocal=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verbocompuestoLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboCompuesto_util.refrescarFKsDescripciones(verbocompuestoLogic.getVerboCompuestos());
					area.setVerboCompuestos(verbocompuestoLogic.getVerboCompuestos());
				}

				continue;
			}

			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));

				if(this.isConDeep) {
					SubArea_logic subareaLogic= new SubArea_logic(this.connexion);
					subareaLogic.setSubAreas(area.getSubAreas());
					ArrayList<Classe> classesLocal=SubArea_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					subareaLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					SubArea_util.refrescarFKsDescripciones(subareaLogic.getSubAreas());
					area.setSubAreas(subareaLogic.getSubAreas());
				}

				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));

				if(this.isConDeep) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(this.connexion);
					vocabularioLogic.setVocabularios(area.getVocabularios());
					ArrayList<Classe> classesLocal=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					vocabularioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Vocabulario_util.refrescarFKsDescripciones(vocabularioLogic.getVocabularios());
					area.setVocabularios(vocabularioLogic.getVocabularios());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregular.class));
			area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Expresion.class));
			area.setExpresions(areaDataAccess.getExpresions(connexion,area));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Diccionario.class));
			area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuesto.class));
			area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(SubArea.class));
			area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Vocabulario.class));
			area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));

		for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
		}

		area.setExpresions(areaDataAccess.getExpresions(connexion,area));

		for(Expresion expresion:area.getExpresions()) {
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
		}

		area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));

		for(Diccionario diccionario:area.getDiccionarios()) {
			Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
			diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
		}

		area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));

		for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
		}

		area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));

		for(SubArea subarea:area.getSubAreas()) {
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subareaLogic.deepLoad(subarea,isDeep,deepLoadType,clases);
		}

		area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));

		for(Vocabulario vocabulario:area.getVocabularios()) {
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));

				for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
					verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setExpresions(areaDataAccess.getExpresions(connexion,area));

				for(Expresion expresion:area.getExpresions()) {
					Expresion_logic expresionLogic= new Expresion_logic(connexion);
					expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));

				for(Diccionario diccionario:area.getDiccionarios()) {
					Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
					diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));

				for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
					verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));

				for(SubArea subarea:area.getSubAreas()) {
					SubArea_logic subareaLogic= new SubArea_logic(connexion);
					subareaLogic.deepLoad(subarea,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));

				for(Vocabulario vocabulario:area.getVocabularios()) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
					vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregular.class));
			area.setVerboIrregulars(areaDataAccess.getVerboIrregulars(connexion,area));

			for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
				VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
				verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Expresion.class));
			area.setExpresions(areaDataAccess.getExpresions(connexion,area));

			for(Expresion expresion:area.getExpresions()) {
				Expresion_logic expresionLogic= new Expresion_logic(connexion);
				expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Diccionario.class));
			area.setDiccionarios(areaDataAccess.getDiccionarios(connexion,area));

			for(Diccionario diccionario:area.getDiccionarios()) {
				Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
				diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuesto.class));
			area.setVerboCompuestos(areaDataAccess.getVerboCompuestos(connexion,area));

			for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
				VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
				verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(SubArea.class));
			area.setSubAreas(areaDataAccess.getSubAreas(connexion,area));

			for(SubArea subarea:area.getSubAreas()) {
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepLoad(subarea,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Vocabulario.class));
			area.setVocabularios(areaDataAccess.getVocabularios(connexion,area));

			for(Vocabulario vocabulario:area.getVocabularios()) {
				Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
				vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Area area,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Area_logic_add.updateAreaToSave(area,this.arrDatoGeneral);
			
Area_data.save(area, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
			verboirregular.setid_area(area.getId());
			VerboIrregular_data.save(verboirregular,connexion);
		}

		for(Expresion expresion:area.getExpresions()) {
			expresion.setid_area(area.getId());
			Expresion_data.save(expresion,connexion);
		}

		for(Diccionario diccionario:area.getDiccionarios()) {
			diccionario.setid_area(area.getId());
			Diccionario_data.save(diccionario,connexion);
		}

		for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
			verbocompuesto.setid_area(area.getId());
			VerboCompuesto_data.save(verbocompuesto,connexion);
		}

		for(SubArea subarea:area.getSubAreas()) {
			subarea.setid_area(area.getId());
			SubArea_data.save(subarea,connexion);
		}

		for(Vocabulario vocabulario:area.getVocabularios()) {
			vocabulario.setid_area(area.getId());
			Vocabulario_data.save(vocabulario,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
					verboirregular.setid_area(area.getId());
					VerboIrregular_data.save(verboirregular,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Expresion expresion:area.getExpresions()) {
					expresion.setid_area(area.getId());
					Expresion_data.save(expresion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Diccionario diccionario:area.getDiccionarios()) {
					diccionario.setid_area(area.getId());
					Diccionario_data.save(diccionario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
					verbocompuesto.setid_area(area.getId());
					VerboCompuesto_data.save(verbocompuesto,connexion);
				}
				continue;
			}

			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(SubArea subarea:area.getSubAreas()) {
					subarea.setid_area(area.getId());
					SubArea_data.save(subarea,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Vocabulario vocabulario:area.getVocabularios()) {
					vocabulario.setid_area(area.getId());
					Vocabulario_data.save(vocabulario,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregular.setid_area(area.getId());
			VerboIrregular_data.save(verboirregular,connexion);
			verboirregularLogic.deepSave(verboirregular,isDeep,deepLoadType,clases);
		}

		for(Expresion expresion:area.getExpresions()) {
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresion.setid_area(area.getId());
			Expresion_data.save(expresion,connexion);
			expresionLogic.deepSave(expresion,isDeep,deepLoadType,clases);
		}

		for(Diccionario diccionario:area.getDiccionarios()) {
			Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
			diccionario.setid_area(area.getId());
			Diccionario_data.save(diccionario,connexion);
			diccionarioLogic.deepSave(diccionario,isDeep,deepLoadType,clases);
		}

		for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuesto.setid_area(area.getId());
			VerboCompuesto_data.save(verbocompuesto,connexion);
			verbocompuestoLogic.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
		}

		for(SubArea subarea:area.getSubAreas()) {
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subarea.setid_area(area.getId());
			SubArea_data.save(subarea,connexion);
			subareaLogic.deepSave(subarea,isDeep,deepLoadType,clases);
		}

		for(Vocabulario vocabulario:area.getVocabularios()) {
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabulario.setid_area(area.getId());
			Vocabulario_data.save(vocabulario,connexion);
			vocabularioLogic.deepSave(vocabulario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregular verboirregular:area.getVerboIrregulars()) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
					verboirregular.setid_area(area.getId());
					VerboIrregular_data.save(verboirregular,connexion);
					verboirregularLogic.deepSave(verboirregular,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Expresion expresion:area.getExpresions()) {
					Expresion_logic expresionLogic= new Expresion_logic(connexion);
					expresion.setid_area(area.getId());
					Expresion_data.save(expresion,connexion);
					expresionLogic.deepSave(expresion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Diccionario diccionario:area.getDiccionarios()) {
					Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
					diccionario.setid_area(area.getId());
					Diccionario_data.save(diccionario,connexion);
					diccionarioLogic.deepSave(diccionario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuesto verbocompuesto:area.getVerboCompuestos()) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
					verbocompuesto.setid_area(area.getId());
					VerboCompuesto_data.save(verbocompuesto,connexion);
					verbocompuestoLogic.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(SubArea.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(SubArea subarea:area.getSubAreas()) {
					SubArea_logic subareaLogic= new SubArea_logic(connexion);
					subarea.setid_area(area.getId());
					SubArea_data.save(subarea,connexion);
					subareaLogic.deepSave(subarea,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Vocabulario vocabulario:area.getVocabularios()) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
					vocabulario.setid_area(area.getId());
					Vocabulario_data.save(vocabulario,connexion);
					vocabularioLogic.deepSave(vocabulario,isDeep,deepLoadType,clases);
				}
				continue;
			}
		}
	}

	}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Area.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(area,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Area_util.refrescarFKsDescripciones(area);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoad(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.deepLoad(this.area,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Area_util.refrescarFKsDescripciones(this.area);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Area.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(areas!=null) {
				for(Area area:areas) {
					this.deepLoad(area,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Area_util.refrescarFKsDescripciones(areas);
				}
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoads(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			if(areas!=null) {
				for(Area area:areas) {
					this.deepLoad(area,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Area_util.refrescarFKsDescripciones(areas);
				}	
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
		
	public void deepSaveWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			this.getNewConnexionToDeep(Area.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(area,isDeep,deepLoadType,clases);	
			
			this.connexion.commit();
		} catch(Exception e) {			
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSavesWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			this.getNewConnexionToDeep(Area.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(areas!=null) {
				for(Area area:areas) {
					this.deepSave(area,isDeep,deepLoadType,clases);
				}
			}
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		}finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSaves(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			if(areas!=null) {
				for(Area area:areas) {
					this.deepSave(area,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Area_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,AreaDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Area area,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Area_util.IS_CON_AUDITORIA) {
				if(area.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AreaDataAccess.TABLENAME, area.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Area_util.IS_CON_AUDITORIA_DETALLE) {
						////Area_logic.registrarAuditoriaDetalles(connexion,area,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(area.getIsDeleted()) {
					/*if(!area.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,AreaDataAccess.TABLENAME, area.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Area_logic.registrarAuditoriaDetalles(connexion,area,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AreaDataAccess.TABLENAME, area.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(area.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AreaDataAccess.TABLENAME, area.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Area_util.IS_CON_AUDITORIA_DETALLE) {
						////Area_logic.registrarAuditoriaDetalles(connexion,area,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Area area)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(area.getIsNew()||!area.getnombre().equals(area.getAreaOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(area.getAreaOriginal().getnombre()!=null)
				{
					strValorActual=area.getAreaOriginal().getnombre();
				}
				if(area.getnombre()!=null)
				{
					strValorNuevo=area.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AreaConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Area area,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<Diccionario> diccionarios,List<VerboCompuesto> verbocompuestos,List<SubArea> subareas,List<Vocabulario> vocabularios) throws Exception {

		if(!area.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(area,verboirregulars,expresions,diccionarios,verbocompuestos,subareas,vocabularios,true);
		}
	}

	public void saveRelaciones(Area area,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<Diccionario> diccionarios,List<VerboCompuesto> verbocompuestos,List<SubArea> subareas,List<Vocabulario> vocabularios)throws Exception {

		if(!area.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(area,verboirregulars,expresions,diccionarios,verbocompuestos,subareas,vocabularios,false);
		}
	}

	public void saveRelacionesBase(Area area,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<Diccionario> diccionarios,List<VerboCompuesto> verbocompuestos,List<SubArea> subareas,List<Vocabulario> vocabularios,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Area-saveRelacionesWithConnection");}
	
			area.setVerboIrregulars(verboirregulars);
			area.setExpresions(expresions);
			area.setDiccionarios(diccionarios);
			area.setVerboCompuestos(verbocompuestos);
			area.setSubAreas(subareas);
			area.setVocabularios(vocabularios);

			this.setArea(area);

			if(true) {

				//Area_logic_add.updateRelacionesToSave(area,this);

				if((area.getIsNew()||area.getIsChanged())&&!area.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(verboirregulars,expresions,diccionarios,verbocompuestos,subareas,vocabularios);

				} else if(area.getIsDeleted()) {
					this.saveRelacionesDetalles(verboirregulars,expresions,diccionarios,verbocompuestos,subareas,vocabularios);
					this.save();
				}

				//Area_logic_add.updateRelacionesToSaveAfter(area,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			VerboIrregular_util.InicializarGeneralEntityAuxiliares(verboirregulars,true,true);
			Expresion_util.InicializarGeneralEntityAuxiliares(expresions,true,true);
			Diccionario_util.InicializarGeneralEntityAuxiliares(diccionarios,true,true);
			VerboCompuesto_util.InicializarGeneralEntityAuxiliares(verbocompuestos,true,true);
			SubArea_util.InicializarGeneralEntityAuxiliares(subareas,true,true);
			Vocabulario_util.InicializarGeneralEntityAuxiliares(vocabularios,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<Diccionario> diccionarios,List<VerboCompuesto> verbocompuestos,List<SubArea> subareas,List<Vocabulario> vocabularios)throws Exception {
		try {
	

			Long idAreaActual=this.getArea().getId();

			VerboIrregular_logic verboirregularLogic_Desde_Area=new VerboIrregular_logic();
			verboirregularLogic_Desde_Area.setVerboIrregulars(verboirregulars);

			verboirregularLogic_Desde_Area.setConnexion(this.getConnexion());
			verboirregularLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(VerboIrregular verboirregular_Desde_Area:verboirregularLogic_Desde_Area.getVerboIrregulars()) {
				verboirregular_Desde_Area.setid_area(idAreaActual);

				verboirregularLogic_Desde_Area.setVerboIrregular(verboirregular_Desde_Area);
				verboirregularLogic_Desde_Area.save();

				Long idVerboIrregularActual=verboirregular_Desde_Area.getId();

				VerboIrregularDetalle_logic verboirregulardetalleLogic_Desde_VerboIrregular=new VerboIrregularDetalle_logic();

				if(verboirregular_Desde_Area.getVerboIrregularDetalles()==null){
					verboirregular_Desde_Area.setVerboIrregularDetalles(new ArrayList<VerboIrregularDetalle>());
				}

				verboirregulardetalleLogic_Desde_VerboIrregular.setVerboIrregularDetalles(verboirregular_Desde_Area.getVerboIrregularDetalles());

				verboirregulardetalleLogic_Desde_VerboIrregular.setConnexion(this.getConnexion());
				verboirregulardetalleLogic_Desde_VerboIrregular.setDatosCliente(this.datosCliente);

				for(VerboIrregularDetalle verboirregulardetalle_Desde_VerboIrregular:verboirregulardetalleLogic_Desde_VerboIrregular.getVerboIrregularDetalles()) {
					verboirregulardetalle_Desde_VerboIrregular.setid_verbo_irregular(idVerboIrregularActual);
				}

				verboirregulardetalleLogic_Desde_VerboIrregular.saves();
			}


			Expresion_logic expresionLogic_Desde_Area=new Expresion_logic();
			expresionLogic_Desde_Area.setExpresions(expresions);

			expresionLogic_Desde_Area.setConnexion(this.getConnexion());
			expresionLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(Expresion expresion_Desde_Area:expresionLogic_Desde_Area.getExpresions()) {
				expresion_Desde_Area.setid_area(idAreaActual);

				expresionLogic_Desde_Area.setExpresion(expresion_Desde_Area);
				expresionLogic_Desde_Area.save();

				Long idExpresionActual=expresion_Desde_Area.getId();

				ExpresionDetalle_logic expresiondetalleLogic_Desde_Expresion=new ExpresionDetalle_logic();

				if(expresion_Desde_Area.getExpresionDetalles()==null){
					expresion_Desde_Area.setExpresionDetalles(new ArrayList<ExpresionDetalle>());
				}

				expresiondetalleLogic_Desde_Expresion.setExpresionDetalles(expresion_Desde_Area.getExpresionDetalles());

				expresiondetalleLogic_Desde_Expresion.setConnexion(this.getConnexion());
				expresiondetalleLogic_Desde_Expresion.setDatosCliente(this.datosCliente);

				for(ExpresionDetalle expresiondetalle_Desde_Expresion:expresiondetalleLogic_Desde_Expresion.getExpresionDetalles()) {
					expresiondetalle_Desde_Expresion.setid_expresion(idExpresionActual);
				}

				expresiondetalleLogic_Desde_Expresion.saves();
			}


			Diccionario_logic diccionarioLogic_Desde_Area=new Diccionario_logic();
			diccionarioLogic_Desde_Area.setDiccionarios(diccionarios);

			diccionarioLogic_Desde_Area.setConnexion(this.getConnexion());
			diccionarioLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(Diccionario diccionario_Desde_Area:diccionarioLogic_Desde_Area.getDiccionarios()) {
				diccionario_Desde_Area.setid_area(idAreaActual);
			}

			diccionarioLogic_Desde_Area.saves();

			VerboCompuesto_logic verbocompuestoLogic_Desde_Area=new VerboCompuesto_logic();
			verbocompuestoLogic_Desde_Area.setVerboCompuestos(verbocompuestos);

			verbocompuestoLogic_Desde_Area.setConnexion(this.getConnexion());
			verbocompuestoLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(VerboCompuesto verbocompuesto_Desde_Area:verbocompuestoLogic_Desde_Area.getVerboCompuestos()) {
				verbocompuesto_Desde_Area.setid_area(idAreaActual);

				verbocompuestoLogic_Desde_Area.setVerboCompuesto(verbocompuesto_Desde_Area);
				verbocompuestoLogic_Desde_Area.save();

				Long idVerboCompuestoActual=verbocompuesto_Desde_Area.getId();

				VerboCompuestoDetalle_logic verbocompuestodetalleLogic_Desde_VerboCompuesto=new VerboCompuestoDetalle_logic();

				if(verbocompuesto_Desde_Area.getVerboCompuestoDetalles()==null){
					verbocompuesto_Desde_Area.setVerboCompuestoDetalles(new ArrayList<VerboCompuestoDetalle>());
				}

				verbocompuestodetalleLogic_Desde_VerboCompuesto.setVerboCompuestoDetalles(verbocompuesto_Desde_Area.getVerboCompuestoDetalles());

				verbocompuestodetalleLogic_Desde_VerboCompuesto.setConnexion(this.getConnexion());
				verbocompuestodetalleLogic_Desde_VerboCompuesto.setDatosCliente(this.datosCliente);

				for(VerboCompuestoDetalle verbocompuestodetalle_Desde_VerboCompuesto:verbocompuestodetalleLogic_Desde_VerboCompuesto.getVerboCompuestoDetalles()) {
					verbocompuestodetalle_Desde_VerboCompuesto.setid_verbo_compuesto(idVerboCompuestoActual);
				}

				verbocompuestodetalleLogic_Desde_VerboCompuesto.saves();
			}


			SubArea_logic subareaLogic_Desde_Area=new SubArea_logic();
			subareaLogic_Desde_Area.setSubAreas(subareas);

			subareaLogic_Desde_Area.setConnexion(this.getConnexion());
			subareaLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(SubArea subarea_Desde_Area:subareaLogic_Desde_Area.getSubAreas()) {
				subarea_Desde_Area.setid_area(idAreaActual);

				subareaLogic_Desde_Area.setSubArea(subarea_Desde_Area);
				subareaLogic_Desde_Area.save();

				Long idSubAreaActual=subarea_Desde_Area.getId();

				VerboIrregular_logic verboirregularLogic_Desde_SubArea=new VerboIrregular_logic();

				if(subarea_Desde_Area.getVerboIrregulars()==null){
					subarea_Desde_Area.setVerboIrregulars(new ArrayList<VerboIrregular>());
				}

				verboirregularLogic_Desde_SubArea.setVerboIrregulars(subarea_Desde_Area.getVerboIrregulars());

				verboirregularLogic_Desde_SubArea.setConnexion(this.getConnexion());
				verboirregularLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

				for(VerboIrregular verboirregular_Desde_SubArea:verboirregularLogic_Desde_SubArea.getVerboIrregulars()) {
					verboirregular_Desde_SubArea.setid_sub_area(idSubAreaActual);

					verboirregularLogic_Desde_SubArea.setVerboIrregular(verboirregular_Desde_SubArea);
					verboirregularLogic_Desde_SubArea.save();

					Long idVerboIrregularActual=verboirregular_Desde_SubArea.getId();

					VerboIrregularDetalle_logic verboirregulardetalleLogic_Desde_VerboIrregular=new VerboIrregularDetalle_logic();

					if(verboirregular_Desde_SubArea.getVerboIrregularDetalles()==null){
						verboirregular_Desde_SubArea.setVerboIrregularDetalles(new ArrayList<VerboIrregularDetalle>());
					}

					verboirregulardetalleLogic_Desde_VerboIrregular.setVerboIrregularDetalles(verboirregular_Desde_SubArea.getVerboIrregularDetalles());

					verboirregulardetalleLogic_Desde_VerboIrregular.setConnexion(this.getConnexion());
					verboirregulardetalleLogic_Desde_VerboIrregular.setDatosCliente(this.datosCliente);

					for(VerboIrregularDetalle verboirregulardetalle_Desde_VerboIrregular:verboirregulardetalleLogic_Desde_VerboIrregular.getVerboIrregularDetalles()) {
						verboirregulardetalle_Desde_VerboIrregular.setid_verbo_irregular(idVerboIrregularActual);
					}

					verboirregulardetalleLogic_Desde_VerboIrregular.saves();
				}


				Expresion_logic expresionLogic_Desde_SubArea=new Expresion_logic();

				if(subarea_Desde_Area.getExpresions()==null){
					subarea_Desde_Area.setExpresions(new ArrayList<Expresion>());
				}

				expresionLogic_Desde_SubArea.setExpresions(subarea_Desde_Area.getExpresions());

				expresionLogic_Desde_SubArea.setConnexion(this.getConnexion());
				expresionLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

				for(Expresion expresion_Desde_SubArea:expresionLogic_Desde_SubArea.getExpresions()) {
					expresion_Desde_SubArea.setid_sub_area(idSubAreaActual);

					expresionLogic_Desde_SubArea.setExpresion(expresion_Desde_SubArea);
					expresionLogic_Desde_SubArea.save();
				}


				VerboCompuesto_logic verbocompuestoLogic_Desde_SubArea=new VerboCompuesto_logic();

				if(subarea_Desde_Area.getVerboCompuestos()==null){
					subarea_Desde_Area.setVerboCompuestos(new ArrayList<VerboCompuesto>());
				}

				verbocompuestoLogic_Desde_SubArea.setVerboCompuestos(subarea_Desde_Area.getVerboCompuestos());

				verbocompuestoLogic_Desde_SubArea.setConnexion(this.getConnexion());
				verbocompuestoLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

				for(VerboCompuesto verbocompuesto_Desde_SubArea:verbocompuestoLogic_Desde_SubArea.getVerboCompuestos()) {
					verbocompuesto_Desde_SubArea.setid_sub_area(idSubAreaActual);

					verbocompuestoLogic_Desde_SubArea.setVerboCompuesto(verbocompuesto_Desde_SubArea);
					verbocompuestoLogic_Desde_SubArea.save();
				}


				Vocabulario_logic vocabularioLogic_Desde_SubArea=new Vocabulario_logic();

				if(subarea_Desde_Area.getVocabularios()==null){
					subarea_Desde_Area.setVocabularios(new ArrayList<Vocabulario>());
				}

				vocabularioLogic_Desde_SubArea.setVocabularios(subarea_Desde_Area.getVocabularios());

				vocabularioLogic_Desde_SubArea.setConnexion(this.getConnexion());
				vocabularioLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

				for(Vocabulario vocabulario_Desde_SubArea:vocabularioLogic_Desde_SubArea.getVocabularios()) {
					vocabulario_Desde_SubArea.setid_sub_area(idSubAreaActual);

					vocabularioLogic_Desde_SubArea.setVocabulario(vocabulario_Desde_SubArea);
					vocabularioLogic_Desde_SubArea.save();
				}

			}


			Vocabulario_logic vocabularioLogic_Desde_Area=new Vocabulario_logic();
			vocabularioLogic_Desde_Area.setVocabularios(vocabularios);

			vocabularioLogic_Desde_Area.setConnexion(this.getConnexion());
			vocabularioLogic_Desde_Area.setDatosCliente(this.datosCliente);

			for(Vocabulario vocabulario_Desde_Area:vocabularioLogic_Desde_Area.getVocabularios()) {
				vocabulario_Desde_Area.setid_area(idAreaActual);

				vocabularioLogic_Desde_Area.setVocabulario(vocabulario_Desde_Area);
				vocabularioLogic_Desde_Area.save();
			}


		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Area_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Area_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setArea(Area newArea) {
		this.area = newArea;
	}
	
	public Area_data getAreaDataAccess() {
		return areaDataAccess;
	}
	
	public void setAreaDataAccess(Area_data newareaDataAccess) {
		this.areaDataAccess = newareaDataAccess;
	}

	public void setAreas(List<Area> newAreas) {
		this.areas = newAreas;
	}
	
	public Object getAreaObject() {	
		this.areaObject=this.areaDataAccess.getEntityObject();
		return this.areaObject;
	}
		
	public void setAreaObject(Object newAreaObject) {
		this.areaObject = newAreaObject;
	}
	
	public List<Object> getAreasObject() {		
		this.areasObject=this.areaDataAccess.getEntitiesObject();
		return this.areasObject;
	}
		
	public void setAreasObject(List<Object> newAreasObject) {
		this.areasObject = newAreasObject;
	}
	
	/*
	public Connexion getConnexion() {
		return this.connexion;		
	}
	
	public void setConnexion(Connexion newConnexion) {
		this.connexion=newConnexion;		
	}
	
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}
	*/

	/*
	public DatosDeep getDatosDeep() {
		return this.datosDeep;
	}

	public void setDatosDeep(DatosDeep datosDeep) {
		this.datosDeep = datosDeep;
	}
	
	public void setDatosDeepFromDatosCliente() {
		this.datosDeep = this.datosCliente.getDatosDeep();
		this.isConDeep=this.datosCliente.getIsConDeep();
	}
	
	public Boolean getIsConDeep() {
		return this.isConDeep;
	}

	public void setIsConDeep(Boolean isConDeep) {
		this.isConDeep = isConDeep;
	}
	
	public ArrayList<DatoGeneral> getArrDatoGeneral() {
		return arrDatoGeneral;
	}

	public void setArrDatoGeneral(ArrayList<DatoGeneral> arrDatoGeneral) {
		this.arrDatoGeneral = arrDatoGeneral;
	}
	
	public ConnexionType getConnexionType() {
		return connexionType;
	}

	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}


	public ParameterDbType getParameterDbType() {
		return parameterDbType;
	}

	public void setParameterDbType(ParameterDbType parameterDbType) {
		this.parameterDbType = parameterDbType;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	*/
	

	public StringBuilder getStringBuilder() {
		return this.stringBuilder;
	}

	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}
	
	public Boolean getConMostrarMensajesStringBuilder() {
		return this.conMostrarMensajesStringBuilder;
	}

	public void setConMostrarMensajesStringBuilder(Boolean conMostrarMensajesStringBuilder) {
		this.conMostrarMensajesStringBuilder = conMostrarMensajesStringBuilder;
	}	

}
