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
package com.bydan.ingles.seguridad.perfilcampo.util;

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
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.*;//PerfilCampo

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;

//REL




@SuppressWarnings("unused")
public class PerfilCampo_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PerfilCampo perfilcampo;	
	protected List<PerfilCampo> perfilcampos;
	
	
	public List<Perfil> perfilsFK;
	public List<Campo> camposFK;
	
	public PerfilCampo_param_return () throws Exception {						
		super();
		this.perfilcampos= new ArrayList<PerfilCampo>();
		this.perfilcampo= new PerfilCampo();
		
		
		this.perfilsFK=new ArrayList<Perfil>();
		this.camposFK=new ArrayList<Campo>();
	} 
	
	public PerfilCampo getPerfilCampo() throws Exception {	
		return perfilcampo;
	}
		
	public void setPerfilCampo(PerfilCampo newPerfilCampo) {
		this.perfilcampo = newPerfilCampo;
	}
	
	public List<PerfilCampo> getPerfilCampos() throws Exception {		
		return perfilcampos;
	}
	
	public void setPerfilCampos(List<PerfilCampo> newPerfilCampos) {
		this.perfilcampos = newPerfilCampos;
	}
	
	

	public List<Perfil> getperfilsFK() {
		return this.perfilsFK;
	}

	public List<Campo> getcamposFK() {
		return this.camposFK;
	}
	
	

	public void setperfilsFK(List<Perfil> perfilsFK) {
		this.perfilsFK=perfilsFK;
	}

	public void setcamposFK(List<Campo> camposFK) {
		this.camposFK=camposFK;
	}
}

