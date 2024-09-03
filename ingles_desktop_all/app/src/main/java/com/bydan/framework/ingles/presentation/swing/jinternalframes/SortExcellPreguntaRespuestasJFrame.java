package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import javax.swing.*;

//import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.ingles.util.Connexion;
import com.bydan.framework.ingles.util.funcionalidad.ExcellUtil;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;

//import ExcellUtil.TipoDato;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SortExcellPreguntaRespuestasJFrame extends JInternalFrameBase implements ActionListener {
   private static final long serialVersionUID = 1L;
   //private ScheduledExecutorService scheduledexecutorservice;
   private JButton JbuttonProcesar;
   private JButton JbuttonAbrirNivelTodos;
   private Label labelAbrirNivelTodos;
   private Label labelIniciar;
   private Label labelProceso;
   private Label labelDetalleProceso;
   //private Label labelNumeroSegundos;
   private Label labelHoja;
   private Label labelNivel;
  
   public Integer arrContadorFavorecidos[];
   public Random randomGenerator;
   
   private Label labelImpresora;
   //private Label labelAcrobat;
   private JTextField jtextfieldImpresora;
   private JTextField jtextfieldAcrobat;
   //private JTextField jtextfieldSegundos;
   
   private JComboBox jcomboboxHoja;
   private JComboBox jcomboboxNivel;
   
   private Integer iFlag;
   public static FileHandler filehandler;
   public static Logger logger;
   public static Boolean ISTEST=false;
   public static String SKEYCHARRINTER="__";
   public static String SIMPRESORADEFECTO="COCINA";
   private ArrayList<String> arrFilesToDelete;
   
   public static String SLOGTIPOINFO="INFO";
   public static String SLOGTIPOWARNING="WARNING";
   public static String SLOGTIPOERROR="ERROR";
   
   public Diccionario diccionarioFavorecido;
   public SorteoJInternalFrame sorteoJFrame;
   private JPanel panel;
   private JPanel panel_1;
   private JButton btnCerrar;
   private JLabel lblPracticaNivelTodos;
   private JButton btnPracticaTodosNivel;
   public TipoProceso tipo_Proceso=TipoProceso.DICCIONARIO;
   
   
   public SortExcellPreguntaRespuestasJFrame(JDesktopPane jDesktopPane) throws Exception {
	   super();
	   
	   setMaximizable(true);
	   setIconifiable(true);
	   setClosable(true);
	   
	   this.jDesktopPane=jDesktopPane;
	   
	   this.tipo_Proceso=TipoProceso.DICCIONARIO;
	   
	   try {
	       //SortExcellJFramePreguntaRespuestas impresionjframe = new SortExcellJFramePreguntaRespuestas("SORTEO");
	       
	       this.setBounds(20, 20, 399, 337);
	       this.setResizable(true);
	       this.setTitle("SORTEO PREGUNTAS RESPUESTAS");     
	       this.iFlag=0;
	       //Set up the content pane.
		   
		   //this.initControls();
		   
	       this.sorteoJFrame=new SorteoJInternalFrame();
	       this.jDesktopPane.add(this.sorteoJFrame);
		   
		   
		   
		   this.arrContadorFavorecidos = new Integer[500000];
		   this.randomGenerator = new Random();
		   //this.labelNumeroSegundos=new Label("NUMERO:");
		   //labelNumeroSegundos.setFont(new Font("Dialog", Font.BOLD, 12));
		   //this.jtextfieldPath.setText("C:/0files/");
		   
		   /*
		   this.jtextfieldSegundos= new JTextField();
		   
		   if(!SortExcellPreguntaRespuestasJFrame.ISTEST) {
			   this.jtextfieldSegundos.setText("2");
		   } else {
			   this.jtextfieldSegundos.setText("5");
		   }		   		   	  
		   */
	   
		   this.labelImpresora=new Label("IMPRESORA");
		   //this.labelAcrobat=new Label("ACROBAT");
		   
		   this.jtextfieldImpresora= new JTextField();	   
		   
		   if(!SortExcellPreguntaRespuestasJFrame.ISTEST) {
			   this.jtextfieldImpresora.setText(SortExcellPreguntaRespuestasJFrame.SIMPRESORADEFECTO);
		   } else {
			   this.jtextfieldImpresora.setText("//192.168.1.4/EpsonLX810");
		   }
		   
		   String sPathAcrobat="\"C:/Archivos de programa/Adobe/Reader 9.0/Reader/AcroRd32.exe\"";//"\"C:/Program Files/Adobe/Reader 9.0/Reader/AcroRd32.exe\"";
			  
		  // Dimension dimension=new Dimension(20,20);
		   
		   this.jtextfieldAcrobat= new JTextField();	  
		   		   		  
		   
		   //POIFSFileSystem fsFileSystem=null;
		   
		   String[] arrNiveles = {"1", "2", "3", "4", "5","6"};
		   
		   /*
		   this.jtextfieldAcrobat.setMaximumSize(dimension);
		   this.jtextfieldAcrobat.setMinimumSize(dimension);
		   this.jtextfieldAcrobat.setSize(dimension);
		   */
		   
		   //this.setBounds(10,50,200,200);
		   
		   this.jtextfieldAcrobat.setText(sPathAcrobat);
		   
		   this.arrFilesToDelete=new ArrayList<String>();
	       getContentPane().setLayout(new MigLayout("", "[401px,grow]", "[125px,grow][grow][]"));
	       
	       panel_1 = new JPanel();
	       panel_1.setToolTipText("Parametros");
	       panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Parametros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel_1, "cell 0 0,grow");
	       panel_1.setLayout(new MigLayout("", "[][]", "[][]"));
	       
	       this.labelHoja=new Label("HOJA");
	       panel_1.add(labelHoja, "cell 0 0");
	       labelHoja.setFont(new Font("Dialog", Font.BOLD, 12));
	       
	       //fsFileSystem=ExcellUtil.GetConnectionExcell(this.jtextfieldPath.getText());
	       
	       //String[] arrSheets =ExcellUtil.GetSheets(fsFileSystem);
	       
	       this.jcomboboxHoja = new JComboBox();
	       panel_1.add(jcomboboxHoja, "cell 1 0");
	       this.labelNivel=new Label("NIVEL");
	       panel_1.add(labelNivel, "cell 0 1");
	       labelNivel.setFont(new Font("Dialog", Font.BOLD, 12));
	       
	       //Object[] arrObjetNiveles =ExcellUtil.GetColumnDistinctValues(fsFileSystem,(String)this.jcomboboxHoja.getSelectedItem(),0,true,ExcellUtil.TipoDato.INT);
	       
	       this.jcomboboxNivel= new JComboBox();
	       panel_1.add(jcomboboxNivel, "cell 1 1");
	       this.jcomboboxHoja.addActionListener(this);
	       
	       panel = new JPanel();
	       panel.setToolTipText("Acciones");
	       panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel, "cell 0 1,grow");
	       panel.setLayout(new MigLayout("", "[][]", "[][][][]"));
	       
		   this.labelIniciar=new Label("SORTEO:");
		   panel.add(labelIniciar, "cell 0 0");
		   labelIniciar.setFont(new Font("Dialog", Font.BOLD, 12));
		   this.JbuttonProcesar = new JButton("SORTEAR");
		   panel.add(JbuttonProcesar, "cell 1 0");
		   this.labelAbrirNivelTodos=new Label("ABRIR NIVEL TODOS:");
		   panel.add(labelAbrirNivelTodos, "cell 0 1");
		   labelAbrirNivelTodos.setFont(new Font("Dialog", Font.BOLD, 12));
		   
	       this.JbuttonAbrirNivelTodos= new JButton("ABRIR TODOS NIVEL");
	       panel.add(JbuttonAbrirNivelTodos, "cell 1 1");
		   
		   lblPracticaNivelTodos = new JLabel("PRACTICA NIVEL TODOS");
		   panel.add(lblPracticaNivelTodos, "cell 0 2");
		   
		   btnPracticaTodosNivel = new JButton("PRACTICA TODOS NIVEL");
		   btnPracticaTodosNivel.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	  try {
      	    	getImpresionJFrameActual().practicaTodosNivel(e);
				
      	    } catch (Exception e1) {
					SortExcellPreguntaRespuestasJFrame.recordLogException(e1);							
					e1.printStackTrace();						
				}	     
		   	}
		   });
		   panel.add(btnPracticaTodosNivel, "cell 1 2");
	       
	        
		   this.labelProceso=new Label("DETALLE:");
		   panel.add(labelProceso, "cell 0 3");
		   labelProceso.setFont(new Font("Dialog", Font.BOLD, 12));
		   this.labelDetalleProceso=new Label("");
		   panel.add(labelDetalleProceso, "cell 1 3");
		   
		   btnCerrar = new JButton("CERRAR");
		   btnCerrar.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   		SortExcellPreguntaRespuestasJFrame.this.dispose();
		   	}
		   });
		   getContentPane().add(btnCerrar, "cell 0 2,alignx center");
	       

	       
	       this.JbuttonAbrirNivelTodos.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	    try {
	        	    	getImpresionJFrameActual().abrirTodosNivel(e);
					
	        	    } catch (Exception e1) {
						SortExcellPreguntaRespuestasJFrame.recordLogException(e1);							
						e1.printStackTrace();						
					}	        	   
	           }
	       });
		   
		   this.JbuttonProcesar.registerKeyboardAction(this.JbuttonProcesar.getActionForKeyStroke(
                   KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                   KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                   JComponent.WHEN_FOCUSED);
		   
		   this.JbuttonProcesar.registerKeyboardAction(this.JbuttonProcesar.getActionForKeyStroke(
                   KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                   KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                   JComponent.WHEN_FOCUSED);
		   
	       //Process the Apply gaps button press
	       this.JbuttonProcesar.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   try {
	        	   	 	//ImpresionJFrame.iniciarProceso(e);
	        	   	 	getImpresionJFrameActual().iniciarProceso(e);
		          
	        	   } catch (Exception e1) {
						SortExcellPreguntaRespuestasJFrame.recordLogException(e1);							
						e1.printStackTrace();						
					}	
	           }
	       });
	       //this.getContentPane().add(new JSeparator(), BorderLayout.CENTER);
	       //this.getContentPane().add(controls, BorderLayout.SOUTH);
	       
		   //this.addComponentsToPane(this.getContentPane());
	       //Display the window.
		   //this.pack();
		   this.setVisible(true);
	   
		   this.cargarCombos();
		   
	   } catch(Exception e) {
		   throw e;
	   }
   }
   
   public void cargarCombos() throws SQLException, Exception {
	   Grupo_logic grupoLogic=new Grupo_logic();
	   Nivel_logic nivelLogic=new Nivel_logic();
	   
	   Connexion connexion=new Connexion();
	   String sFinalQuery="";
	   
	   try {
		   grupoLogic.getNewConnexionToDeep();
		   connexion=grupoLogic.getConnexion();
		   
		   nivelLogic.setConnexion(connexion);
		   
		   //GRUPO
		   grupoLogic.getEntities(sFinalQuery);
		   
		   this.jcomboboxHoja.removeAllItems();
		   
		   for(Grupo grupo:grupoLogic.getGrupos()) {
			   this.jcomboboxHoja.addItem(grupo);
		   }
		   
		   //NIVEL
		   nivelLogic.getEntities(sFinalQuery);
		   
		   this.jcomboboxNivel.removeAllItems();
		   
		   for(Nivel nivel:nivelLogic.getNivels()) {
			   this.jcomboboxNivel.addItem(nivel);
		   }
		   		   
		   connexion.commit();
		   
	   } catch (Exception e) {
		   // TODO Auto-generated catch block
		   connexion.rollback();
		   e.printStackTrace();
		   
	   } finally {
		   connexion.close();
	   }
   }
   
   public static void main(String[] args) {
       /* Use an appropriate Look and Feel */
       try {
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
       
           UIManager.put("swing.boldMetal", Boolean.FALSE);
           
           SortExcellPreguntaRespuestasJFrame.filehandler=new FileHandler(System.getProperty("user.dir")+ "/logging.log");
           SortExcellPreguntaRespuestasJFrame.filehandler.setFormatter(new SimpleFormatter());
		   
		   SortExcellPreguntaRespuestasJFrame.logger=Logger.getLogger("logging");
		   SortExcellPreguntaRespuestasJFrame.logger.addHandler(SortExcellPreguntaRespuestasJFrame.filehandler);
		   
           javax.swing.SwingUtilities.invokeLater(new Runnable() {
               public void run() {
	               try {
	            	   SortExcellPreguntaRespuestasJFrame.recordLog("INICIO-LOGGIN",SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
	            	   
	            	   //NO FUNCIONA, DEBE SER INTERNAL
	            	   SortExcellPreguntaRespuestasJFrame sortExcellJFramePreguntaRespuestas=new SortExcellPreguntaRespuestasJFrame(null);
	            	   
	            	   sortExcellJFramePreguntaRespuestas.setVisible(true);
	            	   
	    		   } catch (Exception e) {	    				
	    			    SortExcellPreguntaRespuestasJFrame.recordLogException(e);	    			   
	    				e.printStackTrace();	    				
	    		   }
               }
           });          
           
       } catch (UnsupportedLookAndFeelException e) {
    	   SortExcellPreguntaRespuestasJFrame.recordLogException(e);	
           e.printStackTrace();
           
       } catch (ClassNotFoundException e) {
    	   SortExcellPreguntaRespuestasJFrame.recordLogException(e);	
           e.printStackTrace();
           
       } catch (Exception e) {
		   SortExcellPreguntaRespuestasJFrame.recordLogException(e);	
    	   e.printStackTrace();
       } 
   }  
   
   private static void recordLog(String sMessage,String sTipo) throws Exception {
	   try {
		   if(sTipo.equals(SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO)) {
			   //SortExcellPreguntaRespuestasJFrame.logger.info("INFORMACION:"+sMessage);
			   
		   } else if(sTipo.equals(SortExcellPreguntaRespuestasJFrame.SLOGTIPOWARNING)) {
			   //SortExcellPreguntaRespuestasJFrame.logger.warning("ADVERTENCIA:"+sMessage);
			   
		   } else if(sTipo.equals(SortExcellPreguntaRespuestasJFrame.SLOGTIPOERROR)) {
			   //SortExcellPreguntaRespuestasJFrame.logger.severe("ERROR:"+sMessage);
		   }		   
	   } catch(Exception e) {
		   throw e;
	   }
   }
   
   private static void recordLogException(Exception e) {
	   try{
		   String sMensaje=SortExcellPreguntaRespuestasJFrame.getStackTraceDescripcion(e);		   		  
	         
		   SortExcellPreguntaRespuestasJFrame.recordLog(e.getMessage()+"\r\n"+sMensaje, SortExcellPreguntaRespuestasJFrame.SLOGTIPOERROR);	   
		   SortExcellPreguntaRespuestasJFrame.recordLog(e.getStackTrace().toString(), SortExcellPreguntaRespuestasJFrame.SLOGTIPOERROR);
		   
	   } catch (Exception ex) {
		   ex.printStackTrace();
	   }
   }
   
   public static String getStackTraceDescripcion(Throwable aThrowable) {
	    final Writer result = new StringWriter();
	    final PrintWriter printWriter = new PrintWriter(result);
	    aThrowable.printStackTrace(printWriter);
	    return result.toString();
  }
   

   public void iniciarProceso(ActionEvent e) throws Exception{
	   try {
		   this.labelDetalleProceso.setText("PROCESO INICIALIZADO");
		   
		   SortExcellPreguntaRespuestasJFrame.recordLog("PROCESO INICIALIZADO",SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
		   
		   //JOptionPane.showMessageDialog(this, "test");
		   
		   Integer lPeriod=0;
		   
		   //lPeriod=Integer.parseInt(this.jtextfieldSegundos.getText());
		  	   
		   //Integer iNivel=Integer.valueOf(this.jcomboboxNivel.getSelectedItem().toString());
		   
		   String sNivel="";//
		   
		   //if(this.jtextfieldNiveles.getText().contains("-1")) {
				sNivel=((Nivel)this.jcomboboxNivel.getSelectedItem()).getId().toString();
		   /*
		   } else {
				sNivel=this.jtextfieldNiveles.getText();
		   }
		   */
			
				
				
		   //String strDescripcionFilaFavorecida=ExcellUtil.ProcesarSorteo(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);
		   
		   //SortExcellPreguntaRespuestasJFrame.recordLog("PROCESO REALIZADO-->"+strDescripcionFilaFavorecida,SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
		   
		   //JOptionPane.showMessageDialog(this,strDescripcionFilaFavorecida);
		   
		   
		   this.diccionarioFavorecido=ExcellUtil.ProcesarSorteoDiccionario(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);
		   
		   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
		   
		   
		   //ABRIR VENTANA DETALLE
		   
		   if(this.sorteoJFrame==null) {
			   this.sorteoJFrame=new SorteoJInternalFrame();
			   			  
			   //this.jDesktopPane.add(this.sorteoJFrame);
			   
			   MainJFrame.procesarAbrirJInternalFramesExistentes(this.jDesktopPane, this.sorteoJFrame);
		   }
		   
		   
		   this.sorteoJFrame.setBounds(500, 100, 427, 300);
		   //this.sorteoJFrame.setVisible(true);
		   
		   this.sorteoJFrame.textField_NumFilas.setText(this.diccionarioFavorecido.getsDescripcionGeneralEntityReporte1());
		   this.sorteoJFrame.textField_Nivel.setText(diccionarioFavorecido.getid_nivel().toString());		   
		   this.sorteoJFrame.textField_Palabra.setText(diccionarioFavorecido.getexpresion());
		   this.sorteoJFrame.textField_Traduccion1.setText(diccionarioFavorecido.gettraduccion1());
		   this.sorteoJFrame.textField_Traduccion2.setText(diccionarioFavorecido.gettraduccion2());		   
		   
		   this.sorteoJFrame.setVisible(true);
		   
		  
		   
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }  

   public void abrirTodosNivel(ActionEvent e)throws Exception {
	   try {
		      
		   
		   SortExcellPreguntaRespuestasJFrame.recordLog("PROCESO CORREGIR",SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        
		            	   
		            	   
		            	   List rowDataList=ExcellUtil.ProcesarTraerTodosNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),((Nivel)getImpresionJFrameActual().jcomboboxNivel.getSelectedItem()).getId().toString());
		            	   
		            	   NivelDetaillJFrame nivelDetaillJFrame=new NivelDetaillJFrame();
		            	   
		            	   nivelDetaillJFrame.tipo_Proceso=SortExcellPreguntaRespuestasJFrame.this.tipo_Proceso;
		            	   nivelDetaillJFrame.setRowDataList(rowDataList);
		            	   nivelDetaillJFrame.cargarDatos();	            	   
		            	   nivelDetaillJFrame.setVisible(true);
		            	   
		            	   //jDesktopPane.add(nivelDetaillJFrame);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, nivelDetaillJFrame);
		            	   
		            	   
		            	   //NivelDetaillJFrame.createAndShowGUI(rowDataList);
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellPreguntaRespuestasJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellPreguntaRespuestasJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public void practicaTodosNivel(ActionEvent e)throws Exception {
	   try {
		      
		   
		   SortExcellPreguntaRespuestasJFrame.recordLog("PROCESO PRACTICA",SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        
		            	   
		            	   
		            	   List rowDataList=ExcellUtil.ProcesarTraerTodosNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),((Nivel)getImpresionJFrameActual().jcomboboxNivel.getSelectedItem()).getId().toString());
		            	   
		            	   
		            	   PracticaJInternalFrame practicaJInternalFrame=new PracticaJInternalFrame();
		            	   
		            	   practicaJInternalFrame.setRowDataList(rowDataList);
		            	   practicaJInternalFrame.cargarDatos();	            	   
		            	   practicaJInternalFrame.setVisible(true);
		            	   
		            	   //jDesktopPane.add(practicaJInternalFrame);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, practicaJInternalFrame);
		            	   
		            	   /*
		            	   NivelDetaillJFrame nivelDetaillJFrame=new NivelDetaillJFrame();
		            	   
		            	   nivelDetaillJFrame.setRowDataList(rowDataList);
		            	   nivelDetaillJFrame.cargarDatos();	            	   
		            	   nivelDetaillJFrame.setVisible(true);
		            	   
		            	   jDesktopPane.add(nivelDetaillJFrame);
		            	   */
		            	  
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellPreguntaRespuestasJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellPreguntaRespuestasJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public SortExcellPreguntaRespuestasJFrame getImpresionJFrameActual() {	   
	   return this;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   try {
		   /*
		   String sSheetActual = (String) this.jcomboboxHoja.getSelectedItem();
       
		   POIFSFileSystem fsFileSystem=null;
	   	   
		   fsFileSystem=ExcellUtil.GetConnectionExcell();
		   
		   Object[] arrObjetNiveles =ExcellUtil.GetColumnDistinctValues(fsFileSystem,sSheetActual,0,true,ExcellUtil.TipoDato.INT);
	   		  
		   DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(arrObjetNiveles);
		   this.jcomboboxNivel.setModel(defaultComboBoxModel);
		   */
		   
	   } catch (Exception ex) {			
		   recordLogException(ex);
	   }
   }
   
	public static void main1(String[] args) {
        JFrame frame = new JFrame("Impresion Punto Venta");
        final JLabel jlabel = new JLabel("Impresiones");
        frame.getContentPane().add(jlabel);
        
        JButton jbuttonIniciar = new JButton("PROCESAR");
        frame.getContentPane().add(jbuttonIniciar);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }

	public void borrarArchivos() throws Exception{
		try {
			File pathArchivo;
			
			if(this.arrFilesToDelete.size()>0) {
				for(String sPathArchivo : this.arrFilesToDelete) {
					pathArchivo = new File(sPathArchivo);
				    
				    if(pathArchivo.exists()) {
				 	   //ImpresionJFrame.logger.info("ELIMINANDO:"+sPathArchivo);
				 	   
				 	   SortExcellPreguntaRespuestasJFrame.recordLog("ELIMINANDO:"+sPathArchivo, SortExcellPreguntaRespuestasJFrame.SLOGTIPOINFO);
				 	  
				 	   pathArchivo.delete();
				    }
				}
			}
		    this.arrFilesToDelete=new ArrayList<String>();
		    
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void imprimirArchivos() throws Exception {
		   try {			
			   
			   this.borrarArchivos();			   			   
			   
			   //synchronized(this.scheduledexecutorservice) {
			   //   this.scheduledexecutorservice.wait();
			   //}
			   
			   //String sPathAcrobat="\"C:/Program Files/Adobe/Reader 9.0/Reader/AcroRd32.exe\" /n /t C:/xampp/htdocs/Punto_Venta/WebApp/modulos/pedido_touch/impresion/pedido_producto_31_1.pdf \"//cocina/COCINA\"";
			   
			   if(this.iFlag < 100000) {
				   this.iFlag++;
			   } else {
				   this.iFlag=0;
			   }
			   
			   this.labelDetalleProceso.setText(this.iFlag.toString());
			   
			    File pathArchivo;
			   
			   String filename ="";
			   Process process;
			   int iTipoRetorno=0;
			      		   
		   } catch(Exception e) {
			   //ImpresionJFrame.logger.warning(e.getMessage());
			   //ImpresionJFrame.logger.warning(e.getStackTrace().toString());			   
			   //ImpresionJFrame.recordLogException(e);				   
			   throw e;
		   }		   
	   }
	
	public String getImpresoraDesdeArchivo(String sFileName) {
		String sImpresora=SortExcellPreguntaRespuestasJFrame.SIMPRESORADEFECTO;
		
		String[] arrFileNameImpresora=sFileName.split(SortExcellPreguntaRespuestasJFrame.SKEYCHARRINTER);
		
		if(arrFileNameImpresora.length > 1) {
			sImpresora=arrFileNameImpresora[1];
		}
		
		sImpresora=sImpresora.replace("&", "/");
		
		return " " + sImpresora + " ";
	}
	public JPanel getPanel_1() {
		return panel_1;
	}
}
