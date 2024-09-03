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
package com.bydan.ingles.gramatica.vocabulariodetalle.util;

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
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.*;//VocabularioDetalle

//FK

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class VocabularioDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected VocabularioDetalle vocabulariodetalle;	
	protected List<VocabularioDetalle> vocabulariodetalles;
	
	
	public List<Vocabulario> vocabulariosFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public VocabularioDetalle_param_return () throws Exception {						
		super();
		this.vocabulariodetalles= new ArrayList<VocabularioDetalle>();
		this.vocabulariodetalle= new VocabularioDetalle();
		
		
		this.vocabulariosFK=new ArrayList<Vocabulario>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public VocabularioDetalle getVocabularioDetalle() throws Exception {	
		return vocabulariodetalle;
	}
		
	public void setVocabularioDetalle(VocabularioDetalle newVocabularioDetalle) {
		this.vocabulariodetalle = newVocabularioDetalle;
	}
	
	public List<VocabularioDetalle> getVocabularioDetalles() throws Exception {		
		return vocabulariodetalles;
	}
	
	public void setVocabularioDetalles(List<VocabularioDetalle> newVocabularioDetalles) {
		this.vocabulariodetalles = newVocabularioDetalles;
	}
	
	

	public List<Vocabulario> getvocabulariosFK() {
		return this.vocabulariosFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setvocabulariosFK(List<Vocabulario> vocabulariosFK) {
		this.vocabulariosFK=vocabulariosFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

