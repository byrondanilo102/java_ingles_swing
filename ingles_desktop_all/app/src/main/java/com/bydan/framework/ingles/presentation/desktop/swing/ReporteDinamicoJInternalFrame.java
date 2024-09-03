/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.framework.ingles.presentation.desktop.swing;

/*
import com.bydan.contabilidad1.seguridad.business.entity.usuario;
import com.bydan.contabilidad1.seguridad.business.entity.Perfilopcion;
import com.bydan.contabilidad1.seguridad.business.entity.PerfilCampo;
import com.bydan.contabilidad1.seguridad.business.entity.PerfilAccion;
import com.bydan.contabilidad1.seguridad.business.entity.parametro_general_sg;
import com.bydan.contabilidad1.seguridad.business.entity.parametro_general_usuario;
import com.bydan.contabilidad1.seguridad.business.entity.modulo;
import com.bydan.contabilidad1.seguridad.business.entity.opcion;

import com.bydan.contabilidad1.seguridad.util.PerfilConstantesFunciones;
import com.bydan.contabilidad1.seguridad.business.entity.Perfil;
*/

import com.bydan.framework.ingles.util.*;

//import com.bydan.contabilidad1.seguridad.business.logic.*;
//import com.bydan.contabilidad1.seguridad.service.ejb.interfaces.PerfilAdditionable;
//import com.bydan.contabilidad1.seguridad.util.TipoVisualConstantesFunciones;
//import com.bydan.contabilidad1.seguridad.service.ejb.interfaces.PerfilAdditionableHome;
//import com.bydan.contabilidad1.seguridad.business.entity.*;
//import com.bydan.framework.contabilidad1.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.contabilidad1.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.Reporte;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

@SuppressWarnings("unused")
public class ReporteDinamicoJInternalFrame extends JInternalFrameBase {
	private static final long serialVersionUID = 1L;
	
	private Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
   
    protected JPanel pnl_ReporteDinamico;
    public JScrollPane jScrollPanelReporteDinamico;
    
    protected GridBagConstraints gridBagConstraints;
    
    public JLabel lbl_ColumnasSelectReporte;
	public JList<Reporte> list_ColumnasSelectReporte;
	public JScrollPane jScrollColumnasSelectReporte;
	
	public JLabel lbl_RelacionesSelectReporte;
	public JList<Reporte> list_RelacionesSelectReporte;
	public JScrollPane jScrollRelacionesSelectReporte;
	
	public JLabel lbl_ConGraficoDinamico;
	protected JCheckBox chb_ConGraficoDinamico;
	
	public JLabel lbl_GenerarExcelReporteDinamico;
	public JLabel lbl_TiposArchivoReporteDinamico;
	
	protected JButton btn_GenerarReporteDinamico;
	protected JButton btn_CerrarReporteDinamico;
	protected JButton btn_GenerarExcelReporteDinamico;	
	
	
	public JLabel lbl_ColumnaCategoriaGrafico;	
	@SuppressWarnings("rawtypes")
	protected JComboBox cmb_ColumnaCategoriaGrafico;
	
	public JLabel lbl_ColumnaCategoriaValor;	
	@SuppressWarnings("rawtypes")
	protected JComboBox cmb_ColumnaCategoriaValor;
	
	public JLabel lbl_ColumnasValoresGrafico;
	public JList<Reporte> list_ColumnasValoresGrafico;
	public JScrollPane jScrollColumnasValoresGrafico;
	
	public JLabel lbl_TiposGraficosReportesDinamico;
	@SuppressWarnings("rawtypes")
	protected JComboBox cmb_TiposGraficosReportesDinamico;
	
	@SuppressWarnings("rawtypes")
	protected JComboBox cmb_TiposReportesDinamico;
	
	@SuppressWarnings("rawtypes")
    protected JComboBox cmb_TiposArchivosReportesDinamico;
	
	String sTamanioGeneral="";
	
	public  ReporteDinamicoJInternalFrame() throws Exception {
		super();
		try {			
			
					
		} catch(Exception e) {
			throw e;
		}
    }
	
