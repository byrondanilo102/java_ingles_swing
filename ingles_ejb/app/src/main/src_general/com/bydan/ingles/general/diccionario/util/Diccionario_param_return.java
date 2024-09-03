/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.ingles.general.diccionario.util;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;

//import org.hibernate.validator.*;

import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterReturnGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.data.ConstantesSql;
//import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.DeepLoadType;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.general.diccionario.business.entity.*;//Diccionario

//FK

import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL




@SuppressWarnings("unused")
public class Diccionario_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Diccionario diccionario;	
	protected List<Diccionario> diccionarios;
	
	
	public List<Grupo> gruposFK;
	public List<Tipo> tiposFK;
	public List<Area> areasFK;
	public List<Nivel> nivelsFK;
	
	public Diccionario_param_return () throws Exception {						
		super();
		this.diccionarios= new ArrayList<Diccionario>();
		this.diccionario= new Diccionario();
		
		
		this.gruposFK=new ArrayList<Grupo>();
		this.tiposFK=new ArrayList<Tipo>();
		this.areasFK=new ArrayList<Area>();
		this.nivelsFK=new ArrayList<Nivel>();
	} 
	
	public Diccionario getDiccionario() throws Exception {	
		return diccionario;
	}
		
	public void setDiccionario(Diccionario newDiccionario) {
		this.diccionario = newDiccionario;
	}
	
	public List<Diccionario> getDiccionarios() throws Exception {		
		return diccionarios;
	}
	
	public void setDiccionarios(List<Diccionario> newDiccionarios) {
		this.diccionarios = newDiccionarios;
	}
	
	

	public List<Grupo> getgruposFK() {
		return this.gruposFK;
	}

	public List<Tipo> gettiposFK() {
		return this.tiposFK;
	}

	public List<Area> getareasFK() {
		return this.areasFK;
	}

	public List<Nivel> getnivelsFK() {
		return this.nivelsFK;
	}
	
	

	public void setgruposFK(List<Grupo> gruposFK) {
		this.gruposFK=gruposFK;
	}

	public void settiposFK(List<Tipo> tiposFK) {
		this.tiposFK=tiposFK;
	}

	public void setareasFK(List<Area> areasFK) {
		this.areasFK=areasFK;
	}

	public void setnivelsFK(List<Nivel> nivelsFK) {
		this.nivelsFK=nivelsFK;
	}
}

