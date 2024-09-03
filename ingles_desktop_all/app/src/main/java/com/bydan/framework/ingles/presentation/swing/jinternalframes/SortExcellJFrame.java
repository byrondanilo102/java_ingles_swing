package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import javax.swing.*;

//import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.ingles.util.Connexion;
import com.bydan.framework.ingles.util.funcionalidad.ExcellUtil;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.tipo.business.entity.Tipo;

import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.concepto.business.logic.Concepto_logic;
import com.bydan.ingles.general.conceptodetalle.business.logic.ConceptoDetalle_logic;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;

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

import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;
import com.bydan.ingles.gramatica.numerogeneral.business.logic.NumeroGeneral_logic;
import com.bydan.ingles.gramatica.paisgeneral.business.logic.PaisGeneral_logic;
import com.bydan.ingles.gramatica.pronombreobjeto.business.logic.PronombreObjeto_logic;
import com.bydan.ingles.gramatica.pronun.business.logic.Pronun_logic;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;
import com.bydan.ingles.gramatica.tipogrammar.business.logic.TipoGrammar_logic;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;

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
import java.util.Timer;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class SortExcellJFrame extends JInternalFrameBase implements ActionListener {
   private static final long serialVersionUID = 1L;
   
   private static Font FONT_SUBTITIULO=new Font("Dialog", Font.BOLD, 11);
   
   //private ScheduledExecutorService scheduledexecutorservice;
   public JButton JbuttonProcesar;
   public JButton JbuttonRepasar;
   public JButton JbuttonAbrirNivelTodos;
   public JButton JbuttonAbrirNivelGrupo;  
   public Label labelAbrirNivelTodos;
   public Label labelIniciar;
   public Label labelRepasar;
   public Label labelSegundosRepasar;
   public Label labelProceso;
   public Label labelDetalleProceso;
   //private Label labelNumeroSegundos;
   public Label labelHoja;
   public Label labelNivel;
   public Label labelNiveles;
   public JTextField jtextfieldNiveles;
   public JTextField jtextfieldNivelGrupo;
   public JTextField jtextfieldSegundosRepasar;
   
   public Integer arrContadorFavorecidos[];
   public Random randomGenerator;
   
   public Label labelImpresora;
   //private Label labelAcrobat;
   public JTextField jtextfieldImpresora;
   public JTextField jtextfieldAcrobat;
   //private JTextField jtextfieldSegundos;
   
   public JComboBox jcomboboxHoja;
   public JComboBox jcomboboxNivel;
   
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
   
   public static Integer INTNUMEROFILAS=0;
   
   public NumeroGeneral numero_generalActual;
   public PaisGeneral pais_generalActual;
   public Diccionario diccionarioActual;
   public VerboCompuesto verbo_compuestoActual;
   public VerboIrregular verbo_irregularActual;
   public Vocabulario vocabularioActual;
   public ConceptoDetalle concepto_detalleActual;
   public GrammarDetalle grammar_detalleActual;
   public ExpresionDetalle expresion_detalleActual;
   
   public SorteoJInternalFrame sorteoJFrame;
   public SortRepasarJFrame sortRepasarJFrame;
   public Timer timer;
   public JPanel panel_Parametros;
   public JPanel panel_AccionRepasar;
   public JPanel panel_AccionNivelGrupo;
   public JLabel lblNoElementos;
   public JLabel lblNivelGrupo;
   public JPanel panel_Acciones;
   public JButton btnCerrar;
   public JLabel lblPracticaNivelTodos;
   public JButton btnPracticaTodosNivel;
   public JLabel lblPracticaNivelGrupo;
   public JButton btnPracticaNivelGrupo;
   public TipoProceso tipo_Proceso=TipoProceso.DICCIONARIO;
   
   public List<NumeroGeneral> numero_generals;
   public List<PaisGeneral> pais_generals;
   public List<VerboCompuesto> verbo_compuestos;
   public List<VerboIrregular> verbo_irregulars;
   public List<Vocabulario> vocabularios;
   public List<ConceptoDetalle> concepto_detalles;
   public List<ExpresionDetalle> expresion_detalles;
   public List<GrammarDetalle> grammar_detalles;
   public List<Concepto> conceptos;
   public List<Expresion> expresions;
   public List<Grammar> grammars;
   
   public SortExcellJFrame(JDesktopPane jDesktopPane) throws Exception {
	   super();
	   
	   try {
	       
	       //Dimension dimension=getToolkit().getScreenSize();
	        
		   this.jDesktopPane=jDesktopPane;
		   this.tipo_Proceso=TipoProceso.DICCIONARIO;
		   this.verbo_irregulars=new ArrayList<VerboIrregular>();
		   
	       this.setTitle("SORTEO DICCIONARIO");
	       //setLocation((dimension.width)/8,(dimension.height)/5);
	       
	       this.setBounds(20, 20, 450, 637);
	       
	       this.setIconifiable(true);
	       this.setResizable(true);
	       this.setClosable(true);
	       this.setMaximizable(true);
	       
	       this.iFlag=0;
	       
	       this.timer = new Timer();
	       
	       this.sorteoJFrame=new SorteoJInternalFrame();
	       this.jDesktopPane.add(this.sorteoJFrame);
	       
	       this.sortRepasarJFrame=new SortRepasarJFrame();
	       this.jDesktopPane.add(this.sortRepasarJFrame);
	       
	       //Set up the content pane.
		   //this.addComponentsToPane(this.getContentPane());
		   
		   
		   //this.initControls();
		   
		   
		   
		   
		   this.arrContadorFavorecidos = new Integer[500000];
		   this.randomGenerator = new Random();
		   //this.jtextfieldPath.setText("C:/0files/");
		   	
		   /*
		   this.jtextfieldSegundos= new JTextField();
		   
		   if(!SortExcellJFrame.ISTEST) {
			   this.jtextfieldSegundos.setText("2");
		   } else {
			   this.jtextfieldSegundos.setText("5");
		   }		   		   	  
	   	   s*/
		   
		   this.labelImpresora=new Label("IMPRESORA");
		   //this.labelAcrobat=new Label("ACROBAT");
		   
		   this.jtextfieldImpresora= new JTextField();	   
		   
		   if(!SortExcellJFrame.ISTEST) {
			   this.jtextfieldImpresora.setText(SortExcellJFrame.SIMPRESORADEFECTO);
		   } else {
			   this.jtextfieldImpresora.setText("//192.168.1.4/EpsonLX810");
		   }
		   
		   String sPathAcrobat="\"C:/Archivos de programa/Adobe/Reader 9.0/Reader/AcroRd32.exe\"";//"\"C:/Program Files/Adobe/Reader 9.0Reader/AcroRd32.exe\"";
			  
		  // Dimension dimension=new Dimension(20,20);
		   
		   this.jtextfieldAcrobat= new JTextField();	  
		   		   		  
		   
		   //POIFSFileSystem fsFileSystem=null;
		   
		   String[] arrNiveles = {"1", "2", "3", "4", "5","6"};
		  	   
		   this.jtextfieldAcrobat.setText(sPathAcrobat);
		   
		   this.arrFilesToDelete=new ArrayList<String>();
	       getContentPane().setLayout(new MigLayout("", "[440px,grow]", "[grow][grow][grow][grow][][225px][143px][1px]"));
	       
	       panel_Parametros = new JPanel();
	       panel_Parametros.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PARAMETROS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel_Parametros, "cell 0 0,grow");
	       panel_Parametros.setLayout(new MigLayout("", "[][]", "[][][][][]"));
	       
	       this.labelHoja=new Label("GRUPO");
	       panel_Parametros.add(labelHoja, "cell 0 0");
	       labelHoja.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       
	       this.jcomboboxHoja = new JComboBox();//(arrSheets);
	       panel_Parametros.add(jcomboboxHoja, "cell 1 0");
	       this.labelNivel=new Label("NIVEL");
	       panel_Parametros.add(labelNivel, "cell 0 1");
	       labelNivel.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       
		   this.jcomboboxNivel= new JComboBox();//(arrObjetNiveles);
		   panel_Parametros.add(jcomboboxNivel, "cell 1 1");
		   this.labelNiveles=new Label("NIVELES");
		   labelNiveles.setFont(SortExcellJFrame.FONT_SUBTITIULO);
		   panel_Parametros.add(labelNiveles, "cell 0 2");
		   
		   
		   this.jtextfieldNiveles= new JTextField();	
		   panel_Parametros.add(jtextfieldNiveles, "cell 1 2");
		   this.jtextfieldNiveles.setColumns(10);
		   this.jtextfieldNiveles.setText("-1");
	       this.jcomboboxHoja.addActionListener(this);
	       
	       panel_Acciones = new JPanel();
	       panel_Acciones.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACCIONES POR NIVEL", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel_Acciones, "cell 0 1,grow");
	       panel_Acciones.setLayout(new MigLayout("", "[][]", "[][][][][]"));
	       
		   this.labelIniciar=new Label("SORTEO:");
		   labelIniciar.setFont(SortExcellJFrame.FONT_SUBTITIULO);
		   panel_Acciones.add(labelIniciar, "cell 0 0");		   
		   this.JbuttonProcesar = new JButton("SORTEAR");
		   panel_Acciones.add(JbuttonProcesar, "cell 1 0");
		   this.labelAbrirNivelTodos=new Label("ABRIR NIVEL TODOS:");
		   panel_Acciones.add(labelAbrirNivelTodos, "cell 0 1");
		   labelAbrirNivelTodos.setFont(SortExcellJFrame.FONT_SUBTITIULO);
		   this.JbuttonAbrirNivelTodos= new JButton("ABRIR TODOS NIVEL");
		   panel_Acciones.add(JbuttonAbrirNivelTodos, "cell 1 1");
		   
		   lblPracticaNivelTodos = new JLabel("PRACTICA NIVEL TODOS:");
		   lblPracticaNivelTodos.setFont(SortExcellJFrame.FONT_SUBTITIULO);
		   panel_Acciones.add(lblPracticaNivelTodos, "cell 0 2");
		   
		   btnPracticaTodosNivel = new JButton("PRACTICA TODOS NIVEL");
		   btnPracticaTodosNivel.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	 try {
	    	    	getImpresionJFrameActual().practicaTodosNivel(e);
				
	    	    } catch (Exception e1) {
					SortExcellJFrame.recordLogException(e1);							
					e1.printStackTrace();						
				}
		   	}
		   });
		   panel_Acciones.add(btnPracticaTodosNivel, "cell 1 2");
		   
		    
		   this.labelProceso=new Label("DETALLE:");
		   panel_Acciones.add(labelProceso, "cell 0 3");
		   labelProceso.setFont(SortExcellJFrame.FONT_SUBTITIULO);
		   this.labelDetalleProceso=new Label("");
		   panel_Acciones.add(labelDetalleProceso, "cell 1 3");
		   
		   this.JbuttonAbrirNivelTodos.addActionListener(new ActionListener(){
		       public void actionPerformed(ActionEvent e){
		    	    try {
		    	    	getImpresionJFrameActual().abrirTodosNivel(e);
					
		    	    } catch (Exception e1) {
						SortExcellJFrame.recordLogException(e1);							
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
						SortExcellJFrame.recordLogException(e1);							
						e1.printStackTrace();						
					}	
	           }
	       });
	       
	       panel_AccionRepasar = new JPanel();
	       panel_AccionRepasar.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACCIONES ALEATORIAS REPASAR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel_AccionRepasar, "cell 0 2,grow");
	       panel_AccionRepasar.setLayout(new MigLayout("", "[][]", "[][][]"));
	       this.labelSegundosRepasar=new Label("No SEGs:");
	       panel_AccionRepasar.add(labelSegundosRepasar, "cell 0 0");
	       labelSegundosRepasar.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       
	       this.jtextfieldSegundosRepasar= new JTextField();
	       this.jtextfieldSegundosRepasar.setColumns(10);
	       panel_AccionRepasar.add(jtextfieldSegundosRepasar, "cell 1 0");
	       this.jtextfieldSegundosRepasar.setText("2");
	       this.labelRepasar=new Label("REPASAR:");
	       panel_AccionRepasar.add(labelRepasar, "cell 0 1");
	       labelRepasar.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       
	       this.JbuttonRepasar = new JButton("REPASAR");
	       panel_AccionRepasar.add(JbuttonRepasar, "cell 1 1");
	       

	       
	       this.JbuttonRepasar.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   try {
	        	   	 	//ImpresionJFrame.iniciarProceso(e);
	        	   	 	getImpresionJFrameActual().iniciarRepaso(e);
		          
	        	   } catch (Exception e1) {
						SortExcellJFrame.recordLogException(e1);							
						e1.printStackTrace();						
					}	
	           }
	       });
	       
	       panel_AccionNivelGrupo = new JPanel();
	       panel_AccionNivelGrupo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACCIONES POR NIVEL GRUPO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	       getContentPane().add(panel_AccionNivelGrupo, "cell 0 3,grow");
	       panel_AccionNivelGrupo.setLayout(new MigLayout("", "[][]", "[][][][]"));
	       
	       lblNoElementos = new JLabel("No ELEMENTOS");
	       lblNoElementos.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       panel_AccionNivelGrupo.add(lblNoElementos, "cell 0 0");
	       //this.labelNumeroSegundos=new Label("NUMERO:");
	       //labelNumeroSegundos.setFont(new Font("Dialog", Font.BOLD, 12));
	  
	       this.jtextfieldNivelGrupo= new JTextField();
	       this.jtextfieldNivelGrupo.setColumns(5);
	       panel_AccionNivelGrupo.add(jtextfieldNivelGrupo, "cell 1 0");
	       jtextfieldNivelGrupo.setHorizontalAlignment(SwingConstants.CENTER);
	       this.jtextfieldNivelGrupo.setText("8");
	       
	       lblNivelGrupo = new JLabel("NIVEL GRUPO");
	       lblNivelGrupo.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       panel_AccionNivelGrupo.add(lblNivelGrupo, "cell 0 1");
	       this.JbuttonAbrirNivelGrupo= new JButton("ABRIR NIVEL GRUPO");
	       panel_AccionNivelGrupo.add(JbuttonAbrirNivelGrupo, "cell 1 1");
	       
	       lblPracticaNivelGrupo = new JLabel("PRACTICA NIVEL GRUPO");
	       lblPracticaNivelGrupo.setFont(SortExcellJFrame.FONT_SUBTITIULO);
	       panel_AccionNivelGrupo.add(lblPracticaNivelGrupo, "cell 0 2");
	       
	       btnPracticaNivelGrupo = new JButton("PRACTICA NIVEL GRUPO");
	       btnPracticaNivelGrupo.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		try {
        	    	getImpresionJFrameActual().practicaGrupoNivel(e);
				
        	    } catch (Exception e1) {
					SortExcellJFrame.recordLogException(e1);							
					e1.printStackTrace();						
				}	
	       	}
	       });
	       panel_AccionNivelGrupo.add(btnPracticaNivelGrupo, "cell 1 2");
	       
	       btnCerrar = new JButton("CERRAR");
	       btnCerrar.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		SortExcellJFrame.this.dispose();
	       	}
	       });
	       getContentPane().add(btnCerrar, "cell 0 5,alignx center");
	       
	       this.JbuttonAbrirNivelGrupo.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	    try {
	        	    	getImpresionJFrameActual().abrirGrupoNivel(e);
					
	        	    } catch (Exception e1) {
						SortExcellJFrame.recordLogException(e1);							
						e1.printStackTrace();						
					}	        	   
	           }
	       });
	       //this.getContentPane().add(new JSeparator(), "cell 0 1,grow");
	       //this.getContentPane().add(controls, "cell 0 2,growx,aligny top");
	       
		   
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
                                      
           SortExcellJFrame.filehandler=new FileHandler(System.getProperty("user.dir")+ "/logging.log");
           SortExcellJFrame.filehandler.setFormatter(new SimpleFormatter());
		   
		   SortExcellJFrame.logger=Logger.getLogger("logging");
		   SortExcellJFrame.logger.addHandler(SortExcellJFrame.filehandler);
		   
           javax.swing.SwingUtilities.invokeLater(new Runnable() {
               public void run() {
	               try {
	            	   SortExcellJFrame.recordLog("INICIO-LOGGIN",SortExcellJFrame.SLOGTIPOINFO);
	            	   
	            	   //NO FUNCIONA, LLAMA EN MENU
	            	   SortExcellJFrame sortExcellJFrame=new SortExcellJFrame(null);
	            	   
	            	   sortExcellJFrame.setVisible(true);
	            	   
	    		   } catch (Exception e) {	    				
	    			    SortExcellJFrame.recordLogException(e);	    			   
	    				e.printStackTrace();	    				
	    		   }
               }
           });          
           
       } catch (UnsupportedLookAndFeelException e) {
    	   SortExcellJFrame.recordLogException(e);	
           e.printStackTrace();
           
       } catch (Exception e) {
		   SortExcellJFrame.recordLogException(e);	
    	   e.printStackTrace();
       } 
   }
   
   private static void recordLog(String sMessage,String sTipo) throws Exception {
	   try {
		   if(sTipo.equals(SortExcellJFrame.SLOGTIPOINFO)) {
			   //SortExcellJFrame.logger.info("INFORMACION:"+sMessage);
			   
		   } else if(sTipo.equals(SortExcellJFrame.SLOGTIPOWARNING)) {
			   //SortExcellJFrame.logger.warning("ADVERTENCIA:"+sMessage);
			   
		   } else if(sTipo.equals(SortExcellJFrame.SLOGTIPOERROR)) {
			   //SortExcellJFrame.logger.severe("ERROR:"+sMessage);
		   }		   
	   } catch(Exception e) {
		   throw e;
	   }
   }
   
   private static void recordLogException(Exception e) {
	   try{
		   String sMensaje=SortExcellJFrame.getStackTraceDescripcion(e);		   		  
	         
		   SortExcellJFrame.recordLog(e.getMessage()+"\r\n"+sMensaje, SortExcellJFrame.SLOGTIPOERROR);	   
		   SortExcellJFrame.recordLog(e.getStackTrace().toString(), SortExcellJFrame.SLOGTIPOERROR);
		   
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
		   
		   SortExcellJFrame.recordLog("PROCESO INICIALIZADO",SortExcellJFrame.SLOGTIPOINFO);
		   
		   //JOptionPane.showMessageDialog(this, "test");
		   
		   Integer lPeriod=0;
		   
		   //lPeriod=Integer.parseInt(this.jtextfieldSegundos.getText());
		  		    
		   String sNivel="";//
		   
		   if(this.jtextfieldNiveles.getText().contains("-1")) {
			   sNivel=((Nivel)this.jcomboboxNivel.getSelectedItem()).getId().toString();
			   
		   } else {
			   sNivel=this.jtextfieldNiveles.getText();
		   }
		   
		   String strDescripcionFilaFavorecida="";//=ExcellUtil.ProcesarSorteo(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);
		   
		   SortExcellJFrame.recordLog("PROCESO REALIZADO-->"+strDescripcionFilaFavorecida,SortExcellJFrame.SLOGTIPOINFO);
		   
		   		   
		   
		   //ABRIR VENTANA DETALLE
		   
		   if(this.sorteoJFrame==null) {
			   this.sorteoJFrame=new SorteoJInternalFrame();
			   			  
			   //this.jDesktopPane.add(this.sorteoJFrame);
			   
			   MainJFrame.procesarAbrirJInternalFramesExistentes(this.jDesktopPane, this.sorteoJFrame);
		   }
		   
		   
		   this.sorteoJFrame.setBounds(500, 100, 427, 300);
		   //this.sorteoJFrame.setVisible(true);
		   
		   
		   
		   this.procesarSorteo(sNivel,lPeriod);
		   
		   
		   
		   /*
		   this.diccionarioFavorecido=ExcellUtil.ProcesarSorteoDiccionario(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
		   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
		   
		   this.sorteoJFrame.textField_NumFilas.setText(this.diccionarioFavorecido.getsDescripcionGeneralEntityReporte1());
		   this.sorteoJFrame.textField_Nivel.setText(diccionarioFavorecido.getid_nivel().toString());		   
		   this.sorteoJFrame.textField_Palabra.setText(diccionarioFavorecido.getexpresion());
		   this.sorteoJFrame.textField_Traduccion1.setText(diccionarioFavorecido.gettraduccion1());
		   this.sorteoJFrame.textField_Traduccion2.setText(diccionarioFavorecido.gettraduccion2());		   
		   */
		   
		   
		   
		   this.sorteoJFrame.setVisible(true);
		   
		   //JOptionPane.showMessageDialog(this,strDescripcionFilaFavorecida);
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }  
  
   public void procesarSorteo(String sNivel,Integer lPeriod) throws Exception{
	   try {
		   
		   if(this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
			   
			   this.diccionarioActual=ExcellUtil.ProcesarSorteoDiccionario(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.diccionarioActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText(diccionarioActual.getid_nivel().toString());		   
			   this.sorteoJFrame.textField_Palabra.setText(diccionarioActual.getexpresion());
			   this.sorteoJFrame.textField_Traduccion1.setText(diccionarioActual.gettraduccion1());
			   this.sorteoJFrame.textField_Traduccion2.setText(diccionarioActual.gettraduccion2());	
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
			   
			   this.concepto_detalleActual=ExcellUtil.ProcesarSorteoConceptoDetalle_DesdeConcepto(this.conceptos,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.concepto_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.concepto_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.concepto_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.concepto_detalleActual.getpronunciacion());
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
			   
			   this.concepto_detalleActual=ExcellUtil.ProcesarSorteoConceptoDetalle(this.concepto_detalles,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.concepto_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.concepto_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.concepto_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.concepto_detalleActual.getpronunciacion());
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
			   
			   this.expresion_detalleActual=ExcellUtil.ProcesarSorteoExpresionDetalle_DesdeExpresion(this.expresions,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.expresion_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.expresion_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.expresion_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.expresion_detalleActual.getpronunciacion());
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
			   
			   this.expresion_detalleActual=ExcellUtil.ProcesarSorteoExpresionDetalle(this.expresion_detalles,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.expresion_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.expresion_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.expresion_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.expresion_detalleActual.getpronunciacion());
		   
		   }  else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
			   
			   this.grammar_detalleActual=ExcellUtil.ProcesarSorteoGrammarDetalle_DesdeGrammar(this.grammars,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.grammar_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.grammar_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.grammar_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.grammar_detalleActual.getpronunciacion());
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
			   
			   this.grammar_detalleActual=ExcellUtil.ProcesarSorteoGrammarDetalle(this.grammar_detalles,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.grammar_detalleActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.grammar_detalleActual.getidea());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.grammar_detalleActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.grammar_detalleActual.getpronunciacion());
		   
		   } else if(this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
			   
			   this.numero_generalActual=ExcellUtil.ProcesarSorteoNumeroGeneral(this.numero_generals,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.numero_generalActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.numero_generalActual.getnombre());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.numero_generalActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.numero_generalActual.getpronunciacion());
		   
		   } else  if(this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
			   
			   this.pais_generalActual=ExcellUtil.ProcesarSorteoPaisGeneral(this.pais_generals,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.pais_generalActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText("0");		   
			   this.sorteoJFrame.textField_Palabra.setText(this.pais_generalActual.getnombre());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.pais_generalActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.pais_generalActual.getpronunciacion());
		   
		   } else  if(this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
			   
			   this.verbo_compuestoActual=ExcellUtil.ProcesarSorteoVerboCompuesto(this.verbo_compuestos,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.verbo_compuestoActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText(this.verbo_compuestoActual.getid_nivel().toString());		   
			   this.sorteoJFrame.textField_Palabra.setText(this.verbo_compuestoActual.getinfinitivo());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.verbo_compuestoActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.verbo_compuestoActual.getpronunciacion());
			   
		   } else  if(this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
			   
			   this.verbo_irregularActual=ExcellUtil.ProcesarSorteoVerboIrregular(this.verbo_irregulars,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.verbo_irregularActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText(this.verbo_irregularActual.getid_nivel().toString());		   
			   this.sorteoJFrame.textField_Palabra.setText(this.verbo_irregularActual.getinfinitivo());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.verbo_irregularActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.verbo_irregularActual.getpronunciacion());
			   
		   } else  if(this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
			   
			   this.vocabularioActual=ExcellUtil.ProcesarSorteoVocabulario(this.vocabularios,this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);		   
			   //strDescripcionFilaFavorecida="("+diccionarioFavorecido.getid_nivel()+")"+" "+diccionarioFavorecido.getexpresion()+strDescripcionSeparador+diccionarioFavorecido.gettraduccion1()+","+diccionarioFavorecido.gettraduccion2();
			   
			   this.sorteoJFrame.textField_NumFilas.setText(this.vocabularioActual.getsDescripcionGeneralEntityReporte1());
			   this.sorteoJFrame.textField_Nivel.setText(this.vocabularioActual.getid_nivel().toString());		   
			   this.sorteoJFrame.textField_Palabra.setText(this.vocabularioActual.getnombre());
			   this.sorteoJFrame.textField_Traduccion1.setText(this.vocabularioActual.gettraduccion());
			   this.sorteoJFrame.textField_Traduccion2.setText(this.vocabularioActual.getpronunciacion());
		   }
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }  
   
   public void iniciarRepaso(ActionEvent e) throws Exception{
	   try {
		   
		   this.labelDetalleProceso.setText("PROCESO INICIALIZADO");
		   
		   SortExcellJFrame.recordLog("PROCESO INICIALIZADO",SortExcellJFrame.SLOGTIPOINFO);
		   
		   //JOptionPane.showMessageDialog(this, "test");
		   
		   Integer lPeriod=0;
		   
		   //lPeriod=Integer.parseInt(this.jtextfieldSegundos.getText());
		  	
		   Integer iSegundosRepasar=Integer.parseInt(this.jtextfieldSegundosRepasar.getText());
		   
		   Integer iMiliSegundosRepasar=iSegundosRepasar * 1000;
			  
		   
		   String sNivel="";//
		   
		   if(this.jtextfieldNiveles.getText().contains("-1")) {
			   sNivel=((Nivel)this.jcomboboxNivel.getSelectedItem()).getId().toString();
			   
		   } else {
			   sNivel=this.jtextfieldNiveles.getText();
		   }
		   
		   
		  //String strDescripcionFilaFavorecida=ExcellUtil.ProcesarSorteo(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);
		   
		  //SortExcellJFrame.recordLog("PROCESO REALIZADO-->"+strDescripcionFilaFavorecida,SortExcellJFrame.SLOGTIPOINFO);
		   
		  //JOptionPane.showMessageDialog(this,strDescripcionFilaFavorecida);
		   
		  //Timer timer = new Timer(); // Instantiate Timer Object
		  //SortRepasarJFrame sortRepasarJFrame=new SortRepasarJFrame();
		  
		  //this.diccionarioFavorecido=ExcellUtil.ProcesarSorteoDiccionario(this.randomGenerator,this.arrContadorFavorecidos,((Grupo)this.jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,lPeriod);
		   
		  //SortExcellJFrame.recordLog("PROCESO REALIZADO-->"+diccionarioFavorecido,SortExcellJFrame.SLOGTIPOINFO);
		   
		   
		   //ABRIR VENTANA DETALLE
		   
		   if(this.sortRepasarJFrame==null) {
			   this.sortRepasarJFrame=new SortRepasarJFrame();
			   			  
			   //this.jDesktopPane.add(this.sortRepasarJFrame);
			   
			   MainJFrame.procesarAbrirJInternalFramesExistentes(this.jDesktopPane, this.sortRepasarJFrame);
		   }
		   
		   
		   this.sortRepasarJFrame.setBounds(500, 100, 300, 330);
		   //this.sorteoJFrame.setVisible(true);
		   
		   /*
		   this.sortRepasarJFrame.textField_NumFilas.setText(this.diccionarioFavorecido.getsDescripcionGeneralEntityReporte1());
		   this.sortRepasarJFrame.textField_Nivel.setText(diccionarioFavorecido.getid_nivel().toString());		   
		   this.sortRepasarJFrame.textField_Palabra.setText(diccionarioFavorecido.getexpresion());
		   this.sortRepasarJFrame.textField_Traduccion1.setText(diccionarioFavorecido.gettraduccion1());
		   this.sortRepasarJFrame.textField_Traduccion2.setText(diccionarioFavorecido.gettraduccion2());		   
		   */
		   
		   this.sortRepasarJFrame.setVisible(true);
		   
		  //sortRepasarJFrame.setVisible(true);
		  //jDesktopPane.add(sortRepasarJFrame);
		  
		  RepasoTask repasoTask = new RepasoTask(this,sortRepasarJFrame,timer,iMiliSegundosRepasar); // Instantiate SheduledTask class
		  
		  
		  sortRepasarJFrame.timer=timer;
		  sortRepasarJFrame.repasoTask=repasoTask;
		  sortRepasarJFrame.iMiliSegundosRepasar=iMiliSegundosRepasar;
		  sortRepasarJFrame.sortExcellJFrame=this;
		  
		 //Integer iMiliSegundosRepasar=iSegundosRepasar*1000;
		  
		  timer.schedule(repasoTask, 0, iMiliSegundosRepasar);					  
		  
	   } catch(Exception ex) {
		   throw ex;
	   }
   } 
   
   

   public void abrirTodosNivel(ActionEvent e)throws Exception {
	   try {
		      		   
		   SortExcellJFrame.recordLog("PROCESO CORREGIR",SortExcellJFrame.SLOGTIPOINFO);
		   		   		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        		            	   		            	   
		            	   String sNivel="";
		        		   
		        		   if(SortExcellJFrame.this.jtextfieldNiveles.getText().contains("-1")) {
		        			   sNivel=((Nivel)SortExcellJFrame.this.jcomboboxNivel.getSelectedItem()).getId().toString();
		        			   
		        		   } else {
		        			   sNivel=SortExcellJFrame.this.jtextfieldNiveles.getText();
		        		   }
		        		   
		        		   List rowDataList=null;
		        		   
		        		   if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelConceptoDetalle_DesdeConcepto(SortExcellJFrame.this.conceptos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelConceptoDetalle(SortExcellJFrame.this.concepto_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelExpresionDetalle_DesdeExpresion(SortExcellJFrame.this.expresions,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelExpresionDetalle(SortExcellJFrame.this.expresion_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelGrammarDetalle_DesdeGrammar(SortExcellJFrame.this.grammars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelGrammarDetalle(SortExcellJFrame.this.grammar_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelNumeroGeneral(SortExcellJFrame.this.numero_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		  
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelPaisGeneral(SortExcellJFrame.this.pais_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		  
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVerboCompuesto(SortExcellJFrame.this.verbo_compuestos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		  
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVerboIrregular(SortExcellJFrame.this.verbo_irregulars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		  
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {		        			   
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVocabulario(SortExcellJFrame.this.vocabularios,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   }
		        		   
		            	   //NivelDetaillJFrame.createAndShowGUI(rowDataList);
		            	   
		            	   NivelDetaillJFrame nivelDetaillJFrame=new NivelDetaillJFrame();
		            	   
		            	   nivelDetaillJFrame.tipo_Proceso=SortExcellJFrame.this.tipo_Proceso;
		            	   nivelDetaillJFrame.setRowDataList(rowDataList);
		            	   nivelDetaillJFrame.cargarDatos();		            	   
		            	   nivelDetaillJFrame.setVisible(true);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, nivelDetaillJFrame);
		            	   
		            	   //jDesktopPane.add(nivelDetaillJFrame);
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public void practicaTodosNivel(ActionEvent e)throws Exception {
	   try {
		      		   
		   SortExcellJFrame.recordLog("PROCESO CORREGIR",SortExcellJFrame.SLOGTIPOINFO);
		   		   		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        		            	   		            	   
		            	   String sNivel="";
		        		   
		        		   if(SortExcellJFrame.this.jtextfieldNiveles.getText().contains("-1")) {
		        			   sNivel=((Nivel)SortExcellJFrame.this.jcomboboxNivel.getSelectedItem()).getId().toString();
		        			   
		        		   } else {
		        			   sNivel=SortExcellJFrame.this.jtextfieldNiveles.getText();
		        		   }
		        		   
		        		   List rowDataList=null;
		        		   
		        		   if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelConceptoDetalle_DesdeConcepto(SortExcellJFrame.this.conceptos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelConceptoDetalle(SortExcellJFrame.this.concepto_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelExpresionDetalle_DesdeExpresion(SortExcellJFrame.this.expresions,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelExpresionDetalle(SortExcellJFrame.this.expresion_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelGrammarDetalle_DesdeGrammar(SortExcellJFrame.this.grammars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelGrammarDetalle(SortExcellJFrame.this.grammar_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelNumeroGeneral(SortExcellJFrame.this.numero_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelPaisGeneral(SortExcellJFrame.this.pais_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVerboCompuesto(SortExcellJFrame.this.verbo_compuestos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        			   
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVerboIrregular(SortExcellJFrame.this.verbo_irregulars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		  
		        		   } else  if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
		        			   rowDataList=ExcellUtil.ProcesarTraerTodosNivelVocabulario(SortExcellJFrame.this.vocabularios,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel);
		        		   }
		        		   
		            	   //NivelDetaillJFrame.createAndShowGUI(rowDataList);
		            	   
		            	   PracticaJInternalFrame practicaJInternalFrame=new PracticaJInternalFrame();
		            	   
		            	   practicaJInternalFrame.tipo_Proceso=SortExcellJFrame.this.tipo_Proceso;
		            	   practicaJInternalFrame.setRowDataList(rowDataList);
		            	   practicaJInternalFrame.cargarDatos();		            	   
		            	   practicaJInternalFrame.setVisible(true);
		            	   
		            	   //jDesktopPane.add(practicaJInternalFrame);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, practicaJInternalFrame);
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public void abrirGrupoNivel(ActionEvent e)throws Exception {
	   try {
		      		   
		   SortExcellJFrame.recordLog("PROCESO CORREGIR",SortExcellJFrame.SLOGTIPOINFO);
		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        
		            	   
		            	   String sNivel="";//
		        		   
		        		   if(SortExcellJFrame.this.jtextfieldNiveles.getText().contains("-1")) {
		        			   sNivel=((Nivel)SortExcellJFrame.this.jcomboboxNivel.getSelectedItem()).getId().toString();
		        			   
		        		   } else {
		        			   sNivel=SortExcellJFrame.this.jtextfieldNiveles.getText();
		        		   }
		        		   
		        		   
		            	   Integer iNumeroResultados=Integer.parseInt(getImpresionJFrameActual().jtextfieldNivelGrupo.getText());
		            	   
		            	   List rowDataList=null;
		            	   
		            	   if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelConceptoDetalle_DesdeConcepto(SortExcellJFrame.this.conceptos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelConceptoDetalle(SortExcellJFrame.this.concepto_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelExpresionDetalle_DesdeExpresion(SortExcellJFrame.this.expresions,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelExpresionDetalle(SortExcellJFrame.this.expresion_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelGrammarDetalle_DesdeGrammar(SortExcellJFrame.this.grammars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelGrammarDetalle(SortExcellJFrame.this.grammar_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelNumeroGeneral(SortExcellJFrame.this.numero_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelPaisGeneral(SortExcellJFrame.this.pais_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVerboCompuesto(SortExcellJFrame.this.verbo_compuestos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVerboIrregular(SortExcellJFrame.this.verbo_irregulars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            	   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVocabulario(SortExcellJFrame.this.vocabularios,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            	   }
		            	   
		            	   
		            	   //NivelDetaillJFrame.createAndShowGUI(rowDataList);
		            	   
		            	   NivelDetaillJFrame nivelDetaillJFrame=new NivelDetaillJFrame();
		            	   
		            	   nivelDetaillJFrame.tipo_Proceso=SortExcellJFrame.this.tipo_Proceso;
		            	   nivelDetaillJFrame.setRowDataList(rowDataList);
		            	   nivelDetaillJFrame.cargarDatos();
		            	   nivelDetaillJFrame.setVisible(true);
		            	   
		            	   //jDesktopPane.add(nivelDetaillJFrame);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, nivelDetaillJFrame);
		            	   
		            	   getImpresionJFrameActual().labelDetalleProceso.setText("NUMERO TOTAL="+SortExcellJFrame.INTNUMEROFILAS);
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public void practicaGrupoNivel(ActionEvent e)throws Exception {
	   try {
		      		   
		   SortExcellJFrame.recordLog("PROCESO CORREGIR",SortExcellJFrame.SLOGTIPOINFO);
		   
		   /* Use an appropriate Look and Feel */
	       try {
	           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           javax.swing.SwingUtilities.invokeLater(new Runnable() {
	               public void run() {
		               try {		        
		            	   
		            	   String sNivel="";//
		        		   
		        		   if(SortExcellJFrame.this.jtextfieldNiveles.getText().contains("-1")) {
		        			   sNivel=((Nivel)SortExcellJFrame.this.jcomboboxNivel.getSelectedItem()).getId().toString();
		        			   
		        		   } else {
		        			   sNivel=SortExcellJFrame.this.jtextfieldNiveles.getText();
		        		   }
		        		   
		        		   
		            	   Integer iNumeroResultados=Integer.parseInt(getImpresionJFrameActual().jtextfieldNivelGrupo.getText());
		            	   
		            	   List rowDataList=null;
		            	   
		            	   if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelConceptoDetalle_DesdeConcepto(SortExcellJFrame.this.conceptos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelConceptoDetalle(SortExcellJFrame.this.concepto_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelDiccionario(((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            	   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelExpresionDetalle_DesdeExpresion(SortExcellJFrame.this.expresions,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelExpresionDetalle(SortExcellJFrame.this.expresion_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelGrammarDetalle_DesdeGrammar(SortExcellJFrame.this.grammars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelGrammarDetalle(SortExcellJFrame.this.grammar_detalles,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelNumeroGeneral(SortExcellJFrame.this.numero_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelPaisGeneral(SortExcellJFrame.this.pais_generals,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVerboCompuesto(SortExcellJFrame.this.verbo_compuestos,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            		   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVerboIrregular(SortExcellJFrame.this.verbo_irregulars,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            	   
		            	   } else if(SortExcellJFrame.this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
		            		   rowDataList=ExcellUtil.ProcesarTraerGrupoNivelVocabulario(SortExcellJFrame.this.vocabularios,((Grupo)getImpresionJFrameActual().jcomboboxHoja.getSelectedItem()).getId().toString(),sNivel,iNumeroResultados,getImpresionJFrameActual().randomGenerator,getImpresionJFrameActual().arrContadorFavorecidos,SortExcellJFrame.INTNUMEROFILAS);
		            	   }
		            	   
		            	   //NivelDetaillJFrame.createAndShowGUI(rowDataList);
		            	   
		            	   PracticaJInternalFrame practicaJInternalFrame=new PracticaJInternalFrame();
		            	   
		            	   practicaJInternalFrame.tipo_Proceso=SortExcellJFrame.this.tipo_Proceso;
		            	   practicaJInternalFrame.setRowDataList(rowDataList);
		            	   practicaJInternalFrame.cargarDatos();
		            	   practicaJInternalFrame.setVisible(true);
		            	   
		            	   //jDesktopPane.add(practicaJInternalFrame);
		            	   
		            	   MainJFrame.procesarAbrirJInternalFramesExistentes(jDesktopPane, practicaJInternalFrame);
		            	   
		            	   getImpresionJFrameActual().labelDetalleProceso.setText("NUMERO TOTAL="+SortExcellJFrame.INTNUMEROFILAS);
		            	   
		    		   } catch (Exception e) {	    				
		    			    SortExcellJFrame.recordLogException(e);	    			   
		    				e.printStackTrace();	    				
		    		   }
	               }
	           });          
	           
	       } catch (Exception ex) {
			   SortExcellJFrame.recordLogException(ex);	
	    	   ex.printStackTrace();
	       } 
		   
	   } catch(Exception ex) {
		   throw ex;
	   }
   }
   
   public SortExcellJFrame getImpresionJFrameActual() {	   
	   return this;
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
				 	   
				 	   SortExcellJFrame.recordLog("ELIMINANDO:"+sPathArchivo, SortExcellJFrame.SLOGTIPOINFO);
				 	  
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
			   
			   
			   if(this.iFlag < 100000) {
				   this.iFlag++;
			   } else {
				   this.iFlag=0;
			   }
			   
			   this.labelDetalleProceso.setText(this.iFlag.toString());
			   			   						   
			   //synchronized(this.scheduledexecutorservice) {
			   //   this.scheduledexecutorservice.notify();
			   //}
			 
			   
		   } catch(Exception e) {
			   throw e;
		   }		   
	   }
	
	public String getImpresoraDesdeArchivo(String sFileName) {
		String sImpresora=SortExcellJFrame.SIMPRESORADEFECTO;
		
		String[] arrFileNameImpresora=sFileName.split(SortExcellJFrame.SKEYCHARRINTER);
		
		if(arrFileNameImpresora.length > 1) {
			sImpresora=arrFileNameImpresora[1];
		}
		
		sImpresora=sImpresora.replace("&", "/");
		
		return " " + sImpresora + " ";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
