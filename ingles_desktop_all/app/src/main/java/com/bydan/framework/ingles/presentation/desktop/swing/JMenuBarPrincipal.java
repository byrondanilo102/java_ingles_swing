package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarPrincipal extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JMenu menu;
	public JMenu menuDatos;
	public JMenu menuArchivo;
	public JMenu menuAcciones;
	//MENU
	
	//MENU_ITEM
	public JMenuItem menuItemNuevo;
	public JMenuItem menuItemDuplicar;
	public JMenuItem menuItemNuevoRelaciones;
	
	
	public JMenuItem menuItemGuardarCambios;
	public JMenuItem menuItemCopiar;
	public JMenuItem menuItemVerForm;
	public JMenuItem menuItemGuardarCambiosTabla;
	public JMenuItem menuItemCerrar;
	//DUPLICADO EN DETALLE
	//public JMenuItem menuItemDetalleCerrar;
	public JMenuItem menuItemDetalleAbrirOrderBy;
	public JMenuItem menuItemDetalleMostarOcultar;
	
	public JMenuItem menuItemRecargarInformacion;
	public JMenuItem menuItemProcesarInformacion;
	public JMenuItem menuItemAnteriores;
	public JMenuItem menuItemSiguientes;
	public JMenuItem menuItemNuevoGuardarCambios;
	public JMenuItem menuItemAbrirOrderBy;
	public JMenuItem menuItemMostrarOcultar;
	
	
	JInternalFrameBase jFrameBase;
	String STIPO_TAMANIO_GENERAL="";
	Boolean conCargarMinimo=false;
	
	public JMenuBarPrincipal(JInternalFrameBase jFrameBase,String STIPO_TAMANIO_GENERAL,Boolean conCargarMinimo) {
		super();
		
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.conCargarMinimo=conCargarMinimo;
		this.jFrameBase=jFrameBase;
		
		this.inicializarMenus();
		
		this.cargarMenus();
	}
	
	public JMenuBarPrincipal() {
		
	}

	public void inicializarMenus() {		
		//this=new JMenuBar();
		
		//PRINCIPAL
		this.menu=new JMenu("General");
		this.menuArchivo=new JMenu("Archivo");
		this.menuAcciones=new JMenu("Acciones");
		this.menuDatos=new JMenu("Datos");
		
		FuncionesSwing.setBoldMenu(this.menu, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuArchivo, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuAcciones, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		FuncionesSwing.setBoldMenu(this.menuDatos, jFrameBase.sTipoTamanioGeneral,false,true,jFrameBase);
		
		FuncionesSwing.setBoldComponent(this.menu, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuArchivo, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuAcciones, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuDatos, jFrameBase.sTipoTamanioGeneral,false,true,this.jFrameBase);
		
	}
	
	public void cargarMenus() {		
		
		
		//PRINCIPAL
		//this.cargarMenusGenerico();
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.menuItemNuevo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemNuevo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.menuItemNuevo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemNuevo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemDuplicar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemDuplicar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.menuItemDuplicar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemDuplicar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemNuevoRelaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemNuevoRelaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.menuItemNuevoRelaciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemNuevoRelaciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		
		this.menuItemGuardarCambios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemGuardarCambios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.menuItemGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemCopiar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemCopiar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.menuItemCopiar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemCopiar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemVerForm= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemVerForm,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.menuItemVerForm, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemVerForm, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemGuardarCambiosTabla= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemGuardarCambiosTabla,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.menuItemGuardarCambiosTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemGuardarCambiosTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemCerrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemCerrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.menuItemCerrar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemCerrar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		
		this.menuItemRecargarInformacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemRecargarInformacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.menuItemRecargarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemRecargarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemProcesarInformacion= new JMenuItem("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemProcesarInformacion,"procesar_button","Procesar Informacion");
		FuncionesSwing.setBoldComponent(this.menuItemProcesarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemAnteriores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemAnteriores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.menuItemAnteriores, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemAnteriores, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemSiguientes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemSiguientes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.menuItemSiguientes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemSiguientes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemAbrirOrderBy= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemAbrirOrderBy,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.menuItemAbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemAbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemMostrarOcultar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemMostrarOcultar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.menuItemMostrarOcultar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemMostrarOcultar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemDetalleAbrirOrderBy= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemDetalleAbrirOrderBy,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.menuItemDetalleAbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemDetalleAbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemDetalleMostarOcultar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemDetalleMostarOcultar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.menuItemDetalleMostarOcultar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemDetalleMostarOcultar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.menuItemNuevoGuardarCambios= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		FuncionesSwing.addImagenMenuItemGeneral(this.menuItemNuevoGuardarCambios,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.menuItemNuevoGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.menuItemNuevoGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.menuArchivo.add(this.menuItemCerrar);
			
			this.menuAcciones.add(this.menuItemNuevo);
			this.menuAcciones.add(this.menuItemNuevoGuardarCambios);
			this.menuAcciones.add(this.menuItemNuevoRelaciones);
			this.menuAcciones.add(this.menuItemGuardarCambiosTabla);		
			this.menuAcciones.add(this.menuItemDuplicar);		
			this.menuAcciones.add(this.menuItemCopiar);		
			this.menuAcciones.add(this.menuItemVerForm);		
			
			this.menuDatos.add(this.menuItemRecargarInformacion);				
			this.menuDatos.add(this.menuItemAnteriores);				
			this.menuDatos.add(this.menuItemSiguientes);				
			this.menuDatos.add(this.menuItemAbrirOrderBy);				
			this.menuDatos.add(this.menuItemMostrarOcultar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.menuDetalleAccionesAnio.add(this.menuItemGuardarCambiosAnio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.menuArchivo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			FuncionesSwing.setBoldMenu(this.menuAcciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			FuncionesSwing.setBoldMenu(this.menuDatos, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			
			FuncionesSwing.setBoldComponent(this.menuArchivo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			FuncionesSwing.setBoldComponent(this.menuAcciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			FuncionesSwing.setBoldComponent(this.menuDatos, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			
			this.add(this.menuArchivo);		
			this.add(this.menuAcciones);		
			this.add(this.menuDatos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		/*
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this);			
		}
		*/
		
		//AGREGA MENU DETALLE A PANTALLA
	}
}
