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
package com.bydan.ingles.gramatica.tipogrammardetalle.business.entity;

import java.io.Serializable;
import java.io.File;

import java.sql.Timestamp;
import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;





import com.bydan.framework.ingles.business.entity.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.data.ConstantesSql;
//import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.ConstantesValidacion;
//import com.bydan.ingles.gramatica.util.TipoGrammarDetalleConstantesFunciones;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.*;

//FK


//REL

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;







@SuppressWarnings("unused")
public class TipoGrammarDetalle extends GeneralEntitySinIdGenerated implements Serializable ,Cloneable {//TipoGrammarDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected Long idOriginal;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient TipoGrammarDetalle tipogrammardetalleOriginal;
	
	private Map<String, Object> map_TipoGrammarDetalle;
	
	public void inicializarMap_TipoGrammarDetalle() {
		this.map_TipoGrammarDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=TipoGrammarDetalle_util.S_REGEX_NOMBRE,message=TipoGrammarDetalle_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	
	
	
	
	public List<VerboIrregularDetalle> verboirregulardetalles;
	public List<PronunDetalle> pronundetalles;
	public List<VocabularioDetalle> vocabulariodetalles;
	public List<VerboCompuestoDetalle> verbocompuestodetalles;
	public List<ExpresionDetalle> expresiondetalles;
	public List<GrammarDetalle> grammardetalles;
		
	public TipoGrammarDetalle () throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.tipogrammardetalleOriginal=this;
		
 		this.nombre="";
		
		
		
		
		
		
		this.verboirregulardetalles=null;
		this.pronundetalles=null;
		this.vocabulariodetalles=null;
		this.verbocompuestodetalles=null;
		this.expresiondetalles=null;
		this.grammardetalles=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public TipoGrammarDetalle (Long id,Date versionRow,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.idOriginal=this.id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.tipogrammardetalleOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public TipoGrammarDetalle (String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.tipogrammardetalleOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		TipoGrammarDetalle tipogrammardetalleLocal=null;
		
		if(object!=null) {
			tipogrammardetalleLocal=(TipoGrammarDetalle)object;
			
			if(tipogrammardetalleLocal!=null) {
				if(this.getId()!=null && tipogrammardetalleLocal.getId()!=null) {
					if(this.getId().equals(tipogrammardetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!TipoGrammarDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(this);
		} else {
			sDetalle=TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public TipoGrammarDetalle getTipoGrammarDetalleOriginal() {
		return this.tipogrammardetalleOriginal;
	}
	
	public void setTipoGrammarDetalleOriginal(TipoGrammarDetalle tipogrammardetalle) {
		try {
			this.tipogrammardetalleOriginal=tipogrammardetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("TipoGrammarDetalle:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("TipoGrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<VerboIrregularDetalle> getVerboIrregularDetalles() {
		return this.verboirregulardetalles;
	}

	public List<PronunDetalle> getPronunDetalles() {
		return this.pronundetalles;
	}

	public List<VocabularioDetalle> getVocabularioDetalles() {
		return this.vocabulariodetalles;
	}

	public List<VerboCompuestoDetalle> getVerboCompuestoDetalles() {
		return this.verbocompuestodetalles;
	}

	public List<ExpresionDetalle> getExpresionDetalles() {
		return this.expresiondetalles;
	}

	public List<GrammarDetalle> getGrammarDetalles() {
		return this.grammardetalles;
	}

	
	
	public  void  setVerboIrregularDetalles(List<VerboIrregularDetalle> verboirregulardetalles) {
		try {
			this.verboirregulardetalles=verboirregulardetalles;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPronunDetalles(List<PronunDetalle> pronundetalles) {
		try {
			this.pronundetalles=pronundetalles;
		} catch(Exception e) {
			;
		}
	}

	public  void  setVocabularioDetalles(List<VocabularioDetalle> vocabulariodetalles) {
		try {
			this.vocabulariodetalles=vocabulariodetalles;
		} catch(Exception e) {
			;
		}
	}

	public  void  setVerboCompuestoDetalles(List<VerboCompuestoDetalle> verbocompuestodetalles) {
		try {
			this.verbocompuestodetalles=verbocompuestodetalles;
		} catch(Exception e) {
			;
		}
	}

	public  void  setExpresionDetalles(List<ExpresionDetalle> expresiondetalles) {
		try {
			this.expresiondetalles=expresiondetalles;
		} catch(Exception e) {
			;
		}
	}

	public  void  setGrammarDetalles(List<GrammarDetalle> grammardetalles) {
		try {
			this.grammardetalles=grammardetalles;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
	}
	
	
	Object verboirregulardetallesDescripcionReporte;
	Object pronundetallesDescripcionReporte;
	Object vocabulariodetallesDescripcionReporte;
	Object verbocompuestodetallesDescripcionReporte;
	Object expresiondetallesDescripcionReporte;
	Object grammardetallesDescripcionReporte;
	
	
	public Object getverboirregulardetallesDescripcionReporte() {
		return verboirregulardetallesDescripcionReporte;
	}

	public Object getpronundetallesDescripcionReporte() {
		return pronundetallesDescripcionReporte;
	}

	public Object getvocabulariodetallesDescripcionReporte() {
		return vocabulariodetallesDescripcionReporte;
	}

	public Object getverbocompuestodetallesDescripcionReporte() {
		return verbocompuestodetallesDescripcionReporte;
	}

	public Object getexpresiondetallesDescripcionReporte() {
		return expresiondetallesDescripcionReporte;
	}

	public Object getgrammardetallesDescripcionReporte() {
		return grammardetallesDescripcionReporte;
	}

	
	
	public  void  setverboirregulardetallesDescripcionReporte(Object verboirregulardetalles) {
		try {
			this.verboirregulardetallesDescripcionReporte=verboirregulardetalles;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setpronundetallesDescripcionReporte(Object pronundetalles) {
		try {
			this.pronundetallesDescripcionReporte=pronundetalles;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setvocabulariodetallesDescripcionReporte(Object vocabulariodetalles) {
		try {
			this.vocabulariodetallesDescripcionReporte=vocabulariodetalles;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setverbocompuestodetallesDescripcionReporte(Object verbocompuestodetalles) {
		try {
			this.verbocompuestodetallesDescripcionReporte=verbocompuestodetalles;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setexpresiondetallesDescripcionReporte(Object expresiondetalles) {
		try {
			this.expresiondetallesDescripcionReporte=expresiondetalles;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setgrammardetallesDescripcionReporte(Object grammardetalles) {
		try {
			this.grammardetallesDescripcionReporte=grammardetalles;
		} catch(Exception ex) {
			;
		}
	}

	/*PARA REPORTES FIN*/
	
	public Object clone() {
        return super.clone();
    }

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long newId) {
		if(this.id!=newId) {
			this.isChanged=true;
		}
		
		this.id=newId;
		super.setId(newId);
	}
	
	public Long getIdOriginal() {
		return this.idOriginal;
	}
	
	public void setIdOriginal(Long newIdOriginal) {		
		this.idOriginal=newIdOriginal;
		super.setIdOriginal(newIdOriginal);
	}

	public Date getVersionRow(){
		//ESTO SIEMPRE SE EJECUTA CUANDO SE CONSUME EJB
		return this.versionRow;
	}
	
	public void setVersionRow(Date newVersionRow){
		if(this.versionRow!=newVersionRow){
			//LE COMENTO PORQUE CUANDO HAGO GET SIEMPRE POR ESTO LE PONE isChanged=true
			//this.isChanged=true;
		}
		
		this.versionRow=newVersionRow;
		super.setVersionRow(newVersionRow);
	}
	
	public String getsVersionRow() {
		return sVersionRow;
	}

	public void setsVersionRow(String sVersionRow) {
		this.sVersionRow = sVersionRow;
		
		super.setsVersionRow(sVersionRow);
	}
	
	public boolean getIsNew() {
		return this.isNew;
	}
	
	public void setIsNew(boolean newIsNew) {
		this.isNew=newIsNew;
		super.setIsNew(newIsNew);
	}
	
	public boolean getIsChanged() {
		return this.isChanged;
	}
	
	public void setIsChanged(boolean newIsChanged) {
		this.isChanged=newIsChanged;
		super.setIsChanged(newIsChanged);
	}
	
	public boolean getIsDeleted() {
		return this.isDeleted;
	}
	
	public void setIsDeleted(boolean newIsDeleted) {
		this.isDeleted=newIsDeleted;
		super.setIsDeleted(newIsDeleted);
	}
	
	public boolean getIsSelected() {
		return this.isSelected;
	}
	
	public void setIsSelected(boolean newIsSelected) {
		this.isSelected=newIsSelected;
		super.setIsSelected(newIsSelected);
	}
	
	public String getsType() {
		return this.sType;
	}
	
	public void setsType(String sType) {
		this.sType=sType;
		super.setsType(sType);
	}

	public Map<String, Object> getMap_TipoGrammarDetalle() {
		return map_TipoGrammarDetalle;
	}

	public void setMap_TipoGrammarDetalle(Map<String, Object> map_TipoGrammarDetalle) {
		this.map_TipoGrammarDetalle = map_TipoGrammarDetalle;
	}

	public void setMapValue_TipoGrammarDetalle(String sKey,Object oValue) {
		this.map_TipoGrammarDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_TipoGrammarDetalle(String sKey) {
		return this.map_TipoGrammarDetalle.get(sKey);
	}
}

