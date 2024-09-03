package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAreaDocumentListener implements DocumentListener {
	JInternalFrameBase jInternalFrameBase=null;
	JTextArea jTextArea=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public TextAreaDocumentListener(JInternalFrameBase jInternalFrameBase,JTextArea jTextArea,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextArea=jTextArea;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public TextAreaDocumentListener(JInternalFrameBase jInternalFrameBase,JTextArea jTextArea,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextArea=jTextArea;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	@Override 
	public void changedUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaChangedUpdateGeneral(this.sTipo,this.jTextArea,e,this.esControlTabla);
	}
	
	@Override
	public void removeUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaRemoveUpdateGeneral(this.sTipo,this.jTextArea,e,this.esControlTabla);
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextAreaInsertUpdateGeneral(this.sTipo,this.jTextArea,e,this.esControlTabla);
	}
}
