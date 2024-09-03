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
package com.bydan.ingles.gramatica.numerogeneral.business.entity;

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
//import com.bydan.ingles.gramatica.util.NumeroGeneralConstantesFunciones;
import com.bydan.ingles.gramatica.numerogeneral.util.*;

//FK


//REL








@SuppressWarnings("unused")
public class NumeroGeneral extends GeneralEntity implements Serializable ,Cloneable {//NumeroGeneralAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient NumeroGeneral numerogeneralOriginal;
	
	private Map<String, Object> map_NumeroGeneral;
	
	public void inicializarMap_NumeroGeneral() {
		this.map_NumeroGeneral = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=20,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=NumeroGeneral_util.S_REGEX_NUMERO,message=NumeroGeneral_util.S_MENSAJE_REGEX_NUMERO)
	private String numero;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=NumeroGeneral_util.S_REGEX_NOMBRE,message=NumeroGeneral_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=NumeroGeneral_util.S_REGEX_TRADUCCION,message=NumeroGeneral_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=60,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=NumeroGeneral_util.S_REGEX_PRONUNCIACION,message=NumeroGeneral_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
			
	
	
	
	
	
		
	public NumeroGeneral () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.numerogeneralOriginal=this;
		
 		this.numero="";
 		this.nombre="";
 		this.traduccion="";
 		this.pronunciacion="";
		
		
		
		
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public NumeroGeneral (Long id,Date versionRow,String numero,String nombre,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.numerogeneralOriginal=this;
		
 		this.numero=numero;
 		this.nombre=nombre;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public NumeroGeneral (String numero,String nombre,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.numerogeneralOriginal=this;
		
 		this.numero=numero;
 		this.nombre=nombre;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		NumeroGeneral numerogeneralLocal=null;
		
		if(object!=null) {
			numerogeneralLocal=(NumeroGeneral)object;
			
			if(numerogeneralLocal!=null) {
				if(this.getId()!=null && numerogeneralLocal.getId()!=null) {
					if(this.getId().equals(numerogeneralLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!NumeroGeneral_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=NumeroGeneral_util.getNumeroGeneralDescripcion(this);
		} else {
			sDetalle=NumeroGeneral_util.getNumeroGeneralDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public NumeroGeneral getNumeroGeneralOriginal() {
		return this.numerogeneralOriginal;
	}
	
	public void setNumeroGeneralOriginal(NumeroGeneral numerogeneral) {
		try {
			this.numerogeneralOriginal=numerogeneral;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getnumero() {
		return this.numero;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String gettraduccion() {
		return this.traduccion;
	}
    
	
	public String getpronunciacion() {
		return this.pronunciacion;
	}
	
    
	public void setnumero(String newnumero)throws Exception
	{
		try {
			if(this.numero!=newnumero) {
				if(newnumero==null) {
					//newnumero="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("NumeroGeneral:Valor nulo no permitido en columna numero");
					}
				}

				if(newnumero!=null&&newnumero.length()>20) {
					newnumero=newnumero.substring(0,18);
					System.out.println("NumeroGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna numero");
				}

				this.numero=newnumero;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("NumeroGeneral:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("NumeroGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
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
						System.out.println("NumeroGeneral:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("NumeroGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("NumeroGeneral:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>60) {
					newpronunciacion=newpronunciacion.substring(0,58);
					System.out.println("NumeroGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=60 en columna pronunciacion");
				}

				this.pronunciacion=newpronunciacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*PARA REPORTES*/
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
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

	public Map<String, Object> getMap_NumeroGeneral() {
		return map_NumeroGeneral;
	}

	public void setMap_NumeroGeneral(Map<String, Object> map_NumeroGeneral) {
		this.map_NumeroGeneral = map_NumeroGeneral;
	}

	public void setMapValue_NumeroGeneral(String sKey,Object oValue) {
		this.map_NumeroGeneral.put(sKey, oValue);
	}
	
	public Object getMapValue_NumeroGeneral(String sKey) {
		return this.map_NumeroGeneral.get(sKey);
	}
}

