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
package com.bydan.ingles.general.conceptodetalle.business.entity;

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
//import com.bydan.ingles.general.util.ConceptoDetalleConstantesFunciones;
import com.bydan.ingles.general.conceptodetalle.util.*;

//FK

import com.bydan.ingles.general.concepto.business.entity.Concepto;

//REL








@SuppressWarnings("unused")
public class ConceptoDetalle extends GeneralEntity implements Serializable ,Cloneable {//ConceptoDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient ConceptoDetalle conceptodetalleOriginal;
	
	private Map<String, Object> map_ConceptoDetalle;
	
	public void inicializarMap_ConceptoDetalle() {
		this.map_ConceptoDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_concepto;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=ConceptoDetalle_util.S_REGEX_IDEA,message=ConceptoDetalle_util.S_MENSAJE_REGEX_IDEA)
	private String idea;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=ConceptoDetalle_util.S_REGEX_TRADUCCION,message=ConceptoDetalle_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=ConceptoDetalle_util.S_REGEX_PRONUNCIACION,message=ConceptoDetalle_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
			
	
	public Concepto concepto;
	
	
	private String concepto_descripcion;
	
	
		
	public ConceptoDetalle () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.conceptodetalleOriginal=this;
		
 		this.id_concepto=-1L;
 		this.idea="";
 		this.traduccion="";
 		this.pronunciacion="";
		
		
		this.concepto=null;
		
		
		this.concepto_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public ConceptoDetalle (Long id,Date versionRow,Long id_concepto,String idea,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.conceptodetalleOriginal=this;
		
 		this.id_concepto=id_concepto;
 		this.idea=idea;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public ConceptoDetalle (Long id_concepto,String idea,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.conceptodetalleOriginal=this;
		
 		this.id_concepto=id_concepto;
 		this.idea=idea;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		ConceptoDetalle conceptodetalleLocal=null;
		
		if(object!=null) {
			conceptodetalleLocal=(ConceptoDetalle)object;
			
			if(conceptodetalleLocal!=null) {
				if(this.getId()!=null && conceptodetalleLocal.getId()!=null) {
					if(this.getId().equals(conceptodetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!ConceptoDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=ConceptoDetalle_util.getConceptoDetalleDescripcion(this);
		} else {
			sDetalle=ConceptoDetalle_util.getConceptoDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public ConceptoDetalle getConceptoDetalleOriginal() {
		return this.conceptodetalleOriginal;
	}
	
	public void setConceptoDetalleOriginal(ConceptoDetalle conceptodetalle) {
		try {
			this.conceptodetalleOriginal=conceptodetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_concepto() {
		return this.id_concepto;
	}
    
	
	public String getidea() {
		return this.idea;
	}
    
	
	public String gettraduccion() {
		return this.traduccion;
	}
    
	
	public String getpronunciacion() {
		return this.pronunciacion;
	}
	
    
	public void setid_concepto(Long newid_concepto)throws Exception
	{
		try {
			if(this.id_concepto!=newid_concepto) {
				if(newid_concepto==null) {
					//newid_concepto=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ConceptoDetalle:Valor nulo no permitido en columna id_concepto");
					}
				}

				this.id_concepto=newid_concepto;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidea(String newidea)throws Exception
	{
		try {
			if(this.idea!=newidea) {
				if(newidea==null) {
					//newidea="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ConceptoDetalle:Valor nulo no permitido en columna idea");
					}
				}

				if(newidea!=null&&newidea.length()>30) {
					newidea=newidea.substring(0,28);
					System.out.println("ConceptoDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna idea");
				}

				this.idea=newidea;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settraduccion(String newtraduccion)throws Exception
	{
		try {
			if(this.traduccion!=newtraduccion) {
				if(newtraduccion==null) {
					//newtraduccion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ConceptoDetalle:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>30) {
					newtraduccion=newtraduccion.substring(0,28);
					System.out.println("ConceptoDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna traduccion");
				}

				this.traduccion=newtraduccion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpronunciacion(String newpronunciacion)throws Exception
	{
		try {
			if(this.pronunciacion!=newpronunciacion) {
				if(newpronunciacion==null) {
					//newpronunciacion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ConceptoDetalle:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>30) {
					newpronunciacion=newpronunciacion.substring(0,28);
					System.out.println("ConceptoDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna pronunciacion");
				}

				this.pronunciacion=newpronunciacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Concepto getConcepto() {
		return this.concepto;
	}

	
	
	public String getconcepto_descripcion() {
		return this.concepto_descripcion;
	}

	
	
	public  void  setConcepto(Concepto concepto) {
		try {
			this.concepto=concepto;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setconcepto_descripcion(String concepto_descripcion) {
		try {
			this.concepto_descripcion=concepto_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_concepto_descripcion="";
	
	
	
	public String getid_concepto_descripcion() {
		return id_concepto_descripcion;
	}
	
	
	public void setid_concepto_descripcion(String newid_concepto_descripcion)throws Exception {
		try {
			this.id_concepto_descripcion=newid_concepto_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_concepto_descripcion="";
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

	public Map<String, Object> getMap_ConceptoDetalle() {
		return map_ConceptoDetalle;
	}

	public void setMap_ConceptoDetalle(Map<String, Object> map_ConceptoDetalle) {
		this.map_ConceptoDetalle = map_ConceptoDetalle;
	}

	public void setMapValue_ConceptoDetalle(String sKey,Object oValue) {
		this.map_ConceptoDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_ConceptoDetalle(String sKey) {
		return this.map_ConceptoDetalle.get(sKey);
	}
}

