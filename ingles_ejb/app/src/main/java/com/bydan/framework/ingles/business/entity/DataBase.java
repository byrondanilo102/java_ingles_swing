package com.bydan.framework.ingles.business.entity;

import java.util.HashMap;

public class DataBase {
	public String nombre="";
	public String valor="";
	public HashMap<String,String> datas;
	
	public DataBase() {
		super();
		
		this.nombre="";
		this.valor="";
		this.datas=new HashMap<String,String>();
	}
	
	public DataBase(String valor, HashMap<String, String> datas) {
		super();
		this.valor = valor;
		this.datas = datas;
	}
	
	public DataBase(String nombre, String valor, HashMap<String, String> datas) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.datas = datas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public HashMap<String, String> getDatas() {
		return datas;
	}

	public void setDatas(HashMap<String, String> datas) {
		this.datas = datas;
	}	
}
