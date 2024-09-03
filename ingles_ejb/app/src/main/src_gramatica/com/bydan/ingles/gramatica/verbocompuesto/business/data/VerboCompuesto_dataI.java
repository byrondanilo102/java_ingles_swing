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
package com.bydan.ingles.gramatica.verbocompuesto.business.data;


import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

import java.io.File;
import java.lang.reflect.Field;


import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.DatoGeneralMaximo;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.ingles.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.ingles.business.data.ConstantesSql;
import com.bydan.framework.ingles.business.data.DataAccessHelper;
import com.bydan.framework.ingles.business.data.DataAccessHelperBase;
import com.bydan.framework.ingles.business.data.DataAccessHelper;

import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;
import com.bydan.ingles.gramatica.verbocompuesto.util.*;//VerboCompuesto_util;


//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

//REL


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;




@SuppressWarnings("unused")
public interface VerboCompuesto_dataI { //VerboCompuesto_dataAdditional,DataAccessHelper<VerboCompuesto>
	
	/*------------------------------------------ EXECUTE QUERY --------------------------------------------*/
	public void executeQuery(Connexion connexion, String sQueryExecute) throws Exception;
	
	/*------------------------------------------ GET ENTITY --------------------------------------------*/
	public VerboCompuesto getEntity(Connexion connexion, Long id) throws SQLException,Exception;				
	public VerboCompuesto getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	public VerboCompuesto getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
		
	
	/*------------------------------------------ GET ENTITIES --------------------------------------------*/
	public List<VerboCompuesto> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;		
	public List<VerboCompuesto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
	public List<VerboCompuesto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;		
	public List<VerboCompuesto> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	
	/*------------------------------------------ SAVE --------------------------------------------*/
	/* public static void save(VerboCompuesto entity,Connexion connexion) throws SQLException,Exception; */
	/* public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,VerboCompuesto verbocompuesto); */
	
	/*------------------------------------------ GENERICOS --------------------------------------------*/	
	/*PARA SQL ESCALAR O QUE TRAIGA 1 FILA Y POCOS CAMPOS*/
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception;		
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;		
	
	/*------------------------------------------ AUXILIARES --------------------------------------------*/	
	/*
	public static VerboCompuesto getEntity(String strPrefijo,VerboCompuesto entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception;	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,VerboCompuesto entity,ResultSet resultSet) throws Exception;
	*/
	
	public VerboCompuesto getEntity(String strPrefijo,VerboCompuesto entity,ResultSet resultSet) throws Exception;	
	public Timestamp getSetVersionRow(Connexion connexion, Long id) throws SQLException,Exception;
	
	

		
	public void setIsNewIsChangedFalse(VerboCompuesto verbocompuesto) throws Exception;	
	public void setIsNewIsChangedFalses(List<VerboCompuesto> verbocompuestos) throws Exception;	
	public void generarExportar(Connexion connexion,String sQuery,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;
}
   
