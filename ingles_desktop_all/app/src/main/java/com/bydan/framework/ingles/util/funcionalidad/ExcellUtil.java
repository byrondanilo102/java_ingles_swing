package com.bydan.framework.ingles.util.funcionalidad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

/*
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
*/

import com.bydan.framework.ingles.presentation.swing.jinternalframes.SortExcellJFrame;
import com.bydan.framework.ingles.util.Connexion;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.logic.Area_logic;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;

import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.concepto.business.logic.Concepto_logic;

import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.conceptodetalle.business.logic.ConceptoDetalle_logic;

import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;

import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;

import com.bydan.ingles.gramatica.numerogeneral.business.entity.NumeroGeneral;
import com.bydan.ingles.gramatica.numerogeneral.business.logic.NumeroGeneral_logic;

import com.bydan.ingles.gramatica.paisgeneral.business.entity.PaisGeneral;
import com.bydan.ingles.gramatica.paisgeneral.business.logic.PaisGeneral_logic;

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.PronombreObjeto;
import com.bydan.ingles.gramatica.pronombreobjeto.business.logic.PronombreObjeto_logic;

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.business.logic.Pronun_logic;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;

import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;

import com.bydan.ingles.gramatica.tipogrammar.business.logic.TipoGrammar_logic;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;

public class ExcellUtil {
	public enum TipoDato { INT, STRING, DOUBLE, BOOLEAN}
	
	public static  String ProcesarSorteo(Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		Diccionario_logic diccionarioLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			int intNumeroFilas=0;
			
			diccionarioLogic=new Diccionario_logic();
			
			diccionarioLogic.getNewConnexionToDeep();
			connexion=diccionarioLogic.getConnexion();
			
			sFinalQuery=" where id_nivel="+sNivel;
			
			diccionarioLogic.getEntities(sFinalQuery);
			
			rowDataList.addAll(diccionarioLogic.getDiccionarios());
			
			intNumeroFilas=diccionarioLogic.getDiccionarios().size();
			
			int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
			 			
			Diccionario diccionarioFavorecido=diccionarioLogic.getDiccionarios().get(intNumeroFavorecido);
					
			strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(diccionarioFavorecido,iMilisegundos);
			 	
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return strDescripcionFilaFavorecida;		
	}

