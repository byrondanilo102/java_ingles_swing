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
package com.bydan.ingles.gramatica.grammar.util;

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
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;

import com.bydan.ingles.gramatica.grammar.business.entity.*;//Grammar

//FK

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;

//REL

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;



@SuppressWarnings("unused")
public class Grammar_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected Grammar grammar;	
	protected List<Grammar> grammars;
	
	
	public List<Nivel> nivelsFK;
	public List<TipoGrammar> tipogrammarsFK;
	
	public Grammar_param_return () throws Exception {						
		super();
		this.grammars= new ArrayList<Grammar>();
		this.grammar= new Grammar();
		
		
		this.nivelsFK=new ArrayList<Nivel>();
		this.tipogrammarsFK=new ArrayList<TipoGrammar>();
	} 
	
	public Grammar getGrammar() throws Exception {	
		return grammar;
	}
		
	public void setGrammar(Grammar newGrammar) {
		this.grammar = newGrammar;
	}
	
	public List<Grammar> getGrammars() throws Exception {		
		return grammars;
	}
	
	public void setGrammars(List<Grammar> newGrammars) {
		this.grammars = newGrammars;
	}
	
	

	public List<Nivel> getnivelsFK() {
		return this.nivelsFK;
	}

	public List<TipoGrammar> gettipogrammarsFK() {
		return this.tipogrammarsFK;
	}
	
	

	public void setnivelsFK(List<Nivel> nivelsFK) {
		this.nivelsFK=nivelsFK;
	}

	public void settipogrammarsFK(List<TipoGrammar> tipogrammarsFK) {
		this.tipogrammarsFK=tipogrammarsFK;
	}
}

