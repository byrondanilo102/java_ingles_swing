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
package com.bydan.ingles.seguridad.perfilopcion.business.entity;

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
//import com.bydan.ingles.seguridad.util.PerfilOpcionConstantesFunciones;
import com.bydan.ingles.seguridad.perfilopcion.util.*;

//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;

//REL








@SuppressWarnings("unused")
public class PerfilOpcion extends GeneralEntity implements Serializable ,Cloneable {//PerfilOpcionAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient PerfilOpcion perfilopcionOriginal;
	
	private Map<String, Object> map_PerfilOpcion;
	
	public void inicializarMap_PerfilOpcion() {
		this.map_PerfilOpcion = new HashMap<String,Object>();
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
	private Long id_opcion;
	
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
	private Boolean guardar_cambios;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean consulta;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean busqueda;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean reporte;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean orden;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean paginacion_medio;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean paginacion_alto;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean paginacion_todo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean duplicar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean copiar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean con_precargar;
			
	
	public Perfil perfil;
	public Opcion opcion;
	
	
	private String perfil_descripcion;
	private String opcion_descripcion;
	
	
		
	public PerfilOpcion () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.perfilopcionOriginal=this;
		
 		this.id_perfil=-1L;
 		this.id_opcion=-1L;
 		this.todo=false;
 		this.ingreso=false;
 		this.modificacion=false;
 		this.eliminacion=false;
 		this.guardar_cambios=false;
 		this.consulta=false;
 		this.busqueda=false;
 		this.reporte=false;
 		this.estado=false;
 		this.orden=false;
 		this.paginacion_medio=false;
 		this.paginacion_alto=false;
 		this.paginacion_todo=false;
 		this.duplicar=false;
 		this.copiar=false;
 		this.con_precargar=false;
		
		
		this.perfil=null;
		this.opcion=null;
		
		
		this.perfil_descripcion="";
		this.opcion_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PerfilOpcion (Long id,Date versionRow,Long id_perfil,Long id_opcion,Boolean todo,Boolean ingreso,Boolean modificacion,Boolean eliminacion,Boolean guardar_cambios,Boolean consulta,Boolean busqueda,Boolean reporte,Boolean estado,Boolean orden,Boolean paginacion_medio,Boolean paginacion_alto,Boolean paginacion_todo,Boolean duplicar,Boolean copiar,Boolean con_precargar) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilopcionOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_opcion=id_opcion;
 		this.todo=todo;
 		this.ingreso=ingreso;
 		this.modificacion=modificacion;
 		this.eliminacion=eliminacion;
 		this.guardar_cambios=guardar_cambios;
 		this.consulta=consulta;
 		this.busqueda=busqueda;
 		this.reporte=reporte;
 		this.estado=estado;
 		this.orden=orden;
 		this.paginacion_medio=paginacion_medio;
 		this.paginacion_alto=paginacion_alto;
 		this.paginacion_todo=paginacion_todo;
 		this.duplicar=duplicar;
 		this.copiar=copiar;
 		this.con_precargar=con_precargar;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public PerfilOpcion (Long id_perfil,Long id_opcion,Boolean todo,Boolean ingreso,Boolean modificacion,Boolean eliminacion,Boolean guardar_cambios,Boolean consulta,Boolean busqueda,Boolean reporte,Boolean estado,Boolean orden,Boolean paginacion_medio,Boolean paginacion_alto,Boolean paginacion_todo,Boolean duplicar,Boolean copiar,Boolean con_precargar) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilopcionOriginal=this;
		
 		this.id_perfil=id_perfil;
 		this.id_opcion=id_opcion;
 		this.todo=todo;
 		this.ingreso=ingreso;
 		this.modificacion=modificacion;
 		this.eliminacion=eliminacion;
 		this.guardar_cambios=guardar_cambios;
 		this.consulta=consulta;
 		this.busqueda=busqueda;
 		this.reporte=reporte;
 		this.estado=estado;
 		this.orden=orden;
 		this.paginacion_medio=paginacion_medio;
 		this.paginacion_alto=paginacion_alto;
 		this.paginacion_todo=paginacion_todo;
 		this.duplicar=duplicar;
 		this.copiar=copiar;
 		this.con_precargar=con_precargar;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		PerfilOpcion perfilopcionLocal=null;
		
		if(object!=null) {
			perfilopcionLocal=(PerfilOpcion)object;
			
			if(perfilopcionLocal!=null) {
				if(this.getId()!=null && perfilopcionLocal.getId()!=null) {
					if(this.getId().equals(perfilopcionLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PerfilOpcion_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PerfilOpcion_util.getPerfilOpcionDescripcion(this);
		} else {
			sDetalle=PerfilOpcion_util.getPerfilOpcionDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PerfilOpcion getPerfilOpcionOriginal() {
		return this.perfilopcionOriginal;
	}
	
	public void setPerfilOpcionOriginal(PerfilOpcion perfilopcion) {
		try {
			this.perfilopcionOriginal=perfilopcion;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_perfil() {
		return this.id_perfil;
	}
    
	
	public Long getid_opcion() {
		return this.id_opcion;
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
    
	
	public Boolean getguardar_cambios() {
		return this.guardar_cambios;
	}
    
	
	public Boolean getconsulta() {
		return this.consulta;
	}
    
	
	public Boolean getbusqueda() {
		return this.busqueda;
	}
    
	
	public Boolean getreporte() {
		return this.reporte;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
    
	
	public Boolean getorden() {
		return this.orden;
	}
    
	
	public Boolean getpaginacion_medio() {
		return this.paginacion_medio;
	}
    
	
	public Boolean getpaginacion_alto() {
		return this.paginacion_alto;
	}
    
	
	public Boolean getpaginacion_todo() {
		return this.paginacion_todo;
	}
    
	
	public Boolean getduplicar() {
		return this.duplicar;
	}
    
	
	public Boolean getcopiar() {
		return this.copiar;
	}
    
	
	public Boolean getcon_precargar() {
		return this.con_precargar;
	}
	
    
	public void setid_perfil(Long newid_perfil)throws Exception
	{
		try {
			if(this.id_perfil!=newid_perfil) {
				if(newid_perfil==null) {
					//newid_perfil=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna id_perfil");
					}
				}

				this.id_perfil=newid_perfil;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_opcion(Long newid_opcion)throws Exception
	{
		try {
			if(this.id_opcion!=newid_opcion) {
				if(newid_opcion==null) {
					//newid_opcion=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna id_opcion");
					}
				}

				this.id_opcion=newid_opcion;
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna todo");
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna ingreso");
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna modificacion");
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna eliminacion");
					}
				}

				this.eliminacion=neweliminacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setguardar_cambios(Boolean newguardar_cambios)throws Exception
	{
		try {
			if(this.guardar_cambios!=newguardar_cambios) {
				if(newguardar_cambios==null) {
					//newguardar_cambios=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna guardar_cambios");
					}
				}

				this.guardar_cambios=newguardar_cambios;
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna consulta");
					}
				}

				this.consulta=newconsulta;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setbusqueda(Boolean newbusqueda)throws Exception
	{
		try {
			if(this.busqueda!=newbusqueda) {
				if(newbusqueda==null) {
					//newbusqueda=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna busqueda");
					}
				}

				this.busqueda=newbusqueda;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setreporte(Boolean newreporte)throws Exception
	{
		try {
			if(this.reporte!=newreporte) {
				if(newreporte==null) {
					//newreporte=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna reporte");
					}
				}

				this.reporte=newreporte;
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
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setorden(Boolean neworden)throws Exception
	{
		try {
			if(this.orden!=neworden) {
				if(neworden==null) {
					//neworden=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna orden");
					}
				}

				this.orden=neworden;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpaginacion_medio(Boolean newpaginacion_medio)throws Exception
	{
		try {
			if(this.paginacion_medio!=newpaginacion_medio) {
				if(newpaginacion_medio==null) {
					//newpaginacion_medio=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna paginacion_medio");
					}
				}

				this.paginacion_medio=newpaginacion_medio;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpaginacion_alto(Boolean newpaginacion_alto)throws Exception
	{
		try {
			if(this.paginacion_alto!=newpaginacion_alto) {
				if(newpaginacion_alto==null) {
					//newpaginacion_alto=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna paginacion_alto");
					}
				}

				this.paginacion_alto=newpaginacion_alto;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpaginacion_todo(Boolean newpaginacion_todo)throws Exception
	{
		try {
			if(this.paginacion_todo!=newpaginacion_todo) {
				if(newpaginacion_todo==null) {
					//newpaginacion_todo=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna paginacion_todo");
					}
				}

				this.paginacion_todo=newpaginacion_todo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setduplicar(Boolean newduplicar)throws Exception
	{
		try {
			if(this.duplicar!=newduplicar) {
				if(newduplicar==null) {
					//newduplicar=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna duplicar");
					}
				}

				this.duplicar=newduplicar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcopiar(Boolean newcopiar)throws Exception
	{
		try {
			if(this.copiar!=newcopiar) {
				if(newcopiar==null) {
					//newcopiar=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna copiar");
					}
				}

				this.copiar=newcopiar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setcon_precargar(Boolean newcon_precargar)throws Exception
	{
		try {
			if(this.con_precargar!=newcon_precargar) {
				if(newcon_precargar==null) {
					//newcon_precargar=false;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PerfilOpcion:Valor nulo no permitido en columna con_precargar");
					}
				}

				this.con_precargar=newcon_precargar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Perfil getPerfil() {
		return this.perfil;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	
	
	public String getperfil_descripcion() {
		return this.perfil_descripcion;
	}

	public String getopcion_descripcion() {
		return this.opcion_descripcion;
	}

	
	
	public  void  setPerfil(Perfil perfil) {
		try {
			this.perfil=perfil;
		} catch(Exception e) {
			;
		}
	}


	public  void  setOpcion(Opcion opcion) {
		try {
			this.opcion=opcion;
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


	public  void  setopcion_descripcion(String opcion_descripcion) {
		try {
			this.opcion_descripcion=opcion_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_perfil_descripcion="";
	String id_opcion_descripcion="";
	String todo_descripcion="";
	String ingreso_descripcion="";
	String modificacion_descripcion="";
	String eliminacion_descripcion="";
	String guardar_cambios_descripcion="";
	String consulta_descripcion="";
	String busqueda_descripcion="";
	String reporte_descripcion="";
	String estado_descripcion="";
	String orden_descripcion="";
	String paginacion_medio_descripcion="";
	String paginacion_alto_descripcion="";
	String paginacion_todo_descripcion="";
	String duplicar_descripcion="";
	String copiar_descripcion="";
	String con_precargar_descripcion="";
	
	
	
	public String getid_perfil_descripcion() {
		return id_perfil_descripcion;
	}
	public String getid_opcion_descripcion() {
		return id_opcion_descripcion;
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
	public String getguardar_cambios_descripcion() {
		return guardar_cambios_descripcion;
	}
	public String getconsulta_descripcion() {
		return consulta_descripcion;
	}
	public String getbusqueda_descripcion() {
		return busqueda_descripcion;
	}
	public String getreporte_descripcion() {
		return reporte_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	public String getorden_descripcion() {
		return orden_descripcion;
	}
	public String getpaginacion_medio_descripcion() {
		return paginacion_medio_descripcion;
	}
	public String getpaginacion_alto_descripcion() {
		return paginacion_alto_descripcion;
	}
	public String getpaginacion_todo_descripcion() {
		return paginacion_todo_descripcion;
	}
	public String getduplicar_descripcion() {
		return duplicar_descripcion;
	}
	public String getcopiar_descripcion() {
		return copiar_descripcion;
	}
	public String getcon_precargar_descripcion() {
		return con_precargar_descripcion;
	}
	
	
	public void setid_perfil_descripcion(String newid_perfil_descripcion)throws Exception {
		try {
			this.id_perfil_descripcion=newid_perfil_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_opcion_descripcion(String newid_opcion_descripcion)throws Exception {
		try {
			this.id_opcion_descripcion=newid_opcion_descripcion;
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
	public void setguardar_cambios_descripcion(String newguardar_cambios_descripcion)throws Exception {
		try {
			this.guardar_cambios_descripcion=newguardar_cambios_descripcion;
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
	public void setbusqueda_descripcion(String newbusqueda_descripcion)throws Exception {
		try {
			this.busqueda_descripcion=newbusqueda_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setreporte_descripcion(String newreporte_descripcion)throws Exception {
		try {
			this.reporte_descripcion=newreporte_descripcion;
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
	public void setorden_descripcion(String neworden_descripcion)throws Exception {
		try {
			this.orden_descripcion=neworden_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setpaginacion_medio_descripcion(String newpaginacion_medio_descripcion)throws Exception {
		try {
			this.paginacion_medio_descripcion=newpaginacion_medio_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setpaginacion_alto_descripcion(String newpaginacion_alto_descripcion)throws Exception {
		try {
			this.paginacion_alto_descripcion=newpaginacion_alto_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setpaginacion_todo_descripcion(String newpaginacion_todo_descripcion)throws Exception {
		try {
			this.paginacion_todo_descripcion=newpaginacion_todo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setduplicar_descripcion(String newduplicar_descripcion)throws Exception {
		try {
			this.duplicar_descripcion=newduplicar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcopiar_descripcion(String newcopiar_descripcion)throws Exception {
		try {
			this.copiar_descripcion=newcopiar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setcon_precargar_descripcion(String newcon_precargar_descripcion)throws Exception {
		try {
			this.con_precargar_descripcion=newcon_precargar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_perfil_descripcion="";
		this.id_opcion_descripcion="";
		this.todo_descripcion="";
		this.ingreso_descripcion="";
		this.modificacion_descripcion="";
		this.eliminacion_descripcion="";
		this.guardar_cambios_descripcion="";
		this.consulta_descripcion="";
		this.busqueda_descripcion="";
		this.reporte_descripcion="";
		this.estado_descripcion="";
		this.orden_descripcion="";
		this.paginacion_medio_descripcion="";
		this.paginacion_alto_descripcion="";
		this.paginacion_todo_descripcion="";
		this.duplicar_descripcion="";
		this.copiar_descripcion="";
		this.con_precargar_descripcion="";
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

	public Map<String, Object> getMap_PerfilOpcion() {
		return map_PerfilOpcion;
	}

	public void setMap_PerfilOpcion(Map<String, Object> map_PerfilOpcion) {
		this.map_PerfilOpcion = map_PerfilOpcion;
	}

	public void setMapValue_PerfilOpcion(String sKey,Object oValue) {
		this.map_PerfilOpcion.put(sKey, oValue);
	}
	
	public Object getMapValue_PerfilOpcion(String sKey) {
		return this.map_PerfilOpcion.get(sKey);
	}
}

