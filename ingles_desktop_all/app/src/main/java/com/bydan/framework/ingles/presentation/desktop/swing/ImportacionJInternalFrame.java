





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
//import com.bydan.contabilidad1.seguridad.service.ejb.interfaces.PerfilAdditionableHome;
//import com.bydan.contabilidad1.seguridad.business.entity.*;
//import com.bydan.framework.contabilidad1.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.contabilidad1.business.logic.*;

//import java.util.ArrayList;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

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

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class ImportacionJInternalFrame extends JInternalFrameBase//PerfilBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
    protected JPanel pnl_Importacion;
    public JScrollPane jScrollPanelImportacion;
    protected GridBagConstraints gridBagConstraints;	
    
    public JLabel lbl_ArchivoImportacion;	
	public JLabel lbl_PathArchivoImportacion;
	protected JTextField txf_PathArchivoImportacion;
	
	protected JButton btn_AbrirImportacion;
	protected JButton btn_GenerarImportacion;
	protected JButton btn_CerrarImportacion;
	protected JFileChooser flc_Importacion;
	protected File file_Importacion;
	
	private String sClassWebTitulo="";
	
	public  ImportacionJInternalFrame(String sClassWebTitulo,JInternalFrameBase jInternalFrameParentParametro) throws Exception
	{
		super();
		try 
		{			
			this.sClassWebTitulo=sClassWebTitulo;
			//this.setjInternalFrameParent(jInternalFrameParent);
			
			this.cargarImportacion(jInternalFrameParentParametro);		
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public  ImportacionJInternalFrame() throws Exception
	{
		super();
		try 
		{			
			
			this.cargarImportacion(null);		
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public void cargarImportacion(JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacion = new GridBagLayout();
				
		//PANEL
		this.pnl_Importacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.pnl_Importacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.pnl_Importacion.setName("pnl_Importacion"); 
		
		this.pnl_Importacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.pnl_Importacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.pnl_Importacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.pnl_Importacion.setLayout(gridaBagLayoutImportacion);
		
		
		//this= new ImportacionJInternalFrame();
		//this= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.setjFrameParent(jInternalFrameParentParametro);
		
		this.setTitle("IMPORTACION");
	    this.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    //this.setjInternalFrameParent(this);
		
		this.setTitle("IMPORTACION");
	    this.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.lbl_ArchivoImportacion = new JLabelMe();

		this.lbl_ArchivoImportacion.setText("ARCHIVO IMPORTACION");		
		this.lbl_ArchivoImportacion.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_ArchivoImportacion.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_ArchivoImportacion.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYImportacion;		
		this.gridBagConstraints.gridx = iPosXImportacion++;
			
		this.pnl_Importacion.add(this.lbl_ArchivoImportacion, this.gridBagConstraints);

		
		//BOTON ABRIR IMPORTACION
		this.flc_Importacion = new JFileChooser();		
		this.flc_Importacion.setToolTipText("ESCOGER ARCHIVO"+" "+sClassWebTitulo);
		
		this.btn_AbrirImportacion = new JButtonMe();
		this.btn_AbrirImportacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.btn_AbrirImportacion,"generar_importacion_button","ESCOGER");
		
		this.btn_AbrirImportacion.setToolTipText("Generar"+" "+sClassWebTitulo);
	
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.pnl_Importacion.add(this.btn_AbrirImportacion, this.gridBagConstraints);
	
	
		//LABEL PATH IMPORTACION
		this.lbl_PathArchivoImportacion = new JLabelMe();

		this.lbl_PathArchivoImportacion.setText("PATH ARCHIVO");		
		this.lbl_PathArchivoImportacion.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_PathArchivoImportacion.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));
		this.lbl_PathArchivoImportacion.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYImportacion;		
		this.gridBagConstraints.gridx = iPosXImportacion++;
			
		this.pnl_Importacion.add(this.lbl_PathArchivoImportacion, this.gridBagConstraints);

		//PATH IMPORTACION
		this.txf_PathArchivoImportacion=new JTextFieldMe();
		this.txf_PathArchivoImportacion.setMinimumSize(new Dimension(150,Constantes.I_SWING_ALTO_CONTROL));
		this.txf_PathArchivoImportacion.setMaximumSize(new Dimension(150,Constantes.I_SWING_ALTO_CONTROL));
		this.txf_PathArchivoImportacion.setPreferredSize(new Dimension(150,Constantes.I_SWING_ALTO_CONTROL));

		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.pnl_Importacion.add(this.txf_PathArchivoImportacion, this.gridBagConstraints);
		

		//BOTON IMPORTACION
		this.btn_GenerarImportacion = new JButtonMe();
		this.btn_GenerarImportacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.btn_GenerarImportacion,"generar_importacion_button","IMPORTAR");
		
		this.btn_GenerarImportacion.setToolTipText("Generar"+" "+sClassWebTitulo);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.pnl_Importacion.add(this.btn_GenerarImportacion, this.gridBagConstraints);
					
		//BOTON CERRAR
		this.btn_CerrarImportacion = new JButtonMe();
		this.btn_CerrarImportacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.btn_CerrarImportacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.btn_CerrarImportacion.setToolTipText("Cancelar"+" "+sClassWebTitulo);
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.pnl_Importacion.add(this.btn_CerrarImportacion, this.gridBagConstraints);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipal = new GridBagLayout();
		
		this.jScrollPanelImportacion= new JScrollPane(pnl_Importacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYImportacion;
		this.gridBagConstraints.gridx =iPosXImportacion;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.getContentPane().setLayout(gridaBagLayoutImportacionPrincipal);
		this.getContentPane().add(this.jScrollPanelImportacion, this.gridBagConstraints);				
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

	public JPanel getpnl_Importacion() {
		return pnl_Importacion;
	}

	public void setpnl_Importacion(JPanel pnl_Importacion) {
		this.pnl_Importacion = pnl_Importacion;
	}

	public JScrollPane getjScrollPanelImportacion() {
		return jScrollPanelImportacion;
	}

	public void setjScrollPanelImportacion(JScrollPane jScrollPanelImportacion) {
		this.jScrollPanelImportacion = jScrollPanelImportacion;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JLabel getlbl_ArchivoImportacion() {
		return lbl_ArchivoImportacion;
	}

	public void setlbl_ArchivoImportacion(JLabel lbl_ArchivoImportacion) {
		this.lbl_ArchivoImportacion = lbl_ArchivoImportacion;
	}

	public JLabel getlbl_PathArchivoImportacion() {
		return lbl_PathArchivoImportacion;
	}

	public void setlbl_PathArchivoImportacion(JLabel lbl_PathArchivoImportacion) {
		this.lbl_PathArchivoImportacion = lbl_PathArchivoImportacion;
	}

	public JTextField gettxf_PathArchivoImportacion() {
		return txf_PathArchivoImportacion;
	}

	public void settxf_PathArchivoImportacion(
			JTextField txf_PathArchivoImportacion) {
		this.txf_PathArchivoImportacion = txf_PathArchivoImportacion;
	}

	public JButton getbtn_AbrirImportacion() {
		return btn_AbrirImportacion;
	}

	public void setbtn_AbrirImportacion(JButton btn_AbrirImportacion) {
		this.btn_AbrirImportacion = btn_AbrirImportacion;
	}

	public JButton getbtn_GenerarImportacion() {
		return btn_GenerarImportacion;
	}

	public void setbtn_GenerarImportacion(JButton btn_GenerarImportacion) {
		this.btn_GenerarImportacion = btn_GenerarImportacion;
	}

	public JButton getbtn_CerrarImportacion() {
		return btn_CerrarImportacion;
	}

	public void setbtn_CerrarImportacion(JButton btn_CerrarImportacion) {
		this.btn_CerrarImportacion = btn_CerrarImportacion;
	}

	public JFileChooser getflc_Importacion() {
		return flc_Importacion;
	}

	public void setflc_Importacion(JFileChooser flc_Importacion) {
		this.flc_Importacion = flc_Importacion;
	}

	public File getFile_Importacion() {
		return file_Importacion;
	}

	public void setFile_Importacion(File file_Importacion) {
		this.file_Importacion = file_Importacion;
	}

	public String getsClassWebTitulo() {
		return sClassWebTitulo;
	}

	public void setsClassWebTitulo(String sClassWebTitulo) {
		this.sClassWebTitulo = sClassWebTitulo;
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