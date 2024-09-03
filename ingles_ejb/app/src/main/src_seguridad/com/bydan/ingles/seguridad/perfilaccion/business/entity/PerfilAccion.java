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
package com.bydan.ingles.seguridad.perfilaccion.business.entity;

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
//import com.bydan.ingles.seguridad.util.PerfilAccionConstantesFunciones;
import com.bydan.ingles.seguridad.perfilaccion.util.*;

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;

//REL








@SuppressWarnings("unused")
public class PerfilAccion extends GeneralEntity implements Serializable ,Cloneable {//PerfilAccionAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient PerfilAccion perfilaccionOriginal;
	
	private Map<String, Object> map_PerfilAccion;
	
	public void inicializarMap_PerfilAccion() {
		this.map_PerfilAccion = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_perfil;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_accion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean ejecusion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	public Perfil perfil;
	public Accion accion;
	
	
	private String perfil_descripcion;
	private String accion_descripcion;
	
	
		
	public PerfilAccion () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.perfilaccionOriginal=this;
		
 		this.id_perfil=-1L;
 		this.id_accion=-1L;
 		this.ejecusion=false;
 		this.estado=false;
		
		
		this.perfil=null;
		this.accion=null;
		
		
		this.perfil_descripcion="";
		this.accion_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PerfilAccion (Long id,Date versionRow,Long id_perfil,Long id_accion,Boolean ejecusion,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilaccionOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_accion=id_accion;
 		this.ejecusion=ejecusion;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public PerfilAccion (Long id_perfil,Long id_accion,Boolean ejecusion,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilaccionOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_accion=id_accion;
 		this.ejecusion=ejecusion;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		PerfilAccion perfilaccionLocal=null;
		
		if(object!=null) {
			perfilaccionLocal=(PerfilAccion)object;
			
			if(perfilaccionLocal!=null) {
				if(this.getId()!=null && perfilaccionLocal.getId()!=null) {
					if(this.getId().equals(perfilaccionLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PerfilAccion_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PerfilAccion_util.getPerfilAccionDescripcion(this);
		} else {
			sDetalle=PerfilAccion_util.getPerfilAccionDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PerfilAccion getPerfilAccionOriginal() {
		return this.perfilaccionOriginal;
	}
	
	public void setPerfilAccionOriginal(PerfilAccion perfilaccion) {
		try {
			this.perfilaccionOriginal=perfilaccion;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_perfil() {
		return this.id_perfil;
	}
    
	
	public Long getid_accion() {
		return this.id_accion;
	}
    
	
	public Boolean getejecusion() {
		return this.ejecusion;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
	
    
	public void setid_perfil(Long newid_perfil)throws Exception
	{
		try {
			if(this.id_perfil!=newid_perfil) {
				if(newid_perfil==null) {
					//newid_perfil=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_accion(Long newid_accion)throws Exception
	{
		try {
			if(this.id_accion!=newid_accion) {
				if(newid_accion==null) {
					//newid_accion=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna id_accion");
					}
				}

				this.id_accion=newid_accion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setejecusion(Boolean newejecusion)throws Exception
	{
		try {
			if(this.ejecusion!=newejecusion) {
				if(newejecusion==null) {
					//newejecusion=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilAccion:Valor nulo no permitido en columna ejecusion");
					}
				}

				this.ejecusion=newejecusion;
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
						System.out.println("PerfilAccion:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Perfil getPerfil() {
		return this.perfil;
	}

	public Accion getAccion() {
		return this.accion;
	}

	
	
	public String getperfil_descripcion() {
		return this.perfil_descripcion;
	}

	public String getaccion_descripcion() {
		return this.accion_descripcion;
	}

	
	
	public  void  setPerfil(Perfil perfil) {
		try {
			this.perfil=perfil;
		} catch(Exception e) {
			;
		}
	}


	public  void  setAccion(Accion accion) {
		try {
			this.accion=accion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setperfil_descripcion(String perfil_descripcion) {
		try {
			this.perfil_descripcion=perfil_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  setaccion_descripcion(String accion_descripcion) {
		try {
			this.accion_descripcion=accion_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_perfil_descripcion="";
	String id_accion_descripcion="";
	String ejecusion_descripcion="";
	String estado_descripcion="";
	
	
	
	public String getid_perfil_descripcion() {
		return id_perfil_descripcion;
	}
	public String getid_accion_descripcion() {
		return id_accion_descripcion;
	}
	public String getejecusion_descripcion() {
		return ejecusion_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void setid_perfil_descripcion(String newid_perfil_descripcion)throws Exception {
		try {
			this.id_perfil_descripcion=newid_perfil_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_accion_descripcion(String newid_accion_descripcion)throws Exception {
		try {
			this.id_accion_descripcion=newid_accion_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setejecusion_descripcion(String newejecusion_descripcion)throws Exception {
		try {
			this.ejecusion_descripcion=newejecusion_descripcion;
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
		
		this.id_perfil_descripcion="";
		this.id_accion_descripcion="";
		this.ejecusion_descripcion="";
		this.estado_descripcion="";
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

	public Map<String, Object> getMap_PerfilAccion() {
		return map_PerfilAccion;
	}

	public void setMap_PerfilAccion(Map<String, Object> map_PerfilAccion) {
		this.map_PerfilAccion = map_PerfilAccion;
	}

	public void setMapValue_PerfilAccion(String sKey,Object oValue) {
		this.map_PerfilAccion.put(sKey, oValue);
	}
	
	public Object getMapValue_PerfilAccion(String sKey) {
		return this.map_PerfilAccion.get(sKey);
	}
}

