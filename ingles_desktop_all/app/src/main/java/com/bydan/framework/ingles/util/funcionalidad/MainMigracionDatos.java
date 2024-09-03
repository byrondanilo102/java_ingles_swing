package com.bydan.framework.ingles.util.funcionalidad;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
*/

//import com.bydan.ingles.general.business.entity.*;
//import com.bydan.ingles.general.business.logic.*;
//import com.bydan.ingles.general.business.entity.Materia;
//import com.bydan.ingles.general.business.logic.MateriaLogic;

import com.bydan.framework.ingles.util.Connexion;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Constantes2;
import com.bydan.framework.ingles.util.ParameterDbType;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

/*import com.bydan.ingles.general.business.entity.*;*/
import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.tipo.business.entity.Tipo;

/*import com.bydan.ingles.general.business.logic.*;*/
import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.concepto.business.logic.Concepto_logic;
import com.bydan.ingles.general.conceptodetalle.business.logic.ConceptoDetalle_logic;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;


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




public class MainMigracionDatos {	
	
	public static void ProcesarMigracion() throws SQLException, Exception {
		
		Sistema_logic sistemaLogic=new Sistema_logic();//AQUI SE INICIALIZA PARAMETERDBTYPE
		Connexion connexion=new Connexion();
		
		Grupo_logic grupoLogic=new Grupo_logic();
		Nivel_logic nivelLogic=new Nivel_logic();
		Tipo_logic tipoLogic=new Tipo_logic();
		Area_logic areaLogic=new Area_logic();
		Diccionario_logic diccionarioLogic=new Diccionario_logic();
		
		//DatoGeneralIngles datoGeneralIngles=new DatoGeneralIngles();
		ArrayList<DatoGeneralIngles> datosGeneralesIngles=new ArrayList<DatoGeneralIngles>();
		Diccionario diccionario=new Diccionario();
		ArrayList<Diccionario> diccionarios=new ArrayList<Diccionario>();
		
		String sFinalQuery="";
		
		try {
			
			sistemaLogic.getNewConnexionToDeep();			
			connexion=sistemaLogic.getConnexion();
			
			grupoLogic.setConnexion(connexion);
			nivelLogic.setConnexion(connexion);
			tipoLogic.setConnexion(connexion);
			areaLogic.setConnexion(connexion);
			diccionarioLogic.setConnexion(connexion);
			
			grupoLogic.getEntities(sFinalQuery);
			nivelLogic.getEntities(sFinalQuery);
			tipoLogic.getEntities(sFinalQuery);
			areaLogic.getEntities(sFinalQuery);
			diccionarioLogic.getEntities(sFinalQuery);
									
			List rowDataList=ExcellUtil.ProcesarTraerTodosNivelDiccionario("not forgen","-999");
      	   
			datosGeneralesIngles=MainMigracionDatos.cargarDatos(rowDataList);
			
			
			for(DatoGeneralIngles datoGeneralIngles:datosGeneralesIngles) {
				diccionario=new Diccionario();
				
				diccionario.setid_grupo(6L);				
				diccionario.setid_nivel(GetIdNivel(nivelLogic,datoGeneralIngles.Level));
				diccionario.setid_tipo(GetIdTipo(tipoLogic,datoGeneralIngles.Tipo2));
				diccionario.setid_area(GetIdArea(areaLogic,datoGeneralIngles.Tipo));
				
				diccionario.setexpresion(datoGeneralIngles.Spanish);
				diccionario.settraduccion1(datoGeneralIngles.Translate1);
				diccionario.settraduccion2(datoGeneralIngles.Translate2);
				
				diccionarios.add(diccionario);
			}
			
			diccionarioLogic.setDiccionarios(diccionarios);
			
			//diccionarioLogic.saveDiccionarios();
			
			connexion.commit();
			
			System.out.println("PROCESO REALIZADO CORRECTAMENTE");
			
		} catch(Exception ex) {
			connexion.rollback();
			
			ex.printStackTrace();
			
		} finally {
			connexion.close();		
		}
	}
	
