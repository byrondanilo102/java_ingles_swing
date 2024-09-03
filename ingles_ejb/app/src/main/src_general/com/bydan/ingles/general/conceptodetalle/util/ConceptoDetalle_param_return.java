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
package com.bydan.ingles.general.conceptodetalle.util;

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
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;

import com.bydan.ingles.general.conceptodetalle.business.entity.*;//ConceptoDetalle

//FK

import com.bydan.ingles.general.concepto.business.entity.Concepto;

//REL




@SuppressWarnings("unused")
public class ConceptoDetalle_param_return extends GeneralEntityParameterReturnGeneral implements Serializable {
	private static final long serialVersionUID=1L;
		
	protected ConceptoDetalle conceptodetalle;	
	protected List<ConceptoDetalle> conceptodetalles;
	
	
	public List<Concepto> conceptosFK;
	
	public ConceptoDetalle_param_return () throws Exception {						
		super();
		this.conceptodetalles= new ArrayList<ConceptoDetalle>();
		this.conceptodetalle= new ConceptoDetalle();
		
		
		this.conceptosFK=new ArrayList<Concepto>();
	} 
	
	public ConceptoDetalle getConceptoDetalle() throws Exception {	
		return conceptodetalle;
	}
		
	public void setConceptoDetalle(ConceptoDetalle newConceptoDetalle) {
		this.conceptodetalle = newConceptoDetalle;
	}
	
	public List<ConceptoDetalle> getConceptoDetalles() throws Exception {		
		return conceptodetalles;
	}
	
	public void setConceptoDetalles(List<ConceptoDetalle> newConceptoDetalles) {
		this.conceptodetalles = newConceptoDetalles;
	}
	
	

	public List<Concepto> getconceptosFK() {
		return this.conceptosFK;
	}
	
	

	public void setconceptosFK(List<Concepto> conceptosFK) {
		this.conceptosFK=conceptosFK;
	}
}

