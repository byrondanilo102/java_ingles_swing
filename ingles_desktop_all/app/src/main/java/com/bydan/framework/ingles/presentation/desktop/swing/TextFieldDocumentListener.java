package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFieldDocumentListener implements DocumentListener {
	JInternalFrameBase jInternalFrameBase=null;
	JTextField jTextField=null;
	
	String sTipo="";
	Boolean esControlTabla=false;
	
	public TextFieldDocumentListener(JInternalFrameBase jInternalFrameBase,JTextField jTextField,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextField=jTextField;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public TextFieldDocumentListener(JInternalFrameBase jInternalFrameBase,JTextField jTextField,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTextField=jTextField;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	@Override 
	public void changedUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldChangedUpdateGeneral(this.sTipo,this.jTextField,e,this.esControlTabla);
	}
	
	//CUANDO SE QUITA ALGUN CARACTER
	@Override
	public void removeUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldRemoveUpdateGeneral(this.sTipo,this.jTextField,e,this.esControlTabla);
	}
	
	//CUANDO SE INGRESA ALGUN CARACTER
	@Override
	public void insertUpdate(DocumentEvent e) {
		this.jInternalFrameBase.jTextFieldInsertUpdateGeneral(this.sTipo,this.jTextField,e,this.esControlTabla);
	}
}
