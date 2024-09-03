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
package com.bydan.ingles.seguridad.usuario.util;

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
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

import com.bydan.ingles.seguridad.usuario.business.entity.*;//Usuario

//FK


//REL

import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;



@SuppressWarnings("unused")
public class Usuario_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Usuario usuario;	
	protected List<Usuario> usuarios;
	
	
	
	public Usuario_param_return () throws Exception {						
		super();
		this.usuarios= new ArrayList<Usuario>();
		this.usuario= new Usuario();
		
		
	} 
	
	public Usuario getUsuario() throws Exception {	
		return usuario;
	}
		
	public void setUsuario(Usuario newUsuario) {
		this.usuario = newUsuario;
	}
	
	public List<Usuario> getUsuarios() throws Exception {		
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> newUsuarios) {
		this.usuarios = newUsuarios;
	}
	
	
	
	
}

