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
package com.bydan.ingles.gramatica.tipogrammar.util;

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
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;

import com.bydan.ingles.gramatica.tipogrammar.business.entity.*;//TipoGrammar

//FK


//REL

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;



@SuppressWarnings("unused")
public class TipoGrammar_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected TipoGrammar tipogrammar;	
	protected List<TipoGrammar> tipogrammars;
	
	
	
	public TipoGrammar_param_return () throws Exception {						
		super();
		this.tipogrammars= new ArrayList<TipoGrammar>();
		this.tipogrammar= new TipoGrammar();
		
		
	} 
	
	public TipoGrammar getTipoGrammar() throws Exception {	
		return tipogrammar;
	}
		
	public void setTipoGrammar(TipoGrammar newTipoGrammar) {
		this.tipogrammar = newTipoGrammar;
	}
	
	public List<TipoGrammar> getTipoGrammars() throws Exception {		
		return tipogrammars;
	}
	
	public void setTipoGrammars(List<TipoGrammar> newTipoGrammars) {
		this.tipogrammars = newTipoGrammars;
	}
	
	
	
	
}

