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
package com.bydan.ingles.seguridad.provincia.business.data;


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

import com.bydan.ingles.seguridad.provincia.business.entity.*;
import com.bydan.ingles.seguridad.provincia.util.*;//Provincia_util;


//FK


import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.data.Pais_data;

//REL


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.data.Ciudad_data;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;




@SuppressWarnings("unused")
public interface Provincia_dataI { //Provincia_dataAdditional,DataAccessHelper<Provincia>
	
	/*------------------------------------------ EXECUTE QUERY --------------------------------------------*/
	public void executeQuery(Connexion connexion, String sQueryExecute) throws Exception;
	
	/*------------------------------------------ GET ENTITY --------------------------------------------*/
	public Provincia getEntity(Connexion connexion, Long id) throws SQLException,Exception;				
	public Provincia getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	public Provincia getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
		
	
	/*------------------------------------------ GET ENTITIES --------------------------------------------*/
	public List<Provincia> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;		
	public List<Provincia> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception;
	public List<Provincia> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;		
	public List<Provincia> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception;
	
	/*------------------------------------------ SAVE --------------------------------------------*/
	/* public static void save(Provincia entity,Connexion connexion) throws SQLException,Exception; */
	/* public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Provincia provincia); */
	
	/*------------------------------------------ GENERICOS --------------------------------------------*/	
	/*PARA SQL ESCALAR O QUE TRAIGA 1 FILA Y POCOS CAMPOS*/
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception;		
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception;		
	
	/*------------------------------------------ AUXILIARES --------------------------------------------*/	
	/*
	public static Provincia getEntity(String strPrefijo,Provincia entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception;	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Provincia entity,ResultSet resultSet) throws Exception;
	*/
	
	public Provincia getEntity(String strPrefijo,Provincia entity,ResultSet resultSet) throws Exception;	
	public Timestamp getSetVersionRow(Connexion connexion, Long id) throws SQLException,Exception;
	
	

		
	public void setIsNewIsChangedFalse(Provincia provincia) throws Exception;	
	public void setIsNewIsChangedFalses(List<Provincia> provincias) throws Exception;	
	public void generarExportar(Connexion connexion,String sQuery,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;
}
   
