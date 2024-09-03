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
package com.bydan.ingles.gramatica.paisgeneral.business.entity;

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
//import com.bydan.ingles.gramatica.util.PaisGeneralConstantesFunciones;
import com.bydan.ingles.gramatica.paisgeneral.util.*;

//FK


//REL








@SuppressWarnings("unused")
public class PaisGeneral extends GeneralEntity implements Serializable ,Cloneable {//PaisGeneralAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient PaisGeneral paisgeneralOriginal;
	
	private Map<String, Object> map_PaisGeneral;
	
	public void inicializarMap_PaisGeneral() {
		this.map_PaisGeneral = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=PaisGeneral_util.S_REGEX_NOMBRE,message=PaisGeneral_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=40,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=PaisGeneral_util.S_REGEX_NACIONALIDAD,message=PaisGeneral_util.S_MENSAJE_REGEX_NACIONALIDAD)
	private String nacionalidad;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PaisGeneral_util.S_REGEX_TRADUCCION,message=PaisGeneral_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=40,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PaisGeneral_util.S_REGEX_PRONUNCIACION,message=PaisGeneral_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
			
	
	
	
	
	
		
	public PaisGeneral () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.paisgeneralOriginal=this;
		
 		this.nombre="";
 		this.nacionalidad="";
 		this.traduccion="";
 		this.pronunciacion="";
		
		
		
		
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PaisGeneral (Long id,Date versionRow,String nombre,String nacionalidad,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paisgeneralOriginal=this;
		
 		this.nombre=nombre;
 		this.nacionalidad=nacionalidad;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public PaisGeneral (String nombre,String nacionalidad,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paisgeneralOriginal=this;
		
 		this.nombre=nombre;
 		this.nacionalidad=nacionalidad;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		PaisGeneral paisgeneralLocal=null;
		
		if(object!=null) {
			paisgeneralLocal=(PaisGeneral)object;
			
			if(paisgeneralLocal!=null) {
				if(this.getId()!=null && paisgeneralLocal.getId()!=null) {
					if(this.getId().equals(paisgeneralLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PaisGeneral_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PaisGeneral_util.getPaisGeneralDescripcion(this);
		} else {
			sDetalle=PaisGeneral_util.getPaisGeneralDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PaisGeneral getPaisGeneralOriginal() {
		return this.paisgeneralOriginal;
	}
	
	public void setPaisGeneralOriginal(PaisGeneral paisgeneral) {
		try {
			this.paisgeneralOriginal=paisgeneral;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getnacionalidad() {
		return this.nacionalidad;
	}
    
	
	public String gettraduccion() {
		return this.traduccion;
	}
    
	
	public String getpronunciacion() {
		return this.pronunciacion;
	}
	
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PaisGeneral:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>30) {
					newnombre=newnombre.substring(0,28);
					System.out.println("PaisGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnacionalidad(String newnacionalidad)throws Exception
	{
		try {
			if(this.nacionalidad!=newnacionalidad) {
				if(newnacionalidad==null) {
					//newnacionalidad="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PaisGeneral:Valor nulo no permitido en columna nacionalidad");
					}
				}

				if(newnacionalidad!=null&&newnacionalidad.length()>40) {
					newnacionalidad=newnacionalidad.substring(0,38);
					System.out.println("PaisGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=40 en columna nacionalidad");
				}

				this.nacionalidad=newnacionalidad;
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
						System.out.println("PaisGeneral:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("PaisGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("PaisGeneral:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>40) {
					newpronunciacion=newpronunciacion.substring(0,38);
					System.out.println("PaisGeneral:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=40 en columna pronunciacion");
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

	public Map<String, Object> getMap_PaisGeneral() {
		return map_PaisGeneral;
	}

	public void setMap_PaisGeneral(Map<String, Object> map_PaisGeneral) {
		this.map_PaisGeneral = map_PaisGeneral;
	}

	public void setMapValue_PaisGeneral(String sKey,Object oValue) {
		this.map_PaisGeneral.put(sKey, oValue);
	}
	
	public Object getMapValue_PaisGeneral(String sKey) {
		return this.map_PaisGeneral.get(sKey);
	}
}

