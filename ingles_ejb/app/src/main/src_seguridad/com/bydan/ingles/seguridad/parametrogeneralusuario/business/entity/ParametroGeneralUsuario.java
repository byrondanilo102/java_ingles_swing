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
package com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity;

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
//import com.bydan.ingles.seguridad.util.ParametroGeneralUsuarioConstantesFunciones;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.*;

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;

//REL








@SuppressWarnings("unused")
public class ParametroGeneralUsuario extends GeneralEntitySinIdGenerated implements Serializable ,Cloneable {//ParametroGeneralUsuarioAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected Long idOriginal;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient ParametroGeneralUsuario parametrogeneralusuarioOriginal;
	
	private Map<String, Object> map_ParametroGeneralUsuario;
	
	public void inicializarMap_ParametroGeneralUsuario() {
		this.map_ParametroGeneralUsuario = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_usuario;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo_fondo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=ParametroGeneralUsuario_util.S_REGEX_PATH_EXPORTAR,message=ParametroGeneralUsuario_util.S_MENSAJE_REGEX_PATH_EXPORTAR)
	private String path_exportar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_exportar_cabecera;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_exportar_campo_version;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_botones_tool_bar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_cargar_por_parte;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_guardar_relaciones;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_mostrar_acciones_campo_general;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_mensaje_confirmacion;
			
	
	public Usuario usuario;
	public TipoFondo tipofondo;
	
	
	private String usuario_descripcion;
	private String tipofondo_descripcion;
	
	
		
	public ParametroGeneralUsuario () throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.parametrogeneralusuarioOriginal=this;
		
