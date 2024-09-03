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
package com.bydan.ingles.gramatica.verboirregulardetalle.util;

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
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.*;//VerboIrregularDetalle

//FK

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class VerboIrregularDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected VerboIrregularDetalle verboirregulardetalle;	
	protected List<VerboIrregularDetalle> verboirregulardetalles;
	
	
	public List<VerboIrregular> verboirregularsFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public VerboIrregularDetalle_param_return () throws Exception {						
		super();
		this.verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();
		this.verboirregulardetalle= new VerboIrregularDetalle();
		
		
		this.verboirregularsFK=new ArrayList<VerboIrregular>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public VerboIrregularDetalle getVerboIrregularDetalle() throws Exception {	
		return verboirregulardetalle;
	}
		
	public void setVerboIrregularDetalle(VerboIrregularDetalle newVerboIrregularDetalle) {
		this.verboirregulardetalle = newVerboIrregularDetalle;
	}
	
	public List<VerboIrregularDetalle> getVerboIrregularDetalles() throws Exception {		
		return verboirregulardetalles;
	}
	
	public void setVerboIrregularDetalles(List<VerboIrregularDetalle> newVerboIrregularDetalles) {
		this.verboirregulardetalles = newVerboIrregularDetalles;
	}
	
	

	public List<VerboIrregular> getverboirregularsFK() {
		return this.verboirregularsFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setverboirregularsFK(List<VerboIrregular> verboirregularsFK) {
		this.verboirregularsFK=verboirregularsFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

