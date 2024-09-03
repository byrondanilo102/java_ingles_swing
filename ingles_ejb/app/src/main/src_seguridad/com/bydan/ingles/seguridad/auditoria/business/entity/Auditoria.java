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
package com.bydan.ingles.seguridad.auditoria.business.entity;

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


import java.sql.Timestamp;



import com.bydan.framework.ingles.business.entity.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.data.ConstantesSql;
//import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.ConstantesValidacion;
//import com.bydan.ingles.seguridad.util.AuditoriaConstantesFunciones;
import com.bydan.ingles.seguridad.auditoria.util.*;

//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;

//REL

import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;







@SuppressWarnings("unused")
public class Auditoria extends GeneralEntity implements Serializable ,Cloneable {//AuditoriaAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Auditoria auditoriaOriginal;
	
	private Map<String, Object> map_Auditoria;
	
	public void inicializarMap_Auditoria() {
		this.map_Auditoria = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_usuario;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_NOMBRE_TABLA,message=Auditoria_util.S_MENSAJE_REGEX_NOMBRE_TABLA)
	private String nombre_tabla;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	private Long id_fila;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_ACCION,message=Auditoria_util.S_MENSAJE_REGEX_ACCION)
	private String accion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_PROCESO,message=Auditoria_util.S_MENSAJE_REGEX_PROCESO)
	private String proceso;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_NOMBRE_PC,message=Auditoria_util.S_MENSAJE_REGEX_NOMBRE_PC)
	private String nombre_pc;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=20,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_IP_PC,message=Auditoria_util.S_MENSAJE_REGEX_IP_PC)
	private String ip_pc;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_USUARIO_PC,message=Auditoria_util.S_MENSAJE_REGEX_USUARIO_PC)
	private String usuario_pc;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Timestamp fecha_hora;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=Auditoria_util.S_REGEX_OBSERVACION,message=Auditoria_util.S_MENSAJE_REGEX_OBSERVACION)
	private String observacion;
			
	
	public Usuario usuario;
	
	
	private String usuario_descripcion;
	
	
	public List<AuditoriaDetalle> auditoriadetalles;
		
	public Auditoria () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.auditoriaOriginal=this;
		
 		this.id_usuario=-1L;
 		this.nombre_tabla="";
 		this.id_fila=0L;
 		this.accion="";
 		this.proceso="";
 		this.nombre_pc="";
 		this.ip_pc="";
 		this.usuario_pc="";
 		this.fecha_hora=new Timestamp((new Date()).getTime());
 		this.observacion="";
		
		
		this.usuario=null;
		
		
		this.usuario_descripcion="";
		
		
		this.auditoriadetalles=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Auditoria (Long id,Date versionRow,Long id_usuario,String nombre_tabla,Long id_fila,String accion,String proceso,String nombre_pc,String ip_pc,String usuario_pc,Timestamp fecha_hora,String observacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.auditoriaOriginal=this;
		
 		this.id_usuario=id_usuario;
 		this.nombre_tabla=nombre_tabla;
 		this.id_fila=id_fila;
 		this.accion=accion;
 		this.proceso=proceso;
 		this.nombre_pc=nombre_pc;
 		this.ip_pc=ip_pc;
 		this.usuario_pc=usuario_pc;
 		this.fecha_hora=fecha_hora;
 		this.observacion=observacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Auditoria (Long id_usuario,String nombre_tabla,Long id_fila,String accion,String proceso,String nombre_pc,String ip_pc,String usuario_pc,Timestamp fecha_hora,String observacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.auditoriaOriginal=this;
		
 		this.id_usuario=id_usuario;
 		this.nombre_tabla=nombre_tabla;
 		this.id_fila=id_fila;
 		this.accion=accion;
 		this.proceso=proceso;
 		this.nombre_pc=nombre_pc;
 		this.ip_pc=ip_pc;
 		this.usuario_pc=usuario_pc;
 		this.fecha_hora=fecha_hora;
 		this.observacion=observacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Auditoria auditoriaLocal=null;
		
		if(object!=null) {
			auditoriaLocal=(Auditoria)object;
			
			if(auditoriaLocal!=null) {
				if(this.getId()!=null && auditoriaLocal.getId()!=null) {
					if(this.getId().equals(auditoriaLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Auditoria_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Auditoria_util.getAuditoriaDescripcion(this);
		} else {
			sDetalle=Auditoria_util.getAuditoriaDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Auditoria getAuditoriaOriginal() {
		return this.auditoriaOriginal;
	}
	
	public void setAuditoriaOriginal(Auditoria auditoria) {
		try {
			this.auditoriaOriginal=auditoria;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	
	public String getnombre_tabla() {
		return this.nombre_tabla;
	}
    
	
	public Long getid_fila() {
		return this.id_fila;
	}
    
	
	public String getaccion() {
		return this.accion;
	}
    
	
	public String getproceso() {
		return this.proceso;
	}
    
	
	public String getnombre_pc() {
		return this.nombre_pc;
	}
    
	
	public String getip_pc() {
		return this.ip_pc;
	}
    
	
	public String getusuario_pc() {
		return this.usuario_pc;
	}
    
	
	public Timestamp getfecha_hora() {
		return this.fecha_hora;
	}
    
	
	public String getobservacion() {
		return this.observacion;
	}
	
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_tabla(String newnombre_tabla)throws Exception
	{
		try {
			if(this.nombre_tabla!=newnombre_tabla) {
				if(newnombre_tabla==null) {
					//newnombre_tabla="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_tabla");
					}
				}

				if(newnombre_tabla!=null&&newnombre_tabla.length()>150) {
					newnombre_tabla=newnombre_tabla.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_tabla");
				}

				this.nombre_tabla=newnombre_tabla;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_fila(Long newid_fila)throws Exception
	{
		try {
			if(this.id_fila!=newid_fila) {
				if(newid_fila==null) {
					//newid_fila=0L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id_fila");
					}
				}

				this.id_fila=newid_fila;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setaccion(String newaccion)throws Exception
	{
		try {
			if(this.accion.trim()!=newaccion) {
				if(newaccion==null) {
					//newaccion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna accion");
					}
				}

				if(newaccion!=null&&newaccion.length()>15) {
					newaccion=newaccion.substring(0,13);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna accion");
				}

				this.accion=newaccion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setproceso(String newproceso)throws Exception
	{
		try {
			if(this.proceso!=newproceso) {
				if(newproceso==null) {
					//newproceso="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna proceso");
					}
				}

				if(newproceso!=null&&newproceso.length()>150) {
					newproceso=newproceso.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna proceso");
				}

				this.proceso=newproceso;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_pc(String newnombre_pc)throws Exception
	{
		try {
			if(this.nombre_pc!=newnombre_pc) {
				if(newnombre_pc==null) {
					//newnombre_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_pc");
					}
				}

				if(newnombre_pc!=null&&newnombre_pc.length()>50) {
					newnombre_pc=newnombre_pc.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre_pc");
				}

				this.nombre_pc=newnombre_pc;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setip_pc(String newip_pc)throws Exception
	{
		try {
			if(this.ip_pc.trim()!=newip_pc) {
				if(newip_pc==null) {
					//newip_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna ip_pc");
					}
				}

				if(newip_pc!=null&&newip_pc.length()>20) {
					newip_pc=newip_pc.substring(0,18);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ip_pc");
				}

				this.ip_pc=newip_pc;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setusuario_pc(String newusuario_pc)throws Exception
	{
		try {
			if(this.usuario_pc!=newusuario_pc) {
				if(newusuario_pc==null) {
					//newusuario_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna usuario_pc");
					}
				}

				if(newusuario_pc!=null&&newusuario_pc.length()>50) {
					newusuario_pc=newusuario_pc.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna usuario_pc");
				}

				this.usuario_pc=newusuario_pc;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_hora(Timestamp newfecha_hora)throws Exception
	{
		try {
			if(this.fecha_hora!=newfecha_hora) {
				if(newfecha_hora==null) {
					//newfecha_hora=new Timestamp((new Date()).getTime());
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna fecha_hora");
					}
				}

				this.fecha_hora=newfecha_hora;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setobservacion(String newobservacion)throws Exception
	{
		try {
			if(this.observacion!=newobservacion) {
				if(newobservacion==null) {
					//newobservacion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna observacion");
					}
				}

				if(newobservacion!=null&&newobservacion.length()>200) {
					newobservacion=newobservacion.substring(0,198);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna observacion");
				}

				this.observacion=newobservacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Usuario getUsuario() {
		return this.usuario;
	}

	
	
	public String getusuario_descripcion() {
		return this.usuario_descripcion;
	}

	
	
	public  void  setUsuario(Usuario usuario) {
		try {
			this.usuario=usuario;
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


	
	
	public List<AuditoriaDetalle> getAuditoriaDetalles() {
		return this.auditoriadetalles;
	}

	
	
	public  void  setAuditoriaDetalles(List<AuditoriaDetalle> auditoriadetalles) {
		try {
			this.auditoriadetalles=auditoriadetalles;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_usuario_descripcion="";
	
	
	
	public String getid_usuario_descripcion() {
		return id_usuario_descripcion;
	}
	
	
	public void setid_usuario_descripcion(String newid_usuario_descripcion)throws Exception {
		try {
			this.id_usuario_descripcion=newid_usuario_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_usuario_descripcion="";
	}
	
	
	Object auditoriadetallesDescripcionReporte;
	
	
	public Object getauditoriadetallesDescripcionReporte() {
		return auditoriadetallesDescripcionReporte;
	}

	
	
	public  void  setauditoriadetallesDescripcionReporte(Object auditoriadetalles) {
		try {
			this.auditoriadetallesDescripcionReporte=auditoriadetalles;
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

	public Map<String, Object> getMap_Auditoria() {
		return map_Auditoria;
	}

	public void setMap_Auditoria(Map<String, Object> map_Auditoria) {
		this.map_Auditoria = map_Auditoria;
	}

	public void setMapValue_Auditoria(String sKey,Object oValue) {
		this.map_Auditoria.put(sKey, oValue);
	}
	
	public Object getMapValue_Auditoria(String sKey) {
		return this.map_Auditoria.get(sKey);
	}
}

