package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarDetalle extends JMenuBar {

	//public JMenuBar menuBarDetalle;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JMenu menuDetalle;
	public JMenu menuDetalleArchivo;
	public JMenu menuDetalleAcciones;
	public JMenu menuDetalleDatos;
	
	//MENU_ITEM_DETALLE
	public JMenuItem menuItemNuevo;
	public JMenuItem menuItemModificar;
	public JMenuItem menuItemActualizar;
	public JMenuItem menuItemEliminar;
    public JMenuItem menuItemCancelar;
    public JMenuItem menuItemDetalleCerrar;
    
    
    public JMenuItem menuItemGuardarCambios;
    public JMenuItem menuItemCerrar;   
    public JMenuItem menuItemDetalleMostarOcultar;
    public JMenuItem menuItemMostrarOcultar;
    
    //public JMenuItem menuItemProcesarInformacion;
    //public JMenuItem menuItemNuevoGuardarCambios;
    //public JMenuItem menuItemGuardarCambiosTabla;    
	
	
    public String STIPO_TAMANIO_GENERAL="";
    public JInternalFrameBase jFrameBase;
    public Boolean conCargarMinimo=false;
    		
    public JMenuBarDetalle() {
		super();
    }
    
    public JMenuBarDetalle(JInternalFrameBase jFrameBase,String STIPO_TAMANIO_GENERAL,Boolean conCargarMinimo) {
		super();
		
		this.jFrameBase=jFrameBase;		
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.conCargarMinimo=conCargarMinimo;		
		
		this.inicializarMenus();
		
		this.cargarMenus();
	}
    
    
	public void inicializarMenus() {		
		
		//this=new JMenuBar();
		
		//DETALLE
		this.menuDetalle=new JMenu("Datos Relacionados");
		this.menuDetalleArchivo=new JMenu("Archivo");
		this.menuDetalleAcciones=new JMenu("Acciones");
		this.menuDetalleDatos=new JMenu("Datos");
		
		/*
		FuncionesSwing.setBoldMenu(this.menuDetalle, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDetalleArchivo, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDetalleAcciones, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDetalleDatos, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		*/
	}

	
	public void cargarMenus() {		
		
		//this.cargarMenusDetalleGenerico();				
		
		
		this.menuItemNuevo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.menuItemNuevo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemNuevo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.menuItemNuevo, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemNuevo, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemModificar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.menuItemModificar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemModificar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.menuItemModificar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemModificar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemActualizar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.menuItemActualizar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemActualizar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.menuItemActualizar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemActualizar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemEliminar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.menuItemEliminar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemEliminar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.menuItemEliminar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemEliminar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemCancelar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.menuItemCancelar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemCancelar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.menuItemCancelar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemCancelar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemGuardarCambios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.menuItemGuardarCambios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemGuardarCambios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.menuItemGuardarCambios, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemGuardarCambios, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemCerrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.menuItemCerrar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemCerrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.menuItemCerrar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemCerrar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemDetalleCerrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.menuItemDetalleCerrar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemDetalleCerrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.menuItemDetalleCerrar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemDetalleCerrar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemMostrarOcultar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.menuItemMostrarOcultar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemMostrarOcultar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.menuItemMostrarOcultar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemMostrarOcultar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		this.menuItemDetalleMostarOcultar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.menuItemDetalleMostarOcultar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemDetalleMostarOcultar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.menuItemDetalleMostarOcultar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);			
		FuncionesSwing.setBoldComponent(this.menuItemDetalleMostarOcultar, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		//DETALLE
		this.menuDetalleArchivo.add(this.menuItemDetalleCerrar);
		
		this.menuDetalleAcciones.add(this.menuItemActualizar);
		this.menuDetalleAcciones.add(this.menuItemEliminar);
		this.menuDetalleAcciones.add(this.menuItemCancelar);		
		
		//this.menuDetalleDatos.add(this.menuItemDetalleAbrirOrderBy);				
		this.menuDetalleDatos.add(this.menuItemDetalleMostarOcultar);				
				
		//this.menuDetalleAccionesAnio.add(this.menuItemGuardarCambiosAnio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.menuDetalleArchivo, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDetalleAcciones, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDetalleDatos, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
			
		FuncionesSwing.setBoldComponent(this.menuDetalleArchivo, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuDetalleAcciones, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuDetalleDatos, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
		
		this.add(this.menuDetalleArchivo);		
		this.add(this.menuDetalleAcciones);		
		this.add(this.menuDetalleDatos);		
		
		//DETALLE_FIN
		
		
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.menuDetalle, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
			FuncionesSwing.setBoldComponent(this.menuDetalle, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
			
			this.add(this.menuDetalle);
		}
		
		//AGREGA MENU DETALLE A PANTALLA
		//this.setJMenuBar(this);				
	}
}
