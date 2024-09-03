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
package com.bydan.ingles.seguridad.campo.business.data;


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

import com.bydan.ingles.seguridad.campo.business.entity.*;
import com.bydan.ingles.seguridad.campo.util.*;//Campo_util;


//FK


import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;

//REL


import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.data.PerfilCampo_data;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;




@SuppressWarnings("unused")
public interface Campo_dataI { //Campo_dataAdditional,DataAccessHelper<Campo>
	
	/*------------------------------------------ EXECUTE QUERY --------------------------------------------*/
	public void executeQuery(Connexion connexion, String sQueryExecute) throws Exception;
	
	/*------------------------------------------ GET ENTITY --------------------------------------------*/
	public Campo getEntity(Connexion connexion, Long id) throws SQLException,Exception;				
	public Campo getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	public Campo getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
		
	
	/*------------------------------------------ GET ENTITIES --------------------------------------------*/
	public List<Campo> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;		
	public List<Campo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
	public List<Campo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;		
	public List<Campo> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	
	/*------------------------------------------ SAVE --------------------------------------------*/
	/* public static void save(Campo entity,Connexion connexion) throws SQLException,Exception; */
	/* public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Campo campo); */
	
	/*------------------------------------------ GENERICOS --------------------------------------------*/	
	/*PARA SQL ESCALAR O QUE TRAIGA 1 FILA Y POCOS CAMPOS*/
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception;		
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;		
	
	/*------------------------------------------ AUXILIARES --------------------------------------------*/	
	/*
	public static Campo getEntity(String strPrefijo,Campo entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception;	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Campo entity,ResultSet resultSet) throws Exception;
	*/
	
	public Campo getEntity(String strPrefijo,Campo entity,ResultSet resultSet) throws Exception;	
	public Timestamp getSetVersionRow(Connexion connexion, Long id) throws SQLException,Exception;
	
	

		
	public void setIsNewIsChangedFalse(Campo campo) throws Exception;	
	public void setIsNewIsChangedFalses(List<Campo> campos) throws Exception;	
	public void generarExportar(Connexion connexion,String sQuery,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;
}
   
