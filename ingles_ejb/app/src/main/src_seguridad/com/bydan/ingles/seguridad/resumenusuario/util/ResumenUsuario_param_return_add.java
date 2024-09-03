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

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;

import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;

import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;




@SuppressWarnings("unused")
public class ResumenUsuario_param_return_add  extends GeneralEntityReturnGeneral implements Serializable{		
	private static final long serialVersionUID = 1L;
	
	private ParametroGeneralUsuario parametroGeneralUsuario;
	private ParametroGeneralSg parametroGeneralSg;
	private Usuario usuarioActual;
	
	public ResumenUsuario_param_return_add ()  throws Exception {
		this.parametroGeneralUsuario=new ParametroGeneralUsuario();
		this.parametroGeneralSg=new ParametroGeneralSg();
		this.usuarioActual=new Usuario();
    } 
	
	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return parametroGeneralUsuario;
	}

	public void setParametroGeneralUsuario(
			ParametroGeneralUsuario parametroGeneralUsuario) {
		this.parametroGeneralUsuario = parametroGeneralUsuario;
	}

	public ParametroGeneralSg getParametroGeneralSg() {
		return parametroGeneralSg;
	}

	public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
		this.parametroGeneralSg = parametroGeneralSg;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	
}
