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
package com.bydan.ingles.seguridad.accion.util;

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
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.accion.business.entity.*;//Accion

//FK

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;

//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;



@SuppressWarnings("unused")
public class Accion_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Accion accion;	
	protected List<Accion> accions;
	
	
	public List<Opcion> opcionsFK;
	
	public Accion_param_return () throws Exception {						
		super();
		this.accions= new ArrayList<Accion>();
		this.accion= new Accion();
		
		
		this.opcionsFK=new ArrayList<Opcion>();
	} 
	
	public Accion getAccion() throws Exception {	
		return accion;
	}
		
	public void setAccion(Accion newAccion) {
		this.accion = newAccion;
	}
	
	public List<Accion> getAccions() throws Exception {		
		return accions;
	}
	
	public void setAccions(List<Accion> newAccions) {
		this.accions = newAccions;
	}
	
	

	public List<Opcion> getopcionsFK() {
		return this.opcionsFK;
	}
	
	

	public void setopcionsFK(List<Opcion> opcionsFK) {
		this.opcionsFK=opcionsFK;
	}
}

