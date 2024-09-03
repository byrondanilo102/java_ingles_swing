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
package com.bydan.ingles.seguridad.parametrogeneralusuario.util;

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
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;//ParametroGeneralUsuario

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;

//REL




@SuppressWarnings("unused")
public class ParametroGeneralUsuario_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected ParametroGeneralUsuario parametrogeneralusuario;	
	protected List<ParametroGeneralUsuario> parametrogeneralusuarios;
	
	
	public List<Usuario> usuariosFK;
	public List<TipoFondo> tipofondosFK;
	
	public ParametroGeneralUsuario_param_return () throws Exception {						
		super();
		this.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
		this.parametrogeneralusuario= new ParametroGeneralUsuario();
		
		
		this.usuariosFK=new ArrayList<Usuario>();
		this.tipofondosFK=new ArrayList<TipoFondo>();
	} 
	
	public ParametroGeneralUsuario getParametroGeneralUsuario() throws Exception {	
		return parametrogeneralusuario;
	}
		
	public void setParametroGeneralUsuario(ParametroGeneralUsuario newParametroGeneralUsuario) {
		this.parametrogeneralusuario = newParametroGeneralUsuario;
	}
	
	public List<ParametroGeneralUsuario> getParametroGeneralUsuarios() throws Exception {		
		return parametrogeneralusuarios;
	}
	
	public void setParametroGeneralUsuarios(List<ParametroGeneralUsuario> newParametroGeneralUsuarios) {
		this.parametrogeneralusuarios = newParametroGeneralUsuarios;
	}
	
	

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}

	public List<TipoFondo> gettipofondosFK() {
		return this.tipofondosFK;
	}
	
	

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}

	public void settipofondosFK(List<TipoFondo> tipofondosFK) {
		this.tipofondosFK=tipofondosFK;
	}
}

