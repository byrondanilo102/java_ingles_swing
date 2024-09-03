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
package com.bydan.ingles.general.subarea.util;

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
import com.bydan.ingles.general.subarea.util.SubArea_util;

import com.bydan.ingles.general.subarea.business.entity.*;//SubArea

//FK

import com.bydan.ingles.general.area.business.entity.Area;

//REL

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;



@SuppressWarnings("unused")
public class SubArea_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected SubArea subarea;	
	protected List<SubArea> subareas;
	
	
	public List<Area> areasFK;
	
	public SubArea_param_return () throws Exception {						
		super();
		this.subareas= new ArrayList<SubArea>();
		this.subarea= new SubArea();
		
		
		this.areasFK=new ArrayList<Area>();
	} 
	
	public SubArea getSubArea() throws Exception {	
		return subarea;
	}
		
	public void setSubArea(SubArea newSubArea) {
		this.subarea = newSubArea;
	}
	
	public List<SubArea> getSubAreas() throws Exception {		
		return subareas;
	}
	
	public void setSubAreas(List<SubArea> newSubAreas) {
		this.subareas = newSubAreas;
	}
	
	

	public List<Area> getareasFK() {
		return this.areasFK;
	}
	
	

	public void setareasFK(List<Area> areasFK) {
		this.areasFK=areasFK;
	}
}

