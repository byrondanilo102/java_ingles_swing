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
package com.bydan.ingles.seguridad.datogeneralusuario.util;

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
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.*;//DatoGeneralUsuario

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;

//REL




@SuppressWarnings("unused")
public class DatoGeneralUsuario_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected DatoGeneralUsuario datogeneralusuario;	
	protected List<DatoGeneralUsuario> datogeneralusuarios;
	
	
	public List<Usuario> usuariosFK;
	public List<Pais> paissFK;
	public List<Provincia> provinciasFK;
	public List<Ciudad> ciudadsFK;
	
	public DatoGeneralUsuario_param_return () throws Exception {						
		super();
		this.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
		this.datogeneralusuario= new DatoGeneralUsuario();
		
		
		this.usuariosFK=new ArrayList<Usuario>();
		this.paissFK=new ArrayList<Pais>();
		this.provinciasFK=new ArrayList<Provincia>();
		this.ciudadsFK=new ArrayList<Ciudad>();
	} 
	
	public DatoGeneralUsuario getDatoGeneralUsuario() throws Exception {	
		return datogeneralusuario;
	}
		
	public void setDatoGeneralUsuario(DatoGeneralUsuario newDatoGeneralUsuario) {
		this.datogeneralusuario = newDatoGeneralUsuario;
	}
	
	public List<DatoGeneralUsuario> getDatoGeneralUsuarios() throws Exception {		
		return datogeneralusuarios;
	}
	
	public void setDatoGeneralUsuarios(List<DatoGeneralUsuario> newDatoGeneralUsuarios) {
		this.datogeneralusuarios = newDatoGeneralUsuarios;
	}
	
	

	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}

	public List<Pais> getpaissFK() {
		return this.paissFK;
	}

	public List<Provincia> getprovinciasFK() {
		return this.provinciasFK;
	}

	public List<Ciudad> getciudadsFK() {
		return this.ciudadsFK;
	}
	
	

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK=usuariosFK;
	}

	public void setpaissFK(List<Pais> paissFK) {
		this.paissFK=paissFK;
	}

	public void setprovinciasFK(List<Provincia> provinciasFK) {
		this.provinciasFK=provinciasFK;
	}

	public void setciudadsFK(List<Ciudad> ciudadsFK) {
		this.ciudadsFK=ciudadsFK;
	}
}

