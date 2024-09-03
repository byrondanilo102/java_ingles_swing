package com.bydan.framework.ingles.util.funcionalidad;

import java.sql.SQLException;
import java.util.List;

import com.bydan.framework.ingles.util.Connexion;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Constantes2;
import com.bydan.framework.ingles.util.ParameterDbType;

//import com.bydan.ingles.general.business.entity.*;
//import com.bydan.ingles.general.business.logic.*;
//import com.bydan.ingles.general.business.entity.Materia;
//import com.bydan.ingles.general.business.logic.MateriaLogic;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;


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


/*import com.bydan.ingles.seguridad.business.logic.*;*/
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic;
import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.historialcambioclave.business.logic.HistorialCambioClave_logic;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.ParametroGeneralSg_logic;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;
import com.bydan.ingles.seguridad.tipofondo.business.logic.TipoFondo_logic;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;
import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic;


public class MainMigracionSeguridad {	
	
	public static void ProcesarMigracion() throws SQLException, Exception {
		//MYSQL
		Constantes.PARAMETERDBTYPE=ParameterDbType.MYSQL;
		InicializarValoresBaseDatos(ParameterDbType.MYSQL);
		Connexion connexionMYSQL=new Connexion();
		Sistema_logic sistemaLogicMYSQL=new Sistema_logic();//AQUI SE INICIALIZA PARAMETERDBTYPE
		//MYSQL-FIN

		//SQLITE
		Constantes.PARAMETERDBTYPE=ParameterDbType.SQLITE;
		InicializarValoresBaseDatos(ParameterDbType.SQLITE);
		Connexion connexionSQLITE=new Connexion();
		Sistema_logic sistemaLogicSQLITE=new Sistema_logic();//AQUI SE INICIALIZA PARAMETERDBTYPE
		//SQLITE-FIN

		try {


			//---------------LEER DATOS ORIGEN---------------------------------------------
			//MYSQL
			sistemaLogicMYSQL.getNewConnexionToDeep();
			connexionMYSQL=sistemaLogicMYSQL.getConnexion();
			InicializarValoresBaseDatos(ParameterDbType.MYSQL);
			//MYSQL-FIN

			
			Pais_logic paisLogic=new Pais_logic();paisLogic.setConnexion(connexionMYSQL);paisLogic.getEntities("");List<Pais> paiss=paisLogic.getPaiss();
			for(Pais pais : paiss) {pais.setIsChanged(true);pais.setIsNew(true);}

			ParametroGeneralSg_logic parametrogeneralsgLogic=new ParametroGeneralSg_logic();parametrogeneralsgLogic.setConnexion(connexionMYSQL);parametrogeneralsgLogic.getEntities("");List<ParametroGeneralSg> parametrogeneralsgs=parametrogeneralsgLogic.getParametroGeneralSgs();
			for(ParametroGeneralSg parametrogeneralsg : parametrogeneralsgs) {parametrogeneralsg.setIsChanged(true);parametrogeneralsg.setIsNew(true);}

			Sistema_logic sistemaLogic=new Sistema_logic();sistemaLogic.setConnexion(connexionMYSQL);sistemaLogic.getEntities("");List<Sistema> sistemas=sistemaLogic.getSistemas();
			for(Sistema sistema : sistemas) {sistema.setIsChanged(true);sistema.setIsNew(true);}

			TipoFondo_logic tipofondoLogic=new TipoFondo_logic();tipofondoLogic.setConnexion(connexionMYSQL);tipofondoLogic.getEntities("");List<TipoFondo> tipofondos=tipofondoLogic.getTipoFondos();
			for(TipoFondo tipofondo : tipofondos) {tipofondo.setIsChanged(true);tipofondo.setIsNew(true);}

			TipoTeclaMascara_logic tipoteclamascaraLogic=new TipoTeclaMascara_logic();tipoteclamascaraLogic.setConnexion(connexionMYSQL);tipoteclamascaraLogic.getEntities("");List<TipoTeclaMascara> tipoteclamascaras=tipoteclamascaraLogic.getTipoTeclaMascaras();
			for(TipoTeclaMascara tipoteclamascara : tipoteclamascaras) {tipoteclamascara.setIsChanged(true);tipoteclamascara.setIsNew(true);}

			Usuario_logic usuarioLogic=new Usuario_logic();usuarioLogic.setConnexion(connexionMYSQL);usuarioLogic.getEntities("");List<Usuario> usuarios=usuarioLogic.getUsuarios();
			for(Usuario usuario : usuarios) {usuario.setIsChanged(true);usuario.setIsNew(true);}

			HistorialCambioClave_logic historialcambioclaveLogic=new HistorialCambioClave_logic();historialcambioclaveLogic.setConnexion(connexionMYSQL);historialcambioclaveLogic.getEntities("");List<HistorialCambioClave> historialcambioclaves=historialcambioclaveLogic.getHistorialCambioClaves();
			for(HistorialCambioClave historialcambioclave : historialcambioclaves) {historialcambioclave.setIsChanged(true);historialcambioclave.setIsNew(true);}

			Paquete_logic paqueteLogic=new Paquete_logic();paqueteLogic.setConnexion(connexionMYSQL);paqueteLogic.getEntities("");List<Paquete> paquetes=paqueteLogic.getPaquetes();
			for(Paquete paquete : paquetes) {paquete.setIsChanged(true);paquete.setIsNew(true);}

			ParametroGeneralUsuario_logic parametrogeneralusuarioLogic=new ParametroGeneralUsuario_logic();parametrogeneralusuarioLogic.setConnexion(connexionMYSQL);parametrogeneralusuarioLogic.getEntities("");List<ParametroGeneralUsuario> parametrogeneralusuarios=parametrogeneralusuarioLogic.getParametroGeneralUsuarios();
			for(ParametroGeneralUsuario parametrogeneralusuario : parametrogeneralusuarios) {parametrogeneralusuario.setIsChanged(true);parametrogeneralusuario.setIsNew(true);}

			Perfil_logic perfilLogic=new Perfil_logic();perfilLogic.setConnexion(connexionMYSQL);perfilLogic.getEntities("");List<Perfil> perfils=perfilLogic.getPerfils();
			for(Perfil perfil : perfils) {perfil.setIsChanged(true);perfil.setIsNew(true);}

			PerfilUsuario_logic perfilusuarioLogic=new PerfilUsuario_logic();perfilusuarioLogic.setConnexion(connexionMYSQL);perfilusuarioLogic.getEntities("");List<PerfilUsuario> perfilusuarios=perfilusuarioLogic.getPerfilUsuarios();
			for(PerfilUsuario perfilusuario : perfilusuarios) {perfilusuario.setIsChanged(true);perfilusuario.setIsNew(true);}

			Provincia_logic provinciaLogic=new Provincia_logic();provinciaLogic.setConnexion(connexionMYSQL);provinciaLogic.getEntities("");List<Provincia> provincias=provinciaLogic.getProvincias();
			for(Provincia provincia : provincias) {provincia.setIsChanged(true);provincia.setIsNew(true);}

			ResumenUsuario_logic resumenusuarioLogic=new ResumenUsuario_logic();resumenusuarioLogic.setConnexion(connexionMYSQL);resumenusuarioLogic.getEntities("");List<ResumenUsuario> resumenusuarios=resumenusuarioLogic.getResumenUsuarios();
			for(ResumenUsuario resumenusuario : resumenusuarios) {resumenusuario.setIsChanged(true);resumenusuario.setIsNew(true);}

			Ciudad_logic ciudadLogic=new Ciudad_logic();ciudadLogic.setConnexion(connexionMYSQL);ciudadLogic.getEntities("");List<Ciudad> ciudads=ciudadLogic.getCiudads();
			for(Ciudad ciudad : ciudads) {ciudad.setIsChanged(true);ciudad.setIsNew(true);}

			DatoGeneralUsuario_logic datogeneralusuarioLogic=new DatoGeneralUsuario_logic();datogeneralusuarioLogic.setConnexion(connexionMYSQL);datogeneralusuarioLogic.getEntities("");List<DatoGeneralUsuario> datogeneralusuarios=datogeneralusuarioLogic.getDatoGeneralUsuarios();
			for(DatoGeneralUsuario datogeneralusuario : datogeneralusuarios) {datogeneralusuario.setIsChanged(true);datogeneralusuario.setIsNew(true);}

			Modulo_logic moduloLogic=new Modulo_logic();moduloLogic.setConnexion(connexionMYSQL);moduloLogic.getEntities("");List<Modulo> modulos=moduloLogic.getModulos();
			for(Modulo modulo : modulos) {modulo.setIsChanged(true);modulo.setIsNew(true);}


			//---------------GUARDAR DATOS DESTINO---------------------------------------------


			Constantes2.IS_DEVELOPING_MIGRATION=true;

			//SQLITE
			sistemaLogicSQLITE.getNewConnexionToDeep();
			connexionSQLITE=sistemaLogicSQLITE.getConnexion();
			InicializarValoresBaseDatos(ParameterDbType.SQLITE);
			//SQLITE-FIN
			paisLogic=new Pais_logic();paisLogic.setConnexion(connexionSQLITE);paisLogic.setPaiss(paiss); paisLogic.saves();
			parametrogeneralsgLogic=new ParametroGeneralSg_logic();parametrogeneralsgLogic.setConnexion(connexionSQLITE);parametrogeneralsgLogic.setParametroGeneralSgs(parametrogeneralsgs); parametrogeneralsgLogic.saves();
			sistemaLogic=new Sistema_logic();sistemaLogic.setConnexion(connexionSQLITE);sistemaLogic.setSistemas(sistemas); sistemaLogic.saves();
			tipofondoLogic=new TipoFondo_logic();tipofondoLogic.setConnexion(connexionSQLITE);tipofondoLogic.setTipoFondos(tipofondos); tipofondoLogic.saves();
			tipoteclamascaraLogic=new TipoTeclaMascara_logic();tipoteclamascaraLogic.setConnexion(connexionSQLITE);tipoteclamascaraLogic.setTipoTeclaMascaras(tipoteclamascaras); tipoteclamascaraLogic.saves();
			usuarioLogic=new Usuario_logic();usuarioLogic.setConnexion(connexionSQLITE);usuarioLogic.setUsuarios(usuarios); usuarioLogic.saves();
			historialcambioclaveLogic=new HistorialCambioClave_logic();historialcambioclaveLogic.setConnexion(connexionSQLITE);historialcambioclaveLogic.setHistorialCambioClaves(historialcambioclaves); historialcambioclaveLogic.saves();
			paqueteLogic=new Paquete_logic();paqueteLogic.setConnexion(connexionSQLITE);paqueteLogic.setPaquetes(paquetes); paqueteLogic.saves();
			parametrogeneralusuarioLogic=new ParametroGeneralUsuario_logic();parametrogeneralusuarioLogic.setConnexion(connexionSQLITE);parametrogeneralusuarioLogic.setParametroGeneralUsuarios(parametrogeneralusuarios); parametrogeneralusuarioLogic.saves();
			perfilLogic=new Perfil_logic();perfilLogic.setConnexion(connexionSQLITE);perfilLogic.setPerfils(perfils); perfilLogic.saves();
			perfilusuarioLogic=new PerfilUsuario_logic();perfilusuarioLogic.setConnexion(connexionSQLITE);perfilusuarioLogic.setPerfilUsuarios(perfilusuarios); perfilusuarioLogic.saves();
			provinciaLogic=new Provincia_logic();provinciaLogic.setConnexion(connexionSQLITE);provinciaLogic.setProvincias(provincias); provinciaLogic.saves();
			resumenusuarioLogic=new ResumenUsuario_logic();resumenusuarioLogic.setConnexion(connexionSQLITE);resumenusuarioLogic.setResumenUsuarios(resumenusuarios); resumenusuarioLogic.saves();
			ciudadLogic=new Ciudad_logic();ciudadLogic.setConnexion(connexionSQLITE);ciudadLogic.setCiudads(ciudads); ciudadLogic.saves();
			datogeneralusuarioLogic=new DatoGeneralUsuario_logic();datogeneralusuarioLogic.setConnexion(connexionSQLITE);datogeneralusuarioLogic.setDatoGeneralUsuarios(datogeneralusuarios); datogeneralusuarioLogic.saves();
			moduloLogic=new Modulo_logic();moduloLogic.setConnexion(connexionSQLITE);moduloLogic.setModulos(modulos); moduloLogic.saves();
			

			connexionMYSQL.commit();
			connexionSQLITE.commit();

			
			
			System.out.println("PROCESO REALIZADO CORRECTAMENTE...");

		} catch(Exception ex) {
			connexionMYSQL.rollback();
			connexionSQLITE.rollback();

			ex.printStackTrace();
			
		} finally {
			connexionMYSQL.close();
			connexionSQLITE.close();
		}
	}

	
	private static void InicializarValoresBaseDatos(ParameterDbType parameterDbType) {
		
		if(parameterDbType.equals(ParameterDbType.SQLITE)) {
    		
			Constantes2.PS="";
    		
    		Constantes.SCHEMA="";
    		Constantes.SCHEMA_SEGURIDAD="";
    		Constantes.SCHEMA_GENERAL="";
    		Constantes.SCHEMA_GRAMATICA="";
    		
    		/*
    		Constantes.SCHEMA_SEMESTRE01="";
    		Constantes.SCHEMA_SEMESTRE02="";
    		Constantes.SCHEMA_SEMESTRE03="";
    		Constantes.SCHEMA_SEMESTRE04="";
    		Constantes.SCHEMA_SEMESTRE05="";
    		*/
    		
    	
		} else if(parameterDbType.equals(ParameterDbType.MYSQL)) {
			
			Constantes2.PS=".";
    		
    		Constantes.SCHEMA="2015_auditoria";
    		Constantes.SCHEMA_SEGURIDAD="2015_auditoria";
    		Constantes.SCHEMA_GENERAL="2015_auditoria";
    		Constantes.SCHEMA_GRAMATICA="2015_auditoria";
    		
    		/*
    		Constantes.SCHEMA_SEMESTRE01="2015_auditoria";
    		Constantes.SCHEMA_SEMESTRE02="2015_auditoria";
    		Constantes.SCHEMA_SEMESTRE03="2015_auditoria";
    		Constantes.SCHEMA_SEMESTRE04="2015_auditoria";
    		Constantes.SCHEMA_SEMESTRE05="2015_auditoria";
    		*/
    	}
	}
	
