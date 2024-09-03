package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import java.util.Timer;
import java.util.TimerTask;

import com.bydan.framework.ingles.util.funcionalidad.ExcellUtil;

/*import com.bydan.ingles.general.business.entity.*;*/
import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.tipo.business.entity.Tipo;

/*import com.bydan.ingles.gramatica.business.entity.*;*/
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.numerogeneral.business.entity.NumeroGeneral;
import com.bydan.ingles.gramatica.paisgeneral.business.entity.PaisGeneral;
import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.PronombreObjeto;
import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;


import java.util.Date;

public class RepasoTask extends TimerTask {
	public Date now;	
	public SortExcellJFrame sortExcellJFrame;
	public SortRepasarJFrame sortRepasarJFrame;
	public Timer timer;
	public Integer iMilisegundos=0;
	public TipoProceso tipo_Proceso=TipoProceso.DICCIONARIO;
	public String sNivel="";
	
	public ConceptoDetalle conceptoDetalleActual;
	public Diccionario diccionarioActual;
	public ExpresionDetalle expresionDetalleActual;
	public GrammarDetalle grammarDetalleActual;
	public NumeroGeneral numeroGeneralActual;
	public PaisGeneral paisGeneralActual;
	public VerboIrregular verboIrregularActual;
	public VerboCompuesto verboCompuestoActual;
	public Vocabulario vocabularioActual;
	
	public RepasoTask(SortExcellJFrame sortExcellJFrame,SortRepasarJFrame sortRepasarJFrame,Timer timer,Integer iMiliSegundosRepasar) {
		this.sortExcellJFrame=sortExcellJFrame;
		this.sortRepasarJFrame=sortRepasarJFrame;
		this.timer=timer;
		this.iMilisegundos=iMiliSegundosRepasar;
		
		this.tipo_Proceso=sortExcellJFrame.tipo_Proceso;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//String sNivel="";
		
		if(this.sortExcellJFrame.jtextfieldNiveles.getText().contains("-1")) {
			sNivel=((Nivel)this.sortExcellJFrame.jcomboboxNivel.getSelectedItem()).getId().toString();
			   
		} else {
			sNivel=this.sortExcellJFrame.jtextfieldNiveles.getText();
		}
		   
		this.procesarRepaso();
		
	}
	
	public void procesarRepaso() {
		
		if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.conceptoDetalleActual=ExcellUtil.ProcesarSorteoConceptoDetalle_DesdeConcepto(this.sortExcellJFrame.conceptos,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.conceptoDetalleActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.conceptoDetalleActual.getidea());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.conceptoDetalleActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.conceptoDetalleActual.getpronunciacion());
			 
	} else if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
				
				try {			
					String strDescripcionFilaFavorecida="";
					
					//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
					
					this.conceptoDetalleActual=ExcellUtil.ProcesarSorteoConceptoDetalle(this.sortExcellJFrame.concepto_detalles,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				  
				
				 this.now = new Date(); // initialize date
				//System.out.println("Time is :" + now);
				
				//System.out.println(strDescripcionFilaFavorecida);
				
				//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
				
				 this.sortRepasarJFrame.textField_NumFilas.setText(this.conceptoDetalleActual.getsDescripcionGeneralEntityReporte1());
				 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
				 this.sortRepasarJFrame.textField_Palabra.setText(this.conceptoDetalleActual.getidea());
				 this.sortRepasarJFrame.textField_Traduccion1.setText(this.conceptoDetalleActual.gettraduccion());
				 this.sortRepasarJFrame.textField_Traduccion2.setText(this.conceptoDetalleActual.getpronunciacion());
				 
		} else if(this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) { 
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.diccionarioActual=ExcellUtil.ProcesarSorteoDiccionario(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.diccionarioActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText(this.diccionarioActual.getid_nivel().toString());		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.diccionarioActual.getexpresion());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.diccionarioActual.gettraduccion1());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.diccionarioActual.gettraduccion2());
		
		}  else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.expresionDetalleActual=ExcellUtil.ProcesarSorteoExpresionDetalle_DesdeExpresion(this.sortExcellJFrame.expresions,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.expresionDetalleActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.expresionDetalleActual.getidea());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.expresionDetalleActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.expresionDetalleActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.expresionDetalleActual=ExcellUtil.ProcesarSorteoExpresionDetalle(this.sortExcellJFrame.expresion_detalles,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.expresionDetalleActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.expresionDetalleActual.getidea());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.expresionDetalleActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.expresionDetalleActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.grammarDetalleActual=ExcellUtil.ProcesarSorteoGrammarDetalle_DesdeGrammar(this.sortExcellJFrame.grammars,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.grammarDetalleActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.grammarDetalleActual.getidea());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.grammarDetalleActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.grammarDetalleActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.grammarDetalleActual=ExcellUtil.ProcesarSorteoGrammarDetalle(this.sortExcellJFrame.grammar_detalles,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.grammarDetalleActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.grammarDetalleActual.getidea());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.grammarDetalleActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.grammarDetalleActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.numeroGeneralActual=ExcellUtil.ProcesarSorteoNumeroGeneral(this.sortExcellJFrame.numero_generals,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.numeroGeneralActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.numeroGeneralActual.getnombre());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.numeroGeneralActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.numeroGeneralActual.getpronunciacion());
			 
		}  else if(this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.paisGeneralActual=ExcellUtil.ProcesarSorteoPaisGeneral(this.sortExcellJFrame.pais_generals,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.paisGeneralActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText("0");		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.paisGeneralActual.getnombre());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.paisGeneralActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.paisGeneralActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.verboCompuestoActual=ExcellUtil.ProcesarSorteoVerboCompuesto(this.sortExcellJFrame.verbo_compuestos,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.verboCompuestoActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText(this.verboCompuestoActual.getid_nivel().toString());		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.verboCompuestoActual.getinfinitivo());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.verboCompuestoActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.verboCompuestoActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.verboIrregularActual=ExcellUtil.ProcesarSorteoVerboIrregular(this.sortExcellJFrame.verbo_irregulars,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.verboIrregularActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText(this.verboIrregularActual.getid_nivel().toString());		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.verboIrregularActual.getinfinitivo());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.verboIrregularActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.verboIrregularActual.getpronunciacion());
			 
		} else if(this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
			
			try {			
				String strDescripcionFilaFavorecida="";
				
				//strDescripcionFilaFavorecida = ExcellUtil.ProcesarSorteo(this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
				this.vocabularioActual=ExcellUtil.ProcesarSorteoVocabulario(this.sortExcellJFrame.vocabularios,this.sortExcellJFrame.randomGenerator,this.sortExcellJFrame.arrContadorFavorecidos,((Grupo)this.sortExcellJFrame.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,this.iMilisegundos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			
			 this.now = new Date(); // initialize date
			//System.out.println("Time is :" + now);
			
			//System.out.println(strDescripcionFilaFavorecida);
			
			//this.sortRepasarJFrame.labelDescripcion.setText(strDescripcionFilaFavorecida);
			
			 this.sortRepasarJFrame.textField_NumFilas.setText(this.vocabularioActual.getsDescripcionGeneralEntityReporte1());
			 this.sortRepasarJFrame.textField_Nivel.setText(this.vocabularioActual.getid_nivel().toString());		   
			 this.sortRepasarJFrame.textField_Palabra.setText(this.vocabularioActual.getnombre());
			 this.sortRepasarJFrame.textField_Traduccion1.setText(this.vocabularioActual.gettraduccion());
			 this.sortRepasarJFrame.textField_Traduccion2.setText(this.vocabularioActual.getpronunciacion());
			 
		}
	}
}