 		this.id_tipo_fondo=-1L;
 		this.path_exportar="";
 		this.con_exportar_cabecera=false;
 		this.con_exportar_campo_version=false;
 		this.con_botones_tool_bar=false;
 		this.con_cargar_por_parte=false;
 		this.con_guardar_relaciones=false;
 		this.con_mostrar_acciones_campo_general=false;
 		this.con_mensaje_confirmacion=false;
		
		
		this.usuario=null;
		this.tipofondo=null;
		
		
		this.usuario_descripcion="";
		this.tipofondo_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public ParametroGeneralUsuario (Long id,Date versionRow,Long id_tipo_fondo,String path_exportar,Boolean con_exportar_cabecera,Boolean con_exportar_campo_version,Boolean con_botones_tool_bar,Boolean con_cargar_por_parte,Boolean con_guardar_relaciones,Boolean con_mostrar_acciones_campo_general,Boolean con_mensaje_confirmacion) throws Exception {
		super();		
		
		this.id=id;
		this.idOriginal=this.id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.parametrogeneralusuarioOriginal=this;
		
 		this.id_tipo_fondo=id_tipo_fondo;
 		this.path_exportar=path_exportar;
 		this.con_exportar_cabecera=con_exportar_cabecera;
 		this.con_exportar_campo_version=con_exportar_campo_version;
 		this.con_botones_tool_bar=con_botones_tool_bar;
 		this.con_cargar_por_parte=con_cargar_por_parte;
 		this.con_guardar_relaciones=con_guardar_relaciones;
 		this.con_mostrar_acciones_campo_general=con_mostrar_acciones_campo_general;
 		this.con_mensaje_confirmacion=con_mensaje_confirmacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public ParametroGeneralUsuario (Long id_tipo_fondo,String path_exportar,Boolean con_exportar_cabecera,Boolean con_exportar_campo_version,Boolean con_botones_tool_bar,Boolean con_cargar_por_parte,Boolean con_guardar_relaciones,Boolean con_mostrar_acciones_campo_general,Boolean con_mensaje_confirmacion) throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.parametrogeneralusuarioOriginal=this;
		
 		
 		this.id_tipo_fondo=id_tipo_fondo;
 		this.path_exportar=path_exportar;
 		this.con_exportar_cabecera=con_exportar_cabecera;
 		this.con_exportar_campo_version=con_exportar_campo_version;
 		this.con_botones_tool_bar=con_botones_tool_bar;
 		this.con_cargar_por_parte=con_cargar_por_parte;
 		this.con_guardar_relaciones=con_guardar_relaciones;
 		this.con_mostrar_acciones_campo_general=con_mostrar_acciones_campo_general;
 		this.con_mensaje_confirmacion=con_mensaje_confirmacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		ParametroGeneralUsuario parametrogeneralusuarioLocal=null;
		
		if(object!=null) {
			parametrogeneralusuarioLocal=(ParametroGeneralUsuario)object;
			
			if(parametrogeneralusuarioLocal!=null) {
				if(this.getId()!=null && parametrogeneralusuarioLocal.getId()!=null) {
					if(this.getId().equals(parametrogeneralusuarioLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!ParametroGeneralUsuario_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=ParametroGeneralUsuario_util.getParametroGeneralUsuarioDescripcion(this);
		} else {
			sDetalle=ParametroGeneralUsuario_util.getParametroGeneralUsuarioDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public ParametroGeneralUsuario getParametroGeneralUsuarioOriginal() {
		return this.parametrogeneralusuarioOriginal;
	}
	
	public void setParametroGeneralUsuarioOriginal(ParametroGeneralUsuario parametrogeneralusuario) {
		try {
			this.parametrogeneralusuarioOriginal=parametrogeneralusuario;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_usuario() {
		this.id_usuario=this.id;

		return this.id_usuario;
	}
    
	
	public Long getid_tipo_fondo() {
		return this.id_tipo_fondo;
	}
    
	
	public String getpath_exportar() {
		return this.path_exportar;
	}
    
	
	public Boolean getcon_exportar_cabecera() {
		return this.con_exportar_cabecera;
	}
    
	
	public Boolean getcon_exportar_campo_version() {
		return this.con_exportar_campo_version;
	}
    
	
	public Boolean getcon_botones_tool_bar() {
		return this.con_botones_tool_bar;
	}
    
	
	public Boolean getcon_cargar_por_parte() {
		return this.con_cargar_por_parte;
	}
    
	
	public Boolean getcon_guardar_relaciones() {
		return this.con_guardar_relaciones;
	}
    
	
	public Boolean getcon_mostrar_acciones_campo_general() {
		return this.con_mostrar_acciones_campo_general;
	}
    
	
	public Boolean getcon_mensaje_confirmacion() {
		return this.con_mensaje_confirmacion;
	}
	
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=null && this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
				this.setIsChanged(true);
			} else if(this.id_usuario==null && newid_usuario!=null) {
				this.id_usuario=newid_usuario;
				this.id=newid_usuario;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_fondo(Long newid_tipo_fondo)throws Exception
	{
		try {
			if(this.id_tipo_fondo!=newid_tipo_fondo) {
				if(newid_tipo_fondo==null) {
					//newid_tipo_fondo=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna id_tipo_fondo");
					}
				}

				this.id_tipo_fondo=newid_tipo_fondo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpath_exportar(String newpath_exportar)throws Exception
	{
		try {
			if(this.path_exportar!=newpath_exportar) {
				if(newpath_exportar==null) {
					//newpath_exportar="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna path_exportar");
					}
				}

				if(newpath_exportar!=null&&newpath_exportar.length()>100) {
					newpath_exportar=newpath_exportar.substring(0,98);
					System.out.println("ParametroGeneralUsuario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna path_exportar");
				}

				this.path_exportar=newpath_exportar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_exportar_cabecera(Boolean newcon_exportar_cabecera)throws Exception
	{
		try {
			if(this.con_exportar_cabecera!=newcon_exportar_cabecera) {
				if(newcon_exportar_cabecera==null) {
					//newcon_exportar_cabecera=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_exportar_cabecera");
					}
				}

				this.con_exportar_cabecera=newcon_exportar_cabecera;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_exportar_campo_version(Boolean newcon_exportar_campo_version)throws Exception
	{
		try {
			if(this.con_exportar_campo_version!=newcon_exportar_campo_version) {
				if(newcon_exportar_campo_version==null) {
					//newcon_exportar_campo_version=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_exportar_campo_version");
					}
				}

				this.con_exportar_campo_version=newcon_exportar_campo_version;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_botones_tool_bar(Boolean newcon_botones_tool_bar)throws Exception
	{
		try {
			if(this.con_botones_tool_bar!=newcon_botones_tool_bar) {
				if(newcon_botones_tool_bar==null) {
					//newcon_botones_tool_bar=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_botones_tool_bar");
					}
				}

				this.con_botones_tool_bar=newcon_botones_tool_bar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_cargar_por_parte(Boolean newcon_cargar_por_parte)throws Exception
	{
		try {
			if(this.con_cargar_por_parte!=newcon_cargar_por_parte) {
				if(newcon_cargar_por_parte==null) {
					//newcon_cargar_por_parte=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_cargar_por_parte");
					}
				}

				this.con_cargar_por_parte=newcon_cargar_por_parte;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_guardar_relaciones(Boolean newcon_guardar_relaciones)throws Exception
	{
		try {
			if(this.con_guardar_relaciones!=newcon_guardar_relaciones) {
				if(newcon_guardar_relaciones==null) {
					//newcon_guardar_relaciones=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_guardar_relaciones");
					}
				}

				this.con_guardar_relaciones=newcon_guardar_relaciones;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_mostrar_acciones_campo_general(Boolean newcon_mostrar_acciones_campo_general)throws Exception
	{
		try {
			if(this.con_mostrar_acciones_campo_general!=newcon_mostrar_acciones_campo_general) {
				if(newcon_mostrar_acciones_campo_general==null) {
					//newcon_mostrar_acciones_campo_general=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_mostrar_acciones_campo_general");
					}
				}

				this.con_mostrar_acciones_campo_general=newcon_mostrar_acciones_campo_general;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_mensaje_confirmacion(Boolean newcon_mensaje_confirmacion)throws Exception
	{
		try {
			if(this.con_mensaje_confirmacion!=newcon_mensaje_confirmacion) {
				if(newcon_mensaje_confirmacion==null) {
					//newcon_mensaje_confirmacion=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("ParametroGeneralUsuario:Valor nulo no permitido en columna con_mensaje_confirmacion");
					}
				}

				this.con_mensaje_confirmacion=newcon_mensaje_confirmacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Usuario getUsuario() {
		return this.usuario;
	}

	public TipoFondo getTipoFondo() {
		return this.tipofondo;
	}

	
	
	public String getusuario_descripcion() {
		return this.usuario_descripcion;
	}

	public String gettipofondo_descripcion() {
		return this.tipofondo_descripcion;
	}

	
	
	public  void  setUsuario(Usuario usuario) {
		try {
			this.usuario=usuario;
		} catch(Exception e) {
			;
		}
	}


	public  void  setTipoFondo(TipoFondo tipofondo) {
		try {
			this.tipofondo=tipofondo;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setusuario_descripcion(String usuario_descripcion) {
		try {
			this.usuario_descripcion=usuario_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  settipofondo_descripcion(String tipofondo_descripcion) {
		try {
			this.tipofondo_descripcion=tipofondo_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_usuario_descripcion="";
	String id_tipo_fondo_descripcion="";
	String con_exportar_cabecera_descripcion="";
	String con_exportar_campo_version_descripcion="";
	String con_botones_tool_bar_descripcion="";
	String con_cargar_por_parte_descripcion="";
	String con_guardar_relaciones_descripcion="";
	String con_mostrar_acciones_campo_general_descripcion="";
	String con_mensaje_confirmacion_descripcion="";
	
	
	
	public String getid_usuario_descripcion() {
		return id_usuario_descripcion;
	}
	public String getid_tipo_fondo_descripcion() {
		return id_tipo_fondo_descripcion;
	}
	public String getcon_exportar_cabecera_descripcion() {
		return con_exportar_cabecera_descripcion;
	}
	public String getcon_exportar_campo_version_descripcion() {
		return con_exportar_campo_version_descripcion;
	}
	public String getcon_botones_tool_bar_descripcion() {
		return con_botones_tool_bar_descripcion;
	}
	public String getcon_cargar_por_parte_descripcion() {
		return con_cargar_por_parte_descripcion;
	}
	public String getcon_guardar_relaciones_descripcion() {
		return con_guardar_relaciones_descripcion;
	}
	public String getcon_mostrar_acciones_campo_general_descripcion() {
		return con_mostrar_acciones_campo_general_descripcion;
	}
	public String getcon_mensaje_confirmacion_descripcion() {
		return con_mensaje_confirmacion_descripcion;
	}
	
	
	public void setid_usuario_descripcion(String newid_usuario_descripcion)throws Exception {
		try {
			this.id_usuario_descripcion=newid_usuario_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_tipo_fondo_descripcion(String newid_tipo_fondo_descripcion)throws Exception {
		try {
			this.id_tipo_fondo_descripcion=newid_tipo_fondo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_exportar_cabecera_descripcion(String newcon_exportar_cabecera_descripcion)throws Exception {
		try {
			this.con_exportar_cabecera_descripcion=newcon_exportar_cabecera_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_exportar_campo_version_descripcion(String newcon_exportar_campo_version_descripcion)throws Exception {
		try {
			this.con_exportar_campo_version_descripcion=newcon_exportar_campo_version_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_botones_tool_bar_descripcion(String newcon_botones_tool_bar_descripcion)throws Exception {
		try {
			this.con_botones_tool_bar_descripcion=newcon_botones_tool_bar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_cargar_por_parte_descripcion(String newcon_cargar_por_parte_descripcion)throws Exception {
		try {
			this.con_cargar_por_parte_descripcion=newcon_cargar_por_parte_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_guardar_relaciones_descripcion(String newcon_guardar_relaciones_descripcion)throws Exception {
		try {
			this.con_guardar_relaciones_descripcion=newcon_guardar_relaciones_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_mostrar_acciones_campo_general_descripcion(String newcon_mostrar_acciones_campo_general_descripcion)throws Exception {
		try {
			this.con_mostrar_acciones_campo_general_descripcion=newcon_mostrar_acciones_campo_general_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_mensaje_confirmacion_descripcion(String newcon_mensaje_confirmacion_descripcion)throws Exception {
		try {
			this.con_mensaje_confirmacion_descripcion=newcon_mensaje_confirmacion_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_tipo_fondo_descripcion="";
		this.con_exportar_cabecera_descripcion="";
		this.con_exportar_campo_version_descripcion="";
		this.con_botones_tool_bar_descripcion="";
		this.con_cargar_por_parte_descripcion="";
		this.con_guardar_relaciones_descripcion="";
		this.con_mostrar_acciones_campo_general_descripcion="";
		this.con_mensaje_confirmacion_descripcion="";
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
	
	public Long getIdOriginal() {
		return this.idOriginal;
	}
	
	public void setIdOriginal(Long newIdOriginal) {		
		this.idOriginal=newIdOriginal;
		super.setIdOriginal(newIdOriginal);
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

	public Map<String, Object> getMap_ParametroGeneralUsuario() {
		return map_ParametroGeneralUsuario;
	}

	public void setMap_ParametroGeneralUsuario(Map<String, Object> map_ParametroGeneralUsuario) {
		this.map_ParametroGeneralUsuario = map_ParametroGeneralUsuario;
	}

	public void setMapValue_ParametroGeneralUsuario(String sKey,Object oValue) {
		this.map_ParametroGeneralUsuario.put(sKey, oValue);
	}
	
	public Object getMapValue_ParametroGeneralUsuario(String sKey) {
		return this.map_ParametroGeneralUsuario.get(sKey);
	}
}