    public  ReporteDinamicoJInternalFrame(String sTamanioGeneral,JInternalFrameBase jInternalFrameParentParametro) throws Exception {
		super();
		try {			
			this.sTamanioGeneral=sTamanioGeneral;
			this.cargarReporteDinamico(jInternalFrameParentParametro);
					
		} catch(Exception e) {
			throw e;
		}
    }
    
    public void cargarReporteDinamico(JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVisual = new GridBagLayout();
				
		//PANEL
		this.pnl_ReporteDinamico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.pnl_ReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.pnl_ReporteDinamico.setName("pnl_ReporteDinamico"); 
		
		this.pnl_ReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.pnl_ReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.pnl_ReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.pnl_ReporteDinamico.setLayout(gridaBagLayoutReporteDinamicoTipoVisual);
		
		
		//this.jInternalFrameReporteDinamicoTipoVisual= new ReporteDinamicoJInternalFrame();
		
		this.jScrollPanelReporteDinamico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.setjFrameParent(jInternalFrameParentParametro);
		
		this.setTitle("REPORTE DINAMICO");
	    this.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.lbl_ColumnasSelectReporte = new JLabelMe();

		this.lbl_ColumnasSelectReporte.setText("Columnas Seleccion");		
		this.lbl_ColumnasSelectReporte.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_ColumnasSelectReporte.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_ColumnasSelectReporte.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
				
		this.pnl_ReporteDinamico.add(this.lbl_ColumnasSelectReporte, this.gridBagConstraints);
		

		//LISTA SELECT COLUMNAS
		this.list_ColumnasSelectReporte = new JList<Reporte>();
		this.list_ColumnasSelectReporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.list_ColumnasSelectReporte.setToolTipText("Tipos de Seleccion");
      		
		this.list_ColumnasSelectReporte.setMinimumSize(new Dimension(145,300));
        this.list_ColumnasSelectReporte.setMaximumSize(new Dimension(145,300));
        this.list_ColumnasSelectReporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporte=new JScrollPane(this.list_ColumnasSelectReporte);
			
			this.jScrollColumnasSelectReporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
				
			
		//this.pnl_ReporteDinamico.add(this.list_ColumnasSelectReporte, this.gridBagConstraints);
		this.pnl_ReporteDinamico.add(this.jScrollColumnasSelectReporte, this.gridBagConstraints);
		
		
		//LABEL SELECT RELACIONES
		this.lbl_RelacionesSelectReporte = new JLabelMe();

		this.lbl_RelacionesSelectReporte.setText("Relaciones Seleccion");		
		this.lbl_RelacionesSelectReporte.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_RelacionesSelectReporte.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_RelacionesSelectReporte.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.list_RelacionesSelectReporte = new JList<Reporte>();
		this.list_RelacionesSelectReporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.list_RelacionesSelectReporte.setToolTipText("Tipos de Seleccion");
      		
		this.list_RelacionesSelectReporte.setMinimumSize(new Dimension(145,300));
        this.list_RelacionesSelectReporte.setMaximumSize(new Dimension(145,300));
        this.list_RelacionesSelectReporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporte=new JScrollPane(this.list_RelacionesSelectReporte);
			
			this.jScrollRelacionesSelectReporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.chb_ConGraficoDinamico = new JCheckBoxMe();
		this.cmb_ColumnaCategoriaGrafico = new JComboBoxMe();
		this.list_ColumnasValoresGrafico = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.cmb_TiposReportesDinamico = new JComboBoxMe();		
		this.cmb_TiposReportesDinamico.setToolTipText("Tipos De Reporte");
		
		this.cmb_TiposReportesDinamico.setMinimumSize(new Dimension(100,20));
		this.cmb_TiposReportesDinamico.setMaximumSize(new Dimension(100,20));
		this.cmb_TiposReportesDinamico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.cmb_TiposReportesDinamico, sTamanioGeneral,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.cmb_TiposArchivosReportesDinamico = new JComboBoxMe();		
		this.cmb_TiposArchivosReportesDinamico.setToolTipText("Tipos Archivos");
		
		this.cmb_TiposArchivosReportesDinamico.setMinimumSize(new Dimension(100,20));
		this.cmb_TiposArchivosReportesDinamico.setMaximumSize(new Dimension(100,20));
		this.cmb_TiposArchivosReportesDinamico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.cmb_TiposArchivosReportesDinamico, sTamanioGeneral,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.lbl_GenerarExcelReporteDinamico = new JLabelMe();

		this.lbl_GenerarExcelReporteDinamico.setText("Tipos de Reporte");		
		this.lbl_GenerarExcelReporteDinamico.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_GenerarExcelReporteDinamico.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_GenerarExcelReporteDinamico.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
			
		this.pnl_ReporteDinamico.add(this.lbl_GenerarExcelReporteDinamico, this.gridBagConstraints);

				
		//BOTON GENERAR EXCEL
		
		this.btn_GenerarExcelReporteDinamico = new JButtonMe();
		this.btn_GenerarExcelReporteDinamico.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.btn_GenerarExcelReporteDinamico,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.btn_GenerarExcelReporteDinamico.setToolTipText("Generar EXCEL"+" ");//TipoVisualConstantesFunciones.SCLASSWEBTITULO
		
				
		//this.gridBagConstraints = new GridBagConstraints();
		//this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraints.gridy = iPosYReporteDinamico;
		//this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		//this.pnl_ReporteDinamico.add(this.btn_GenerarExcelReporteDinamico, this.gridBagConstraints);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.pnl_ReporteDinamico.add(this.cmb_TiposReportesDinamico, this.gridBagConstraints);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.lbl_TiposArchivoReporteDinamico = new JLabelMe();

		this.lbl_TiposArchivoReporteDinamico.setText("Tipos de Archivo");		
		this.lbl_TiposArchivoReporteDinamico.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_TiposArchivoReporteDinamico.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_TiposArchivoReporteDinamico.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
			
		this.pnl_ReporteDinamico.add(this.lbl_TiposArchivoReporteDinamico, this.gridBagConstraints);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.pnl_ReporteDinamico.add(this.cmb_TiposArchivosReportesDinamico, this.gridBagConstraints);
		
		
		//BOTON GENERAR
		this.btn_GenerarReporteDinamico = new JButtonMe();
		this.btn_GenerarReporteDinamico.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.btn_GenerarReporteDinamico,"generar_reporte_dinamico_button","Generar");
		
