package com.bydan.framework.ingles.business.entity;

public class ConexionBeanFace {
	String sUsuario;
	String sPassword;

	public void ConexionBean(){
		sUsuario="";
		sPassword="";
	}
	
	public String getSUsuario() {
		return sUsuario;
	}

	public void setSUsuario(String sUsuario) {
		this.sUsuario = sUsuario;
	}

	public String getSPassword() {
		return sPassword;
	}

	public void setSPassword(String sPassword) {
		this.sPassword = sPassword;
	}
}
