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
package com.bydan.ingles.seguridad.auditoria.util;

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
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

import com.bydan.ingles.seguridad.auditoria.business.entity.*;//Auditoria

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;

//REL

import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;



@SuppressWarnings("unused")
public class Auditoria_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Auditoria auditoria;	
	protected List<Auditoria> auditorias;
	
	
	public List<Usuario> usuariosFK;
	
	public Auditoria_param_return () throws Exception {						
		super();
		this.auditorias= new ArrayList<Auditoria>();
		this.auditoria= new Auditoria();
		
		
		this.usuariosFK=new ArrayList<Usuario>();
	} 
	
	public Auditoria getAuditoria() throws Exception {	
		return auditoria;
	}
		
	public void setAuditoria(Auditoria newAuditoria) {
		this.auditoria = newAuditoria;
	}
	
	public List<Auditoria> getAuditorias() throws Exception {		
		return auditorias;
	}
	
	public void setAuditorias(List<Auditoria> newAuditorias) {
		this.auditorias = newAuditorias;
	}
	
	

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}
	
	

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}
}

