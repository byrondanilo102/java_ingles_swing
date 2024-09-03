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
package com.bydan.ingles.seguridad.perfilusuario.util;

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
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.*;//PerfilUsuario

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;

//REL




@SuppressWarnings("unused")
public class PerfilUsuario_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PerfilUsuario perfilusuario;	
	protected List<PerfilUsuario> perfilusuarios;
	
	
	public List<Perfil> perfilsFK;
	public List<Usuario> usuariosFK;
	
	public PerfilUsuario_param_return () throws Exception {						
		super();
		this.perfilusuarios= new ArrayList<PerfilUsuario>();
		this.perfilusuario= new PerfilUsuario();
		
		
		this.perfilsFK=new ArrayList<Perfil>();
		this.usuariosFK=new ArrayList<Usuario>();
	} 
	
	public PerfilUsuario getPerfilUsuario() throws Exception {	
		return perfilusuario;
	}
		
	public void setPerfilUsuario(PerfilUsuario newPerfilUsuario) {
		this.perfilusuario = newPerfilUsuario;
	}
	
	public List<PerfilUsuario> getPerfilUsuarios() throws Exception {		
		return perfilusuarios;
	}
	
	public void setPerfilUsuarios(List<PerfilUsuario> newPerfilUsuarios) {
		this.perfilusuarios = newPerfilUsuarios;
	}
	
	

	public List<Perfil> getperfilsFK() {
		return this.perfilsFK;
	}

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}
	
	

	public void setperfilsFK(List<Perfil> perfilsFK) {
		this.perfilsFK=perfilsFK;
	}

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}
}

