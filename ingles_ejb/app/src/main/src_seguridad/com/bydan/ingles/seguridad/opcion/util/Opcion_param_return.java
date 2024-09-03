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
package com.bydan.ingles.seguridad.opcion.util;

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
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

import com.bydan.ingles.seguridad.opcion.business.entity.*;//Opcion

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;



@SuppressWarnings("unused")
public class Opcion_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Opcion opcion;	
	protected List<Opcion> opcions;
	
	
	public List<Sistema> sistemasFK;
	public List<Opcion> opcionsFK;
	
	public Opcion_param_return () throws Exception {						
		super();
		this.opcions= new ArrayList<Opcion>();
		this.opcion= new Opcion();
		
		
		this.sistemasFK=new ArrayList<Sistema>();
		this.opcionsFK=new ArrayList<Opcion>();
	} 
	
	public Opcion getOpcion() throws Exception {	
		return opcion;
	}
		
	public void setOpcion(Opcion newOpcion) {
		this.opcion = newOpcion;
	}
	
	public List<Opcion> getOpcions() throws Exception {		
		return opcions;
	}
	
	public void setOpcions(List<Opcion> newOpcions) {
		this.opcions = newOpcions;
	}
	
	

	public List<Sistema> getsistemasFK() {
		return this.sistemasFK;
	}

	public List<Opcion> getopcionsFK() {
		return this.opcionsFK;
	}
	
	

	public void setsistemasFK(List<Sistema> sistemasFK) {
		this.sistemasFK=sistemasFK;
	}

	public void setopcionsFK(List<Opcion> opcionsFK) {
		this.opcionsFK=opcionsFK;
	}
}