	public static ArrayList<DatoGeneralIngles> cargarDatos(List rowDataList) {
		
		ArrayList<DatoGeneralIngles> datosGeneralesIngles=new ArrayList<DatoGeneralIngles>();
		DatoGeneralIngles datoGeneralIngles=new DatoGeneralIngles();
		
		/*
		 HSSFRow hssfRow=null;
		 HSSFCell hssfCell0;
		 HSSFCell hssfCell1;
		 HSSFCell hssfCell2;
		 HSSFCell hssfCell3;
		 HSSFCell hssfCell4;
		 HSSFCell hssfCell5;
		 HSSFCell hssfCell6;
		   
		 Vector<String> row;
		 Vector<Vector> rowData=new Vector<Vector>();
		 
		 Integer i=1;
		 
		 for(Object o:rowDataList) {
			 if(i.equals(1)) {
				 i++;
				 continue;
			 }
			 
			 hssfRow=(HSSFRow)o;
				   
			 hssfCell0 =hssfRow.getCell(0);
			 hssfCell1 =hssfRow.getCell(1);
			 hssfCell2 =hssfRow.getCell(2);
			 hssfCell3 =hssfRow.getCell(3);				   
			 hssfCell4 =hssfRow.getCell(4);
			 hssfCell5 =hssfRow.getCell(5);
			 hssfCell6 =hssfRow.getCell(6);
				   
			 row = new Vector<String>();
			 
			 row.addElement(hssfCell0.toString());
			 row.addElement(hssfCell1.toString());
			 row.addElement(hssfCell2.toString());
			 row.addElement(hssfCell3.toString());
			 row.addElement(hssfCell4.toString());
			 row.addElement(hssfCell5.toString());
			 row.addElement(hssfCell6.toString());
				   
			 rowData.addElement(row);
			 
			 
			 
			 datoGeneralIngles=new DatoGeneralIngles();
			 
			 datoGeneralIngles.Level=hssfCell0.toString();
		     datoGeneralIngles.Tipo = hssfCell1.toString();
			 datoGeneralIngles.Tipo2 = hssfCell2.toString();
			 datoGeneralIngles.Tipo3 = hssfCell3.toString();
			 datoGeneralIngles.Spanish = hssfCell4.toString();
			 datoGeneralIngles.Translate1 = hssfCell5.toString();
			 datoGeneralIngles.Translate2 = hssfCell6.toString();
				
			 System.out.println("F"+i+"->"+datoGeneralIngles);
			 
			 datosGeneralesIngles.add(datoGeneralIngles);
			 
			 i++;
		 }
		 */
		
		 return datosGeneralesIngles;
	}
	
	public static Long GetIdGrupo(Grupo_logic grupoLogic,String sNombre) throws Exception {
		Long id_grupo=-1L;
		
		for(Grupo grupo:grupoLogic.getGrupos()) {
			if(grupo.getnombre().equals(sNombre)) {
				id_grupo=grupo.getId();
			}
		}
		
		if(id_grupo<=0) {
			throw new Exception("NO EXISTE ID GRUPO ="+sNombre);
		}
		
		return id_grupo;
	}
	
	public static Long GetIdNivel(Nivel_logic nivelLogic,String sNivel) throws Exception {
		Long id_nivel=-1L;
		Long lNivel=Long.parseLong(sNivel.replace(".0", ""));
		
		for(Nivel nivel:nivelLogic.getNivels()) {
			if(nivel.getId().equals(lNivel)) {
				id_nivel=nivel.getId();
			}
		}
		
		if(id_nivel<0) {
			throw new Exception("NO EXISTE ID NIVEL ="+lNivel);
		}
		
		return id_nivel;
	}
	
	public static Long GetIdTipo(Tipo_logic tipoLogic,String sNombre) throws Exception {
		Long id_tipo=-1L;
		
		for(Tipo tipo:tipoLogic.getTipos()) {
			if(tipo.getnombre().equals(sNombre)) {
				id_tipo=tipo.getId();
			}
		}
		
		if(id_tipo<=0) {
			throw new Exception("NO EXISTE ID TIPO ="+sNombre);
		}
		
		return id_tipo;
	}
	
	public static Long GetIdArea(Area_logic areaLogic,String sNombre) throws Exception {
		Long id_area=-1L;
		
		for(Area area:areaLogic.getAreas()) {
			if(area.getnombre().equals(sNombre)) {
				id_area=area.getId();
			}
		}
		
		if(id_area<=0) {
			throw new Exception("NO EXISTE ID AREA ="+sNombre);
		}
		
		return id_area;
	}
}

