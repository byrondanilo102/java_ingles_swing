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
package com.bydan.ingles.general.tipo.util;

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
import com.bydan.ingles.general.tipo.util.Tipo_util;

import com.bydan.ingles.general.tipo.business.entity.*;//Tipo

//FK


//REL

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;



@SuppressWarnings("unused")
public class Tipo_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Tipo tipo;	
	protected List<Tipo> tipos;
	
	
	
	public Tipo_param_return () throws Exception {						
		super();
		this.tipos= new ArrayList<Tipo>();
		this.tipo= new Tipo();
		
		
	} 
	
	public Tipo getTipo() throws Exception {	
		return tipo;
	}
		
	public void setTipo(Tipo newTipo) {
		this.tipo = newTipo;
	}
	
	public List<Tipo> getTipos() throws Exception {		
		return tipos;
	}
	
	public void setTipos(List<Tipo> newTipos) {
		this.tipos = newTipos;
	}
	
	
	
	
}

