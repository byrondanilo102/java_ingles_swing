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
package com.bydan.ingles.seguridad.sistema.business.logic;

/*
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.log4j.Logger;
*/

import java.sql.Time;
import java.sql.Timestamp;

import java.io.InputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;
//import java.util.ArrayList;

import com.bydan.framework.ingles.business.entity.GeneralEntity;
//LOGIC NO DEBE APARECER EN DESKTOP ONLY
import com.bydan.framework.ingles.business.entity.GeneralEntityLogic;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityConstantesFunciones;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.Reporte;
import com.bydan.framework.ingles.util.ConstantesJsp;
import com.bydan.framework.ingles.business.data.ConstantesSql;


import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;
//import com.bydan.ingles.seguridad.util.SistemaParameterGeneral;

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.FuncionesJsp;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilaccion.business.data.PerfilAccion_data;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;

//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.dataaccess.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.sistema.business.entity.*;

import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic;

@SuppressWarnings("unused")
final public class Sistema_logic_add extends Sistema_logic {		
	
	final public  static String STODO="TODO";
	final public  static String SBUSQUEDA="BUSQUEDA";
	final public  static String SCONSULTA="CONSULTA";
	final public  static String SINGRESO="INGRESO";
	final public  static String SMODIFICACION="MODIFICACION";
	final public  static String SELIMINACION="ELIMINACION";
	
	
	private Opcion_logic opcionLogic;
	private Modulo_logic moduloLogic;
	
	//CONTROL_INICIO
	public  Sistema_logic_add()throws Exception {
		super();
		
		this.opcionLogic=new Opcion_logic();
		this.moduloLogic=new Modulo_logic();
    }
	
	public static void checkSistemaToSave(Sistema sistema,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_1
	}
	
	public static void checkSistemaToSave(Sistema sistema,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_2
	}
	
	public static void checkSistemaToSaveAfter(Sistema sistema,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_3
	}
	
	public static void checkSistemaToSaves(List<Sistema> sistemas,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_4
	}
	
	public static void checkSistemaToSaves(List<Sistema> sistemas,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_5
	}
	
	public static void checkSistemaToSavesAfter(List<Sistema> sistemas,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_6
	}
	
	public static void checkSistemaToGet(Sistema sistema,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_7
	}
	
	public static void checkSistemaToGets(List<Sistema> sistemas,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_8
	}
	
	public static void updateSistemaToSave(Sistema sistema,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_9
	}		
						
	public static void updateSistemaToGet(Sistema sistema,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_10
	}	
	
	public static void updateJSONObjectSistemaActions(String sTipoJsonResponse,ArrayList<DatoGeneral> arrDatoGeneral) {
		//,JSONObject jsonObjectSistema
		//CONTROL_11
	}
	
	public static String getJsonSistemaDataTable(String sTipoJsonResponse,Sistema sistema,ArrayList<DatoGeneral> arrDatoGeneral) {
		String sJsonDataTable="";
		
		//CONTROL_12
		
		return sJsonDataTable;
	}
	
	public static String getJsonSistemasDataTable(String sTipoJsonResponse,List<Sistema> sistemas,ArrayList<DatoGeneral> arrDatoGeneral) {
		String sJsonDataTable="";
		
		//CONTROL_13
		
		return sJsonDataTable;
	}
	
	/*
	public static JSONArray getJsonArraySistemaColumnsDefaultTable(String sTipoJsonResponse,ArrayList<DatoGeneral> arrDatoGeneral)throws Exception {	
		JSONArray jsonArraySistemasColumns = new JSONArray();
		
		//CONTROL_14
		
		return jsonArraySistemasColumns;
	}
	
	public static void updateJSONArraySistemaActionsColumns(String sTipoJsonResponse,JSONArray jsonObjectSistema,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_15
	}
	*/
	
