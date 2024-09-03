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
package com.bydan.ingles.gramatica.expresion.util;

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
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.gramatica.expresion.business.entity.*;//Expresion

//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;



@SuppressWarnings("unused")
public class Expresion_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Expresion expresion;	
	protected List<Expresion> expresions;
	
	
	public List<Area> areasFK;
	public List<SubArea> subareasFK;
	public List<Nivel> nivelsFK;
	
	public Expresion_param_return () throws Exception {						
		super();
		this.expresions= new ArrayList<Expresion>();
		this.expresion= new Expresion();
		
		
		this.areasFK=new ArrayList<Area>();
		this.subareasFK=new ArrayList<SubArea>();
		this.nivelsFK=new ArrayList<Nivel>();
	} 
	
	public Expresion getExpresion() throws Exception {	
		return expresion;
	}
		
	public void setExpresion(Expresion newExpresion) {
		this.expresion = newExpresion;
	}
	
	public List<Expresion> getExpresions() throws Exception {		
		return expresions;
	}
	
	public void setExpresions(List<Expresion> newExpresions) {
		this.expresions = newExpresions;
	}
	
	

	public List<Area> getareasFK() {
		return this.areasFK;
	}

	public List<SubArea> getsubareasFK() {
		return this.subareasFK;
	}

	public List<Nivel> getnivelsFK() {
		return this.nivelsFK;
	}
	
	

	public void setareasFK(List<Area> areasFK) {
		this.areasFK=areasFK;
	}

	public void setsubareasFK(List<SubArea> subareasFK) {
		this.subareasFK=subareasFK;
	}

	public void setnivelsFK(List<Nivel> nivelsFK) {
		this.nivelsFK=nivelsFK;
	}
}

