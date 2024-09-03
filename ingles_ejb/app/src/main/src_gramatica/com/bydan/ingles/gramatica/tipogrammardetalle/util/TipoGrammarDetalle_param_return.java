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
package com.bydan.ingles.gramatica.tipogrammardetalle.util;

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
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;//TipoGrammarDetalle

//FK


//REL

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;



@SuppressWarnings("unused")
public class TipoGrammarDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected TipoGrammarDetalle tipogrammardetalle;	
	protected List<TipoGrammarDetalle> tipogrammardetalles;
	
	
	
	public TipoGrammarDetalle_param_return () throws Exception {						
		super();
		this.tipogrammardetalles= new ArrayList<TipoGrammarDetalle>();
		this.tipogrammardetalle= new TipoGrammarDetalle();
		
		
	} 
	
	public TipoGrammarDetalle getTipoGrammarDetalle() throws Exception {	
		return tipogrammardetalle;
	}
		
	public void setTipoGrammarDetalle(TipoGrammarDetalle newTipoGrammarDetalle) {
		this.tipogrammardetalle = newTipoGrammarDetalle;
	}
	
	public List<TipoGrammarDetalle> getTipoGrammarDetalles() throws Exception {		
		return tipogrammardetalles;
	}
	
	public void setTipoGrammarDetalles(List<TipoGrammarDetalle> newTipoGrammarDetalles) {
		this.tipogrammardetalles = newTipoGrammarDetalles;
	}
	
	
	
	
}

