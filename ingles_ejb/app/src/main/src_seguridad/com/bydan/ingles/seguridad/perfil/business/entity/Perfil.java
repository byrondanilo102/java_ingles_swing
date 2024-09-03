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
package com.bydan.ingles.seguridad.perfil.business.entity;

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
//import com.bydan.ingles.seguridad.util.PerfilConstantesFunciones;
import com.bydan.ingles.seguridad.perfil.util.*;

//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;

//REL

import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;







@SuppressWarnings("unused")
public class Perfil extends GeneralEntity implements Serializable ,Cloneable {//PerfilAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Perfil perfilOriginal;
	
	private Map<String, Object> map_Perfil;
	
	public void inicializarMap_Perfil() {
		this.map_Perfil = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_sistema;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Perfil_util.S_REGEX_CODIGO,message=Perfil_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Perfil_util.S_REGEX_NOMBRE,message=Perfil_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=400,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Perfil_util.S_REGEX_NOMBRE2,message=Perfil_util.S_MENSAJE_REGEX_NOMBRE2)
	private String nombre2;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	private Boolean estado;
			
	
	public Sistema sistema;
	
	
	private String sistema_descripcion;
	
	
	public List<Opcion> opcions;
	public List<Usuario> usuarios;
	public List<PerfilUsuario> perfilusuarios;
	public List<PerfilOpcion> perfilopcions;
		
	public Perfil () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.perfilOriginal=this;
		
 		this.id_sistema=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.nombre2="";
 		this.estado=false;
		
		
		this.sistema=null;
		
		
		this.sistema_descripcion="";
		
		
		this.opcions=null;
		this.usuarios=null;
		this.perfilusuarios=null;
		this.perfilopcions=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Perfil (Long id,Date versionRow,Long id_sistema,String codigo,String nombre,String nombre2,Boolean estado) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.nombre2=nombre2;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Perfil (Long id_sistema,String codigo,String nombre,String nombre2,Boolean estado) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.perfilOriginal=this;
		
 		this.id_sistema=id_sistema;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.nombre2=nombre2;
 		this.estado=estado;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Perfil perfilLocal=null;
		
		if(object!=null) {
			perfilLocal=(Perfil)object;
			
			if(perfilLocal!=null) {
				if(this.getId()!=null && perfilLocal.getId()!=null) {
					if(this.getId().equals(perfilLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Perfil_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Perfil_util.getPerfilDescripcion(this);
		} else {
			sDetalle=Perfil_util.getPerfilDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Perfil getPerfilOriginal() {
		return this.perfilOriginal;
	}
	
	public void setPerfilOriginal(Perfil perfil) {
		try {
			this.perfilOriginal=perfil;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_sistema() {
		return this.id_sistema;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getnombre2() {
		return this.nombre2;
	}
    
	
	public Boolean getestado() {
		return this.estado;
	}
	
    
	public void setid_sistema(Long newid_sistema)throws Exception
	{
		try {
			if(this.id_sistema!=newid_sistema) {
				if(newid_sistema==null) {
					//newid_sistema=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Perfil:Valor nulo no permitido en columna id_sistema");
					}
				}

				this.id_sistema=newid_sistema;
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
						System.out.println("Perfil:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Perfil:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("Perfil:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Perfil:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre2(String newnombre2)throws Exception
	{
		try {
			if(this.nombre2!=newnombre2) {
				if(newnombre2==null) {
					//newnombre2="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Perfil:Valor nulo no permitido en columna nombre2");
					}
				}

				if(newnombre2!=null&&newnombre2.length()>400) {
					newnombre2=newnombre2.substring(0,398);
					System.out.println("Perfil:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=400 en columna nombre2");
				}

				this.nombre2=newnombre2;
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
						System.out.println("Perfil:Valor nulo no permitido en columna estado");
					}
				}

				this.estado=newestado;
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


	
	
	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public List<PerfilUsuario> getPerfilUsuarios() {
		return this.perfilusuarios;
	}

	public List<PerfilOpcion> getPerfilOpcions() {
		return this.perfilopcions;
	}

	
	
	public  void  setOpcions(List<Opcion> opcions) {
		try {
			this.opcions=opcions;
		} catch(Exception e) {
			;
		}
	}

	public  void  setUsuarios(List<Usuario> usuarios) {
		try {
			this.usuarios=usuarios;
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

	public  void  setPerfilOpcions(List<PerfilOpcion> perfilopcions) {
		try {
			this.perfilopcions=perfilopcions;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_sistema_descripcion="";
	String estado_descripcion="";
	
	
	
	public String getid_sistema_descripcion() {
		return id_sistema_descripcion;
	}
	public String getestado_descripcion() {
		return estado_descripcion;
	}
	
	
	public void setid_sistema_descripcion(String newid_sistema_descripcion)throws Exception {
		try {
			this.id_sistema_descripcion=newid_sistema_descripcion;
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
		
		this.id_sistema_descripcion="";
		this.estado_descripcion="";
	}
	
	
	Object perfilaccionsDescripcionReporte;
	Object perfilcamposDescripcionReporte;
	Object accionsDescripcionReporte;
	Object perfilopcionsDescripcionReporte;
	Object perfilusuariosDescripcionReporte;
	Object camposDescripcionReporte;
	Object usuariosDescripcionReporte;
	Object opcionsDescripcionReporte;
	
	
	public Object getperfilaccionsDescripcionReporte() {
		return perfilaccionsDescripcionReporte;
	}

	public Object getperfilcamposDescripcionReporte() {
		return perfilcamposDescripcionReporte;
	}

	public Object getaccionsDescripcionReporte() {
		return accionsDescripcionReporte;
	}

	public Object getperfilopcionsDescripcionReporte() {
		return perfilopcionsDescripcionReporte;
	}

	public Object getperfilusuariosDescripcionReporte() {
		return perfilusuariosDescripcionReporte;
	}

	public Object getcamposDescripcionReporte() {
		return camposDescripcionReporte;
	}

	public Object getusuariosDescripcionReporte() {
		return usuariosDescripcionReporte;
	}

	public Object getopcionsDescripcionReporte() {
		return opcionsDescripcionReporte;
	}

	
	
	public  void  setperfilaccionsDescripcionReporte(Object perfilaccions) {
		try {
			this.perfilaccionsDescripcionReporte=perfilaccions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilcamposDescripcionReporte(Object perfilcampos) {
		try {
			this.perfilcamposDescripcionReporte=perfilcampos;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setaccionsDescripcionReporte(Object accions) {
		try {
			this.accionsDescripcionReporte=accions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setperfilopcionsDescripcionReporte(Object perfilopcions) {
		try {
			this.perfilopcionsDescripcionReporte=perfilopcions;
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

	public  void  setcamposDescripcionReporte(Object campos) {
		try {
			this.camposDescripcionReporte=campos;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setusuariosDescripcionReporte(Object usuarios) {
		try {
			this.usuariosDescripcionReporte=usuarios;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setopcionsDescripcionReporte(Object opcions) {
		try {
			this.opcionsDescripcionReporte=opcions;
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

	public Map<String, Object> getMap_Perfil() {
		return map_Perfil;
	}

	public void setMap_Perfil(Map<String, Object> map_Perfil) {
		this.map_Perfil = map_Perfil;
	}

	public void setMapValue_Perfil(String sKey,Object oValue) {
		this.map_Perfil.put(sKey, oValue);
	}
	
	public Object getMapValue_Perfil(String sKey) {
		return this.map_Perfil.get(sKey);
	}
}

