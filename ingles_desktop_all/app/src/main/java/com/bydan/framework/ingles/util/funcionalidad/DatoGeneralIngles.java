package com.bydan.framework.ingles.util.funcionalidad;

public class DatoGeneralIngles {
	public String Level="";
	public String Tipo="";
	public String Tipo2="";
	public String Tipo3="";
	public String Spanish="";
	public String Translate1="";
	public String Translate2="";
			
	public DatoGeneralIngles() {
		super();
	}

	public DatoGeneralIngles(String level, String tipo, String tipo2, String tipo3, String spanish, String translate1,
			String translate3) {
		super();
		Level = level;
		Tipo = tipo;
		Tipo2 = tipo2;
		Tipo3 = tipo3;
		Spanish = spanish;
		Translate1 = translate1;
		Translate2 = translate3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Level+","+this.Tipo+","+this.Tipo2+","+this.Tipo3+","+this.Spanish+","+this.Translate1+","+this.Translate2;
	}
	
	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getTipo2() {
		return Tipo2;
	}

	public void setTipo2(String tipo2) {
		Tipo2 = tipo2;
	}

	public String getTipo3() {
		return Tipo3;
	}

	public void setTipo3(String tipo3) {
		Tipo3 = tipo3;
	}

	public String getSpanish() {
		return Spanish;
	}

	public void setSpanish(String spanish) {
		Spanish = spanish;
	}

	public String getTranslate1() {
		return Translate1;
	}

	public void setTranslate1(String translate1) {
		Translate1 = translate1;
	}

	public String getTranslate2() {
		return Translate2;
	}

	public void setTranslate2(String translate3) {
		Translate2 = translate3;
	}
	
}
