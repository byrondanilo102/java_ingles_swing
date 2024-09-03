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
package com.bydan.ingles.seguridad.perfilcampo.business.entity;

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
//import com.bydan.ingles.seguridad.util.PerfilCampoConstantesFunciones;
import com.bydan.ingles.seguridad.perfilcampo.util.*;

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;

//REL








@SuppressWarnings("unused")
public class PerfilCampo extends GeneralEntity implements Serializable ,Cloneable {//PerfilCampoAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient PerfilCampo perfilcampoOriginal;
	
	private Map<String, Object> map_PerfilCampo;
	
	public void inicializarMap_PerfilCampo() {
		this.map_PerfilCampo = new HashMap<String,Object>();
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
	private Long id_campo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean todo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean ingreso;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean modificacion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean eliminacion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean consulta;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	public Perfil perfil;
	public Campo campo;
	
	
	private String perfil_descripcion;
	private String campo_descripcion;
	
	
		
	public PerfilCampo () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.perfilcampoOriginal=this;
		
 		this.id_perfil=-1L;
 		this.id_campo=-1L;
 		this.todo=false;
 		this.ingreso=false;
 		this.modificacion=false;
 		this.eliminacion=false;
 		this.consulta=false;
 		this.estado=false;
		
		
		this.perfil=null;
		this.campo=null;
		
		
		this.perfil_descripcion="";
		this.campo_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PerfilCampo (Long id,Date versionRow,Long id_perfil,Long id_campo,Boolean todo,Boolean ingreso,Boolean modificacion,Boolean eliminacion,Boolean consulta,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilcampoOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_campo=id_campo;
 		this.todo=todo;
 		this.ingreso=ingreso;
 		this.modificacion=modificacion;
 		this.eliminacion=eliminacion;
 		this.consulta=consulta;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public PerfilCampo (Long id_perfil,Long id_campo,Boolean todo,Boolean ingreso,Boolean modificacion,Boolean eliminacion,Boolean consulta,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilcampoOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_campo=id_campo;
 		this.todo=todo;
 		this.ingreso=ingreso;
 		this.modificacion=modificacion;
 		this.eliminacion=eliminacion;
 		this.consulta=consulta;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		PerfilCampo perfilcampoLocal=null;
		
		if(object!=null) {
			perfilcampoLocal=(PerfilCampo)object;
			
			if(perfilcampoLocal!=null) {
				if(this.getId()!=null && perfilcampoLocal.getId()!=null) {
					if(this.getId().equals(perfilcampoLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PerfilCampo_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PerfilCampo_util.getPerfilCampoDescripcion(this);
		} else {
			sDetalle=PerfilCampo_util.getPerfilCampoDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PerfilCampo getPerfilCampoOriginal() {
		return this.perfilcampoOriginal;
	}
	
	public void setPerfilCampoOriginal(PerfilCampo perfilcampo) {
		try {
			this.perfilcampoOriginal=perfilcampo;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_perfil() {
		return this.id_perfil;
	}
    
	
	public Long getid_campo() {
		return this.id_campo;
	}
    
	
	public Boolean gettodo() {
		return this.todo;
	}
    
	
	public Boolean getingreso() {
		return this.ingreso;
	}
    
	
	public Boolean getmodificacion() {
		return this.modificacion;
	}
    
	
	public Boolean geteliminacion() {
		return this.eliminacion;
	}
    
	
	public Boolean getconsulta() {
		return this.consulta;
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
						System.out.println("PerfilCampo:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_campo(Long newid_campo)throws Exception
	{
		try {
			if(this.id_campo!=newid_campo) {
				if(newid_campo==null) {
					//newid_campo=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna id_campo");
					}
				}

				this.id_campo=newid_campo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settodo(Boolean newtodo)throws Exception
	{
		try {
			if(this.todo!=newtodo) {
				if(newtodo==null) {
					//newtodo=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna todo");
					}
				}

				this.todo=newtodo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setingreso(Boolean newingreso)throws Exception
	{
		try {
			if(this.ingreso!=newingreso) {
				if(newingreso==null) {
					//newingreso=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna ingreso");
					}
				}

				this.ingreso=newingreso;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setmodificacion(Boolean newmodificacion)throws Exception
	{
		try {
			if(this.modificacion!=newmodificacion) {
				if(newmodificacion==null) {
					//newmodificacion=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna modificacion");
					}
				}

				this.modificacion=newmodificacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void seteliminacion(Boolean neweliminacion)throws Exception
	{
		try {
			if(this.eliminacion!=neweliminacion) {
				if(neweliminacion==null) {
					//neweliminacion=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna eliminacion");
					}
				}

				this.eliminacion=neweliminacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setconsulta(Boolean newconsulta)throws Exception
	{
		try {
			if(this.consulta!=newconsulta) {
				if(newconsulta==null) {
					//newconsulta=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilCampo:Valor nulo no permitido en columna consulta");
					}
				}

				this.consulta=newconsulta;
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
						System.out.println("PerfilCampo:Valor nulo no permitido en columna estado");
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

	public Campo getCampo() {
		return this.campo;
	}

	
	
	public String getperfil_descripcion() {
		return this.perfil_descripcion;
	}

	public String getcampo_descripcion() {
		return this.campo_descripcion;
	}

	
	
	public  void  setPerfil(Perfil perfil) {
		try {
			this.perfil=perfil;
		} catch(Exception e) {
			;
		}
	}


	public  void  setCampo(Campo campo) {
		try {
			this.campo=campo;
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


	public  void  setcampo_descripcion(String campo_descripcion) {
		try {
			this.campo_descripcion=campo_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_perfil_descripcion="";
	String id_campo_descripcion="";
	String todo_descripcion="";
	String ingreso_descripcion="";
	String modificacion_descripcion="";
	String eliminacion_descripcion="";
	String consulta_descripcion="";
	String estado_descripcion="";
	
	
	
	public String getid_perfil_descripcion() {
		return id_perfil_descripcion;
	}
	public String getid_campo_descripcion() {
		return id_campo_descripcion;
	}
	public String gettodo_descripcion() {
		return todo_descripcion;
	}
	public String getingreso_descripcion() {
		return ingreso_descripcion;
	}
	public String getmodificacion_descripcion() {
		return modificacion_descripcion;
	}
	public String geteliminacion_descripcion() {
		return eliminacion_descripcion;
	}
	public String getconsulta_descripcion() {
		return consulta_descripcion;
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
	public void setid_campo_descripcion(String newid_campo_descripcion)throws Exception {
		try {
			this.id_campo_descripcion=newid_campo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void settodo_descripcion(String newtodo_descripcion)throws Exception {
		try {
			this.todo_descripcion=newtodo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setingreso_descripcion(String newingreso_descripcion)throws Exception {
		try {
			this.ingreso_descripcion=newingreso_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setmodificacion_descripcion(String newmodificacion_descripcion)throws Exception {
		try {
			this.modificacion_descripcion=newmodificacion_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void seteliminacion_descripcion(String neweliminacion_descripcion)throws Exception {
		try {
			this.eliminacion_descripcion=neweliminacion_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setconsulta_descripcion(String newconsulta_descripcion)throws Exception {
		try {
			this.consulta_descripcion=newconsulta_descripcion;
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
		this.id_campo_descripcion="";
		this.todo_descripcion="";
		this.ingreso_descripcion="";
		this.modificacion_descripcion="";
		this.eliminacion_descripcion="";
		this.consulta_descripcion="";
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

	public Map<String, Object> getMap_PerfilCampo() {
		return map_PerfilCampo;
	}

	public void setMap_PerfilCampo(Map<String, Object> map_PerfilCampo) {
		this.map_PerfilCampo = map_PerfilCampo;
	}

	public void setMapValue_PerfilCampo(String sKey,Object oValue) {
		this.map_PerfilCampo.put(sKey, oValue);
	}
	
	public Object getMapValue_PerfilCampo(String sKey) {
		return this.map_PerfilCampo.get(sKey);
	}
}

