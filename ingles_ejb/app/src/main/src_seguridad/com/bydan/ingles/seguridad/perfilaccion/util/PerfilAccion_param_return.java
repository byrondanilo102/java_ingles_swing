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
package com.bydan.ingles.seguridad.perfilaccion.util;

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
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;

import com.bydan.ingles.seguridad.perfilaccion.business.entity.*;//PerfilAccion

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;

//REL




@SuppressWarnings("unused")
public class PerfilAccion_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PerfilAccion perfilaccion;	
	protected List<PerfilAccion> perfilaccions;
	
	
	public List<Perfil> perfilsFK;
	public List<Accion> accionsFK;
	
	public PerfilAccion_param_return () throws Exception {						
		super();
		this.perfilaccions= new ArrayList<PerfilAccion>();
		this.perfilaccion= new PerfilAccion();
		
		
		this.perfilsFK=new ArrayList<Perfil>();
		this.accionsFK=new ArrayList<Accion>();
	} 
	
	public PerfilAccion getPerfilAccion() throws Exception {	
		return perfilaccion;
	}
		
	public void setPerfilAccion(PerfilAccion newPerfilAccion) {
		this.perfilaccion = newPerfilAccion;
	}
	
	public List<PerfilAccion> getPerfilAccions() throws Exception {		
		return perfilaccions;
	}
	
	public void setPerfilAccions(List<PerfilAccion> newPerfilAccions) {
		this.perfilaccions = newPerfilAccions;
	}
	
	

	public List<Perfil> getperfilsFK() {
		return this.perfilsFK;
	}

	public List<Accion> getaccionsFK() {
		return this.accionsFK;
	}
	
	

	public void setperfilsFK(List<Perfil> perfilsFK) {
		this.perfilsFK=perfilsFK;
	}

	public void setaccionsFK(List<Accion> accionsFK) {
		this.accionsFK=accionsFK;
	}
}

