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
package com.bydan.ingles.seguridad.perfilopcion.util;

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
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;//PerfilOpcion

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;

//REL




@SuppressWarnings("unused")
public class PerfilOpcion_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PerfilOpcion perfilopcion;	
	protected List<PerfilOpcion> perfilopcions;
	
	
	public List<Perfil> perfilsFK;
	public List<Opcion> opcionsFK;
	
	public PerfilOpcion_param_return () throws Exception {						
		super();
		this.perfilopcions= new ArrayList<PerfilOpcion>();
		this.perfilopcion= new PerfilOpcion();
		
		
		this.perfilsFK=new ArrayList<Perfil>();
		this.opcionsFK=new ArrayList<Opcion>();
	} 
	
	public PerfilOpcion getPerfilOpcion() throws Exception {	
		return perfilopcion;
	}
		
	public void setPerfilOpcion(PerfilOpcion newPerfilOpcion) {
		this.perfilopcion = newPerfilOpcion;
	}
	
	public List<PerfilOpcion> getPerfilOpcions() throws Exception {		
		return perfilopcions;
	}
	
	public void setPerfilOpcions(List<PerfilOpcion> newPerfilOpcions) {
		this.perfilopcions = newPerfilOpcions;
	}
	
	

	public List<Perfil> getperfilsFK() {
		return this.perfilsFK;
	}

	public List<Opcion> getopcionsFK() {
		return this.opcionsFK;
	}
	
	

	public void setperfilsFK(List<Perfil> perfilsFK) {
		this.perfilsFK=perfilsFK;
	}

	public void setopcionsFK(List<Opcion> opcionsFK) {
		this.opcionsFK=opcionsFK;
	}
}

