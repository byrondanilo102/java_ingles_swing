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
package com.bydan.ingles.seguridad.perfil.util;

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
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.perfil.business.entity.*;//Perfil

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;



@SuppressWarnings("unused")
public class Perfil_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Perfil perfil;	
	protected List<Perfil> perfils;
	
	
	public List<Sistema> sistemasFK;
	
	public Perfil_param_return () throws Exception {						
		super();
		this.perfils= new ArrayList<Perfil>();
		this.perfil= new Perfil();
		
		
		this.sistemasFK=new ArrayList<Sistema>();
	} 
	
	public Perfil getPerfil() throws Exception {	
		return perfil;
	}
		
	public void setPerfil(Perfil newPerfil) {
		this.perfil = newPerfil;
	}
	
	public List<Perfil> getPerfils() throws Exception {		
		return perfils;
	}
	
	public void setPerfils(List<Perfil> newPerfils) {
		this.perfils = newPerfils;
	}
	
	

	public List<Sistema> getsistemasFK() {
		return this.sistemasFK;
	}
	
	

	public void setsistemasFK(List<Sistema> sistemasFK) {
		this.sistemasFK=sistemasFK;
	}
}

