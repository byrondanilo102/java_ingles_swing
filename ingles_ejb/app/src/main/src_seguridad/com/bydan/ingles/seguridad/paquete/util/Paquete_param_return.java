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
package com.bydan.ingles.seguridad.paquete.util;

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
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;

import com.bydan.ingles.seguridad.paquete.business.entity.*;//Paquete

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;



@SuppressWarnings("unused")
public class Paquete_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Paquete paquete;	
	protected List<Paquete> paquetes;
	
	
	public List<Sistema> sistemasFK;
	
	public Paquete_param_return () throws Exception {						
		super();
		this.paquetes= new ArrayList<Paquete>();
		this.paquete= new Paquete();
		
		
		this.sistemasFK=new ArrayList<Sistema>();
	} 
	
	public Paquete getPaquete() throws Exception {	
		return paquete;
	}
		
	public void setPaquete(Paquete newPaquete) {
		this.paquete = newPaquete;
	}
	
	public List<Paquete> getPaquetes() throws Exception {		
		return paquetes;
	}
	
	public void setPaquetes(List<Paquete> newPaquetes) {
		this.paquetes = newPaquetes;
	}
	
	

	public List<Sistema> getsistemasFK() {
		return this.sistemasFK;
	}
	
	

	public void setsistemasFK(List<Sistema> sistemasFK) {
		this.sistemasFK=sistemasFK;
	}
}

