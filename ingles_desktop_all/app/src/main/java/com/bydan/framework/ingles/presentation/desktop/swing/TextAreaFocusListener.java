package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextAreaFocusListener extends FocusAdapter {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public TextAreaFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public TextAreaFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	@Override 
    public  void focusLost ( FocusEvent e )  { 
		this.jInternalFrameBase.jTextAreaFocusLostGeneral(this.sTipo,e,this.esControlTabla);
    } 
	
	@Override 
    public  void focusGained ( FocusEvent e )  { 
		this.jInternalFrameBase.jTextAreaFocusGainedGeneral(this.sTipo,e,this.esControlTabla);
    } 
}
