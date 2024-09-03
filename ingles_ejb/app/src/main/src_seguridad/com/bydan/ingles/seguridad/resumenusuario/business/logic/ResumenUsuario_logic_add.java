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
package com.bydan.ingles.seguridad.resumenusuario.business.logic;

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

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic_add;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.ParametroGeneralSg_logic;

import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.sistema.util.SeguridadSql;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_param_return;
//import com.bydan.ingles.seguridad.util.ResumenUsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.FuncionesJsp;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;

//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.dataaccess.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
/*import com.bydan.ingles.seguridad.business.entity.*;*/



@SuppressWarnings("unused")
final public class ResumenUsuario_logic_add extends ResumenUsuario_logic {		
	
	//CONTROL_INICIO
	public  ResumenUsuario_logic_add()throws Exception {
		super();
    }
	
	public static void checkResumenUsuarioToSave(ResumenUsuario resumenusuario,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_1
	}
	
	public static void checkResumenUsuarioToSave(ResumenUsuario resumenusuario,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_2
	}
	
	public static void checkResumenUsuarioToSaveAfter(ResumenUsuario resumenusuario,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_3
	}
	
	public static void checkResumenUsuarioToSaves(List<ResumenUsuario> resumenusuarios,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_4
	}
	
	public static void checkResumenUsuarioToSaves(List<ResumenUsuario> resumenusuarios,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_5
	}
	
	public static void checkResumenUsuarioToSavesAfter(List<ResumenUsuario> resumenusuarios,DatosCliente datosCliente,Connexion connexion,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_6
	}
	
	public static void checkResumenUsuarioToGet(ResumenUsuario resumenusuario,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_7
	}
	
	public static void checkResumenUsuarioToGets(List<ResumenUsuario> resumenusuarios,DatosCliente datosCliente,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_8
	}
	
	public static void updateResumenUsuarioToSave(ResumenUsuario resumenusuario,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_9
	}		
						
	public static void updateResumenUsuarioToGet(ResumenUsuario resumenusuario,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_10
	}	
	
	public static void updateJSONObjectResumenUsuarioActions(String sTipoJsonResponse,ArrayList<DatoGeneral> arrDatoGeneral) {
		//,JSONObject jsonObjectResumenUsuario
		//CONTROL_11
	}
	
	public static String getJsonResumenUsuarioDataTable(String sTipoJsonResponse,ResumenUsuario resumenusuario,ArrayList<DatoGeneral> arrDatoGeneral) {
		String sJsonDataTable="";
		
		//CONTROL_12
		
		return sJsonDataTable;
	}
	
	public static String getJsonResumenUsuariosDataTable(String sTipoJsonResponse,List<ResumenUsuario> resumenusuarios,ArrayList<DatoGeneral> arrDatoGeneral) {
		String sJsonDataTable="";
		
		//CONTROL_13
		
		return sJsonDataTable;
	}
	
	/*
	public static JSONArray getJsonArrayResumenUsuarioColumnsDefaultTable(String sTipoJsonResponse,ArrayList<DatoGeneral> arrDatoGeneral)throws Exception {	
		JSONArray jsonArrayResumenUsuariosColumns = new JSONArray();
		
		//CONTROL_14
		
		return jsonArrayResumenUsuariosColumns;
	}
	
	public static void updateJSONArrayResumenUsuarioActionsColumns(String sTipoJsonResponse,JSONArray jsonObjectResumenUsuario,ArrayList<DatoGeneral> arrDatoGeneral) {	
		//CONTROL_15
	}
	*/
	
