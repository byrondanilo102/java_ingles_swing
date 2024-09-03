package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

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


import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PracticaJInternalFrame extends JInternalFrameBase {

	private JPanel contentPane;
	public JPanel panel_Datos;
	public ArrayList<ActionListenerFila> actionsListenerFila;
	public List rowDataList;
	public TipoProceso tipo_Proceso=TipoProceso.DICCIONARIO;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticaJInternalFrame frame = new PracticaJInternalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PracticaJInternalFrame() {
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(350, 50, 600, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow][grow][]"));
		
		this.actionsListenerFila=new ArrayList<ActionListenerFila>();
		
		JPanel panel_Parametros = new JPanel();
		panel_Parametros.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Parametros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_Parametros, "cell 0 0,grow");
		panel_Parametros.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblAccion_1 = new JLabel("Accion");
		panel_Parametros.add(lblAccion_1, "cell 0 0");
		
		JButton btnProcesar = new JButton("Validar Todos");
		panel_Parametros.add(btnProcesar, "cell 1 0");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(ActionListenerFila actionListenerFila:actionsListenerFila) {
					actionListenerFila.validarRespuesta();
				}
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		panel_Datos = new JPanel();
		scrollPane.setViewportView(panel_Datos);
		panel_Datos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Datos.setLayout(new MigLayout("", "[][][][][]", "[]"));
		
		JLabel lblId = new JLabel("Id");
		panel_Datos.add(lblId, "cell 0 0");
		
		JLabel lblEspanol = new JLabel("Espanol");
		panel_Datos.add(lblEspanol, "cell 1 0");
		
		JLabel lblIngles = new JLabel("Respuesta");
		panel_Datos.add(lblIngles, "cell 2 0");
		
		JLabel lblRespuuesta = new JLabel("Ingles");
		panel_Datos.add(lblRespuuesta, "cell 3 0");
		
		JLabel lblAccion = new JLabel("Accion");
		panel_Datos.add(lblAccion, "cell 4 0");
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PracticaJInternalFrame.this.setVisible(false);;
			}
		});
		contentPane.add(btnCerrar, "cell 0 2,alignx center");
		
		
		this.tipo_Proceso=TipoProceso.DICCIONARIO;
		
		/*
		JLabel lbl_id;
		JTextField txt_espanol;
		JTextField txt_respuesta;
		JLabel lbl_ingles;
		JButton btn_accion;
		ActionListenerFila actionListenerFila;
		
		for(Integer i=1;i<=20;i++) {
			lbl_id=new JLabel(i.toString());
			txt_espanol=new JTextField("SPANISH");
			txt_respuesta=new JTextField("ENGLISH");
			lbl_ingles=new JLabel("ANSWER");
			btn_accion=new JButton("Validar "+i);
			
			lbl_ingles.setVisible(false);
			
			panel_Datos.add(lbl_id, "cell 0 "+i);
			panel_Datos.add(txt_espanol, "cell 1 "+i);
			panel_Datos.add(txt_respuesta, "cell 2 "+i);
			panel_Datos.add(lbl_ingles, "cell 3 "+i);
			panel_Datos.add(btn_accion, "cell 4 "+i);
			
			actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
			
			this.actionsListenerFila.add(actionListenerFila);
			
			btn_accion.addActionListener(actionListenerFila);
		}
		*/
				
	}
	
	public void cargarDatos() {
		
		Integer i=1;
		JLabel lbl_id;
		JTextField txt_espanol;
		JTextField txt_respuesta;
		JLabel lbl_ingles;
		JButton btn_accion;
		ActionListenerFila actionListenerFila;
		
		if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO)) {
			
			for(ConceptoDetalle conceptoDetalle:(ArrayList<ConceptoDetalle>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(conceptoDetalle.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(conceptoDetalle.getidea());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.CONCEPTO_DETALLE)) {
				
				for(ConceptoDetalle conceptoDetalle:(ArrayList<ConceptoDetalle>)this.rowDataList) {
					 
					lbl_id=new JLabel(i.toString());
					
					txt_espanol=new JTextField(conceptoDetalle.gettraduccion());
					txt_espanol.setColumns(15);
					
					txt_respuesta=new JTextField("");
					txt_respuesta.setColumns(10);
					
					btn_accion=new JButton("Validar "+i);
					
					lbl_ingles=new JLabel(conceptoDetalle.getidea());			
					lbl_ingles.setVisible(false);
						
					panel_Datos.add(lbl_id, "cell 0 "+i);
					panel_Datos.add(txt_espanol, "cell 1 "+i);
					panel_Datos.add(txt_respuesta, "cell 2 "+i);			
					panel_Datos.add(btn_accion, "cell 3 "+i);
					panel_Datos.add(lbl_ingles, "cell 4 "+i);
					
					actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
						
					this.actionsListenerFila.add(actionListenerFila);
					
					btn_accion.addActionListener(actionListenerFila);
					 
					i++;
				 }
				
			} else if(this.tipo_Proceso.equals(TipoProceso.DICCIONARIO)) {
			
			 for(Diccionario diccionario:(ArrayList<Diccionario>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(diccionario.getexpresion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(diccionario.gettraduccion1());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			 
		}  else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION)) {
			
			for(ExpresionDetalle expresionDetalle:(ArrayList<ExpresionDetalle>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(expresionDetalle.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(expresionDetalle.getidea());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.EXPRESION_DETALLE)) {
			
			for(ExpresionDetalle expresionDetalle:(ArrayList<ExpresionDetalle>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(expresionDetalle.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(expresionDetalle.getidea());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		}  else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR)) {
			
			for(GrammarDetalle grammarDetalle:(ArrayList<GrammarDetalle>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(grammarDetalle.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(grammarDetalle.getidea());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.GRAMMAR_DETALLE)) {
			
			for(GrammarDetalle grammarDetalle:(ArrayList<GrammarDetalle>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(grammarDetalle.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(grammarDetalle.getidea());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.NUMERO_GENERAL)) {
			
			for(NumeroGeneral numeroGeneral:(ArrayList<NumeroGeneral>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(numeroGeneral.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(numeroGeneral.getnombre());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }		
		} else if(this.tipo_Proceso.equals(TipoProceso.PAIS_GENERAL)) {
			
			for(PaisGeneral paisGeneral:(ArrayList<PaisGeneral>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(paisGeneral.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(paisGeneral.getnombre());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.VERBO_COMPUESTO)) {
			
			for(VerboCompuesto verboCompuesto:(ArrayList<VerboCompuesto>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(verboCompuesto.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(verboCompuesto.getinfinitivo());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }
			
		} else if(this.tipo_Proceso.equals(TipoProceso.VERBO_IRREGULAR)) {
			
			for(VerboIrregular verboIrregular:(ArrayList<VerboIrregular>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(verboIrregular.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(verboIrregular.getinfinitivo());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }	
			
		} else if(this.tipo_Proceso.equals(TipoProceso.VOCABULARIO)) {
			
			for(Vocabulario vocabulario:(ArrayList<Vocabulario>)this.rowDataList) {
				 
				lbl_id=new JLabel(i.toString());
				
				txt_espanol=new JTextField(vocabulario.gettraduccion());
				txt_espanol.setColumns(15);
				
				txt_respuesta=new JTextField("");
				txt_respuesta.setColumns(10);
				
				btn_accion=new JButton("Validar "+i);
				
				lbl_ingles=new JLabel(vocabulario.getnombre());			
				lbl_ingles.setVisible(false);
					
				panel_Datos.add(lbl_id, "cell 0 "+i);
				panel_Datos.add(txt_espanol, "cell 1 "+i);
				panel_Datos.add(txt_respuesta, "cell 2 "+i);			
				panel_Datos.add(btn_accion, "cell 3 "+i);
				panel_Datos.add(lbl_ingles, "cell 4 "+i);
				
				actionListenerFila=new ActionListenerFila(txt_espanol,txt_respuesta,lbl_ingles,btn_accion,i);
					
				this.actionsListenerFila.add(actionListenerFila);
				
				btn_accion.addActionListener(actionListenerFila);
				 
				i++;
			 }		
		}
	}
	
	public List getRowDataList() {
		return rowDataList;
	}


	public void setRowDataList(List rowDataList) {
		this.rowDataList = rowDataList;
	}
	
	public class ActionListenerFila implements ActionListener {
		public JTextField txt_espanol;
		public JTextField txt_ingles;
		public JLabel lbl_respuesta;
		public JButton btn_accion;
		Integer i;
		
		public ActionListenerFila() {
			
		}
		
		public ActionListenerFila(JTextField txt_espanol,JTextField txt_ingles,JLabel lbl_respuesta,JButton btn_accion,Integer i) {
			this.txt_espanol=txt_espanol;
			this.txt_ingles=txt_ingles;
			this.lbl_respuesta=lbl_respuesta;
			this.btn_accion=btn_accion;
			this.i=i;
		}

		public void actionPerformed(ActionEvent arg0) {
			this.validarRespuesta();
		}
		
		public void validarRespuesta() {
			//this.txt_espanol.setText("ESPANOL");
			//this.txt_ingles.setText("INGLES");
			//this.lbl_respuesta.setText("RESPUESTA");
			//this.btn_accion.setText("OK "+this.i);
			
			this.lbl_respuesta.setVisible(true);
			
			
			if(this.txt_ingles.getText().trim().toLowerCase().equals(this.lbl_respuesta.getText().trim().toLowerCase())) {
				this.txt_ingles.setBackground(new Color(204, 255, 204));
				
			} else {
				this.txt_ingles.setBackground(new Color(255, 153, 153));
			}
			
			//System.out.println("Clicked "+i);
		}
	}

}
