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
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
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
public class OrderByJInternalFrame extends JInternalFrameBase//PerfilBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
    GridBagLayout gridaBagLayout = new GridBagLayout();
    GridBagLayout gridaBagLayoutPrincipal = new GridBagLayout();
    protected JPanel pnl_OrderBy;
    public JTable table_DatosOrderBy;
    public JScrollPane jScrollPanelDatosOrderBy;		
    protected GridBagConstraints gridBagConstraints;
    protected JButton btn_CerrarOrderBy;
    protected JButton btn_AbrirOrderBy;
    
    String sTamanioGeneral="";
    Boolean cargaMinima=false;
    
	public  OrderByJInternalFrame() throws Exception
	{
		super();
		try 
		{			
			
					
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public  OrderByJInternalFrame(String sTamanioGeneral,JButton btn_AbrirOrderBy,Boolean cargaMinima,JInternalFrameBase jInternalFrameParentParametro) throws Exception
	{
		super();
		try 
		{			
			this.sTamanioGeneral=sTamanioGeneral;
			this.btn_AbrirOrderBy=btn_AbrirOrderBy;
			this.cargaMinima=cargaMinima;
			
			this.cargarOrderBySistema(cargaMinima,jInternalFrameParentParametro);
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 
	
	public void cargarOrderBySistema(Boolean cargaMinima,JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//300;350;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			//this.btn_AbrirOrderBy = new JButtonMe();
			if(!this.btn_AbrirOrderBy.getText().equals("Orden")) {
				this.btn_AbrirOrderBy.setText("Orden");
				this.btn_AbrirOrderBy.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
				
				FuncionesSwing.addImagenButtonGeneral(this.btn_AbrirOrderBy,"orden_button","Orden");
				
				FuncionesSwing.setBoldButton(this.btn_AbrirOrderBy, sTamanioGeneral,false,true,this);;
				
				sMapKey = "AbrirOrderBySistema";
				inputMap = this.btn_AbrirOrderBy.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
				inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
					
				this.btn_AbrirOrderBy.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
			}
		
			
					
			//PANEL
			this.pnl_OrderBy = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.pnl_OrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.pnl_OrderBy.setName("pnl_OrderBy"); 
			
			this.pnl_OrderBy.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.pnl_OrderBy.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.pnl_OrderBy.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.pnl_OrderBy, sTamanioGeneral,false,true,this);;
			
			gridaBagLayout = new GridBagLayout();
			this.pnl_OrderBy.setLayout(gridaBagLayout);
			
			
			this.table_DatosOrderBy = new JTableMe();        
			this.table_DatosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(table_DatosOrderBy,sTamanioGeneral,false,true,this);
		
			
			this.jScrollPanelDatosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOrderBy.setViewportView(this.table_DatosOrderBy);
			this.table_DatosOrderBy.setFillsViewportHeight(true);
			this.table_DatosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			//this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			//this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			//this.jScrollPanelDatosOrderBy = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSistema= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.setjFrameParent(jInternalFrameParentParametro);
			
			this.setTitle("Orden");
			this.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
				
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySistema, sTamanioGeneral,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelDatosOrderBy.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			this.jScrollPanelDatosOrderBy.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			this.jScrollPanelDatosOrderBy.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrderBy, sTamanioGeneral,false,true,this);;
			
			this.jScrollPanelDatosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.gridy =iPosYOrderBy++;
			this.gridBagConstraints.gridx =iPosXOrderBy;
			this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraints.ipady =150;
				
			this.pnl_OrderBy.add(jScrollPanelDatosOrderBy, this.gridBagConstraints);//this.table_DatosSistemaTotales			
			
			//BOTON CERRAR
			this.btn_CerrarOrderBy = new JButtonMe();
			this.btn_CerrarOrderBy.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.btn_CerrarOrderBy,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.btn_CerrarOrderBy.setToolTipText("Cancelar"+" "+Sistema_util.S_CLASS_WEB_TITULO);
			
			FuncionesSwing.setBoldButton(this.btn_CerrarOrderBy, sTamanioGeneral,false,true,this);;
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints.gridy = iPosYOrderBy++;
			this.gridBagConstraints.gridx = iPosXOrderBy;
									
			this.pnl_OrderBy.add(this.btn_CerrarOrderBy, this.gridBagConstraints);
						
						
			//GLOBAL AGREGAR PANELES			
			gridaBagLayoutPrincipal = new GridBagLayout();
			
			this.jScrollPanelDatosOrderBy= new JScrollPane(pnl_OrderBy,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.gridy =iPosYOrderBy;
			this.gridBagConstraints.gridx =iPosXOrderBy;
			this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
			
			this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.getContentPane().setLayout(gridaBagLayoutPrincipal);
			
			this.getContentPane().add(this.jScrollPanelDatosOrderBy, this.gridBagConstraints);			
		
		} else {
			this.btn_AbrirOrderBy = new JButtonMe();
		}				
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
		OrderByJInternalFrame.openFrameCount = openFrameCount;
	}

	public GridBagLayout getGridaBagLayoutOrderBy() {
		return gridaBagLayout;
	}

	public void setGridaBagLayoutOrderBy(GridBagLayout gridaBagLayout) {
		this.gridaBagLayout = gridaBagLayout;
	}

	public GridBagLayout getGridaBagLayoutOrderByPrincipal() {
		return gridaBagLayoutPrincipal;
	}

	public void setGridaBagLayoutOrderByPrincipal(
			GridBagLayout gridaBagLayoutPrincipal) {
		this.gridaBagLayoutPrincipal = gridaBagLayoutPrincipal;
	}

	public JPanel getpnl_OrderBy() {
		return pnl_OrderBy;
	}

	public void setpnl_OrderBy(JPanel pnl_OrderBy) {
		this.pnl_OrderBy = pnl_OrderBy;
	}

	public JTable gettable_DatosOrderBy() {
		return table_DatosOrderBy;
	}

	public void settable_DatosOrderBy(JTable table_DatosOrderBy) {
		this.table_DatosOrderBy = table_DatosOrderBy;
	}

	public JScrollPane getjScrollPanelDatosOrderBy() {
		return jScrollPanelDatosOrderBy;
	}

	public void setjScrollPanelDatosOrderBy(JScrollPane jScrollPanelDatosOrderBy) {
		this.jScrollPanelDatosOrderBy = jScrollPanelDatosOrderBy;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JButton getbtn_CerrarOrderBy() {
		return btn_CerrarOrderBy;
	}

	public void setbtn_CerrarOrderBy(JButton btn_CerrarOrderBy) {
		this.btn_CerrarOrderBy = btn_CerrarOrderBy;
	}

	public JButton getbtn_AbrirOrderBy() {
		return btn_AbrirOrderBy;
	}

	public void setbtn_AbrirOrderBy(JButton btn_AbrirOrderBy) {
		this.btn_AbrirOrderBy = btn_AbrirOrderBy;
	}

	public String getsTamanioGeneral() {
		return sTamanioGeneral;
	}

	public void setsTamanioGeneral(String sTamanioGeneral) {
		this.sTamanioGeneral = sTamanioGeneral;
	}

	public Boolean getCargaMinima() {
		return cargaMinima;
	}

	public void setCargaMinima(Boolean cargaMinima) {
		this.cargaMinima = cargaMinima;
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