	public static  Diccionario ProcesarSorteoDiccionario(Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		Diccionario diccionarioFavorecido=new Diccionario();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		Diccionario_logic diccionarioLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			diccionarioLogic=new Diccionario_logic();
			
			diccionarioLogic.getNewConnexionToDeep();
			connexion=diccionarioLogic.getConnexion();
			
			sFinalQuery=" where id_nivel="+sNivel;
			
			diccionarioLogic.getEntities(sFinalQuery);
			
			rowDataList.addAll(diccionarioLogic.getDiccionarios());
			
			intNumeroFilas=diccionarioLogic.getDiccionarios().size();
			
			
			if(intNumeroFilas>0) {
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				diccionarioFavorecido=diccionarioLogic.getDiccionarios().get(intNumeroFavorecido);
						
				strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(diccionarioFavorecido,iMilisegundos);
				 	
				diccionarioFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return diccionarioFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  VerboIrregular ProcesarSorteoVerboIrregular(List<VerboIrregular> verbo_irregulars,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		VerboIrregular verboIrregularFavorecido=new VerboIrregular();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		VerboIrregular_logic verboIrregularLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			verboIrregularLogic=new VerboIrregular_logic();
			
			verboIrregularLogic.getNewConnexionToDeep();
			connexion=verboIrregularLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboIrregularLogic.setVerboIrregulars(verbo_irregulars);
			
			rowDataList.addAll(verboIrregularLogic.getVerboIrregulars());
			
			intNumeroFilas=verboIrregularLogic.getVerboIrregulars().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				verboIrregularFavorecido=verboIrregularLogic.getVerboIrregulars().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				verboIrregularFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return verboIrregularFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  VerboCompuesto ProcesarSorteoVerboCompuesto(List<VerboCompuesto> verbo_compuestos,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		VerboCompuesto verboCompuestoFavorecido=new VerboCompuesto();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		VerboCompuesto_logic verboCompuestoLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			verboCompuestoLogic=new VerboCompuesto_logic();
			
			verboCompuestoLogic.getNewConnexionToDeep();
			connexion=verboCompuestoLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboCompuestoLogic.setVerboCompuestos(verbo_compuestos);
			
			rowDataList.addAll(verboCompuestoLogic.getVerboCompuestos());
			
			intNumeroFilas=verboCompuestoLogic.getVerboCompuestos().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				verboCompuestoFavorecido=verboCompuestoLogic.getVerboCompuestos().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				verboCompuestoFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return verboCompuestoFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  Vocabulario ProcesarSorteoVocabulario(List<Vocabulario> vocabularios,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		Vocabulario vocabularioFavorecido=new Vocabulario();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		Vocabulario_logic vocabularioLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			vocabularioLogic=new Vocabulario_logic();
			
			vocabularioLogic.getNewConnexionToDeep();
			connexion=vocabularioLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			vocabularioLogic.setVocabularios(vocabularios);
			
			rowDataList.addAll(vocabularioLogic.getVocabularios());
			
			intNumeroFilas=vocabularioLogic.getVocabularios().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				vocabularioFavorecido=vocabularioLogic.getVocabularios().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				vocabularioFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return vocabularioFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static NumeroGeneral ProcesarSorteoNumeroGeneral(List<NumeroGeneral> numero_generals,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		NumeroGeneral numeroGeneralFavorecido=new NumeroGeneral();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		NumeroGeneral_logic numeroGeneralLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			numeroGeneralLogic=new NumeroGeneral_logic();
			
			numeroGeneralLogic.getNewConnexionToDeep();
			connexion=numeroGeneralLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			numeroGeneralLogic.setNumeroGenerals(numero_generals);
			
			rowDataList.addAll(numeroGeneralLogic.getNumeroGenerals());
			
			intNumeroFilas=numeroGeneralLogic.getNumeroGenerals().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				numeroGeneralFavorecido=numeroGeneralLogic.getNumeroGenerals().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				numeroGeneralFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return numeroGeneralFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  PaisGeneral ProcesarSorteoPaisGeneral(List<PaisGeneral> pais_generals,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		PaisGeneral paisGeneralFavorecido=new PaisGeneral();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		PaisGeneral_logic paisGeneralLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			paisGeneralLogic=new PaisGeneral_logic();
			
			paisGeneralLogic.getNewConnexionToDeep();
			connexion=paisGeneralLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			paisGeneralLogic.setPaisGenerals(pais_generals);
			
			rowDataList.addAll(paisGeneralLogic.getPaisGenerals());
			
			intNumeroFilas=paisGeneralLogic.getPaisGenerals().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				paisGeneralFavorecido=paisGeneralLogic.getPaisGenerals().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				paisGeneralFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return paisGeneralFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  ConceptoDetalle ProcesarSorteoConceptoDetalle_DesdeConcepto(List<Concepto> conceptos,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		ConceptoDetalle conceptoDetalleFavorecido=new ConceptoDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		ArrayList<ConceptoDetalle> concepto_detalles = new ArrayList<ConceptoDetalle>();
		
		ConceptoDetalle_logic conceptoDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			
			
			for(Concepto concepto:conceptos) {
				sFinalQuery=" where id_concepto="+concepto.getId();			
			
				conceptoDetalleLogic.getEntities(sFinalQuery);
				
				concepto_detalles.addAll(conceptoDetalleLogic.getConceptoDetalles());
			}
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
			
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
			
			intNumeroFilas=conceptoDetalleLogic.getConceptoDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				conceptoDetalleFavorecido=conceptoDetalleLogic.getConceptoDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				conceptoDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return conceptoDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  ConceptoDetalle ProcesarSorteoConceptoDetalle(List<ConceptoDetalle> concepto_detalles,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		ConceptoDetalle conceptoDetalleFavorecido=new ConceptoDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		ConceptoDetalle_logic conceptoDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
			
			intNumeroFilas=conceptoDetalleLogic.getConceptoDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				conceptoDetalleFavorecido=conceptoDetalleLogic.getConceptoDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				conceptoDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return conceptoDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  ExpresionDetalle ProcesarSorteoExpresionDetalle(List<ExpresionDetalle> expresion_detalles,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		ExpresionDetalle expresionDetalleFavorecido=new ExpresionDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		ExpresionDetalle_logic expresionDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
			
			intNumeroFilas=expresionDetalleLogic.getExpresionDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				expresionDetalleFavorecido=expresionDetalleLogic.getExpresionDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				expresionDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return expresionDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  ExpresionDetalle ProcesarSorteoExpresionDetalle_DesdeExpresion(List<Expresion> expresions,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		ExpresionDetalle expresionDetalleFavorecido=new ExpresionDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		ArrayList<ExpresionDetalle> expresion_detalles = new ArrayList<ExpresionDetalle>();

		ExpresionDetalle_logic expresionDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			
			for(Expresion expresion:expresions) {
				sFinalQuery=" where id_expresion="+expresion.getId();			
				expresionDetalleLogic.getEntities(sFinalQuery);
				
				expresion_detalles.addAll(expresionDetalleLogic.getExpresionDetalles());
			}
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
			
			intNumeroFilas=expresionDetalleLogic.getExpresionDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				expresionDetalleFavorecido=expresionDetalleLogic.getExpresionDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				expresionDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return expresionDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  GrammarDetalle ProcesarSorteoGrammarDetalle(List<GrammarDetalle> grammar_detalles,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		GrammarDetalle grammarDetalleFavorecido=new GrammarDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		
		GrammarDetalle_logic grammarDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;			
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
			
			intNumeroFilas=grammarDetalleLogic.getGrammarDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				grammarDetalleFavorecido=grammarDetalleLogic.getGrammarDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				grammarDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return grammarDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static  GrammarDetalle ProcesarSorteoGrammarDetalle_DesdeGrammar(List<Grammar> grammars,Random randomGenerator,Integer arrContadorFavorecidos[],String sSheetName,String sNivel,Integer iMilisegundos) throws Exception	{	
		GrammarDetalle grammarDetalleFavorecido=new GrammarDetalle();
		String strDescripcionFilaFavorecida="";
		List rowDataList = new ArrayList();
		ArrayList<GrammarDetalle> grammar_detalles = new ArrayList<GrammarDetalle>();

		GrammarDetalle_logic grammarDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{								
			
			Integer intNumeroFilas=0;
			
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			
			for(Grammar grammar:grammars) {
				
				sFinalQuery=" where id_grammar="+grammar.getId();			
				
				grammarDetalleLogic.getEntities(sFinalQuery);
				
				grammar_detalles.addAll(grammarDetalleLogic.getGrammarDetalles());
				
			}
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
			
			intNumeroFilas=grammarDetalleLogic.getGrammarDetalles().size();
			
			
			if(intNumeroFilas>0) {
				
				int intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
				 			
				grammarDetalleFavorecido=grammarDetalleLogic.getGrammarDetalles().get(intNumeroFavorecido);
						
				//strDescripcionFilaFavorecida="TOTAL="+intNumeroFilas+"------"+ExcellUtil.TraerDescripcionFilaFavorecida(verboIrregularFavorecido,iMilisegundos);
				 	
				grammarDetalleFavorecido.setsDescripcionGeneralEntityReporte1(intNumeroFilas.toString());
			}
			
			
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return grammarDetalleFavorecido;//strDescripcionFilaFavorecida;		
	}
	
	public static Boolean ExisteNivel(String sNiveles,String sCellValue) {
		Boolean existe=false;
		String sNivel="";
		
		String[] arrNiveles=sNiveles.split(",");
		
		for(String sNivelLocal:arrNiveles) {
			if(sNivelLocal.equals(sCellValue)) {
				existe=true;
				//System.out.println(sCellValue);
				break;
			}
		}
		
		return existe;
	}
	
	public static  List ProcesarTraerTodosNivelDiccionario(String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		Diccionario_logic diccionarioLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			diccionarioLogic=new Diccionario_logic();
			
			diccionarioLogic.getNewConnexionToDeep();
			connexion=diccionarioLogic.getConnexion();
			
			sFinalQuery=" where id_nivel="+sNivel;
			diccionarioLogic.getEntities(sFinalQuery);
			
			rowDataList.addAll(diccionarioLogic.getDiccionarios());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelVerboIrregular(List<VerboIrregular> verbo_irregulars,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		VerboIrregular_logic verboIrregularLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			verboIrregularLogic=new VerboIrregular_logic();
			
			verboIrregularLogic.getNewConnexionToDeep();
			connexion=verboIrregularLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboIrregularLogic.setVerboIrregulars(verbo_irregulars);
			
			rowDataList.addAll(verboIrregularLogic.getVerboIrregulars());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelVerboCompuesto(List<VerboCompuesto> verbo_compuestos,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		VerboCompuesto_logic verboCompuestoLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			verboCompuestoLogic=new VerboCompuesto_logic();
			
			verboCompuestoLogic.getNewConnexionToDeep();
			connexion=verboCompuestoLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboCompuestoLogic.setVerboCompuestos(verbo_compuestos);
			
			rowDataList.addAll(verboCompuestoLogic.getVerboCompuestos());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelVocabulario(List<Vocabulario> vocabularios,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		Vocabulario_logic vocabularioLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			vocabularioLogic=new Vocabulario_logic();
			
			vocabularioLogic.getNewConnexionToDeep();
			connexion=vocabularioLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			vocabularioLogic.setVocabularios(vocabularios);
			
			rowDataList.addAll(vocabularioLogic.getVocabularios());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelNumeroGeneral(List<NumeroGeneral> numero_generals,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		NumeroGeneral_logic numero_generalLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			numero_generalLogic=new NumeroGeneral_logic();
			
			numero_generalLogic.getNewConnexionToDeep();
			connexion=numero_generalLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			numero_generalLogic.setNumeroGenerals(numero_generals);
			
			rowDataList.addAll(numero_generalLogic.getNumeroGenerals());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelPaisGeneral(List<PaisGeneral> pais_generals,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		PaisGeneral_logic pais_generalLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			pais_generalLogic=new PaisGeneral_logic();
			
			pais_generalLogic.getNewConnexionToDeep();
			connexion=pais_generalLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			pais_generalLogic.setPaisGenerals(pais_generals);
			
			rowDataList.addAll(pais_generalLogic.getPaisGenerals());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelConceptoDetalle(List<ConceptoDetalle> concepto_detalles,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		ConceptoDetalle_logic conceptoDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelConceptoDetalle_DesdeConcepto(List<Concepto> conceptos,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		ArrayList<ConceptoDetalle> concepto_detalles = new ArrayList<ConceptoDetalle>();

		ConceptoDetalle_logic conceptoDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			

			for(Concepto concepto:conceptos) {
				sFinalQuery=" where id_concepto="+concepto.getId();			
			
				conceptoDetalleLogic.getEntities(sFinalQuery);
				
				concepto_detalles.addAll(conceptoDetalleLogic.getConceptoDetalles());
			}
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
						
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelExpresionDetalle(List<ExpresionDetalle> expresion_detalles,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		ExpresionDetalle_logic expresionDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelExpresionDetalle_DesdeExpresion(List<Expresion> expresions,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		ArrayList<ExpresionDetalle> expresion_detalles = new ArrayList<ExpresionDetalle>();

		ExpresionDetalle_logic expresionDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			

			for(Expresion expresion:expresions) {
				sFinalQuery=" where id_expresion="+expresion.getId();
				
				expresionDetalleLogic.getEntities(sFinalQuery);
				
				expresion_detalles.addAll(expresionDetalleLogic.getExpresionDetalles());
			}
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelGrammarDetalle(List<GrammarDetalle> grammar_detalles,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		
		GrammarDetalle_logic grammarDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerTodosNivelGrammarDetalle_DesdeGrammar(List<Grammar> grammars,String sSheetName,String sNivel) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		ArrayList<GrammarDetalle> grammar_detalles = new ArrayList<GrammarDetalle>();

		GrammarDetalle_logic grammarDetalleLogic=null;
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		
		try	{				
			
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			
			for(Grammar grammar:grammars) {
				
				sFinalQuery=" where id_grammar="+grammar.getId();			
				
				grammarDetalleLogic.getEntities(sFinalQuery);
				
				grammar_detalles.addAll(grammarDetalleLogic.getGrammarDetalles());
				
			}
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
				
			connexion.commit();
			
		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelDiccionario(String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		Diccionario_logic diccionarioLogic=null;
		Diccionario diccionarioFavorecido=new Diccionario();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			diccionarioLogic=new Diccionario_logic();
			
			diccionarioLogic.getNewConnexionToDeep();
			connexion=diccionarioLogic.getConnexion();
			
			sFinalQuery=" where id_nivel="+sNivel+" and id_grupo="+sSheetName;
			diccionarioLogic.getEntities(sFinalQuery);
			
			rowDataList.addAll(diccionarioLogic.getDiccionarios());
			
			intNumeroFilas=diccionarioLogic.getDiccionarios().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					diccionarioFavorecido=diccionarioLogic.getDiccionarios().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(diccionarioFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelVerboIrregular(List<VerboIrregular> verbo_irregulars,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		VerboIrregular_logic verboIrregularLogic=null;
		VerboIrregular verboIrregularFavorecido=new VerboIrregular();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			verboIrregularLogic=new VerboIrregular_logic();
			
			verboIrregularLogic.getNewConnexionToDeep();
			connexion=verboIrregularLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboIrregularLogic.setVerboIrregulars(verbo_irregulars);
			
			rowDataList.addAll(verboIrregularLogic.getVerboIrregulars());
			
			intNumeroFilas=verboIrregularLogic.getVerboIrregulars().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					verboIrregularFavorecido=verboIrregularLogic.getVerboIrregulars().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(verboIrregularFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelVerboCompuesto(List<VerboCompuesto> verbo_compuestos,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		VerboCompuesto_logic verboCompuestoLogic=null;
		VerboCompuesto verboCompuestoFavorecido=new VerboCompuesto();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			verboCompuestoLogic=new VerboCompuesto_logic();
			
			verboCompuestoLogic.getNewConnexionToDeep();
			connexion=verboCompuestoLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			verboCompuestoLogic.setVerboCompuestos(verbo_compuestos);
			
			rowDataList.addAll(verboCompuestoLogic.getVerboCompuestos());
			
			intNumeroFilas=verboCompuestoLogic.getVerboCompuestos().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					verboCompuestoFavorecido=verboCompuestoLogic.getVerboCompuestos().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(verboCompuestoFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelVocabulario(List<Vocabulario> vocabularios,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		Vocabulario_logic vocabularioLogic=null;
		Vocabulario vocabularioFavorecido=new Vocabulario();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			vocabularioLogic=new Vocabulario_logic();
			
			vocabularioLogic.getNewConnexionToDeep();
			connexion=vocabularioLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			vocabularioLogic.setVocabularios(vocabularios);
			
			rowDataList.addAll(vocabularioLogic.getVocabularios());
			
			intNumeroFilas=vocabularioLogic.getVocabularios().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					vocabularioFavorecido=vocabularioLogic.getVocabularios().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(vocabularioFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelNumeroGeneral(List<NumeroGeneral> numero_generals,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		NumeroGeneral_logic numeroGeneralLogic=null;
		NumeroGeneral numeroGeneralFavorecido=new NumeroGeneral();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			numeroGeneralLogic=new NumeroGeneral_logic();
			
			numeroGeneralLogic.getNewConnexionToDeep();
			connexion=numeroGeneralLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			numeroGeneralLogic.setNumeroGenerals(numero_generals);
			
			rowDataList.addAll(numeroGeneralLogic.getNumeroGenerals());
			
			intNumeroFilas=numeroGeneralLogic.getNumeroGenerals().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					numeroGeneralFavorecido=numeroGeneralLogic.getNumeroGenerals().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(numeroGeneralFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelPaisGeneral(List<PaisGeneral> pais_generals,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		PaisGeneral_logic paisGeneralLogic=null;
		PaisGeneral paisGeneralFavorecido=new PaisGeneral();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			paisGeneralLogic=new PaisGeneral_logic();
			
			paisGeneralLogic.getNewConnexionToDeep();
			connexion=paisGeneralLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			paisGeneralLogic.setPaisGenerals(pais_generals);
			
			rowDataList.addAll(paisGeneralLogic.getPaisGenerals());
			
			intNumeroFilas=paisGeneralLogic.getPaisGenerals().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					paisGeneralFavorecido=paisGeneralLogic.getPaisGenerals().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(paisGeneralFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelConceptoDetalle(List<ConceptoDetalle> concepto_detalles,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		ConceptoDetalle_logic conceptoDetalleLogic=null;
		ConceptoDetalle conceptoDetalleFavorecido=new ConceptoDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
			
			intNumeroFilas=conceptoDetalleLogic.getConceptoDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					conceptoDetalleFavorecido=conceptoDetalleLogic.getConceptoDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(conceptoDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelConceptoDetalle_DesdeConcepto(List<Concepto> conceptos,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		ArrayList<ConceptoDetalle> concepto_detalles = new ArrayList<ConceptoDetalle>();

		ConceptoDetalle_logic conceptoDetalleLogic=null;
		ConceptoDetalle conceptoDetalleFavorecido=new ConceptoDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			conceptoDetalleLogic=new ConceptoDetalle_logic();
			
			conceptoDetalleLogic.getNewConnexionToDeep();
			connexion=conceptoDetalleLogic.getConnexion();
			
			
			for(Concepto concepto:conceptos) {
				sFinalQuery=" where id_concepto="+concepto.getId();			
			
				conceptoDetalleLogic.getEntities(sFinalQuery);
				
				concepto_detalles.addAll(conceptoDetalleLogic.getConceptoDetalles());
			}
			
			conceptoDetalleLogic.setConceptoDetalles(concepto_detalles);
			
			
			rowDataList.addAll(conceptoDetalleLogic.getConceptoDetalles());
			
			intNumeroFilas=conceptoDetalleLogic.getConceptoDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					conceptoDetalleFavorecido=conceptoDetalleLogic.getConceptoDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(conceptoDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelExpresionDetalle(List<ExpresionDetalle> expresion_detalles,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		ExpresionDetalle_logic expresionDetalleLogic=null;
		ExpresionDetalle expresionDetalleFavorecido=new ExpresionDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
			
			intNumeroFilas=expresionDetalleLogic.getExpresionDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					expresionDetalleFavorecido=expresionDetalleLogic.getExpresionDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(expresionDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelExpresionDetalle_DesdeExpresion(List<Expresion> expresions,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		ArrayList<ExpresionDetalle> expresion_detalles = new ArrayList<ExpresionDetalle>();

		ExpresionDetalle_logic expresionDetalleLogic=null;
		ExpresionDetalle expresionDetalleFavorecido=new ExpresionDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			expresionDetalleLogic=new ExpresionDetalle_logic();
			
			expresionDetalleLogic.getNewConnexionToDeep();
			connexion=expresionDetalleLogic.getConnexion();
			

			for(Expresion expresion:expresions) {
				sFinalQuery=" where id_expresion="+expresion.getId();			
				expresionDetalleLogic.getEntities(sFinalQuery);
				
				expresion_detalles.addAll(expresionDetalleLogic.getExpresionDetalles());
			}
			
			expresionDetalleLogic.setExpresionDetalles(expresion_detalles);
			
			
			rowDataList.addAll(expresionDetalleLogic.getExpresionDetalles());
			
			intNumeroFilas=expresionDetalleLogic.getExpresionDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					expresionDetalleFavorecido=expresionDetalleLogic.getExpresionDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(expresionDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelGrammarDetalle(List<GrammarDetalle> grammar_detalles,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		
		GrammarDetalle_logic grammarDetalleLogic=null;
		GrammarDetalle grammarDetalleFavorecido=new GrammarDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			//sFinalQuery=" where id_nivel="+sNivel;//+" and id_grupo="+sSheetName;
			//verboIrregularLogic.getEntities(sFinalQuery);
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
			
			intNumeroFilas=grammarDetalleLogic.getGrammarDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					grammarDetalleFavorecido=grammarDetalleLogic.getGrammarDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(grammarDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static  List ProcesarTraerGrupoNivelGrammarDetalle_DesdeGrammar(List<Grammar> grammars,String sSheetName,String sNivel,Integer iNumeroResultados,Random randomGenerator,Integer arrContadorFavorecidos[],Integer intNumeroFilas) throws Exception	{	
		String strDescripcionFilaFavorecida="";
		List cellDataList = new ArrayList();
		List rowDataList = new ArrayList();
		List rowDataListGrupo = new ArrayList();
		ArrayList<GrammarDetalle> grammar_detalles = new ArrayList<GrammarDetalle>();

		GrammarDetalle_logic grammarDetalleLogic=null;
		GrammarDetalle grammarDetalleFavorecido=new GrammarDetalle();		
		
		Connexion connexion=new Connexion();
		String sFinalQuery="";
		int intNumeroFavorecido=0;
		
		try	{				
			 
			grammarDetalleLogic=new GrammarDetalle_logic();
			
			grammarDetalleLogic.getNewConnexionToDeep();
			connexion=grammarDetalleLogic.getConnexion();
			
			
			for(Grammar grammar:grammars) {
				
				sFinalQuery=" where id_grammar="+grammar.getId();			
				
				grammarDetalleLogic.getEntities(sFinalQuery);
				
				grammar_detalles.addAll(grammarDetalleLogic.getGrammarDetalles());
				
			}
			
			grammarDetalleLogic.setGrammarDetalles(grammar_detalles);
			
			
			rowDataList.addAll(grammarDetalleLogic.getGrammarDetalles());
			
			intNumeroFilas=grammarDetalleLogic.getGrammarDetalles().size();
			
			if(intNumeroFilas > iNumeroResultados) { 
				
				for(int i=0;i<iNumeroResultados;i++) {
					intNumeroFavorecido=ExcellUtil.TraerNumeroFavorecido(intNumeroFilas, arrContadorFavorecidos,randomGenerator);
 			
					//diccionarioFavorecido=ExcellUtil.TraerFilaFavorecida(rowDataList, intNumeroFavorecido);
					
					grammarDetalleFavorecido=grammarDetalleLogic.getGrammarDetalles().get(intNumeroFavorecido);
							
					rowDataListGrupo.add(grammarDetalleFavorecido);
				}
				
				rowDataList=rowDataListGrupo;
			}

			connexion.commit();

		} catch (Exception e)	{
			connexion.rollback();
			e.printStackTrace();
			
		} finally {
			connexion.close();
		}
		
		return rowDataList;
	}
	
	public static int TraerNumeroFavorecido(int intNumeroFilas,Integer arrContadorFavorecidos[],Random randomGenerator) {
		int intNumeroFavorecido=0;
		
		intNumeroFavorecido= randomGenerator.nextInt(intNumeroFilas);
		
		return intNumeroFavorecido;
	}
	
	public static String TraerDescripcionFilaFavorecida(Diccionario diccionarioFavorecido,Integer iMilisegundos) {
		//HSSFRow rowHSS =null;
		String strDescripcionFilaFavorecida="";
		String strDescripcionSeparador="";
		
		/*
		List cellTempList = new ArrayList();
		
		int i=0;
				
		if(iMilisegundos<1501) {
			strDescripcionSeparador="-->";
			
		} else {
			strDescripcionSeparador="---------------------------";
		}
		
		strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
		*/
		
		return strDescripcionFilaFavorecida;
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
