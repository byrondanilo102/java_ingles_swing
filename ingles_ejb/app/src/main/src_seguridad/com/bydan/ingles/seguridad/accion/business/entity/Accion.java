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
package com.bydan.ingles.seguridad.accion.business.entity;

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
//import com.bydan.ingles.seguridad.util.AccionConstantesFunciones;
import com.bydan.ingles.seguridad.accion.util.*;

//FK

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;

//REL

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;







@SuppressWarnings("unused")
public class Accion extends GeneralEntity implements Serializable ,Cloneable {//AccionAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Accion accionOriginal;
	
	private Map<String, Object> map_Accion;
	
	public void inicializarMap_Accion() {
		this.map_Accion = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_opcion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Accion_util.S_REGEX_CODIGO,message=Accion_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Accion_util.S_REGEX_NOMBRE,message=Accion_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=250,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Accion_util.S_REGEX_DESCRIPCION,message=Accion_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=10,fraction=0,message=ConstantesValidacion.S_VALIDACION_INT)
	private Integer orden;
			
	
	public Opcion opcion;
	
	
	private String opcion_descripcion;
	
	
	public List<Perfil> perfils;
	public List<PerfilAccion> perfilaccions;
		
	public Accion () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.accionOriginal=this;
		
 		this.id_opcion=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.descripcion="";
 		this.estado=false;
 		this.orden=0;
		
		
		this.opcion=null;
		
		
		this.opcion_descripcion="";
		
		
		this.perfils=null;
		this.perfilaccions=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Accion (Long id,Date versionRow,Long id_opcion,String codigo,String nombre,String descripcion,Boolean estado,Integer orden) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.accionOriginal=this;
		
 		this.id_opcion=id_opcion;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
 		this.estado=estado;
 		this.orden=orden;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Accion (Long id_opcion,String codigo,String nombre,String descripcion,Boolean estado,Integer orden) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.accionOriginal=this;
		
 		this.id_opcion=id_opcion;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
 		this.estado=estado;
 		this.orden=orden;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Accion accionLocal=null;
		
		if(object!=null) {
			accionLocal=(Accion)object;
			
			if(accionLocal!=null) {
				if(this.getId()!=null && accionLocal.getId()!=null) {
					if(this.getId().equals(accionLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Accion_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Accion_util.getAccionDescripcion(this);
		} else {
			sDetalle=Accion_util.getAccionDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Accion getAccionOriginal() {
		return this.accionOriginal;
	}
	
	public void setAccionOriginal(Accion accion) {
		try {
			this.accionOriginal=accion;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_opcion() {
		return this.id_opcion;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getdescripcion() {
		return this.descripcion;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
    
	
	public Integer getorden() {
		return this.orden;
	}
	
    
	public void setid_opcion(Long newid_opcion)throws Exception
	{
		try {
			if(this.id_opcion!=newid_opcion) {
				if(newid_opcion==null) {
					//newid_opcion=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Accion:Valor nulo no permitido en columna id_opcion");
					}
				}

				this.id_opcion=newid_opcion;
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
						System.out.println("Accion:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Accion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("Accion:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>150) {
					newnombre=newnombre.substring(0,148);
					System.out.println("Accion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre");
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
						System.out.println("Accion:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>250) {
					newdescripcion=newdescripcion.substring(0,248);
					System.out.println("Accion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=250 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setestado(Boolean newestado)throws Exception
	{
		try {
			if(this.estado!=newestado) {
				if(newestado==null) {
					//newestado=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Accion:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setorden(Integer neworden)throws Exception
	{
		try {
			if(this.orden!=neworden) {
				if(neworden==null) {
					//neworden=0;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Accion:Valor nulo no permitido en columna orden");
					}
				}

				this.orden=neworden;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Opcion getOpcion() {
		return this.opcion;
	}

	
	
	public String getopcion_descripcion() {
		return this.opcion_descripcion;
	}

	
	
	public  void  setOpcion(Opcion opcion) {
		try {
			this.opcion=opcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setopcion_descripcion(String opcion_descripcion) {
		try {
			this.opcion_descripcion=opcion_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public List<PerfilAccion> getPerfilAccions() {
		return this.perfilaccions;
	}

	
	
	public  void  setPerfils(List<Perfil> perfils) {
		try {
			this.perfils=perfils;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPerfilAccions(List<PerfilAccion> perfilaccions) {
		try {
			this.perfilaccions=perfilaccions;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_opcion_descripcion="";
	String estado_descripcion="";
	
	
	
	public String getid_opcion_descripcion() {
		return id_opcion_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void setid_opcion_descripcion(String newid_opcion_descripcion)throws Exception {
		try {
			this.id_opcion_descripcion=newid_opcion_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setestado_descripcion(String newestado_descripcion)throws Exception {
		try {
			this.estado_descripcion=newestado_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_opcion_descripcion="";
		this.estado_descripcion="";
	}
	
	
	Object perfilsDescripcionReporte;
	Object perfilaccionsDescripcionReporte;
	
	
	public Object getperfilsDescripcionReporte() {
		return perfilsDescripcionReporte;
	}

	public Object getperfilaccionsDescripcionReporte() {
		return perfilaccionsDescripcionReporte;
	}

	
	
	public  void  setperfilsDescripcionReporte(Object perfils) {
		try {
			this.perfilsDescripcionReporte=perfils;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilaccionsDescripcionReporte(Object perfilaccions) {
		try {
			this.perfilaccionsDescripcionReporte=perfilaccions;
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

	public Map<String, Object> getMap_Accion() {
		return map_Accion;
	}

	public void setMap_Accion(Map<String, Object> map_Accion) {
		this.map_Accion = map_Accion;
	}

	public void setMapValue_Accion(String sKey,Object oValue) {
		this.map_Accion.put(sKey, oValue);
	}
	
	public Object getMapValue_Accion(String sKey) {
		return this.map_Accion.get(sKey);
	}
}

