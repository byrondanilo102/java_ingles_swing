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
package com.bydan.ingles.seguridad.ciudad.business.entity;

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
//import com.bydan.ingles.seguridad.util.CiudadConstantesFunciones;
import com.bydan.ingles.seguridad.ciudad.util.*;

//FK

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;

//REL

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;







@SuppressWarnings("unused")
public class Ciudad extends GeneralEntity implements Serializable ,Cloneable {//CiudadAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Ciudad ciudadOriginal;
	
	private Map<String, Object> map_Ciudad;
	
	public void inicializarMap_Ciudad() {
		this.map_Ciudad = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_provincia;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Ciudad_util.S_REGEX_CODIGO,message=Ciudad_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Ciudad_util.S_REGEX_NOMBRE,message=Ciudad_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	public Provincia provincia;
	
	
	private String provincia_descripcion;
	
	
	public List<DatoGeneralUsuario> datogeneralusuarios;
		
	public Ciudad () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.ciudadOriginal=this;
		
 		this.id_provincia=-1L;
 		this.codigo="";
 		this.nombre="";
		
		
		this.provincia=null;
		
		
		this.provincia_descripcion="";
		
		
		this.datogeneralusuarios=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Ciudad (Long id,Date versionRow,Long id_provincia,String codigo,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.ciudadOriginal=this;
		
 		this.id_provincia=id_provincia;
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Ciudad (Long id_provincia,String codigo,String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.ciudadOriginal=this;
		
 		this.id_provincia=id_provincia;
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Ciudad ciudadLocal=null;
		
		if(object!=null) {
			ciudadLocal=(Ciudad)object;
			
			if(ciudadLocal!=null) {
				if(this.getId()!=null && ciudadLocal.getId()!=null) {
					if(this.getId().equals(ciudadLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Ciudad_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Ciudad_util.getCiudadDescripcion(this);
		} else {
			sDetalle=Ciudad_util.getCiudadDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Ciudad getCiudadOriginal() {
		return this.ciudadOriginal;
	}
	
	public void setCiudadOriginal(Ciudad ciudad) {
		try {
			this.ciudadOriginal=ciudad;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid_provincia(Long newid_provincia)throws Exception
	{
		try {
			if(this.id_provincia!=newid_provincia) {
				if(newid_provincia==null) {
					//newid_provincia=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Ciudad:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
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
						System.out.println("Ciudad:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Ciudad:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("Ciudad:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Ciudad:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Provincia getProvincia() {
		return this.provincia;
	}

	
	
	public String getprovincia_descripcion() {
		return this.provincia_descripcion;
	}

	
	
	public  void  setProvincia(Provincia provincia) {
		try {
			this.provincia=provincia;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setprovincia_descripcion(String provincia_descripcion) {
		try {
			this.provincia_descripcion=provincia_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<DatoGeneralUsuario> getDatoGeneralUsuarios() {
		return this.datogeneralusuarios;
	}

	
	
	public  void  setDatoGeneralUsuarios(List<DatoGeneralUsuario> datogeneralusuarios) {
		try {
			this.datogeneralusuarios=datogeneralusuarios;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_provincia_descripcion="";
	
	
	
	public String getid_provincia_descripcion() {
		return id_provincia_descripcion;
	}
	
	
	public void setid_provincia_descripcion(String newid_provincia_descripcion)throws Exception {
		try {
			this.id_provincia_descripcion=newid_provincia_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_provincia_descripcion="";
	}
	
	
	Object datogeneralusuariosDescripcionReporte;
	
	
	public Object getdatogeneralusuariosDescripcionReporte() {
		return datogeneralusuariosDescripcionReporte;
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

	public Map<String, Object> getMap_Ciudad() {
		return map_Ciudad;
	}

	public void setMap_Ciudad(Map<String, Object> map_Ciudad) {
		this.map_Ciudad = map_Ciudad;
	}

	public void setMapValue_Ciudad(String sKey,Object oValue) {
		this.map_Ciudad.put(sKey, oValue);
	}
	
	public Object getMapValue_Ciudad(String sKey) {
		return this.map_Ciudad.get(sKey);
	}
}

