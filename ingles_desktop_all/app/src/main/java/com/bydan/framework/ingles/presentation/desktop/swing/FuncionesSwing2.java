package com.bydan.framework.ingles.presentation.desktop.swing;

import java.util.logging.Logger;

import javax.swing.JDesktopPane;

//import org.apache.log4j.Logger;

import com.bydan.framework.ingles.business.entity.GeneralEntityParameterReturnGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Mensaje;

public class FuncionesSwing2 {
	
	public static void procesarMensaje(Object container,Mensaje mensaje,Logger logger) throws Exception {		
		try {
			//e.printStackTrace();
			//logger.error("Exception:" + mensaje.getSMensajeTecnico());
			
			if(mensaje.getsTipoMensaje().equals("INFO")) {
				FuncionesSwing.manageNormalInfo(container, mensaje.getSMensajeUsuario(), logger);
			
			} else if(mensaje.getsTipoMensaje().equals("ADVER")) {
				FuncionesSwing.manageNormalAdvertencia(container, mensaje.getSMensajeUsuario(), logger);
				
			} else if(mensaje.getsTipoMensaje().equals("ERROR")) {
				FuncionesSwing.manageNormalError(container, mensaje.getSMensajeUsuario(), logger);
			}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void procesarVentanaGeneral(Object container,Mensaje mensaje,Logger logger) throws Exception {		
		try {
			//ABRIR JFRAME O JINTERNALFRAME 
			VentanaGeneralHtmlJInternalFrame ventanaGeneralHtmlJInternalFrame=new VentanaGeneralHtmlJInternalFrame();
			
			JDesktopPane desktop=((JInternalFrameBase)container).jDesktopPane;
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(desktop,ventanaGeneralHtmlJInternalFrame);
    		}
			
			ventanaGeneralHtmlJInternalFrame.getLblHtml().setText(mensaje.getSMensajeTecnico());
			
			ventanaGeneralHtmlJInternalFrame.setVisible(true);
			ventanaGeneralHtmlJInternalFrame.setAutoscrolls(true);    				    
			ventanaGeneralHtmlJInternalFrame.setVisible(true); //necessary as of 1.3
	    	
	        desktop.add(ventanaGeneralHtmlJInternalFrame);
	               			
	        ventanaGeneralHtmlJInternalFrame.setSelected(true);
	        
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void procesarVentanaGeneral(Object container,GeneralEntityParameterReturnGeneral entityReturnGeneral,Logger logger) throws Exception {		
		try {
			//ABRIR JFRAME O JINTERNALFRAME 
			VentanaGeneralHtmlJInternalFrame ventanaGeneralHtmlJInternalFrame=new VentanaGeneralHtmlJInternalFrame();
			
			JDesktopPane desktop=((JInternalFrameBase)container).jDesktopPane;
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(desktop,ventanaGeneralHtmlJInternalFrame);
    		}
			
			ventanaGeneralHtmlJInternalFrame.getLblHtml().setText(entityReturnGeneral.getsMensaje());
			
			ventanaGeneralHtmlJInternalFrame.setVisible(true);
			ventanaGeneralHtmlJInternalFrame.setAutoscrolls(true);    				    
			ventanaGeneralHtmlJInternalFrame.setVisible(true); //necessary as of 1.3
	    	
	        desktop.add(ventanaGeneralHtmlJInternalFrame);
	               			
	        ventanaGeneralHtmlJInternalFrame.setSelected(true);
	        
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void procesarVentanaGeneral(Object container,GeneralEntityReturnGeneral entityReturnGeneral,Logger logger) throws Exception {		
		try {
			//ABRIR JFRAME O JINTERNALFRAME 
			VentanaGeneralHtmlJInternalFrame ventanaGeneralHtmlJInternalFrame=new VentanaGeneralHtmlJInternalFrame();
			
			JDesktopPane desktop=((JInternalFrameBase)container).jDesktopPane;
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(desktop,ventanaGeneralHtmlJInternalFrame);
    		}
			
			ventanaGeneralHtmlJInternalFrame.getLblHtml().setText(entityReturnGeneral.getsMensaje());
			
			ventanaGeneralHtmlJInternalFrame.setVisible(true);
			ventanaGeneralHtmlJInternalFrame.setAutoscrolls(true);    				    
			ventanaGeneralHtmlJInternalFrame.setVisible(true); //necessary as of 1.3
	    	
	        desktop.add(ventanaGeneralHtmlJInternalFrame);
	               			
	        ventanaGeneralHtmlJInternalFrame.setSelected(true);
	        
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void procesarVentanaParticular(Object container,Mensaje mensaje,Logger logger) throws Exception {		
		try {
			//ABRIR JFRAME O JINTERNALFRAME
			if(mensaje.getsTipoMensaje().equals("RESUMEN")) {
				
			} else if(mensaje.getsTipoMensaje().equals("FORMULARIO")) {
				
			} else if(mensaje.getsTipoMensaje().equals("TABLA")) {
				
			} else if(mensaje.getsTipoMensaje().equals("HTML")) {
				
			}
			
		} catch(Exception e) {
			throw e;
		}
	}
}
