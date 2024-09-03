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
package com.bydan.ingles.seguridad.modulo.util;

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
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;

import com.bydan.ingles.seguridad.modulo.business.entity.*;//Modulo

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;

//REL




@SuppressWarnings("unused")
public class Modulo_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Modulo modulo;	
	protected List<Modulo> modulos;
	
	
	public List<Sistema> sistemasFK;
	public List<Paquete> paquetesFK;
	public List<TipoTeclaMascara> tipoteclamascarasFK;
	
	public Modulo_param_return () throws Exception {						
		super();
		this.modulos= new ArrayList<Modulo>();
		this.modulo= new Modulo();
		
		
		this.sistemasFK=new ArrayList<Sistema>();
		this.paquetesFK=new ArrayList<Paquete>();
		this.tipoteclamascarasFK=new ArrayList<TipoTeclaMascara>();
	} 
	
	public Modulo getModulo() throws Exception {	
		return modulo;
	}
		
	public void setModulo(Modulo newModulo) {
		this.modulo = newModulo;
	}
	
	public List<Modulo> getModulos() throws Exception {		
		return modulos;
	}
	
	public void setModulos(List<Modulo> newModulos) {
		this.modulos = newModulos;
	}
	
	

	public List<Sistema> getsistemasFK() {
		return this.sistemasFK;
	}

	public List<Paquete> getpaquetesFK() {
		return this.paquetesFK;
	}

	public List<TipoTeclaMascara> gettipoteclamascarasFK() {
		return this.tipoteclamascarasFK;
	}
	
	

	public void setsistemasFK(List<Sistema> sistemasFK) {
		this.sistemasFK=sistemasFK;
	}

	public void setpaquetesFK(List<Paquete> paquetesFK) {
		this.paquetesFK=paquetesFK;
	}

	public void settipoteclamascarasFK(List<TipoTeclaMascara> tipoteclamascarasFK) {
		this.tipoteclamascarasFK=tipoteclamascarasFK;
	}
}