	public static void ProcesarMigracion2() throws SQLException, Exception {
		//MYSQL
		Constantes.PARAMETERDBTYPE=ParameterDbType.MYSQL;
		Connexion connexionMYSQL=new Connexion();
		Sistema_logic sistemaLogicMYSQL=new Sistema_logic();//AQUI SE INICIALIZA PARAMETERDBTYPE
		//MYSQL-FIN

		//SQLITE
		Constantes.PARAMETERDBTYPE=ParameterDbType.SQLITE;
		Connexion connexionSQLITE=new Connexion();
		Sistema_logic sistemaLogicSQLITE=new Sistema_logic();//AQUI SE INICIALIZA PARAMETERDBTYPE
		//SQLITE-FIN

		try {


			//---------------LEER DATOS ORIGEN---------------------------------------------
			//MYSQL
			sistemaLogicMYSQL.getNewConnexionToDeep();
			connexionMYSQL=sistemaLogicMYSQL.getConnexion();
			InicializarValoresBaseDatos(ParameterDbType.MYSQL);
			//MYSQL-FIN

			//Materia_logic materiaLogic=new Materia_logic();materiaLogic.setConnexion(connexionMYSQL);materiaLogic.getEntities("");
			//for(Materia materia : materiaLogic.getMaterias()) {materia.setIsChanged(true);materia.setIsNew(true);}

			Perfil_logic perfilLogic=new Perfil_logic();perfilLogic.setConnexion(connexionMYSQL);perfilLogic.getEntities("");
			for(Perfil perfil : perfilLogic.getPerfils()) {perfil.setIsChanged(true);perfil.setIsNew(true);}

			
			//---------------GUARDAR DATOS DESTINO---------------------------------------------


			Constantes2.IS_DEVELOPING_MIGRATION=true;

			//SQLITE
			sistemaLogicSQLITE.getNewConnexionToDeep();
			connexionSQLITE=sistemaLogicSQLITE.getConnexion();
			InicializarValoresBaseDatos(ParameterDbType.SQLITE);
			//SQLITE-FIN

			//materiaLogic.setConnexion(connexionSQLITE);materiaLogic.saveMaterias();

			perfilLogic.setConnexion(connexionSQLITE);perfilLogic.saves();


			connexionMYSQL.commit();
			connexionSQLITE.commit();


			System.out.println("PROCESO REALIZADO CORRECTAMENTE...");

		} catch(Exception ex) {
			connexionMYSQL.rollback();
			connexionSQLITE.rollback();

			ex.printStackTrace();
		}
	}
}

