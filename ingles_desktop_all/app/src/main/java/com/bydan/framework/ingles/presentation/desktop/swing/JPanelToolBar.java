package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

//import com.bydan.erp.seguridad.util.AnioConstantesFunciones;
import com.bydan.framework.ingles.util.PaginaTipo;

@SuppressWarnings("unused")
public class JPanelToolBar extends JPanelMe {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GridBagLayout gridaBagLayout;	
	protected GridBagConstraints gridBagConstraints;	
	public String sNombreClase="";
	public PaginaTipo paginaTipo=PaginaTipo.PRINCIPAL;
	
	public JToolBar toolBar;
	
	public JButton btn_NuevoToolBar;
	public JButton btn_DuplicarToolBar;
	public JButton btn_NuevoRelacionesToolBar;
	
	
	public JButton btn_GuardarCambiosToolBar;
	public JButton btn_CopiarToolBar;
	public JButton btn_VerFormToolBar;
	public JButton btn_GuardarCambiosTablaToolBar;
	public JButton btn_MostrarOcultarTablaToolBar;
	public JButton btn_CerrarToolBar;
	
	public JButton btn_RecargarInformacionToolBar;
	public JButton btn_ProcesarInformacionToolBar;
	public JButton btn_AnterioresToolBar;
	public JButton btn_SiguientesToolBar;
	public JButton btn_NuevoGuardarCambiosToolBar;
	public JButton btn_AbrirOrderByToolBar;
	public JInternalFrameBase jFrameBase;
	
	/**
	 * Create the panel.
	 */
	public JPanelToolBar() {		
		this.inicializarToolBar();
		
		this.ubicarToolBar();
	}

	public JPanelToolBar(JInternalFrameBase jFrameBase) {
		this.jFrameBase=jFrameBase;
		
		this.inicializarToolBar();
		
		this.ubicarToolBar();
	}
	
	public JPanelToolBar(Long idTipoFondo,String sNombreClase,PaginaTipo paginaTipo) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);//new JPanel();
		
		this.sNombreClase=sNombreClase;
		this.paginaTipo=paginaTipo;
		
		this.inicializarToolBar();
		
		this.ubicarToolBar();
	}
	
	public JPanelToolBar(Long idTipoFondo,String sNombreClase,PaginaTipo paginaTipo,JInternalFrameBase jFrameBase) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);//new JPanel();
		
		this.sNombreClase=sNombreClase;
		this.paginaTipo=paginaTipo;
		this.jFrameBase=jFrameBase;
		
		this.inicializarToolBar();
		
		this.ubicarToolBar();
	}
	
	public void ubicarToolBar() {
		GridXy gxy=new GridXy();
		
		this.gridBagConstraints = new GridBagConstraints();						
		//this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.CENTER,0,gxy.iGridyPrincipal++);
		this.gridBagConstraints.ipadx = 100;				
		this.add(this.toolBar, this.gridBagConstraints);	
	}
	
	public void inicializarToolBar() {
		this.toolBar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		//ConstantesFunciones.SCLASSWEBTITULO
		this.btn_NuevoToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_NuevoToolBar,this.toolBar,
							"nuevo","nuevo","Nuevo"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_NuevoToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		
		this.btn_NuevoGuardarCambiosToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_NuevoGuardarCambiosToolBar,this.toolBar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_NuevoGuardarCambiosToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_GuardarCambiosTablaToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_GuardarCambiosTablaToolBar,this.toolBar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_GuardarCambiosTablaToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_DuplicarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_DuplicarToolBar,this.toolBar,
							"duplicar","duplicar","Duplicar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_DuplicarToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_CopiarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_CopiarToolBar,this.toolBar,
							"copiar","copiar","Copiar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false,this.jFrameBase);								
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_CopiarToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_VerFormToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_VerFormToolBar,this.toolBar,
							"ver_form","ver_form","Ver"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false,this.jFrameBase);								
							
		FuncionesSwing.setBoldButtonToolBar(this.btn_VerFormToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_RecargarInformacionToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_RecargarInformacionToolBar,this.toolBar,
							"recargar","recargar","Recargar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_RecargarInformacionToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_AnterioresToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_RecargarInformacionToolBar,this.toolBar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_AnterioresToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_SiguientesToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_RecargarInformacionToolBar,this.toolBar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_SiguientesToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_AbrirOrderByToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_AbrirOrderByToolBar,this.toolBar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_AbrirOrderByToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_NuevoRelacionesToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_NuevoRelacionesToolBar,this.toolBar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_NuevoRelacionesToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_MostrarOcultarTablaToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_MostrarOcultarTablaToolBar,this.toolBar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_MostrarOcultarTablaToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.btn_CerrarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_CerrarToolBar,this.toolBar,
							"cerrar","cerrar","Salir"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_CerrarToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		//this.btn_NuevoRelacionesToolBarAnio=new JButton();		
		//protected JButton btn_NuevoRelacionesToolBarAnio;
			
				this.btn_ProcesarInformacionToolBar=new JButton();
				//protected JButton btn_ProcesarInformacionToolBarAnio;
				FuncionesSwing.setBoldButtonToolBar(this.btn_ProcesarInformacionToolBar, this.jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
				
		//protected JButton btn_ModificarToolBarAnio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}

//JPanelToolBar jPanelToolBar=new JPanelToolBar(this.parametroGeneralusuario.getid_tipo_fondo());
//this.jContentPane.add(jPanelToolBar, this.gridBagConstraintsAnio);			
}