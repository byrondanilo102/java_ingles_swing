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
package com.bydan.ingles.seguridad.provincia.business.entity;

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
//import com.bydan.ingles.seguridad.util.ProvinciaConstantesFunciones;
import com.bydan.ingles.seguridad.provincia.util.*;

//FK

import com.bydan.ingles.seguridad.pais.business.entity.Pais;

//REL

import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;







@SuppressWarnings("unused")
public class Provincia extends GeneralEntity implements Serializable ,Cloneable {//ProvinciaAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Provincia provinciaOriginal;
	
	private Map<String, Object> map_Provincia;
	
	public void inicializarMap_Provincia() {
		this.map_Provincia = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_pais;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Provincia_util.S_REGEX_CODIGO,message=Provincia_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Provincia_util.S_REGEX_NOMBRE,message=Provincia_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	public Pais pais;
	
	
	private String pais_descripcion;
	
	
	public List<Ciudad> ciudads;
	public List<DatoGeneralUsuario> datogeneralusuarios;
		
	public Provincia () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.provinciaOriginal=this;
		
 		this.id_pais=-1L;
 		this.codigo="";
 		this.nombre="";
		
		
		this.pais=null;
		
		
		this.pais_descripcion="";
		
		
		this.ciudads=null;
		this.datogeneralusuarios=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Provincia (Long id,Date versionRow,Long id_pais,String codigo,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.provinciaOriginal=this;
		
 		this.id_pais=id_pais;
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Provincia (Long id_pais,String codigo,String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.provinciaOriginal=this;
		
 		this.id_pais=id_pais;
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Provincia provinciaLocal=null;
		
		if(object!=null) {
			provinciaLocal=(Provincia)object;
			
			if(provinciaLocal!=null) {
				if(this.getId()!=null && provinciaLocal.getId()!=null) {
					if(this.getId().equals(provinciaLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Provincia_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Provincia_util.getProvinciaDescripcion(this);
		} else {
			sDetalle=Provincia_util.getProvinciaDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Provincia getProvinciaOriginal() {
		return this.provinciaOriginal;
	}
	
	public void setProvinciaOriginal(Provincia provincia) {
		try {
			this.provinciaOriginal=provincia;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_pais() {
		return this.id_pais;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Provincia:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Provincia:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Provincia:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
				}

				this.codigo=newcodigo;
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
						System.out.println("Provincia:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Provincia:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Pais getPais() {
		return this.pais;
	}

	
	
	public String getpais_descripcion() {
		return this.pais_descripcion;
	}

	
	
	public  void  setPais(Pais pais) {
		try {
			this.pais=pais;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setpais_descripcion(String pais_descripcion) {
		try {
			this.pais_descripcion=pais_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public List<DatoGeneralUsuario> getDatoGeneralUsuarios() {
		return this.datogeneralusuarios;
	}

	
	
	public  void  setCiudads(List<Ciudad> ciudads) {
		try {
			this.ciudads=ciudads;
		} catch(Exception e) {
			;
		}
	}

	public  void  setDatoGeneralUsuarios(List<DatoGeneralUsuario> datogeneralusuarios) {
		try {
			this.datogeneralusuarios=datogeneralusuarios;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_pais_descripcion="";
	
	
	
	public String getid_pais_descripcion() {
		return id_pais_descripcion;
	}
	
	
	public void setid_pais_descripcion(String newid_pais_descripcion)throws Exception {
		try {
			this.id_pais_descripcion=newid_pais_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_pais_descripcion="";
	}
	
	
	Object ciudadsDescripcionReporte;
	Object datogeneralusuariosDescripcionReporte;
	
	
	public Object getciudadsDescripcionReporte() {
		return ciudadsDescripcionReporte;
	}

	public Object getdatogeneralusuariosDescripcionReporte() {
		return datogeneralusuariosDescripcionReporte;
	}

	
	
	public  void  setciudadsDescripcionReporte(Object ciudads) {
		try {
			this.ciudadsDescripcionReporte=ciudads;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setdatogeneralusuariosDescripcionReporte(Object datogeneralusuarios) {
		try {
			this.datogeneralusuariosDescripcionReporte=datogeneralusuarios;
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

	public Map<String, Object> getMap_Provincia() {
		return map_Provincia;
	}

	public void setMap_Provincia(Map<String, Object> map_Provincia) {
		this.map_Provincia = map_Provincia;
	}

	public void setMapValue_Provincia(String sKey,Object oValue) {
		this.map_Provincia.put(sKey, oValue);
	}
	
	public Object getMapValue_Provincia(String sKey) {
		return this.map_Provincia.get(sKey);
	}
}

