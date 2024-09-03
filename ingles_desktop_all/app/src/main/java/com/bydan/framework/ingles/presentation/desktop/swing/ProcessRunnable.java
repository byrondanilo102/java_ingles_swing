package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.PaginaTipo;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;


@SuppressWarnings("unused")
public class ProcessRunnable implements Runnable {
	public String sTipo="NONE";
	
	public Modulo modulousuarioSeleccionado;
	public Opcion opcionActual;
	public Usuario usuarioActual;
	public ResumenUsuario resumenusuarioActual;
	public ParametroGeneralSg parametroGeneralSg;
	public ParametroGeneralUsuario parametroGeneralusuario;
	public Modulo moduloActual;
	public JDesktopPane desktop;
	
	public JInternalFrameBase jInternalFrameBase;
	
	public JTabbedPane jTabbedPaneBusquedas; 
	
	public JPanel jPanelParametrosReportes;
	//public JScrollPane jScrollPanelDatos;
	public JTable tableDatos;
	public JPanel jPanelCampos;
	public JPanel jPanelPaginacion;
	//public JScrollPane jScrollPanelDatosEdicion;
	public JPanel jPanelAcciones;
	public JPanel jPanelAccionesFormulario;
	
	public JMenuBar jmenuBar;
	public JMenuBar jmenuBarDetalle;
	public JToolBar jTtoolBar;
	public JToolBar jTtoolBarDetalle;
	
	
	public void run() {
		
		
		try {
			
			//System.out.println(""+this.sTipo+"");
			
			if(this.sTipo.equals("START")) {
				FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedas ,jPanelParametrosReportes,tableDatos, /*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
				
				jInternalFrameBase.startProcess();
				
			} else if(this.sTipo.equals("END")){
				FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedas ,jPanelParametrosReportes, tableDatos,/*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
				
				jInternalFrameBase.finishProcess();
			}
			
			//System.out.println(""+this.sTipo+" ");
			
			
		} catch (Exception e) {
			FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedas ,jPanelParametrosReportes,tableDatos, /*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
			
			System.out.println("ERROR!!!!! MODULO "+this.sTipo+" CARGADO!!!!! ");
						
			e.printStackTrace();
		}				
    }
		
		public String getsTipo() {
			return sTipo;
		}

		public void setsTipo(String sTipo) {
			this.sTipo = sTipo;
		}

		public Modulo getmodulousuarioSeleccionado() {
			return modulousuarioSeleccionado;
		}

		public void setModuloUsuarioSeleccionado(Modulo modulousuarioSeleccionado) {
			this.modulousuarioSeleccionado = modulousuarioSeleccionado;
		}

		public Opcion getopcionActual() {
			return opcionActual;
		}

		public void setOpcionActual(Opcion opcionActual) {
			this.opcionActual = opcionActual;
		}

		public Usuario getusuarioActual() {
			return usuarioActual;
		}

		public void setUsuarioActual(Usuario usuarioActual) {
			this.usuarioActual = usuarioActual;
		}

		public ResumenUsuario getresumen_usuarioActual() {
			return resumenusuarioActual;
		}

		public void setResumenUsuarioActual(ResumenUsuario resumenusuarioActual) {
			this.resumenusuarioActual = resumenusuarioActual;
		}

		public ParametroGeneralSg getparametro_general_sg() {
			return parametroGeneralSg;
		}

		public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
			this.parametroGeneralSg = parametroGeneralSg;
		}

		public ParametroGeneralUsuario getparametro_general_usuario() {
			return parametroGeneralusuario;
		}

		public void setParametroGeneralUsuario(
				ParametroGeneralUsuario parametroGeneralusuario) {
			this.parametroGeneralusuario = parametroGeneralusuario;
		}

		public Modulo getmoduloActual() {
			return moduloActual;
		}

		public void setModuloActual(Modulo moduloActual) {
			this.moduloActual = moduloActual;
		}

		public JDesktopPane getDesktop() {
			return desktop;
		}

		public void setDesktop(JDesktopPane desktop) {
			this.desktop = desktop;
		}

		
		
		
		
		
		
		
		
		
		
		
		public JInternalFrameBase getjInternalFrameBase() {
			return jInternalFrameBase;
		}

		public void setjInternalFrameBase(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase = jInternalFrameBase;
		}

		public JTabbedPane getjTabbedPaneBusquedas() {
			return jTabbedPaneBusquedas;
		}

		public void setjTabbedPaneBusquedas(
				JTabbedPane jTabbedPaneBusquedas) {
			this.jTabbedPaneBusquedas = jTabbedPaneBusquedas;
		}

		public JPanel getjPanelParametrosReportes() {
			return jPanelParametrosReportes;
		}

		public void setjPanelParametrosReportes(
				JPanel jPanelParametrosReportes) {
			this.jPanelParametrosReportes = jPanelParametrosReportes;
		}

		public JTable gettableDatos() {
			return tableDatos;
		}

		public void settableDatos(JTable tableDatos) {
			this.tableDatos = tableDatos;
		}

		public JPanel getjPanelCampos() {
			return jPanelCampos;
		}

		public void setjPanelCampos(JPanel jPanelCampos) {
			this.jPanelCampos = jPanelCampos;
		}

		public JPanel getjPanelPaginacion() {
			return jPanelPaginacion;
		}

		public void setjPanelPaginacion(JPanel jPanelPaginacion) {
			this.jPanelPaginacion = jPanelPaginacion;
		}

		public JPanel getjPanelAcciones() {
			return jPanelAcciones;
		}

		public void setjPanelAcciones(JPanel jPanelAcciones) {
			this.jPanelAcciones = jPanelAcciones;
		}

		public JPanel getjPanelAccionesFormulario() {
			return jPanelAccionesFormulario;
		}

		public void setjPanelAccionesFormulario(
				JPanel jPanelAccionesFormulario) {
			this.jPanelAccionesFormulario = jPanelAccionesFormulario;
		}

		public JMenuBar getJmenuBar() {
			return jmenuBar;
		}

		public void setJmenuBar(JMenuBar jmenuBar) {
			this.jmenuBar = jmenuBar;
		}

		public JMenuBar getJmenuBarDetalle() {
			return jmenuBarDetalle;
		}

		public void setJmenuBarDetalle(JMenuBar jmenuBarDetalle) {
			this.jmenuBarDetalle = jmenuBarDetalle;
		}

		public JToolBar getjTtoolBar() {
			return jTtoolBar;
		}

		public void setjTtoolBar(JToolBar jTtoolBar) {
			this.jTtoolBar = jTtoolBar;
		}

		public JToolBar getjTtoolBarDetalle() {
			return jTtoolBarDetalle;
		}

		public void setjTtoolBarDetalle(JToolBar jTtoolBarDetalle) {
			this.jTtoolBarDetalle = jTtoolBarDetalle;
		}		
}
