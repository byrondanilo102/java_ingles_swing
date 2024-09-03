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
package com.bydan.ingles.seguridad.paquete.business.entity;

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
//import com.bydan.ingles.seguridad.util.PaqueteConstantesFunciones;
import com.bydan.ingles.seguridad.paquete.util.*;

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;







@SuppressWarnings("unused")
public class Paquete extends GeneralEntity implements Serializable ,Cloneable {//PaqueteAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Paquete paqueteOriginal;
	
	private Map<String, Object> map_Paquete;
	
	public void inicializarMap_Paquete() {
		this.map_Paquete = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_sistema;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Paquete_util.S_REGEX_NOMBRE,message=Paquete_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Paquete_util.S_REGEX_DESCRIPCION,message=Paquete_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
			
	
	public Sistema sistema;
	
	
	private String sistema_descripcion;
	
	
		
	public Paquete () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.paqueteOriginal=this;
		
 		this.id_sistema=-1L;
 		this.nombre="";
 		this.descripcion="";
		
		
		this.sistema=null;
		
		
		this.sistema_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Paquete (Long id,Date versionRow,Long id_sistema,String nombre,String descripcion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paqueteOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Paquete (Long id_sistema,String nombre,String descripcion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paqueteOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Paquete paqueteLocal=null;
		
		if(object!=null) {
			paqueteLocal=(Paquete)object;
			
			if(paqueteLocal!=null) {
				if(this.getId()!=null && paqueteLocal.getId()!=null) {
					if(this.getId().equals(paqueteLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Paquete_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Paquete_util.getPaqueteDescripcion(this);
		} else {
			sDetalle=Paquete_util.getPaqueteDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Paquete getPaqueteOriginal() {
		return this.paqueteOriginal;
	}
	
	public void setPaqueteOriginal(Paquete paquete) {
		try {
			this.paqueteOriginal=paquete;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_sistema() {
		return this.id_sistema;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getdescripcion() {
		return this.descripcion;
	}
	
    
	public void setid_sistema(Long newid_sistema)throws Exception
	{
		try {
			if(this.id_sistema!=newid_sistema) {
				if(newid_sistema==null) {
					//newid_sistema=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Paquete:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
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
						System.out.println("Paquete:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Paquete:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setdescripcion(String newdescripcion)throws Exception
	{
		try {
			if(this.descripcion!=newdescripcion) {
				if(newdescripcion==null) {
					//newdescripcion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Paquete:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>200) {
					newdescripcion=newdescripcion.substring(0,198);
					System.out.println("Paquete:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Sistema getSistema() {
		return this.sistema;
	}

	
	
	public String getsistema_descripcion() {
		return this.sistema_descripcion;
	}

	
	
	public  void  setSistema(Sistema sistema) {
		try {
			this.sistema=sistema;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setsistema_descripcion(String sistema_descripcion) {
		try {
			this.sistema_descripcion=sistema_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_sistema_descripcion="";
	
	
	
	public String getid_sistema_descripcion() {
		return id_sistema_descripcion;
	}
	
	
	public void setid_sistema_descripcion(String newid_sistema_descripcion)throws Exception {
		try {
			this.id_sistema_descripcion=newid_sistema_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_sistema_descripcion="";
	}
	
	
	Object modulosDescripcionReporte;
	
	
	public Object getmodulosDescripcionReporte() {
		return modulosDescripcionReporte;
	}

	
	
	public  void  setmodulosDescripcionReporte(Object modulos) {
		try {
			this.modulosDescripcionReporte=modulos;
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

	public Map<String, Object> getMap_Paquete() {
		return map_Paquete;
	}

	public void setMap_Paquete(Map<String, Object> map_Paquete) {
		this.map_Paquete = map_Paquete;
	}

	public void setMapValue_Paquete(String sKey,Object oValue) {
		this.map_Paquete.put(sKey, oValue);
	}
	
	public Object getMapValue_Paquete(String sKey) {
		return this.map_Paquete.get(sKey);
	}
}