		this.btn_GenerarReporteDinamico.setToolTipText("Generar"+" ");//+TipoVisualConstantesFunciones.SCLASSWEBTITULO
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.pnl_ReporteDinamico.add(this.btn_GenerarReporteDinamico, this.gridBagConstraints);
					
		//BOTON CERRAR
		this.btn_CerrarReporteDinamico = new JButtonMe();
		this.btn_CerrarReporteDinamico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.btn_CerrarReporteDinamico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.btn_CerrarReporteDinamico.setToolTipText("Cancelar"+" ");//+TipoVisualConstantesFunciones.SCLASSWEBTITULO
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.pnl_ReporteDinamico.add(this.btn_CerrarReporteDinamico, this.gridBagConstraints);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVisual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamico= new JScrollPane(pnl_ReporteDinamico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYReporteDinamico;
		this.gridBagConstraints.gridx =iPosXReporteDinamico;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVisual);
		this.getContentPane().add(this.jScrollPanelReporteDinamico, this.gridBagConstraints);				
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public static int getOpenFrameCount() {
		return openFrameCount;
	}

	public static void setOpenFrameCount(int openFrameCount) {
		ReporteDinamicoJInternalFrame.openFrameCount = openFrameCount;
	}

	public JPanel getpnl_ReporteDinamico() {
		return pnl_ReporteDinamico;
	}

	public void setpnl_ReporteDinamico(JPanel pnl_ReporteDinamico) {
		this.pnl_ReporteDinamico = pnl_ReporteDinamico;
	}

	public JScrollPane getjScrollPanelReporteDinamico() {
		return jScrollPanelReporteDinamico;
	}

