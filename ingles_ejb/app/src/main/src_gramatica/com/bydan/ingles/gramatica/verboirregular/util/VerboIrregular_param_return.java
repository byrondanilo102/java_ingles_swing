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
package com.bydan.ingles.gramatica.verboirregular.util;

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
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.verboirregular.business.entity.*;//VerboIrregular

//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;



@SuppressWarnings("unused")
public class VerboIrregular_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected VerboIrregular verboirregular;	
	protected List<VerboIrregular> verboirregulars;
	
	
	public List<Area> areasFK;
	public List<SubArea> subareasFK;
	public List<Nivel> nivelsFK;
	
	public VerboIrregular_param_return () throws Exception {						
		super();
		this.verboirregulars= new ArrayList<VerboIrregular>();
		this.verboirregular= new VerboIrregular();
		
		
		this.areasFK=new ArrayList<Area>();
		this.subareasFK=new ArrayList<SubArea>();
		this.nivelsFK=new ArrayList<Nivel>();
	} 
	
	public VerboIrregular getVerboIrregular() throws Exception {	
		return verboirregular;
	}
		
	public void setVerboIrregular(VerboIrregular newVerboIrregular) {
		this.verboirregular = newVerboIrregular;
	}
	
	public List<VerboIrregular> getVerboIrregulars() throws Exception {		
		return verboirregulars;
	}
	
	public void setVerboIrregulars(List<VerboIrregular> newVerboIrregulars) {
		this.verboirregulars = newVerboIrregulars;
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

