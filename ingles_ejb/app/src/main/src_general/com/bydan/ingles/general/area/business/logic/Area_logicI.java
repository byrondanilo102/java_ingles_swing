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









@SuppressWarnings("unused")
public interface Area_logicI  {
	
	/*--------------------------------- EXECUTE QUERY ---------------------------------*/
	public void executeQueryWithConnection(String sQueryExecute) throws Exception;	
	public void executeQuery(String sQueryExecute) throws Exception;
	
	/*--------------------------------- GET ENTITY ---------------------------------*/
	public void getEntityWithConnection(Long id) throws Exception;	
	public void getEntity(Long id) throws Exception;		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;	
	public void getEntity(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception;		
	public void getEntityWithConnection(String sFinalQuery) throws Exception;	
	public void getEntity(String sFinalQuery) throws Exception;
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception;
	public void getEntity(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception;
	
	
	/*--------------------------------- GET ENTITIES ---------------------------------*/
	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;	
	public void getEntities(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;	
	public void getEntitiesWithConnection(String sFinalQuery)throws Exception;	
	public void getEntities(String sFinalQuery)throws Exception;	
	public void getEntitiesWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;
	public void getEntities(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception;	
	public void  getTodos(String sFinalQuery,Pagination pagination)throws Exception;
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;
	public void getEntitiesSimpleQueryBuild(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception;
	
	/*
	Trae cualquier tipo de query select
	@conMapGenerico  Si es true, trae todo como objeto generico, Si es false trae query en campos de la clase, usando unicamente los determinados en listColumns y deepLoadType
	@deepLoadType  Si conMapGenerico es false trae query select con las columnas de listColumns, incluyento o excludendo deacuerdo a deepLoadType
	*/
	public void getEntitiesWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception;	
	public void getEntities(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception;		
	
	/*--------------------------------- SAVES ---------------------------------*/
	public void saveWithConnection()throws Exception;	
	public void save()throws Exception;	
	public void savesWithConnection()throws Exception;	
	public void saves()throws Exception;
	
	/*--------------------------------- CONNEXION ---------------------------------*/
	public void getNewConnexionToDeep()throws Exception;	
	public void getNewConnexionToDeep(String sDetalle)throws Exception;	
	public void commitNewConnexionToDeep()throws Exception;	
	public void rollbackNewConnexionToDeep()throws Exception;	
	public void closeNewConnexionToDeep()throws Exception;
	
	/*--------------------------------- DATO GENERAL ---------------------------------*/
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;		
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception;		
			
	/*--------------------------------- PROCESAR ACCION ---------------------------------*/
	public Area_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Area> areas,Area_param_return areaParameterGeneral)throws Exception;	
	public Area_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Area> areas,Area_param_return areaParameterGeneral)throws Exception;
	
	/*--------------------------------- PROCESAR EVENTOS ---------------------------------*/
	public Area_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Area> areas,Area area,Area_param_return areaParameterGeneral,Boolean isEsNuevoArea,ArrayList<Classe> clases)throws Exception;		
	public Area_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Area> areas,Area area,Area_param_return areaParameterGeneral,Boolean isEsNuevoArea,ArrayList<Classe> clases)throws Exception;
	
	public Area_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Area_param_return areaParameterGeneral)throws Exception;
	
	/*--------------------------------- VALIDAR ---------------------------------*/
	public Boolean validarGuardar(Area area) throws Exception;	
	public Boolean validarGuardar(List<Area> Areas) throws Exception;	
	public void validarGuardarManejar(List<Area> Areas) throws Exception;	
	public void validarGuardarManejar(Area Area) throws Exception;
	
	public void guardarInvalidValues(Area area) throws Exception;	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception;
	
	/*--------------------------------- QUITAR ELIMINADOS/NULOS---------------------------------*/
	public void quitarsEliminados() throws Exception;	
	public void quitarsNulos() throws Exception;
	
	/*--------------------------------- SETs / GETs ---------------------------------*/
	public void setDatosCliente(DatosCliente datosCliente);			
	public void setDatosDeepParametros(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String strTituloMensaje);
	
	public void getSetVersionRowWithConnection()throws Exception;	
	/*private void getSetVersionRow()throws Exception;*/	
	public void getSetVersionRowsWithConnection()throws Exception;	
	/*private void getSetVersionRows()throws Exception;*/
	
	
	/*--------------------------------- CARGAR RELACIONES ---------------------------------*/
	public void cargarRelacionesLoteFKWithConnection() throws Exception;
	
	/*--------------------------------- DEEP LOADs ---------------------------------*/
	public void deepLoad(Area area,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	public void deepLoad(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	public void deepLoads(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	
	/*--------------------------------- DEEP SAVEs ---------------------------------*/
	public void deepSave(Area area,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;				
	public void deepSaveWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepSavesWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepSaves(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;		
	
	
	/*--------------------------------- AUDITORIA ---------------------------------*/
	/*
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception;	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Area area,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception;			
	*/
	
	
	
	
	//IF MAX CODE
	
	/*--------------------------------- CLASSES FKs / RELs ---------------------------------*/
	/*
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
	*/
	
	
	
	
	
}

