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
package com.bydan.ingles.gramatica.expresiondetalle.util;

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
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.*;//ExpresionDetalle

//FK

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class ExpresionDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected ExpresionDetalle expresiondetalle;	
	protected List<ExpresionDetalle> expresiondetalles;
	
	
	public List<Expresion> expresionsFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public ExpresionDetalle_param_return () throws Exception {						
		super();
		this.expresiondetalles= new ArrayList<ExpresionDetalle>();
		this.expresiondetalle= new ExpresionDetalle();
		
		
		this.expresionsFK=new ArrayList<Expresion>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public ExpresionDetalle getExpresionDetalle() throws Exception {	
		return expresiondetalle;
	}
		
	public void setExpresionDetalle(ExpresionDetalle newExpresionDetalle) {
		this.expresiondetalle = newExpresionDetalle;
	}
	
	public List<ExpresionDetalle> getExpresionDetalles() throws Exception {		
		return expresiondetalles;
	}
	
	public void setExpresionDetalles(List<ExpresionDetalle> newExpresionDetalles) {
		this.expresiondetalles = newExpresionDetalles;
	}
	
	

	public List<Expresion> getexpresionsFK() {
		return this.expresionsFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setexpresionsFK(List<Expresion> expresionsFK) {
		this.expresionsFK=expresionsFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

