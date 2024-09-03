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
package com.bydan.ingles.gramatica.verbocompuestodetalle.util;

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
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.*;//VerboCompuestoDetalle

//FK

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL




@SuppressWarnings("unused")
public class VerboCompuestoDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected VerboCompuestoDetalle verbocompuestodetalle;	
	protected List<VerboCompuestoDetalle> verbocompuestodetalles;
	
	
	public List<VerboCompuesto> verbocompuestosFK;
	public List<TipoGrammarDetalle> tipogrammardetallesFK;
	
	public VerboCompuestoDetalle_param_return () throws Exception {						
		super();
		this.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
		this.verbocompuestodetalle= new VerboCompuestoDetalle();
		
		
		this.verbocompuestosFK=new ArrayList<VerboCompuesto>();
		this.tipogrammardetallesFK=new ArrayList<TipoGrammarDetalle>();
	} 
	
	public VerboCompuestoDetalle getVerboCompuestoDetalle() throws Exception {	
		return verbocompuestodetalle;
	}
		
	public void setVerboCompuestoDetalle(VerboCompuestoDetalle newVerboCompuestoDetalle) {
		this.verbocompuestodetalle = newVerboCompuestoDetalle;
	}
	
	public List<VerboCompuestoDetalle> getVerboCompuestoDetalles() throws Exception {		
		return verbocompuestodetalles;
	}
	
	public void setVerboCompuestoDetalles(List<VerboCompuestoDetalle> newVerboCompuestoDetalles) {
		this.verbocompuestodetalles = newVerboCompuestoDetalles;
	}
	
	

	public List<VerboCompuesto> getverbocompuestosFK() {
		return this.verbocompuestosFK;
	}

	public List<TipoGrammarDetalle> gettipogrammardetallesFK() {
		return this.tipogrammardetallesFK;
	}
	
	

	public void setverbocompuestosFK(List<VerboCompuesto> verbocompuestosFK) {
		this.verbocompuestosFK=verbocompuestosFK;
	}

	public void settipogrammardetallesFK(List<TipoGrammarDetalle> tipogrammardetallesFK) {
		this.tipogrammardetallesFK=tipogrammardetallesFK;
	}
}

