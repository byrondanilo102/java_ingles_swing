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
package com.bydan.ingles.seguridad.provincia.util;

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
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;

import com.bydan.ingles.seguridad.provincia.business.entity.*;//Provincia

//FK

import com.bydan.ingles.seguridad.pais.business.entity.Pais;

//REL

import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;



@SuppressWarnings("unused")
public class Provincia_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Provincia provincia;	
	protected List<Provincia> provincias;
	
	
	public List<Pais> paissFK;
	
	public Provincia_param_return () throws Exception {						
		super();
		this.provincias= new ArrayList<Provincia>();
		this.provincia= new Provincia();
		
		
		this.paissFK=new ArrayList<Pais>();
	} 
	
	public Provincia getProvincia() throws Exception {	
		return provincia;
	}
		
	public void setProvincia(Provincia newProvincia) {
		this.provincia = newProvincia;
	}
	
	public List<Provincia> getProvincias() throws Exception {		
		return provincias;
	}
	
	public void setProvincias(List<Provincia> newProvincias) {
		this.provincias = newProvincias;
	}
	
	

	public List<Pais> getpaissFK() {
		return this.paissFK;
	}
	
	

	public void setpaissFK(List<Pais> paissFK) {
		this.paissFK=paissFK;
	}
}

