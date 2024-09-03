package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LabelFocusListener extends FocusAdapter {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public LabelFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public LabelFocusListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	@Override 
    public  void focusLost ( FocusEvent e )  { 
		this.jInternalFrameBase.jLabelFocusLostGeneral(this.sTipo,e,this.esControlTabla);
    }
	
	@Override 
    public  void focusGained ( FocusEvent e )  { 
		this.jInternalFrameBase.jLabelFocusGainedGeneral(this.sTipo,e,this.esControlTabla);
    } 
}