	public void setjScrollPanelReporteDinamico(
			JScrollPane jScrollPanelReporteDinamico) {
		this.jScrollPanelReporteDinamico = jScrollPanelReporteDinamico;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JLabel getlbl_ColumnasSelectReporte() {
		return lbl_ColumnasSelectReporte;
	}

	public void setlbl_ColumnasSelectReporte(JLabel lbl_ColumnasSelectReporte) {
		this.lbl_ColumnasSelectReporte = lbl_ColumnasSelectReporte;
	}

	public JList<Reporte> getlist_ColumnasSelectReporte() {
		return list_ColumnasSelectReporte;
	}

	public void setlist_ColumnasSelectReporte(
			JList<Reporte> list_ColumnasSelectReporte) {
		this.list_ColumnasSelectReporte = list_ColumnasSelectReporte;
	}

	public JScrollPane getjScrollColumnasSelectReporte() {
		return jScrollColumnasSelectReporte;
	}

	public void setjScrollColumnasSelectReporte(
			JScrollPane jScrollColumnasSelectReporte) {
		this.jScrollColumnasSelectReporte = jScrollColumnasSelectReporte;
	}

	public JLabel getlbl_RelacionesSelectReporte() {
		return lbl_RelacionesSelectReporte;
	}

	public void setlbl_RelacionesSelectReporte(
			JLabel lbl_RelacionesSelectReporte) {
		this.lbl_RelacionesSelectReporte = lbl_RelacionesSelectReporte;
	}

	public JList<Reporte> getlist_RelacionesSelectReporte() {
		return list_RelacionesSelectReporte;
	}

	public void setlist_RelacionesSelectReporte(
			JList<Reporte> list_RelacionesSelectReporte) {
		this.list_RelacionesSelectReporte = list_RelacionesSelectReporte;
	}

	public JScrollPane getjScrollRelacionesSelectReporte() {
		return jScrollRelacionesSelectReporte;
	}

	public void setjScrollRelacionesSelectReporte(
			JScrollPane jScrollRelacionesSelectReporte) {
		this.jScrollRelacionesSelectReporte = jScrollRelacionesSelectReporte;
	}

	public JLabel getlbl_ConGraficoDinamico() {
		return lbl_ConGraficoDinamico;
	}

	public void setlbl_ConGraficoDinamico(JLabel lbl_ConGraficoDinamico) {
		this.lbl_ConGraficoDinamico = lbl_ConGraficoDinamico;
	}

	public JCheckBox getchb_ConGraficoDinamico() {
		return chb_ConGraficoDinamico;
	}

	public void setchb_ConGraficoDinamico(JCheckBox chb_ConGraficoDinamico) {
		this.chb_ConGraficoDinamico = chb_ConGraficoDinamico;
	}

	public JLabel getlbl_GenerarExcelReporteDinamico() {
		return lbl_GenerarExcelReporteDinamico;
	}

	public void setlbl_GenerarExcelReporteDinamico(
			JLabel lbl_GenerarExcelReporteDinamico) {
		this.lbl_GenerarExcelReporteDinamico = lbl_GenerarExcelReporteDinamico;
	}

	public JLabel getlbl_TiposArchivoReporteDinamico() {
		return lbl_TiposArchivoReporteDinamico;
	}

	public void setlbl_TiposArchivoReporteDinamico(
			JLabel lbl_TiposArchivoReporteDinamico) {
		this.lbl_TiposArchivoReporteDinamico = lbl_TiposArchivoReporteDinamico;
	}

	public JButton getbtn_GenerarReporteDinamico() {
		return btn_GenerarReporteDinamico;
	}

	public void setbtn_GenerarReporteDinamico(
			JButton btn_GenerarReporteDinamico) {
		this.btn_GenerarReporteDinamico = btn_GenerarReporteDinamico;
	}

	public JButton getbtn_CerrarReporteDinamico() {
		return btn_CerrarReporteDinamico;
	}

	public void setbtn_CerrarReporteDinamico(JButton btn_CerrarReporteDinamico) {
		this.btn_CerrarReporteDinamico = btn_CerrarReporteDinamico;
	}

	public JButton getbtn_GenerarExcelReporteDinamico() {
		return btn_GenerarExcelReporteDinamico;
	}

	public void setbtn_GenerarExcelReporteDinamico(
			JButton btn_GenerarExcelReporteDinamico) {
		this.btn_GenerarExcelReporteDinamico = btn_GenerarExcelReporteDinamico;
	}

	public JLabel getlbl_ColumnaCategoriaGrafico() {
		return lbl_ColumnaCategoriaGrafico;
	}

	public void setlbl_ColumnaCategoriaGrafico(
			JLabel lbl_ColumnaCategoriaGrafico) {
		this.lbl_ColumnaCategoriaGrafico = lbl_ColumnaCategoriaGrafico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_ColumnaCategoriaGrafico() {
		return cmb_ColumnaCategoriaGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_ColumnaCategoriaGrafico(
			JComboBox cmb_ColumnaCategoriaGrafico) {
		this.cmb_ColumnaCategoriaGrafico = cmb_ColumnaCategoriaGrafico;
	}

	public JLabel getlbl_ColumnaCategoriaValor() {
		return lbl_ColumnaCategoriaValor;
	}

	public void setlbl_ColumnaCategoriaValor(JLabel lbl_ColumnaCategoriaValor) {
		this.lbl_ColumnaCategoriaValor = lbl_ColumnaCategoriaValor;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_ColumnaCategoriaValor() {
		return cmb_ColumnaCategoriaValor;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_ColumnaCategoriaValor(
			JComboBox cmb_ColumnaCategoriaValor) {
		this.cmb_ColumnaCategoriaValor = cmb_ColumnaCategoriaValor;
	}

	public JLabel getlbl_ColumnasValoresGrafico() {
		return lbl_ColumnasValoresGrafico;
	}

	public void setlbl_ColumnasValoresGrafico(JLabel lbl_ColumnasValoresGrafico) {
		this.lbl_ColumnasValoresGrafico = lbl_ColumnasValoresGrafico;
	}

	public JList<Reporte> getlist_ColumnasValoresGrafico() {
		return list_ColumnasValoresGrafico;
	}

	public void setlist_ColumnasValoresGrafico(
			JList<Reporte> list_ColumnasValoresGrafico) {
		this.list_ColumnasValoresGrafico = list_ColumnasValoresGrafico;
	}

	public JScrollPane getjScrollColumnasValoresGrafico() {
		return jScrollColumnasValoresGrafico;
	}

	public void setjScrollColumnasValoresGrafico(
			JScrollPane jScrollColumnasValoresGrafico) {
		this.jScrollColumnasValoresGrafico = jScrollColumnasValoresGrafico;
	}

	public JLabel getlbl_TiposGraficosReportesDinamico() {
		return lbl_TiposGraficosReportesDinamico;
	}

	public void setlbl_TiposGraficosReportesDinamico(
			JLabel lbl_TiposGraficosReportesDinamico) {
		this.lbl_TiposGraficosReportesDinamico = lbl_TiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposGraficosReportesDinamico() {
		return cmb_TiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposGraficosReportesDinamico(
			JComboBox cmb_TiposGraficosReportesDinamico) {
		this.cmb_TiposGraficosReportesDinamico = cmb_TiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposReportesDinamico() {
		return cmb_TiposReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposReportesDinamico(
			JComboBox cmb_TiposReportesDinamico) {
		this.cmb_TiposReportesDinamico = cmb_TiposReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposArchivosReportesDinamico() {
		return cmb_TiposArchivosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposArchivosReportesDinamico(
			JComboBox cmb_TiposArchivosReportesDinamico) {
		this.cmb_TiposArchivosReportesDinamico = cmb_TiposArchivosReportesDinamico;
	}

	public String getsTamanioGeneral() {
		return sTamanioGeneral;
	}

	public void setsTamanioGeneral(String sTamanioGeneral) {
		this.sTamanioGeneral = sTamanioGeneral;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getXoffset() {
		return xOffset;
	}

	public static int getYoffset() {
		return yOffset;
	}
    
    
}