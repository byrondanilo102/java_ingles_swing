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
package com.bydan.ingles.general.nivel.util;

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
import com.bydan.ingles.general.nivel.util.Nivel_util;

import com.bydan.ingles.general.nivel.business.entity.*;//Nivel

//FK


//REL

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;



@SuppressWarnings("unused")
public class Nivel_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Nivel nivel;	
	protected List<Nivel> nivels;
	
	
	
	public Nivel_param_return () throws Exception {						
		super();
		this.nivels= new ArrayList<Nivel>();
		this.nivel= new Nivel();
		
		
	} 
	
	public Nivel getNivel() throws Exception {	
		return nivel;
	}
		
	public void setNivel(Nivel newNivel) {
		this.nivel = newNivel;
	}
	
	public List<Nivel> getNivels() throws Exception {		
		return nivels;
	}
	
	public void setNivels(List<Nivel> newNivels) {
		this.nivels = newNivels;
	}
	
	
	
	
}