	//PARA ACCIONES ADDITIONAL
	public Boolean ProcesarAccion(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,String sProceso,List<ResumenUsuario> resumenusuarios) throws Exception  {
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
	
	
	
	
	public ResumenUsuario validarResumenUsuario(Usuario usuario,Boolean ingreso_nuevo,Boolean esCerrarSesion) throws Exception {	
		ResumenUsuario resumen_usuario=new ResumenUsuario();
			
		try	{

			resumen_usuario=this.traerResumenUsuarioActual(usuario);
			
			/*
			sFinalQuery=' where id_usuario=\''.usuario.getId().'\'';
			//sFinalQuery=' where username=\''.sLogin.'\'';
			
			queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setInitialQuery("");
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.getEntities(queryWhereSelectParameters);
			
			foreach(this.getResumenUsuarios() as resumen_usuarioLocal){ 
				resumen_usuario=resumen_usuarioLocal;
				break;
			}				
			*/
						
			if(resumen_usuario.getId()<=0 || resumen_usuario==null) {
				if(ingreso_nuevo) {
					resumen_usuario=new ResumenUsuario();

					if(esCerrarSesion) {
						resumen_usuario.setnumero_ingreso_actual(0L);
					} else {
						resumen_usuario.setnumero_ingreso_actual(1L);
					}
					
					resumen_usuario.setid_usuario(usuario.getId());
					
					this.setResumenUsuario(resumen_usuario);
					
					this.save();
											
					resumen_usuario=this.traerResumenUsuarioActual(usuario);
					
					resumen_usuario.setnumero_ingreso_actual(0L);
				}
			} else {
				if(esCerrarSesion) {
					resumen_usuario.setnumero_ingreso_actual(0L);																							
				} else {
					resumen_usuario.setnumero_ingreso_actual(resumen_usuario.getnumero_ingreso_actual() + 1);
				}
				
				this.setResumenUsuario(resumen_usuario);						
				this.save();

				resumen_usuario=this.traerResumenUsuarioActual(usuario);
				
				if(!esCerrarSesion) {
					if(resumen_usuario.getnumero_ingreso_actual()==1) {
						resumen_usuario.setnumero_ingreso_actual(0L);
					}
				}					
			}
		} catch(Exception e) {
			//Funciones::logShowExceptionMessages(logger,e);
			
			throw e;
		}
		
		return resumen_usuario;
	}
	
	public ResumenUsuario traerResumenUsuarioActual(Usuario usuario) throws Exception {
		ResumenUsuario resumen_usuario=new ResumenUsuario();
		
		String sFinalQuery=" where id_usuario="+usuario.getId()+"";
		//sFinalQuery=" where username=\"".sLogin."\"";
				
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		queryWhereSelectParameters.setInitialQuery("");
		queryWhereSelectParameters.setFinalQuery(sFinalQuery);
				
		this.getEntities(queryWhereSelectParameters);
				
		for(ResumenUsuario resumen_usuarioLocal : this.getResumenUsuarios()){ 
			resumen_usuario=resumen_usuarioLocal;
			break;
		}

		return resumen_usuario;
	}
	
	public ResumenUsuario_param_return validarUsuarioCerrarUsuarioAutomaticoWithConnection(String sUsuario,String sPassword,Boolean esDeveloping)throws Exception {//Boolean paraCerrarSessionDesdeLogin
		Boolean esErrorIngreso=false;
		Boolean isValidado=false;
		ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
		
		resumenUsuarioReturnGeneral.setEsValidado(isValidado);
		resumenUsuarioReturnGeneral.setEsError(esErrorIngreso);
		
		try {	
			connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-validarUsuarioCerrarUsuarioAutomaticoWithConnection");connexion.begin();			
		
			Usuario_logic_add usuarioLogicAdditional=new Usuario_logic_add();
			Usuario usuarioActual=new Usuario();
			
			usuarioLogicAdditional.setConnexion(this.connexion);
			
			usuarioActual=usuarioLogicAdditional.validarUsuario(sUsuario,sPassword,false);
			
			if(usuarioActual!=null && usuarioActual.getId()>0) {
				isValidado=true;
				resumenUsuarioReturnGeneral.setEsValidado(isValidado);
			}
			
			if(isValidado) {
				esErrorIngreso=this.manejarResumenUsuarioAutomaticoWithConnection(usuarioActual.getId(),true,esDeveloping,false);//paraCerrarSessionDesdeLogin
				
				resumenUsuarioReturnGeneral.setEsError(esErrorIngreso);
				
				if(!esErrorIngreso) {
					//NO HACE NADA					
				}
				
			}
			
			/*
			else {
				throw new Exception("USUARIO O PASSWORD INCORRECTO");
			}
			*/
						
			connexion.commit();			
			
		} catch(Exception e) {
			connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			connexion.close();			
		}
		
		return resumenUsuarioReturnGeneral;
	}
	
	public ResumenUsuario_param_return validarUsuarioLoginUsuarioAutomaticoWithConnection(String sUsuario,String sPassword,Boolean esDeveloping)throws Exception {//Boolean paraCerrarSessionDesdeLogin,
		Boolean esErrorIngreso=false;
		Boolean isValidado=false;
		String sFinalQuery="";
		
		ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
		
		resumenUsuarioReturnGeneral.setEsValidado(isValidado);
		resumenUsuarioReturnGeneral.setEsError(esErrorIngreso);
		
		try {	
			connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-validarUsuarioLoginUsuarioAutomaticoWithConnection");connexion.begin();			
		
			Usuario_logic_add usuarioLogicAdditional=new Usuario_logic_add();
			ParametroGeneralUsuario_logic parametroGeneralUsuarioLogic=new ParametroGeneralUsuario_logic();
			ParametroGeneralSg_logic parametroGeneralSgLogic=new ParametroGeneralSg_logic();
			
			Usuario usuarioActual=new Usuario();
			ParametroGeneralUsuario parametroGeneralUsuario=new ParametroGeneralUsuario();
			ParametroGeneralSg parametroGeneralSg=new ParametroGeneralSg();
			
			usuarioLogicAdditional.setConnexion(this.connexion);
			parametroGeneralUsuarioLogic.setConnexion(this.connexion);
			parametroGeneralSgLogic.setConnexion(this.connexion);
			
			usuarioActual=usuarioLogicAdditional.validarUsuario(sUsuario,sPassword,false);
			
			if(usuarioActual!=null && usuarioActual.getId()>0) {
				isValidado=true;
				resumenUsuarioReturnGeneral.setEsValidado(isValidado);
				resumenUsuarioReturnGeneral.setUsuarioActual(usuarioActual);
			}
			
			if(isValidado) {
				esErrorIngreso=this.manejarResumenUsuarioAutomaticoWithConnection(usuarioActual.getId(),false,esDeveloping,false);//paraCerrarSessionDesdeLogin
				
				resumenUsuarioReturnGeneral.setEsError(esErrorIngreso);
				resumenUsuarioReturnGeneral.setResumenUsuario(this.resumenusuario);
				
				if(!esErrorIngreso) {
					//NO HACE NADA					
				}

				//CARGAR PARAMETRO GENERAL USUARIO
				//parametroGeneralUsuarioLogic.setDatosCliente(this.datosCliente);
								
								
				parametroGeneralUsuarioLogic.getEntity(usuarioActual.getId());
					
				if(parametroGeneralUsuarioLogic.getParametroGeneralUsuario()!=null && parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getId()>0) {
					parametroGeneralUsuario=parametroGeneralUsuarioLogic.getParametroGeneralUsuario();
					//System.out.println(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getnombre_empresa());
				} else {
					parametroGeneralUsuario= new ParametroGeneralUsuario();
				}		
				
				resumenUsuarioReturnGeneral.setParametroGeneralUsuario(parametroGeneralUsuario);
				
				
				//CARGAR PARAMETRO GENERAL SG
				parametroGeneralSgLogic.setDatosCliente(this.datosCliente);
								
				sFinalQuery=SeguridadSql.GetWhereParametroGeneralActivo(parametroGeneralSgLogic.getConnexionType(), parametroGeneralSgLogic.getParameterDbType());
								
				parametroGeneralSgLogic.getEntity(sFinalQuery);
					
				if(parametroGeneralSgLogic.getParametroGeneralSg()!=null && parametroGeneralSgLogic.getParametroGeneralSg().getId()>0) {
					parametroGeneralSg=parametroGeneralSgLogic.getParametroGeneralSg();
						//System.out.println(this.parametroGeneralSgLogic.getParametroGeneralSg().getnombre_empresa());
				} else {
					parametroGeneralSg= new ParametroGeneralSg();
				}		
				
				resumenUsuarioReturnGeneral.setParametroGeneralSg(parametroGeneralSg);
			}
			
			
			/*
			else {
				throw new Exception("USUARIO O PASSWORD INCORRECTO");
			}
			*/
						
			connexion.commit();
			
			
		} catch(Exception e) {
			connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			connexion.close();			
		}
		
		return resumenUsuarioReturnGeneral;
	}
	
	public Boolean manejarResumenUsuarioAutomaticoWithConnection(Long idUsuario,Boolean paraCerrarSessionDesdeLogin,Boolean esDeveloping)throws Exception {
		Boolean esErrorIngreso=false;
		
		esErrorIngreso=this.manejarResumenUsuarioAutomaticoWithConnection(idUsuario,paraCerrarSessionDesdeLogin,esDeveloping,true);
		
		return esErrorIngreso;
	}
	
	public Boolean manejarResumenUsuarioAutomaticoWithConnection(Long idUsuario,Boolean paraCerrarSessionDesdeLogin,Boolean esDeveloping,Boolean conConnexion)throws Exception {
		Boolean esErrorIngreso=false;
		
		try {	
			
			if(conConnexion) {
				connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);connexion.begin();			
			}
			
			String sFinalQuery=" where id_usuario="+idUsuario;
			
			
			this.getEntity(sFinalQuery);
    		
			
			if(this.resumenusuario!=null && this.resumenusuario.getId()>0) {
				
				if(!paraCerrarSessionDesdeLogin) {
				
	    			this.resumenusuario.setnumero_ingresos(this.resumenusuario.getnumero_ingresos()+1);
	    			this.resumenusuario.setnumero_intentos(this.resumenusuario.getnumero_intentos()+1);
	    			
	    			if(this.resumenusuario.getnumero_ingreso_actual()<=0) {
	    				this.resumenusuario.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual()+1);
	    				
	    				this.resumenusuario.setfecha_ultimo_ingreso(new Date());
	    				this.resumenusuario.setfecha_ultimo_intento(new Date());
	    				
	    			} else {
	    				this.resumenusuario.setnumero_error_ingreso(this.resumenusuario.getnumero_error_ingreso()+1);
	    				this.resumenusuario.setfecha_ultimo_error_ingreso(new Date()); 
	    				
	    				if(!esDeveloping) {
	    					esErrorIngreso=true;
	    				}
	    			}
				} else {
					this.resumenusuario.setnumero_reinicios(this.resumenusuario.getnumero_reinicios()+1);
	    			this.resumenusuario.setnumero_ingreso_actual(0L);
				}
				
    		} else {
    			this.resumenusuario=new ResumenUsuario();
    			
    			if(!paraCerrarSessionDesdeLogin) {
	    			this.resumenusuario.setid_usuario(idUsuario);
	    			this.resumenusuario.setnumero_ingresos(this.resumenusuario.getnumero_ingresos()+1);
	    			this.resumenusuario.setnumero_intentos(this.resumenusuario.getnumero_intentos()+1);
	    			this.resumenusuario.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual()+1);    				
					this.resumenusuario.setfecha_ultimo_ingreso(new Date());
					this.resumenusuario.setfecha_ultimo_intento(new Date());
					
    			} else {
    				this.resumenusuario.setid_usuario(idUsuario);
	    			//this.resumenusuario.setnumero_ingresos(this.resumenusuario.getnumero_ingresos()+1);
	    			//this.resumenusuario.setnumero_intentos(this.resumenusuario.getnumero_intentos()+1);
	    			this.resumenusuario.setnumero_reinicios(this.resumenusuario.getnumero_reinicios()+1);
	    			this.resumenusuario.setnumero_ingreso_actual(0L);    			
    			}
    		}
    		
    		
			this.save();
			
