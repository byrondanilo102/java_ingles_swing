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
package com.bydan.ingles.seguridad.auditoriadetalle.business.entity;

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
//import com.bydan.ingles.seguridad.util.AuditoriaDetalleConstantesFunciones;
import com.bydan.ingles.seguridad.auditoriadetalle.util.*;

//FK

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;

//REL








@SuppressWarnings("unused")
public class AuditoriaDetalle extends GeneralEntity implements Serializable ,Cloneable {//AuditoriaDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient AuditoriaDetalle auditoriadetalleOriginal;
	
	private Map<String, Object> map_AuditoriaDetalle;
	
	public void inicializarMap_AuditoriaDetalle() {
		this.map_AuditoriaDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_auditoria;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=150,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=AuditoriaDetalle_util.S_REGEX_NOMBRE_CAMPO,message=AuditoriaDetalle_util.S_MENSAJE_REGEX_NOMBRE_CAMPO)
	private String nombre_campo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=250,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=AuditoriaDetalle_util.S_REGEX_VALOR_ANTERIOR,message=AuditoriaDetalle_util.S_MENSAJE_REGEX_VALOR_ANTERIOR)
	private String valor_anterior;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=250,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	////@Pattern(regexp=AuditoriaDetalle_util.S_REGEX_VALOR_ACTUAL,message=AuditoriaDetalle_util.S_MENSAJE_REGEX_VALOR_ACTUAL)
	private String valor_actual;
			
	
	public Auditoria auditoria;
	
	
	private String auditoria_descripcion;
	
	
		
	public AuditoriaDetalle () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.auditoriadetalleOriginal=this;
		
 		this.id_auditoria=-1L;
 		this.nombre_campo="";
 		this.valor_anterior="";
 		this.valor_actual="";
		
		
		this.auditoria=null;
		
		
		this.auditoria_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public AuditoriaDetalle (Long id,Date versionRow,Long id_auditoria,String nombre_campo,String valor_anterior,String valor_actual) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.auditoriadetalleOriginal=this;
		
 		this.id_auditoria=id_auditoria;
 		this.nombre_campo=nombre_campo;
 		this.valor_anterior=valor_anterior;
 		this.valor_actual=valor_actual;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public AuditoriaDetalle (Long id_auditoria,String nombre_campo,String valor_anterior,String valor_actual) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.auditoriadetalleOriginal=this;
		
 		this.id_auditoria=id_auditoria;
 		this.nombre_campo=nombre_campo;
 		this.valor_anterior=valor_anterior;
 		this.valor_actual=valor_actual;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		AuditoriaDetalle auditoriadetalleLocal=null;
		
		if(object!=null) {
			auditoriadetalleLocal=(AuditoriaDetalle)object;
			
			if(auditoriadetalleLocal!=null) {
				if(this.getId()!=null && auditoriadetalleLocal.getId()!=null) {
					if(this.getId().equals(auditoriadetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!AuditoriaDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=AuditoriaDetalle_util.getAuditoriaDetalleDescripcion(this);
		} else {
			sDetalle=AuditoriaDetalle_util.getAuditoriaDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public AuditoriaDetalle getAuditoriaDetalleOriginal() {
		return this.auditoriadetalleOriginal;
	}
	
	public void setAuditoriaDetalleOriginal(AuditoriaDetalle auditoriadetalle) {
		try {
			this.auditoriadetalleOriginal=auditoriadetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_auditoria() {
		return this.id_auditoria;
	}
    
	
	public String getnombre_campo() {
		return this.nombre_campo;
	}
    
	
	public String getvalor_anterior() {
		return this.valor_anterior;
	}
    
	
	public String getvalor_actual() {
		return this.valor_actual;
	}
	
    
	public void setid_auditoria(Long newid_auditoria)throws Exception
	{
		try {
			if(this.id_auditoria!=newid_auditoria) {
				if(newid_auditoria==null) {
					//newid_auditoria=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna id_auditoria");
					}
				}

				this.id_auditoria=newid_auditoria;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_campo(String newnombre_campo)throws Exception
	{
		try {
			if(this.nombre_campo!=newnombre_campo) {
				if(newnombre_campo==null) {
					//newnombre_campo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna nombre_campo");
					}
				}

				if(newnombre_campo!=null&&newnombre_campo.length()>150) {
					newnombre_campo=newnombre_campo.substring(0,148);
					System.out.println("AuditoriaDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_campo");
				}

				this.nombre_campo=newnombre_campo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setvalor_anterior(String newvalor_anterior)throws Exception
	{
		try {
			if(this.valor_anterior!=newvalor_anterior) {
				if(newvalor_anterior==null) {
					//newvalor_anterior="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna valor_anterior");
					}
				}

				if(newvalor_anterior!=null&&newvalor_anterior.length()>250) {
					newvalor_anterior=newvalor_anterior.substring(0,248);
					System.out.println("AuditoriaDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=250 en columna valor_anterior");
				}

				this.valor_anterior=newvalor_anterior;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setvalor_actual(String newvalor_actual)throws Exception
	{
		try {
			if(this.valor_actual!=newvalor_actual) {
				if(newvalor_actual==null) {
					//newvalor_actual="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("AuditoriaDetalle:Valor nulo no permitido en columna valor_actual");
					}
				}

				if(newvalor_actual!=null&&newvalor_actual.length()>250) {
					newvalor_actual=newvalor_actual.substring(0,248);
					System.out.println("AuditoriaDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=250 en columna valor_actual");
				}

				this.valor_actual=newvalor_actual;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Auditoria getAuditoria() {
		return this.auditoria;
	}

	
	
	public String getauditoria_descripcion() {
		return this.auditoria_descripcion;
	}

	
	
	public  void  setAuditoria(Auditoria auditoria) {
		try {
			this.auditoria=auditoria;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setauditoria_descripcion(String auditoria_descripcion) {
		try {
			this.auditoria_descripcion=auditoria_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_auditoria_descripcion="";
	
	
	
	public String getid_auditoria_descripcion() {
		return id_auditoria_descripcion;
	}
	
	
	public void setid_auditoria_descripcion(String newid_auditoria_descripcion)throws Exception {
		try {
			this.id_auditoria_descripcion=newid_auditoria_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_auditoria_descripcion="";
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

	public Map<String, Object> getMap_AuditoriaDetalle() {
		return map_AuditoriaDetalle;
	}

	public void setMap_AuditoriaDetalle(Map<String, Object> map_AuditoriaDetalle) {
		this.map_AuditoriaDetalle = map_AuditoriaDetalle;
	}

	public void setMapValue_AuditoriaDetalle(String sKey,Object oValue) {
		this.map_AuditoriaDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_AuditoriaDetalle(String sKey) {
		return this.map_AuditoriaDetalle.get(sKey);
	}
}

