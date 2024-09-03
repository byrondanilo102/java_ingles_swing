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
package com.bydan.ingles.gramatica.grammardetalle.util;

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
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.*;//GrammarDetalle

//FK

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class GrammarDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected GrammarDetalle grammardetalle;	
	protected List<GrammarDetalle> grammardetalles;
	
	
	public List<Grammar> grammarsFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public GrammarDetalle_param_return () throws Exception {						
		super();
		this.grammardetalles= new ArrayList<GrammarDetalle>();
		this.grammardetalle= new GrammarDetalle();
		
		
		this.grammarsFK=new ArrayList<Grammar>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public GrammarDetalle getGrammarDetalle() throws Exception {	
		return grammardetalle;
	}
		
	public void setGrammarDetalle(GrammarDetalle newGrammarDetalle) {
		this.grammardetalle = newGrammarDetalle;
	}
	
	public List<GrammarDetalle> getGrammarDetalles() throws Exception {		
		return grammardetalles;
	}
	
	public void setGrammarDetalles(List<GrammarDetalle> newGrammarDetalles) {
		this.grammardetalles = newGrammarDetalles;
	}
	
	

	public List<Grammar> getgrammarsFK() {
		return this.grammarsFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setgrammarsFK(List<Grammar> grammarsFK) {
		this.grammarsFK=grammarsFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

