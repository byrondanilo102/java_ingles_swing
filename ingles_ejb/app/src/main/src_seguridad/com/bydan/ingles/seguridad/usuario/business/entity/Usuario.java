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
package com.bydan.ingles.seguridad.usuario.business.entity;

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
//import com.bydan.ingles.seguridad.util.UsuarioConstantesFunciones;
import com.bydan.ingles.seguridad.usuario.util.*;

//FK


//REL

import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;







@SuppressWarnings("unused")
public class Usuario extends Usuario_add implements Serializable ,Cloneable {//UsuarioAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Usuario usuarioOriginal;
	
	private Map<String, Object> map_Usuario;
	
	public void inicializarMap_Usuario() {
		this.map_Usuario = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Usuario_util.S_REGEX_USER_NAME,message=Usuario_util.S_MENSAJE_REGEX_USER_NAME)
	private String user_name;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=500,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Usuario_util.S_REGEX_CLAVE,message=Usuario_util.S_MENSAJE_REGEX_CLAVE)
	private String clave;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=500,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Usuario_util.S_REGEX_CONFIRMAR_CLAVE,message=Usuario_util.S_MENSAJE_REGEX_CONFIRMAR_CLAVE)
	private String confirmar_clave;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Usuario_util.S_REGEX_NOMBRE,message=Usuario_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Usuario_util.S_REGEX_CODIGO_ALTERNO,message=Usuario_util.S_MENSAJE_REGEX_CODIGO_ALTERNO)
	private String codigo_alterno;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean tipo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	
	
	
	
	public List<HistorialCambioClave> historialcambioclaves;
	public List<ResumenUsuario> resumenusuarios;
	public List<Auditoria> auditorias;
	public List<Perfil> perfils;
	public ParametroGeneralUsuario parametrogeneralusuario;
	public List<PerfilUsuario> perfilusuarios;
	public DatoGeneralUsuario datogeneralusuario;
		
	public Usuario () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.usuarioOriginal=this;
		
 		this.user_name="";
 		this.clave="";
 		this.confirmar_clave="";
 		this.nombre="";
 		this.codigo_alterno="";
 		this.tipo=false;
 		this.estado=false;
		
		
		
		
		
		
		this.historialcambioclaves=null;
		this.resumenusuarios=null;
		this.auditorias=null;
		this.perfils=null;
		this.perfilusuarios=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Usuario (Long id,Date versionRow,String user_name,String clave,String confirmar_clave,String nombre,String codigo_alterno,Boolean tipo,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.usuarioOriginal=this;
		
 		this.user_name=user_name;
 		this.clave=clave;
 		this.confirmar_clave=confirmar_clave;
 		this.nombre=nombre;
 		this.codigo_alterno=codigo_alterno;
 		this.tipo=tipo;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Usuario (String user_name,String clave,String confirmar_clave,String nombre,String codigo_alterno,Boolean tipo,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.usuarioOriginal=this;
		
 		this.user_name=user_name;
 		this.clave=clave;
 		this.confirmar_clave=confirmar_clave;
 		this.nombre=nombre;
 		this.codigo_alterno=codigo_alterno;
 		this.tipo=tipo;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Usuario usuarioLocal=null;
		
		if(object!=null) {
			usuarioLocal=(Usuario)object;
			
			if(usuarioLocal!=null) {
				if(this.getId()!=null && usuarioLocal.getId()!=null) {
					if(this.getId().equals(usuarioLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Usuario_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Usuario_util.getUsuarioDescripcion(this);
		} else {
			sDetalle=Usuario_util.getUsuarioDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Usuario getUsuarioOriginal() {
		return this.usuarioOriginal;
	}
	
	public void setUsuarioOriginal(Usuario usuario) {
		try {
			this.usuarioOriginal=usuario;
		} catch(Exception e) {
			;
		}
	}
	
	
	protected Usuario_add usuarioAdditional=null;
	
	public Usuario_add getUsuarioAdditional() {
		return this.usuarioAdditional;
	}
	
	public void setUsuarioAdditional(Usuario_add usuarioAdditional) {
		try {
			this.usuarioAdditional=usuarioAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getuser_name() {
		return this.user_name;
	}
    
	
	public String getclave() {
		return this.clave;
	}
    
	
	public String getconfirmar_clave() {
		return this.confirmar_clave;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getcodigo_alterno() {
		return this.codigo_alterno;
	}
    
	
	public Boolean gettipo() {
		return this.tipo;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
	
    
	public void setuser_name(String newuser_name)throws Exception
	{
		try {
			if(this.user_name!=newuser_name) {
				if(newuser_name==null) {
					//newuser_name="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Usuario:Valor nulo no permitido en columna user_name");
					}
				}

				if(newuser_name!=null&&newuser_name.length()>50) {
					newuser_name=newuser_name.substring(0,48);
					System.out.println("Usuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna user_name");
				}

				this.user_name=newuser_name;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setclave(String newclave)throws Exception
	{
		try {
			if(this.clave!=newclave) {
				if(newclave==null) {
					//newclave="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Usuario:Valor nulo no permitido en columna clave");
					}
				}

				if(newclave!=null&&newclave.length()>500) {
					newclave=newclave.substring(0,498);
					System.out.println("Usuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=500 en columna clave");
				}

				this.clave=newclave;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setconfirmar_clave(String newconfirmar_clave)throws Exception
	{
		try {
			if(this.confirmar_clave!=newconfirmar_clave) {
				if(newconfirmar_clave==null) {
					//newconfirmar_clave="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Usuario:Valor nulo no permitido en columna confirmar_clave");
					}
				}

				if(newconfirmar_clave!=null&&newconfirmar_clave.length()>500) {
					newconfirmar_clave=newconfirmar_clave.substring(0,498);
					System.out.println("Usuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=500 en columna confirmar_clave");
				}

				this.confirmar_clave=newconfirmar_clave;
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
						System.out.println("Usuario:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>100) {
					newnombre=newnombre.substring(0,98);
					System.out.println("Usuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcodigo_alterno(String newcodigo_alterno)throws Exception
	{
		try {
			if(this.codigo_alterno!=newcodigo_alterno) {
				if(newcodigo_alterno==null) {
					//newcodigo_alterno="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Usuario:Valor nulo no permitido en columna codigo_alterno");
					}
				}

				if(newcodigo_alterno!=null&&newcodigo_alterno.length()>50) {
					newcodigo_alterno=newcodigo_alterno.substring(0,48);
					System.out.println("Usuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo_alterno");
				}

				this.codigo_alterno=newcodigo_alterno;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settipo(Boolean newtipo)throws Exception
	{
		try {
			if(this.tipo!=newtipo) {
				if(newtipo==null) {
					//newtipo=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Usuario:Valor nulo no permitido en columna tipo");
					}
				}

				this.tipo=newtipo;
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
						System.out.println("Usuario:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<HistorialCambioClave> getHistorialCambioClaves() {
		return this.historialcambioclaves;
	}

	public List<ResumenUsuario> getResumenUsuarios() {
		return this.resumenusuarios;
	}

	public List<Auditoria> getAuditorias() {
		return this.auditorias;
	}

	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return this.parametrogeneralusuario;
	}

	public List<PerfilUsuario> getPerfilUsuarios() {
		return this.perfilusuarios;
	}

	public DatoGeneralUsuario getDatoGeneralUsuario() {
		return this.datogeneralusuario;
	}

	
	
	public  void  setHistorialCambioClaves(List<HistorialCambioClave> historialcambioclaves) {
		try {
			this.historialcambioclaves=historialcambioclaves;
		} catch(Exception e) {
			;
		}
	}

	public  void  setResumenUsuarios(List<ResumenUsuario> resumenusuarios) {
		try {
			this.resumenusuarios=resumenusuarios;
		} catch(Exception e) {
			;
		}
	}

	public  void  setAuditorias(List<Auditoria> auditorias) {
		try {
			this.auditorias=auditorias;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPerfils(List<Perfil> perfils) {
		try {
			this.perfils=perfils;
		} catch(Exception e) {
			;
		}
	}

	public  void  setParametroGeneralUsuario(ParametroGeneralUsuario parametrogeneralusuario) {
	try {
			this.parametrogeneralusuario=parametrogeneralusuario;
		} catch(Exception e) {
			;
		}
	}

	public  void  setPerfilUsuarios(List<PerfilUsuario> perfilusuarios) {
		try {
			this.perfilusuarios=perfilusuarios;
		} catch(Exception e) {
			;
		}
	}

	public  void  setDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario) {
	try {
			this.datogeneralusuario=datogeneralusuario;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String tipo_descripcion="";
	String estado_descripcion="";
	
	
	
	public String gettipo_descripcion() {
		return tipo_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void settipo_descripcion(String newtipo_descripcion)throws Exception {
		try {
			this.tipo_descripcion=newtipo_descripcion;
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
		
		this.tipo_descripcion="";
		this.estado_descripcion="";
	}
	
	
	Object historialcambioclavesDescripcionReporte;
	Object resumenusuariosDescripcionReporte;
	Object auditoriasDescripcionReporte;
	Object perfilsDescripcionReporte;
	Object ParametroGeneralUsuarioDescripcionReporte;
	Object perfilusuariosDescripcionReporte;
	Object DatoGeneralUsuarioDescripcionReporte;
	
	
	public Object gethistorialcambioclavesDescripcionReporte() {
		return historialcambioclavesDescripcionReporte;
	}

	public Object getresumenusuariosDescripcionReporte() {
		return resumenusuariosDescripcionReporte;
	}

	public Object getauditoriasDescripcionReporte() {
		return auditoriasDescripcionReporte;
	}

	public Object getperfilsDescripcionReporte() {
		return perfilsDescripcionReporte;
	}

	public Object getParametroGeneralUsuarioDescripcionReporte()
	{
		return ParametroGeneralUsuarioDescripcionReporte;
	}

	public Object getperfilusuariosDescripcionReporte() {
		return perfilusuariosDescripcionReporte;
	}

	public Object getDatoGeneralUsuarioDescripcionReporte()
	{
		return DatoGeneralUsuarioDescripcionReporte;
	}

	
	
	public  void  sethistorialcambioclavesDescripcionReporte(Object historialcambioclaves) {
		try {
			this.historialcambioclavesDescripcionReporte=historialcambioclaves;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setresumenusuariosDescripcionReporte(Object resumenusuarios) {
		try {
			this.resumenusuariosDescripcionReporte=resumenusuarios;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setauditoriasDescripcionReporte(Object auditorias) {
		try {
			this.auditoriasDescripcionReporte=auditorias;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilsDescripcionReporte(Object perfils) {
		try {
			this.perfilsDescripcionReporte=perfils;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setParametroGeneralUsuarioDescripcionReporte(Object parametrogeneralusuario) {
	try {
			this.ParametroGeneralUsuarioDescripcionReporte=parametrogeneralusuario;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilusuariosDescripcionReporte(Object perfilusuarios) {
		try {
			this.perfilusuariosDescripcionReporte=perfilusuarios;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setDatoGeneralUsuarioDescripcionReporte(Object datogeneralusuario) {
	try {
			this.DatoGeneralUsuarioDescripcionReporte=datogeneralusuario;
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

	public Map<String, Object> getMap_Usuario() {
		return map_Usuario;
	}

	public void setMap_Usuario(Map<String, Object> map_Usuario) {
		this.map_Usuario = map_Usuario;
	}

	public void setMapValue_Usuario(String sKey,Object oValue) {
		this.map_Usuario.put(sKey, oValue);
	}
	
	public Object getMapValue_Usuario(String sKey) {
		return this.map_Usuario.get(sKey);
	}
}

