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
package com.bydan.ingles.gramatica.pronundetalle.util;

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
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.*;//PronunDetalle

//FK

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class PronunDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected PronunDetalle pronundetalle;	
	protected List<PronunDetalle> pronundetalles;
	
	
	public List<Pronun> pronunsFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public PronunDetalle_param_return () throws Exception {						
		super();
		this.pronundetalles= new ArrayList<PronunDetalle>();
		this.pronundetalle= new PronunDetalle();
		
		
		this.pronunsFK=new ArrayList<Pronun>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public PronunDetalle getPronunDetalle() throws Exception {	
		return pronundetalle;
	}
		
	public void setPronunDetalle(PronunDetalle newPronunDetalle) {
		this.pronundetalle = newPronunDetalle;
	}
	
	public List<PronunDetalle> getPronunDetalles() throws Exception {		
		return pronundetalles;
	}
	
	public void setPronunDetalles(List<PronunDetalle> newPronunDetalles) {
		this.pronundetalles = newPronunDetalles;
	}
	
	

	public List<Pronun> getpronunsFK() {
		return this.pronunsFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setpronunsFK(List<Pronun> pronunsFK) {
		this.pronunsFK=pronunsFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

