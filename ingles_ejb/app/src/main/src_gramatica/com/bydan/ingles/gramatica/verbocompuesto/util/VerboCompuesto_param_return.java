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
package com.bydan.ingles.gramatica.verbocompuesto.util;

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
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;//VerboCompuesto

//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;



@SuppressWarnings("unused")
public class VerboCompuesto_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected VerboCompuesto verbocompuesto;	
	protected List<VerboCompuesto> verbocompuestos;
	
	
	public List<Area> areasFK;
	public List<SubArea> subareasFK;
	public List<Nivel> nivelsFK;
	
	public VerboCompuesto_param_return () throws Exception {						
		super();
		this.verbocompuestos= new ArrayList<VerboCompuesto>();
		this.verbocompuesto= new VerboCompuesto();
		
		
		this.areasFK=new ArrayList<Area>();
		this.subareasFK=new ArrayList<SubArea>();
		this.nivelsFK=new ArrayList<Nivel>();
	} 
	
	public VerboCompuesto getVerboCompuesto() throws Exception {	
		return verbocompuesto;
	}
		
	public void setVerboCompuesto(VerboCompuesto newVerboCompuesto) {
		this.verbocompuesto = newVerboCompuesto;
	}
	
	public List<VerboCompuesto> getVerboCompuestos() throws Exception {		
		return verbocompuestos;
	}
	
	public void setVerboCompuestos(List<VerboCompuesto> newVerboCompuestos) {
		this.verbocompuestos = newVerboCompuestos;
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

