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
package com.bydan.ingles.gramatica.tipogrammardetalle.business.logic;


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
import com.bydan.ingles.gramatica.tipogrammardetalle.util.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalleParameterGeneral;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic_add;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.VerboIrregularDetalle_data;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.data.PronunDetalle_data;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.VocabularioDetalle_data;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.data.ExpresionDetalle_data;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.data.GrammarDetalle_data;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;

//REL DETALLES










@SuppressWarnings("unused")
public interface TipoGrammarDetalle_logicI  {
	
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
	public TipoGrammarDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception;	
	public TipoGrammarDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception;
	
	/*--------------------------------- PROCESAR EVENTOS ---------------------------------*/
	public TipoGrammarDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral,Boolean isEsNuevoTipoGrammarDetalle,ArrayList<Classe> clases)throws Exception;		
	public TipoGrammarDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral,Boolean isEsNuevoTipoGrammarDetalle,ArrayList<Classe> clases)throws Exception;
	
	public TipoGrammarDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception;
	
	/*--------------------------------- VALIDAR ---------------------------------*/
	public Boolean validarGuardar(TipoGrammarDetalle tipogrammardetalle) throws Exception;	
	public Boolean validarGuardar(List<TipoGrammarDetalle> TipoGrammarDetalles) throws Exception;	
	public void validarGuardarManejar(List<TipoGrammarDetalle> TipoGrammarDetalles) throws Exception;	
	public void validarGuardarManejar(TipoGrammarDetalle TipoGrammarDetalle) throws Exception;
	
	public void guardarInvalidValues(TipoGrammarDetalle tipogrammardetalle) throws Exception;	
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
	public void deepLoad(TipoGrammarDetalle tipogrammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	public void deepLoad(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	public void deepLoads(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;
	
	/*--------------------------------- DEEP SAVEs ---------------------------------*/
	public void deepSave(TipoGrammarDetalle tipogrammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;				
	public void deepSaveWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepSavesWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;	
	public void deepSaves(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception;		
	
	
	/*--------------------------------- AUDITORIA ---------------------------------*/
	/*
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception;	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,TipoGrammarDetalle tipogrammardetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception;			
	*/
	
	
//IF MAX CODE
	
	/*--------------------------------- CLASSES FKs / RELs ---------------------------------*/
	/*
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
	*/
	
}