	//PARA ACCIONES ADDITIONAL
	public Boolean ProcesarAccion(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,String sProceso,List<Sistema> sistemas) throws Exception  {
		//CONTROL_16
		Boolean esProcesado=true;
		
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);connexion.begin();			
		
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
      		this.connexion.close();			
		}
		
		return esProcesado;
	}		
	
	//PARA ACCIONES NORMALES		
	public static GeneralEntityReturnGeneral procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,GeneralEntityLogic generalEntityLogic,String sProceso,Object objects,GeneralEntityParameterGeneral generalEntityParameterGeneral,GeneralEntityReturnGeneral generalEntityReturnGeneral)throws Exception {				
		//CONTROL_17
		
		 try {	
			
			
			//GeneralEntityReturnGeneral generalEntityReturnGeneral=new GeneralEntityReturnGeneral();
				
			
			return generalEntityReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	//ACCION TABLA PROCESO DESDE BUSQUEDA
	public static GeneralEntityReturnGeneral ProcesarAccion(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcion,Usuario usuario,GeneralEntityLogic generalEntityLogic,String sProceso,Object objects,GeneralEntityParameterGeneral generalEntityParameterGeneral,GeneralEntityReturnGeneral generalEntityReturnGeneral) throws Exception  {
		//CONTROL_18
		//GeneralEntityReturnGeneral generalEntityReturnGeneral=new GeneralEntityReturnGeneral();
			
		try {	
			//this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);connexion.begin();			
		
			//this.connexion.commit();
			
		} catch(Exception e) {
			//this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
      		//this.connexion.close();			
		}
		
		return generalEntityReturnGeneral;
	}
	
	//PARA EVENTOS GENERALES
	public static GeneralEntityReturnGeneral procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,GeneralEntityLogic generalEntityLogic,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,Object objects,Object object,GeneralEntityParameterGeneral generalEntityParameterGeneral,GeneralEntityReturnGeneral generalEntityReturnGeneral,Boolean isEsNuevoUpdate,ArrayList<Classe> clases)throws Exception {				
		//CONTROL_19		
		 try {	
				
			
			return generalEntityReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public static Boolean validarSaveRelaciones(GeneralEntity generalEntity,GeneralEntityLogic generalEntityLogic) {
		//CONTROL_20
		Boolean validado=true;

		return validado;	
	}
	
	public static void updateRelacionesToSave(GeneralEntity generalEntity,GeneralEntityLogic generalEntityLogic) {	
		//CONTROL_21
	}
	
	public static void updateRelacionesToSaveAfter(GeneralEntity generalEntity,GeneralEntityLogic generalEntityLogic) {	
		//CONTROL_22
	}
	
	
	
	//CONTROL_FUNCION1
	
	
	
	
	public List<Accion> accionesCargarSesionUsuarioActual(Usuario usuarioActual,DatosCliente datosCliente,ResumenUsuario resumenUsuarioActual,Long idSistemaActual,String sNombreOpcion,Opcion opcionActual,Boolean esGuardarRelacionado,Boolean conGuardarRelaciones,ArrayList<String> arrPaginas) throws Exception {
		Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
		
		Accion_logic accionLogic=new Accion_logic();
		
		accionLogic.setConnexion(this.getConnexion());
		
		String sFinalQuery=" where id_opcion="+opcionActual.getId();
		
		accionLogic.getEntities(sFinalQuery);
		
		List<Accion> acciones=new ArrayList<Accion>();
		
		acciones=accionLogic.getAccions();
		
		return acciones;
	}
	
	public Boolean validarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean isValidado=true;
		
		try	{
		   
			String sUsuarioPCServer=datosCliente.getsUsuarioPCServer();
			String sNamePCServer=datosCliente.getsNamePCServer();
			String sIPPCServer=datosCliente.getsIPPCServer();
			String sMacAddressPCServer=datosCliente.getsMacAddressPCServer();
			Date dFechaServer=datosCliente.getdFechaServer();
			Long idUsuario=datosCliente.getIdUsuario();
			Boolean isClienteWeb=datosCliente.getIsClienteWeb();
			String sClaveSistema=datosCliente.getsClaveSistema();
			
			//isValidado=GlobalSeguridad.validarLicenciaCliente(sUsuarioPCServer, sNamePCServer, sIPPCServer, sMacAddressPCServer, dFechaServer, idUsuario, isClienteWeb, sClaveSistema);
		    
		    return isValidado;
			
		} catch(Exception e) {
			//this.connexion.rollback();			
			
			throw e;
			
		} finally {
			this.connexion.close();	
		}
	}
	
	public Boolean validarLicenciaCliente(DatosCliente datosCliente,Modulo moduloActual,Usuario usuarioActual) throws Exception {
		Boolean isValidado=true;
		
		try	{
		   
			String sUsuarioPCServer=datosCliente.getsUsuarioPCServer();
			String sNamePCServer=datosCliente.getsNamePCServer();
			String sIPPCServer=datosCliente.getsIPPCServer();
			String sMacAddressPCServer=datosCliente.getsMacAddressPCServer();
			Date dFechaServer=datosCliente.getdFechaServer();
			Long idUsuario=datosCliente.getIdUsuario();
			Boolean isClienteWeb=datosCliente.getIsClienteWeb();
			String sClaveSistema=datosCliente.getsClaveSistema();			
			String sNombreModuloActual=moduloActual.getnombre().trim();
			String sNombreUsuarioActual=usuarioActual.getuser_name().trim();
			
			//isValidado=GlobalSeguridad.validarLicenciaCliente(sUsuarioPCServer, sNamePCServer, sIPPCServer, sMacAddressPCServer, dFechaServer, idUsuario, isClienteWeb, sClaveSistema,sNombreModuloActual,sNombreUsuarioActual);
		    
		    return isValidado;
			
		} catch(Exception e) {
			//this.connexion.rollback();			
			
			throw e;
			
		} finally {
			//this.connexion.close();	
		}
	}
	
	public Boolean validarSesionUsuarioActual(Usuario usuarioActual,DatosCliente datosCliente,ResumenUsuario resumenUsuarioActual) throws Exception {
		Boolean isValidado=true;
		String sFinalQuery="";
		
		try	{
			ResumenUsuario_logic resumenUsuarioLogic=new ResumenUsuario_logic();
			
			resumenUsuarioLogic.setDatosCliente(datosCliente);
			
			sFinalQuery=" where id_usuario="+usuarioActual.getId();
			
    		resumenUsuarioLogic.getEntityWithConnection(sFinalQuery);
    		
    		if(resumenUsuarioLogic.getResumenUsuario()!=null && resumenUsuarioLogic.getResumenUsuario().getId()>0) {
	    		if(!resumenUsuarioActual.getnumero_reinicios().equals(resumenUsuarioLogic.getResumenUsuario().getnumero_reinicios())) {
	    			isValidado=false;
	    		}
    		} else {
    			isValidado=false;
    		}
			
		    return isValidado;
			
		} catch(Exception e) {
			//this.connexion.rollback();			
			
			throw e;
			
		} finally {
			//this.connexion.close();	
		}
	}
	
	public Sistema_param_return validarCargarSesionUsuarioActual(Usuario usuarioActual,DatosCliente datosCliente,ResumenUsuario resumenUsuarioActual,Long lIdSistema,String sPagina,Opcion opcionActual,Boolean esGuardarRelacionado,Boolean conGuardarRelaciones,ArrayList<String> arrPaginas) throws Exception {
		return this.validarCargarSesionUsuarioActualBase(usuarioActual,datosCliente,resumenUsuarioActual,lIdSistema,sPagina,opcionActual,esGuardarRelacionado,conGuardarRelaciones,arrPaginas,false);
	}
	
	public Sistema_param_return validarCargarSesionUsuarioActualWithConnection(Usuario usuarioActual,DatosCliente datosCliente,ResumenUsuario resumenUsuarioActual,Long lIdSistema,String sPagina,Opcion opcionActual,Boolean esGuardarRelacionado,Boolean conGuardarRelaciones,ArrayList<String> arrPaginas) throws Exception {
		return this.validarCargarSesionUsuarioActualBase(usuarioActual,datosCliente,resumenUsuarioActual,lIdSistema,sPagina,opcionActual,esGuardarRelacionado,conGuardarRelaciones,arrPaginas,true);
	}
	
	public Sistema_param_return validarCargarSesionUsuarioActualBase(Usuario usuarioActual,DatosCliente datosCliente,ResumenUsuario resumenUsuarioActual,Long lIdSistema,String sPagina,Opcion opcionActual,Boolean esGuardarRelacionado,Boolean conGuardarRelaciones,ArrayList<String> arrPaginas,Boolean conConexion) throws Exception {
		Boolean isValidado=true;
		String sFinalQuery="";
		
		Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();
		List<Accion> accions=new ArrayList<Accion>();
		List<Accion> accionsFormulario=new ArrayList<Accion>();
		List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
		
		try	{
			
			if(conConexion) {
				this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-validarCargarSesionUsuarioActualWithConnection");this.connexion.begin();
			}
			
			ResumenUsuario_logic resumenUsuarioLogic=new ResumenUsuario_logic();
			
			resumenUsuarioLogic.setConnexion(this.connexion);
			
			resumenUsuarioLogic.setDatosCliente(datosCliente);
			
			//CARGAR ISVALIDADO
			sFinalQuery=" where id_usuario="+usuarioActual.getId();
			
    		resumenUsuarioLogic.getEntity(sFinalQuery);
    		
    		if(resumenUsuarioLogic.getResumenUsuario()!=null && resumenUsuarioLogic.getResumenUsuario().getId()>0) {
	    		if(!resumenUsuarioActual.getnumero_reinicios().equals(resumenUsuarioLogic.getResumenUsuario().getnumero_reinicios())) {
	    			isValidado=false;
	    		}
    		} else {
    			isValidado=false;
    		}
			
    		sistemaReturnGeneral.setEsValidado(isValidado);
    		
    		
    		//CARGAR PERFILOPCION
    		perfilOpcionUsuario=this.traerPermisosPaginaWebPerfilOpcion(usuarioActual,lIdSistema,sPagina,opcionActual.getId(),false);
    		
    		//LA OPCION SE CARGO DESDE NOMBRE CLASE, NO DESDE ID
    		if(opcionActual.getId()<0 && perfilOpcionUsuario!=null && perfilOpcionUsuario.getid_opcion()>=0) {
    			opcionActual.setId(perfilOpcionUsuario.getid_opcion());
    		}
    		
    		sistemaReturnGeneral.setPerfilOpcion(perfilOpcionUsuario);
    		
    		
    		//CARGAR ACCIONES PRINCIPAL Y FORMULARIO
    		accions=this.getAccionesUsuario(usuarioActual,opcionActual,false,false);
    		
    		sistemaReturnGeneral.setAccions(accions);
    		
    		//ACCIONES FORMULARIO	
    		accionsFormulario=this.getAccionesUsuario(usuarioActual,opcionActual,true,false);
    		
    		sistemaReturnGeneral.setAccionsFormulario(accionsFormulario);
    		
    		
    		
    		//CARGAR PERMISOS RELACIONADOS
    		if(!esGuardarRelacionado || (esGuardarRelacionado && conGuardarRelaciones)) {
    			
    			opcionsRelacionadas=this.tienePermisosOpcionesEnPaginaWeb(usuarioActual,lIdSistema,arrPaginas,false);;
    		}
    		
    		
    		sistemaReturnGeneral.setOpcionsRelacionadas(opcionsRelacionadas);
    		
    		
    		if(conConexion) {
    			this.connexion.commit();    		
    		}
    		
		    return sistemaReturnGeneral;//isValidado;
			
		} catch(Exception e) {
			//this.connexion.rollback();			
			
			if(conConexion) {
				this.connexion.rollback();
			}
			
			throw e;
			
		} finally {
			if(conConexion) {
				this.connexion.close();
			}
		}
	}
	
	public List<Accion> getAccionesUsuario(Usuario usuario,Opcion opcion) throws Exception {
		List<Accion> accionesUsuario=new ArrayList<Accion>();
		
		accionesUsuario=this.getAccionesUsuario(usuario,opcion,false);
				
		return accionesUsuario;
	}
	
	public List<Accion> getAccionesUsuario(Usuario usuario,Opcion opcion,Boolean soloParaFormulario) throws Exception {
		return this.getAccionesUsuario(usuario,opcion,soloParaFormulario,true);
	}
	
	public List<Accion> getAccionesUsuario(Usuario usuario,Opcion opcion,Boolean soloParaFormulario,Boolean conConnexion) throws Exception {
		ArrayList<Accion> accionesUsuario=new ArrayList<Accion>();
		
		try {
			
			if(conConnexion) {
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getAccionesUsuario");connexion.begin();
			}
			
			//PerfilOpcionLogic perfilOpcionLogic=new PerfilOpcionLogic();			
			PerfilUsuario_logic perfilUsuarioLogic=new PerfilUsuario_logic();
			Accion_logic accionLogic=new Accion_logic();
			//PerfilAccionLogic perfilAccionLogic=new PerfilAccionLogic();
			
			perfilUsuarioLogic.setConnexion(this.connexion);
			//perfilOpcionLogic.setConnexion(this.connexion);
			accionLogic.setConnexion(this.connexion);
			//perfilAccionLogic.setConnexion(this.connexion);
			
			//perfilUsuarioLogic.getPerfilUsuariosFK_IdUsuarioWithConnection("",new Pagination(), usuario.getId());
			perfilUsuarioLogic.getsFK_IdUsuario("",new Pagination(), usuario.getId());
			
			
			
						
			String sPerfiles=new String();
			String sFinalQuery="";
			String sFinalQuerySoloParaFormulario="";
			String sQueryPerfil="";
			Boolean esPrimero=true;
			
			for(PerfilUsuario perfilusuario:perfilUsuarioLogic.getPerfilUsuarios())	{
				if(esPrimero) {
					esPrimero=false;
				} else {
					sPerfiles+=",";
				}
				
				sPerfiles+=perfilusuario.getid_perfil().toString();		
			}
			
			StringBuilder sbPermisosAcciones=new StringBuilder();
				
			opcionLogic.setOpcions(new ArrayList<Opcion>());
			//ArrayList<Opcion> opciones=new ArrayList<Opcion>();
			
			/*
			 	select distinct * from Opcion O inner join perfilopcion PO on perfilopcion.idOpcion=opcion.id
			 	where opcion.idSistema=2 and perfilopcion.idPerfil in (1,2,3);
			*/
						
			
			/*
			String sSelect=" select distinct * from "+PerfilOpcion_util.SCHEMA+".perfil_opcion ";
			String sFinal="  inner join "+Opcion_util.SCHEMA+".opcion on perfil_opcion.id_opcion=opcion.id where opcion.id_sistema="+opcion.getid_sistema();
			sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+") and opcion.id= "+opcion.getId()+"";
			sFinal+=" and perfil_opcion.estado=true ";
					
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinal);
			
				
			//perfilOpcionLogic.getEntitiesWithConnection(sSelect, queryWhereSelectParameters);
			perfilOpcionLogic.getEntities(sSelect, queryWhereSelectParameters);
			
			
			Boolean isEsPerfilAccionPrimero=false;
			
			if(perfilOpcionLogic.getPerfilOpcions()!=null) {
				
				for(PerfilOpcion perfilopcion:perfilOpcionLogic.getPerfilOpcions())	{
					
					//accionLogic.getAccionsFK_IdOpcionWithConnection("",new Pagination(), perfilopcion.getid_opcion());
					
					sFinalQuery=" where id_opcion="+perfilopcion.getid_opcion() +" order by orden asc";
					
					//accionLogic.getEntitiesWithConnection(sFinalQuery);
					accionLogic.getEntities(sFinalQuery);
					
					isEsPerfilAccionPrimero=false;
					
					for(Accion accion:accionLogic.getAccions())	{
						queryWhereSelectParameters=new QueryWhereSelectParameters();
						queryWhereSelectParameters.setInitialQuery("");
						queryWhereSelectParameters.setFinalQuery(" where "+PerfilAccionDataAccess.getColumnNameidPerfil()+"="+perfilopcion.getid_perfil()+" and "+PerfilAccionDataAccess.getColumnNameidAccion()+"="+accion.getId());
						
						perfilAccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
						//perfilAccionLogic.getEntitiesSimpleQueryBuildWithConnection(PerfilAccionDataAccess.QUERYSELECTNATIVE, queryWhereSelectParameters);
						perfilAccionLogic.getEntitiesSimpleQueryBuild(PerfilAccionDataAccess.QUERYSELECTNATIVE, queryWhereSelectParameters);						
						
						for(PerfilAccion perfilAccion:perfilAccionLogic.getPerfilAccions())	{
							if(perfilAccion.getejecusion() && perfilAccion.getestado()) {
								accionesUsuario.add(accion);
							}
							break;
						}						
					}						
					break;
				}
			}		
			*/
			
			if(soloParaFormulario) {
				//sFinalQuerySoloParaFormulario=" and solo_form=true ";
			}
			
			if(!sPerfiles.equals("")) {
				sQueryPerfil=" and seg_perfil_accion.id_perfil in ("+sPerfiles+") ";				
			} else {
				sQueryPerfil=" and seg_perfil_accion.id_perfil in (-1) ";	
			}
			
			sFinalQuery=" inner join "+PerfilAccion_util.SCHEMA+Constantes2.PS+PerfilAccion_util.TABLE_NAME+" seg_perfil_accion on seg_perfil_accion.id_accion=seg_accion.id ";
			sFinalQuery+=" where seg_accion.id_opcion="+opcion.getId()+sQueryPerfil;
			sFinalQuery+=" and seg_perfil_accion.ejecusion=1 and seg_accion.estado=1"+sFinalQuerySoloParaFormulario+" order by seg_accion.orden asc";
			
			accionLogic.getEntities(sFinalQuery);
			
			accionesUsuario.addAll(accionLogic.getAccions());
			
			if(conConnexion) {
				this.connexion.commit();
			}
			
		} catch(Exception ex) {
			if(conConnexion) {
				this.connexion.rollback();
			}
			
			throw ex;
			
		} finally {
			if(conConnexion) {
				this.connexion.close();
			}
		}
		
		return accionesUsuario;
	}
	
	public PerfilOpcion traerPermisosPaginaWebPerfilOpcion(Usuario usuario,Long lIdSistema,String sPagina,Long id_opcion) throws Exception {
		return traerPermisosPaginaWebPerfilOpcion(usuario,lIdSistema,sPagina,id_opcion,true) ;
	}
	
	public PerfilOpcion traerPermisosPaginaWebPerfilOpcion(Usuario usuario,Long lIdSistema,String sPagina,Long id_opcion,Boolean conConnexion) throws Exception {
		PerfilOpcion perfilOpcionDeUsuario=new PerfilOpcion();
		
		try {
			
			if(conConnexion) {
				this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-traerPermisosPaginaWebPerfilOpcion");this.connexion.begin();						
			}
			
			PerfilOpcion_logic perfilOpcionLogic=new PerfilOpcion_logic();			
			PerfilUsuario_logic perfilUsuarioLogic=new PerfilUsuario_logic();
			
			
			perfilUsuarioLogic.setConnexion(this.connexion);
			perfilOpcionLogic.setConnexion(this.connexion);
			
			
			perfilUsuarioLogic.getsFK_IdUsuario("",new Pagination(), usuario.getId());
			
			String sPerfiles=new String();
			Boolean esPrimero=true;
			
			for(PerfilUsuario perfilusuario:perfilUsuarioLogic.getPerfilUsuarios())	{
				if(esPrimero) {
					esPrimero=false;
				} else {
					sPerfiles+=",";
				}
				
				sPerfiles+=perfilusuario.getid_perfil().toString();		
			}
			
			opcionLogic.setOpcions(new ArrayList<Opcion>());
			//ArrayList<Opcion> opciones=new ArrayList<Opcion>();
			
			/*
			 	select distinct * from Opcion O inner join perfilopcion PO on PO.idOpcion=O.id
			 	where O.idSistema=2 and PO.idPerfil in (1,2,3);
			*/
							
			String sSelect=" select distinct * from "+PerfilOpcion_util.SCHEMA+Constantes2.PS+PerfilOpcion_util.TABLE_NAME+" perfil_opcion";
			String sFinal="  inner join "+Opcion_util.SCHEMA+Constantes2.PS+Opcion_util.TABLE_NAME+" opcion on perfil_opcion.id_opcion=opcion.id where opcion.id_sistema="+lIdSistema.toString();
			sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+")";
			
			if(id_opcion!=null && id_opcion>=0) {
				sFinal+=" and opcion.id= "+id_opcion;
			} else {
				sFinal+=" and (opcion.nombre_clase= '"+sPagina+"' or opcion.nombre_clase= 'Mantenimiento"+sPagina+".jsf')";
			}
			
			sFinal+=" and perfil_opcion.estado=true ";
					
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinal);
					
			try	{			
				perfilOpcionLogic.getEntities(sSelect, queryWhereSelectParameters);
						
				if(perfilOpcionLogic.getPerfilOpcions()!=null) {
					
					for(PerfilOpcion perfilopcion:perfilOpcionLogic.getPerfilOpcions())	{					
						perfilOpcionDeUsuario=perfilopcion;					
						break;
					}
				}				
			} catch(Exception ex) {
				throw ex;
			}
			
			if(conConnexion) {
				this.connexion.commit();
			}
			
		} catch(Exception e) {
			if(conConnexion) {
				this.connexion.rollback();
			}
			
			throw e;
			
		}  finally {
			
			if(conConnexion) {
				connexion.close();	
			}
		}
		
		return perfilOpcionDeUsuario;
	}
	
	public String traerPermisosAccionesPaginaWeb(Usuario usuario,Long lIdSistema,String sPagina,Long id_opcion) throws Exception {	
		PerfilOpcion_logic perfilOpcionLogic=new PerfilOpcion_logic();
		
		PerfilUsuario_logic perfilUsuarioLogic=new PerfilUsuario_logic();
		perfilUsuarioLogic.getsFK_IdUsuarioWithConnection("",new Pagination(), usuario.getId());
		
		PerfilAccion_logic perfilAccionLogic=new PerfilAccion_logic();
		Accion_logic accionLogic=new Accion_logic();
		
		String sPerfiles=new String();
		Boolean esPrimero=true;
		
		for(PerfilUsuario perfilusuario:perfilUsuarioLogic.getPerfilUsuarios())	{
			if(esPrimero) {
				esPrimero=false;
			} else {
				sPerfiles+=",";
			}
			
			sPerfiles+=perfilusuario.getid_perfil().toString();		
		}
		
		StringBuilder sbPermisosAcciones=new StringBuilder();
			
		opcionLogic.setOpcions(new ArrayList<Opcion>());
		//ArrayList<Opcion> opciones=new ArrayList<Opcion>();
		
		/*
		 	select distinct * from Opcion O inner join perfilopcion PO on perfilopcion.idOpcion=opcion.id
		 	where opcion.idSistema=2 and perfilopcion.idPerfil in (1,2,3);
		*/
						
		String sSelect=" select distinct * from "+PerfilOpcion_util.SCHEMA+Constantes2.PS+PerfilOpcion_util.TABLE_NAME+" perfil_opcion ";
		String sFinal="  inner join "+Opcion_util.SCHEMA+Constantes2.PS+Opcion_util.TABLE_NAME+" opcion where opcion.id_sistema="+lIdSistema.toString();
		sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+") ";
		
		if(id_opcion!=null && id_opcion>0) {
			sFinal+="and opcion.id= "+id_opcion;
		} else {
			sFinal+="and opcion.nombre_clase= '"+sPagina+"'";
		}
		
		sFinal+=" and perfil_opcion.estado=true ";
				
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		queryWhereSelectParameters.setInitialQuery("");
		queryWhereSelectParameters.setFinalQuery(sFinal);
			
		try {		
			perfilOpcionLogic.getEntitiesWithConnection(sSelect, queryWhereSelectParameters);
			
			Boolean isEsPerfilAccionPrimero=false;
			
			if(perfilOpcionLogic.getPerfilOpcions()!=null) {
				
				for(PerfilOpcion perfilopcion:perfilOpcionLogic.getPerfilOpcions())	{
					
					accionLogic.getsFK_IdOpcionWithConnection("",new Pagination(), perfilopcion.getid_opcion());
					
					isEsPerfilAccionPrimero=false;
					
					for(Accion accion:accionLogic.getAccions())	{
						queryWhereSelectParameters=new QueryWhereSelectParameters();
						queryWhereSelectParameters.setInitialQuery("");
						queryWhereSelectParameters.setFinalQuery(" where "+PerfilAccion_util.IDPERFIL+"="+perfilopcion.getid_perfil()+" and "+PerfilAccion_util.IDACCION+"="+accion.getId());
						
						perfilAccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
						perfilAccionLogic.getEntitiesSimpleQueryBuildWithConnection(PerfilAccion_data.QUERY_SELECT, queryWhereSelectParameters);
						
						for(PerfilAccion perfilAccion:perfilAccionLogic.getPerfilAccions())	{
							if(!isEsPerfilAccionPrimero) {
								isEsPerfilAccionPrimero=true;
								sbPermisosAcciones.append(accion.getcodigo());
							} else	{
								sbPermisosAcciones.append(",");								
								sbPermisosAcciones.append(accion.getcodigo());
							}
						}
					}	
					
					break;
				}
			}			
			
		} catch(Exception ex) {
			throw ex;
		}
		
		return sbPermisosAcciones.toString();
	}
	
	public ArrayList<Opcion> tienePermisosOpcionesEnPaginaWeb(Usuario usuario,Long lIdSistema,ArrayList<String> arrPaginas) throws Exception {
		return tienePermisosOpcionesEnPaginaWeb(usuario,lIdSistema,arrPaginas,true);
	}
	
	public ArrayList<Opcion> tienePermisosOpcionesEnPaginaWeb(Usuario usuario,Long lIdSistema,ArrayList<String> arrPaginas,Boolean conConnexion) throws Exception {
		//Boolean isTienePermisos=false;
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();
		
		try	{
			
			if(arrPaginas.size()<=0) {
				return opcionsFinal;
			}
			
			if(conConnexion) {
				this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-tienePermisosOpcionesEnPaginaWeb");this.connexion.begin();						
			}
			
			
			PerfilOpcion_logic perfilOpcionLogic=new PerfilOpcion_logic();						
			PerfilUsuario_logic perfilUsuarioLogic=new PerfilUsuario_logic();
			this.opcionLogic=new Opcion_logic();
			
			perfilUsuarioLogic.setConnexion(this.connexion);
			perfilOpcionLogic.setConnexion(this.connexion);
			this.opcionLogic.setConnexion(this.connexion);
			
			//perfilUsuarioLogic.getPerfilUsuariosFK_IdUsuarioWithConnection("",new Pagination(), usuario.getId());
			perfilUsuarioLogic.getsFK_IdUsuario("",new Pagination(), usuario.getId());
			
			String sPerfiles=new String();
			Boolean esPrimero=true;
			
			for(PerfilUsuario perfilusuario:perfilUsuarioLogic.getPerfilUsuarios())	{
				if(esPrimero) {
					esPrimero=false;
				} else {
					sPerfiles+=",";
				}
				
				sPerfiles+=perfilusuario.getid_perfil().toString();		
			}
			
			
			String sPaginas=new String();
			esPrimero=true;
			
			for(String sPagina:arrPaginas)	{
				if(esPrimero) {
					esPrimero=false;
				} else {
					sPaginas+=",";
				}
				
				sPaginas+="'Mantenimiento"+sPagina+".jsf'";		
			}
			
			//StringBuilder sbPermisos=new StringBuilder();
				
			opcionLogic.setOpcions(new ArrayList<Opcion>());
			
			/*				
			String sSelect=" select distinct * from "+PerfilOpcion_util.SCHEMA+".perfil_opcion ";
			String sFinal="  inner join "+Opcion_util.SCHEMA+".opcion opcion on perfil_opcion.id_opcion=opcion.id";		
			sFinal+=" where opcion.id_sistema="+lIdSistema.toString();
			sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+") and opcion.nombre_clase = '"+sPagina+"'";
			sFinal+=" and perfil_opcion.estado=true ";
					
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinal);
				
				
			//perfilOpcionLogic.getEntitiesWithConnection(sSelect, queryWhereSelectParameters);
			perfilOpcionLogic.getEntities(sSelect, queryWhereSelectParameters);
									
			if(perfilOpcionLogic.getPerfilOpcions()!=null&&perfilOpcionLogic.getPerfilOpcions().size()>0) {			
				isTienePermisos=true;					
			}		
			*/
			
			String sSelect=" select distinct * from "+Opcion_util.SCHEMA+Constantes2.PS+"seg_opcion opcion";
			String sFinal="  inner join "+PerfilOpcion_util.SCHEMA+Constantes2.PS+"seg_perfil_opcion perfil_opcion on perfil_opcion.id_opcion = opcion.id";		
			sFinal+=" where opcion.id_sistema="+lIdSistema.toString();
			sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+") and opcion.nombre_clase in ("+sPaginas+")";
			sFinal+=" and perfil_opcion.estado=1 ";
					
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinal);
				
				
			this.opcionLogic.getEntities(sSelect, queryWhereSelectParameters);
			
			for(Opcion opcion:this.opcionLogic.getOpcions()) {
				opcionsFinal.add(opcion);
			}
			
			if(conConnexion) {
				this.connexion.commit();
			}
			
		} catch(Exception ex) {
			if(conConnexion) {
				this.connexion.rollback();
			}
			
			throw ex;
			
		} finally {
			if(conConnexion) {
				connexion.close();
			}
		}
		
		return opcionsFinal;
	}
	
	public Boolean tienePermisosEnPaginaWeb(Usuario usuario,Long lIdSistema,String sPagina) throws Exception {
		Boolean isTienePermisos=false;
		
		try	{
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);this.connexion.begin();						
			
			PerfilOpcion_logic perfilOpcionLogic=new PerfilOpcion_logic();						
			PerfilUsuario_logic perfilUsuarioLogic=new PerfilUsuario_logic();
			
			perfilUsuarioLogic.setConnexion(this.connexion);
			perfilOpcionLogic.setConnexion(this.connexion);
			
			//perfilUsuarioLogic.getPerfilUsuariosFK_IdUsuarioWithConnection("",new Pagination(), usuario.getId());
			perfilUsuarioLogic.getsFK_IdUsuario("",new Pagination(), usuario.getId());
			
			String sPerfiles=new String();
			Boolean esPrimero=true;
			
			for(PerfilUsuario perfilusuario:perfilUsuarioLogic.getPerfilUsuarios())	{
				if(esPrimero) {
					esPrimero=false;
				} else {
					sPerfiles+=",";
				}
				
				sPerfiles+=perfilusuario.getid_perfil().toString();		
			}
			
			//StringBuilder sbPermisos=new StringBuilder();
				
			opcionLogic.setOpcions(new ArrayList<Opcion>());
			//ArrayList<Opcion> opciones=new ArrayList<Opcion>();
			
			/*
			 	select distinct * from Opcion O inner join perfilopcion PO on PO.idOpcion=O.id
			 	where O.idSistema=2 and PO.idPerfil in (1,2,3);
			*/
							
			String sSelect=" select distinct * from "+PerfilOpcion_util.SCHEMA+Constantes2.PS+"perfil_opcion perfil_opcion";
			String sFinal="  inner join "+Opcion_util.SCHEMA+Constantes2.PS+"opcion opcion on perfil_opcion.id_opcion=opcion.id";		
			sFinal+=" where opcion.id_sistema="+lIdSistema.toString();
			sFinal+=" and perfil_opcion.id_perfil in ("+sPerfiles+") and opcion.nombre_clase = '"+sPagina+"'";
			sFinal+=" and perfil_opcion.estado=true ";
					
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinal);
				
				
			//perfilOpcionLogic.getEntitiesWithConnection(sSelect, queryWhereSelectParameters);
			perfilOpcionLogic.getEntities(sSelect, queryWhereSelectParameters);
									
			if(perfilOpcionLogic.getPerfilOpcions()!=null&&perfilOpcionLogic.getPerfilOpcions().size()>0) {			
				isTienePermisos=true;					
			}		
									
			this.connexion.commit();
			
		} catch(Exception ex) {
			this.connexion.rollback();
			
			throw ex;
			
		} finally {
			connexion.close();	
		}
		
		return isTienePermisos;
	}
	//CONTROL_FUNCION2
}