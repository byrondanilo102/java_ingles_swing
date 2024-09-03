package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
*/

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;

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


//import ExcellUtil.TipoDato;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;

public class NivelDetaillJFrame extends JInternalFrameBase implements ActionListener {
	 private GridLayout gridlayout;
	 
	 //private JTextField jtextfieldSegundos;
	 JTable table;
	 DefaultTableModel defaultTableModel;
	 JScrollPane scrollPane;
	 public List rowDataList;
	 Vector<Vector> rowData;
	 Vector<String> columnNames;
	 //Label labelNumeroSegundos;
	 public TipoProceso tipo_Proceso=TipoProceso.DICCIONARIO;
	 
	private static final long serialVersionUID = 1L;

	public NivelDetaillJFrame() throws Exception {
		   super();
		   
		   try {
		       			  
		       //Dimension dimension=getToolkit().getScreenSize();
		       
		       this.setTitle("SORTEO");
		       
		       //setLocation((dimension.width)/4,(dimension.height)/8);
		       
		       this.setBounds(450, 50, 500, 550);
		       
		       this.setResizable(true);
		       this.setClosable(true);
		       this.setMaximizable(true);
		       this.setIconifiable(true);
		       
		       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		      
		        			//this.addComponentsToPane(this.getContentPane(),rowDataList);
			   			   
		        			//this.initControls(rowDataList);
			   this.gridlayout = new GridLayout(1,1);
			   //this.labelNumeroSegundos=new Label("NUMERO:");
		  
			   //this.jtextfieldSegundos= new JTextField();
			   //this.jtextfieldSegundos.setText("5");
			   		   		   	  		   
			    			   
			   this.columnNames = new Vector<String>();
			   this.rowData = new Vector<Vector>();
			   
			   this.cargarCabeceras();
			   
			   getContentPane().setLayout(new MigLayout("", "[490px]", "[503px][]"));
			   
			   //this.table = new JTable(this.rowData, this.columnNames);
			   //this.table.setModel(new DefaultTableModel(this.rowData,this.columnNames));
			   
			   this.table = new JTable();
			    
			   this.defaultTableModel=new DefaultTableModel(this.rowData,this.columnNames);
			   
			   this.table.setModel(defaultTableModel);
					   
					   
			   this.scrollPane = new JScrollPane(this.table);
			   
			   
			   //final JPanel jpanel = new JPanel();
		       //jpanel.setLayout(gridlayout);
		       
		       //JPanel controls = new JPanel();
		       //controls.setLayout(new GridLayout(2,3));
		       
		       //jpanel.add(this.scrollPane);
		       
		       		       
		      this.getContentPane().add(this.scrollPane, "cell 0 0,growx,aligny top"); //jpanel
		      
		      JButton btnCerrar = new JButton("CERRAR");
		      btnCerrar.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		NivelDetaillJFrame.this.dispose();
		      	}
		      });
		      getContentPane().add(btnCerrar, "cell 0 1,alignx center");
		       //this.getContentPane().add(new JSeparator(), BorderLayout.CENTER);
		       //this.getContentPane().add(controls, BorderLayout.SOUTH);			   
			   
			   		//this.pack();
			   this.setVisible(true);
			   
			   this.tipo_Proceso=TipoProceso.DICCIONARIO;
			   
		   } catch(Exception e) {
			   throw e;
		   }
	}

	public static void main(String[] args) {
		NivelDetaillJFrame nivelDetaillJFrame;
		try {
			nivelDetaillJFrame = new NivelDetaillJFrame();
			
			nivelDetaillJFrame.setVisible(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}	
	
	public void cargarDatos() {
			 
		Integer i=1;
		Vector<String> row;			    			   
		 //this.rowData = new Vector<Vector>();
		 
		 
		if(tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
			 
			 for(ConceptoDetalle conceptoDetalle:(ArrayList<ConceptoDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(conceptoDetalle.getidea());
				 row.addElement(conceptoDetalle.gettraduccion());
				 row.addElement(conceptoDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
		 } else if(tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
			 
			 for(ConceptoDetalle conceptoDetalle:(ArrayList<ConceptoDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(conceptoDetalle.getidea());
				 row.addElement(conceptoDetalle.gettraduccion());
				 row.addElement(conceptoDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
		 } else if(this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
			 
			 for(Diccionario diccionario:(ArrayList<Diccionario>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement(diccionario.getid_nivel().toString());
				 row.addElement(diccionario.getexpresion());
				 row.addElement(diccionario.gettraduccion1());
				 row.addElement(diccionario.gettraduccion2());
					   
				 this.rowData.addElement(row);	
				 
				 i++;
			 }
			 
		 }  else if(tipo_Proceso.equals(TipoProceso.EXPRESION)) {
			 
			 for(ExpresionDetalle expresionDetalle:(ArrayList<ExpresionDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(expresionDetalle.getidea());
				 row.addElement(expresionDetalle.gettraduccion());
				 row.addElement(expresionDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
		 } else if(tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
			 
			 for(ExpresionDetalle expresionDetalle:(ArrayList<ExpresionDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(expresionDetalle.getidea());
				 row.addElement(expresionDetalle.gettraduccion());
				 row.addElement(expresionDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
			 
			 for(GrammarDetalle grammarDetalle:(ArrayList<GrammarDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(grammarDetalle.getidea());
				 row.addElement(grammarDetalle.gettraduccion());
				 row.addElement(grammarDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
			 
			 for(GrammarDetalle grammarDetalle:(ArrayList<GrammarDetalle>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(grammarDetalle.getidea());
				 row.addElement(grammarDetalle.gettraduccion());
				 row.addElement(grammarDetalle.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
			 
			 for(NumeroGeneral numeroGeneral:(ArrayList<NumeroGeneral>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(numeroGeneral.getnombre());
				 row.addElement(numeroGeneral.gettraduccion());
				 row.addElement(numeroGeneral.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 }  else if(tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
			 
			 for(PaisGeneral paisGeneral:(ArrayList<PaisGeneral>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement("0");
				 row.addElement(paisGeneral.getnombre());
				 row.addElement(paisGeneral.gettraduccion());
				 row.addElement(paisGeneral.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
			 
			 for(VerboIrregular verboIrregular:(ArrayList<VerboIrregular>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement(verboIrregular.getid_nivel().toString());
				 row.addElement(verboIrregular.getinfinitivo());
				 row.addElement(verboIrregular.gettraduccion());
				 row.addElement(verboIrregular.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
			 
			 for(VerboCompuesto verboCompuesto:(ArrayList<VerboCompuesto>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement(verboCompuesto.getid_nivel().toString());
				 row.addElement(verboCompuesto.getinfinitivo());
				 row.addElement(verboCompuesto.gettraduccion());
				 row.addElement(verboCompuesto.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
			 
		 } else if(tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
			 
			 for(Vocabulario vocabulario:(ArrayList<Vocabulario>)this.rowDataList) {
				 
				 row = new Vector<String>();
				 
				 row.addElement(i.toString());
				 row.addElement(vocabulario.getid_nivel().toString());
				 row.addElement(vocabulario.getnombre());
				 row.addElement(vocabulario.gettraduccion());
				 row.addElement(vocabulario.getpronunciacion());
					   
				 this.rowData.addElement(row);
				 
				 i++;
			 }
		 }
		 
		 
		 this.table = new JTable(rowData, this.columnNames);
	   
		 this.scrollPane = new JScrollPane(table);
	}
	
	public void cargarCabeceras() {
		this.columnNames = new Vector<String>();
		   
		this.columnNames.addElement("ID");
		this.columnNames.addElement("LEVEL");
		this.columnNames.addElement("SPANISH");
		this.columnNames.addElement("TRANSLATE 1");
		this.columnNames.addElement("TRANSLATE 2");
	}
	
	public List getRowDataList() {
		return rowDataList;
	}


	public void setRowDataList(List rowDataList) {
		this.rowDataList = rowDataList;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
}
