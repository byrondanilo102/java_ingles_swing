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
package com.bydan.ingles.seguridad.resumenusuario.util;

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
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;//ResumenUsuario

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;

//REL




@SuppressWarnings("unused")
public class ResumenUsuario_param_return extends ResumenUsuario_param_return_add implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected ResumenUsuario resumenusuario;	
	protected List<ResumenUsuario> resumenusuarios;
	
	
	public List<Usuario> usuariosFK;
	
	public ResumenUsuario_param_return () throws Exception {						
		super();
		this.resumenusuarios= new ArrayList<ResumenUsuario>();
		this.resumenusuario= new ResumenUsuario();
		
		
		this.usuariosFK=new ArrayList<Usuario>();
	} 
	
	public ResumenUsuario getResumenUsuario() throws Exception {	
		return resumenusuario;
	}
		
	public void setResumenUsuario(ResumenUsuario newResumenUsuario) {
		this.resumenusuario = newResumenUsuario;
	}
	
	public List<ResumenUsuario> getResumenUsuarios() throws Exception {		
		return resumenusuarios;
	}
	
	public void setResumenUsuarios(List<ResumenUsuario> newResumenUsuarios) {
		this.resumenusuarios = newResumenUsuarios;
	}
	
	

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}
	
	

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}
}

