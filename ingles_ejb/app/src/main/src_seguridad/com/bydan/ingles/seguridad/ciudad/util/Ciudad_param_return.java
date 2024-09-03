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
package com.bydan.ingles.seguridad.ciudad.util;

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
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.ciudad.business.entity.*;//Ciudad

//FK

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;

//REL

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;



@SuppressWarnings("unused")
public class Ciudad_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Ciudad ciudad;	
	protected List<Ciudad> ciudads;
	
	
	public List<Provincia> provinciasFK;
	
	public Ciudad_param_return () throws Exception {						
		super();
		this.ciudads= new ArrayList<Ciudad>();
		this.ciudad= new Ciudad();
		
		
		this.provinciasFK=new ArrayList<Provincia>();
	} 
	
	public Ciudad getCiudad() throws Exception {	
		return ciudad;
	}
		
	public void setCiudad(Ciudad newCiudad) {
		this.ciudad = newCiudad;
	}
	
	public List<Ciudad> getCiudads() throws Exception {		
		return ciudads;
	}
	
	public void setCiudads(List<Ciudad> newCiudads) {
		this.ciudads = newCiudads;
	}
	
	

	public List<Provincia> getprovinciasFK() {
		return this.provinciasFK;
	}
	
	

	public void setprovinciasFK(List<Provincia> provinciasFK) {
		this.provinciasFK=provinciasFK;
	}
}