			if(conConnexion) {
				connexion.commit();
			}
			
		} catch(Exception e) {
			if(conConnexion) {
				connexion.rollback();
			}
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
      		if(conConnexion) {
      			connexion.close();
      		}
		}
		
		return esErrorIngreso;
	}
	
	
	public void cerrarSesionUsuarioWithConnection(Long idUsuario)throws Exception {
		try {
		
			connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);connexion.begin();			
			
			String sFinalQuery=" where id_usuario="+idUsuario;
    		
			this.getEntity(sFinalQuery);
	    	
	    					    		
    		if(this.resumenusuario!=null && this.resumenusuario.getId()>0) {
    			//this.resumenusuario.setnumero_ingresos(this.resumenusuario.getnumero_ingresos()+1);
    			//this.resumenusuario.setnumero_intentos(this.resumenusuario.getnumero_intentos()+1);
    			
    			/*
    			if(this.resumenusuario.getnumero_ingreso_actual()<=0) {
    				this.resumenusuario.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual()+1);
    				
    				this.resumenusuario.setfecha_ultimo_ingreso(new Date());
    				this.resumenusuario.setfecha_ultimo_intento(new Date());
    				
    			} else {
    				this.resumenusuario.setnumero_error_ingreso(this.resumenusuario.getnumero_error_ingreso()+1);
    				this.resumenusuario.setfecha_ultimo_error_ingreso(new Date());
    				
    				esErrorIngreso=true;	    				
    			}
    			*/
    			
    			this.resumenusuario.setnumero_cierres(this.resumenusuario.getnumero_cierres()+1);
    			this.resumenusuario.setnumero_ingreso_actual(0L);
    			
    		} else {
    			this.resumenusuario=new ResumenUsuario();
    			
    			this.resumenusuario.setid_usuario(idUsuario);
    			//this.resumenusuario.setnumero_ingresos(this.resumenusuario.getnumero_ingresos()+1);
    			//this.resumenusuario.setnumero_intentos(this.resumenusuario.getnumero_intentos()+1);
    			this.resumenusuario.setnumero_cierres(this.resumenusuario.getnumero_cierres()+1);
    			this.resumenusuario.setnumero_ingreso_actual(0L);    				
				//this.resumenusuario.setfecha_ultimo_ingreso(new Date());
				//this.resumenusuario.setfecha_ultimo_intento(new Date());    				
    		}
    		
    		
    		this.save();
	    		
    		connexion.commit();	
    		
		} catch(Exception e) {
			connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
	  	} finally {
			connexion.close();			
		}
	}
	
	public void registrarErrorLoginSesionUsuarioWithConnection(String sUsuario)throws Exception {
		try {
		
			connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);connexion.begin();			
			
			
			Usuario_logic usuarioLogic=new Usuario_logic();
    		
			Usuario usuarioActual=new Usuario(); 
			
			usuarioLogic.setConnexion(this.connexion);
    		
			String sFinalQuery=" where user_name='"+sUsuario+"'";
    		
    		//usuarioLogic.setDatosCliente(this.datosCliente);
			
	    	usuarioLogic.getEntity(sFinalQuery);
	    	usuarioActual=usuarioLogic.getUsuario();
	    					 
    		
    		if(usuarioActual!=null && usuarioActual.getId()>0) {
	    			
				//this.setDatosCliente(this.datosCliente);
    			
    			sFinalQuery=" where id_usuario="+usuarioActual.getId();
    			
		    	this.getEntity(sFinalQuery);
		    	
		    	resumenusuario=this.getResumenUsuario();
		    						
	    		
	    		if(resumenusuario!=null && resumenusuario.getId()>0) {
	    			//resumenusuario.setnumero_ingresos(resumenusuario.getnumero_ingresos()+1);
	    			resumenusuario.setnumero_intentos(resumenusuario.getnumero_intentos()+1);
	    			
	    			//if(resumenusuario.getnumero_ingreso_actual()<=0) {
	    				//resumenusuario.setnumero_ingreso_actual(resumenusuario.getnumero_ingreso_actual()+1);
	    				
	    				//resumenusuario.setfecha_ultimo_ingreso(new Date());
	    				//resumenusuario.setfecha_ultimo_intento(new Date());
	    				
	    			//} else {
	    				resumenusuario.setnumero_error_ingreso(resumenusuario.getnumero_error_ingreso()+1);
	    				resumenusuario.setfecha_ultimo_error_ingreso(new Date());
	    				
	    				//throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    			//}
	    		} else {
	    			resumenusuario=new ResumenUsuario();
	    			
	    			resumenusuario.setid_usuario(usuarioActual.getId());
	    			//resumenusuario.setnumero_ingresos(resumenusuario.getnumero_ingresos()+1);
	    			resumenusuario.setnumero_error_ingreso(resumenusuario.getnumero_error_ingreso()+1);
	    			resumenusuario.setnumero_intentos(resumenusuario.getnumero_intentos()+1);
	    			//resumenusuario.setnumero_ingreso_actual(resumenusuario.getnumero_ingreso_actual()+1);    				
    				//resumenusuario.setfecha_ultimo_ingreso(new Date());
    				resumenusuario.setfecha_ultimo_intento(new Date()); 
    				resumenusuario.setfecha_ultimo_error_ingreso(new Date());
	    		}
	    		
	    		//this.setResumenUsuario(resumenusuario);
	    		
		    	this.save();
		    						
    		}
	    		
    		connexion.commit();	
    		
		} catch(Exception e) {
			connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
	  	} finally {
			connexion.close();			
		}
	}
	
	//CONTROL_FUNCION2
}