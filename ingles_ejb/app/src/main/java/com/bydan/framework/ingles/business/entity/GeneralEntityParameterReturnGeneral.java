package com.bydan.framework.ingles.business.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import com.bydan.ingles.seguridad.business.entity.Accion;
//import com.bydan.ingles.seguridad.business.entity.Opcion;
//import com.bydan.ingles.seguridad.business.entity.PerfilOpcion;
//import com.bydan.erp.seguridad.util.SistemaReturnGeneral;
import com.bydan.framework.ingles.util.EventoGlobalTipo;


@SuppressWarnings("unused")
public class GeneralEntityParameterReturnGeneral extends GeneralEntityReturnGeneral implements Serializable {
	protected static final long serialVersionUID=1L;		
	protected HashMap<String, DataBase> data;
	protected Boolean conReturnJson=true;
	protected String htmlTablaReporteAuxiliar="";
	
	public GeneralEntityParameterReturnGeneral () throws Exception {	
		this.data=new HashMap<String, DataBase>();
	}

	public HashMap<String, DataBase> getdata() {
		return data;
	}

	public void setdata(HashMap<String, DataBase> data) {
		this.data = data;
	}

	public Boolean getConReturnJson() {
		return conReturnJson;
	}

	public void setConReturnJson(Boolean conReturnJson) {
		this.conReturnJson = conReturnJson;
	}

	public String getHtmlTablaReporteAuxiliar() {
		return htmlTablaReporteAuxiliar;
	}

	public void setHtmlTablaReporteAuxiliar(String htmlTablaReporteAuxiliar) {
		this.htmlTablaReporteAuxiliar = htmlTablaReporteAuxiliar;
	} 		
}
