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
package com.bydan.ingles.gramatica.verboirregular.business.entity;

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
//import com.bydan.ingles.gramatica.util.VerboIrregularConstantesFunciones;
import com.bydan.ingles.gramatica.verboirregular.util.*;

//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;







@SuppressWarnings("unused")
public class VerboIrregular extends GeneralEntity implements Serializable ,Cloneable {//VerboIrregularAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient VerboIrregular verboirregularOriginal;
	
	private Map<String, Object> map_VerboIrregular;
	
	public void inicializarMap_VerboIrregular() {
		this.map_VerboIrregular = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_area;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_sub_area;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_nivel;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=VerboIrregular_util.S_REGEX_INFINITIVO,message=VerboIrregular_util.S_MENSAJE_REGEX_INFINITIVO)
	private String infinitivo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VerboIrregular_util.S_REGEX_PASADO,message=VerboIrregular_util.S_MENSAJE_REGEX_PASADO)
	private String pasado;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VerboIrregular_util.S_REGEX_PARTICIPIO,message=VerboIrregular_util.S_MENSAJE_REGEX_PARTICIPIO)
	private String participio;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=40,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VerboIrregular_util.S_REGEX_TRADUCCION,message=VerboIrregular_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VerboIrregular_util.S_REGEX_PRONUNCIACION,message=VerboIrregular_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
			
	
	public Area area;
	public SubArea subarea;
	public Nivel nivel;
	
	
	private String area_descripcion;
	private String subarea_descripcion;
	private String nivel_descripcion;
	
	
	public List<VerboIrregularDetalle> verboirregulardetalles;
		
	public VerboIrregular () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.verboirregularOriginal=this;
		
 		this.id_area=-1L;
 		this.id_sub_area=-1L;
 		this.id_nivel=-1L;
 		this.infinitivo="";
 		this.pasado="";
 		this.participio="";
 		this.traduccion="";
 		this.pronunciacion="";
		
		
		this.area=null;
		this.subarea=null;
		this.nivel=null;
		
		
		this.area_descripcion="";
		this.subarea_descripcion="";
		this.nivel_descripcion="";
		
		
		this.verboirregulardetalles=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public VerboIrregular (Long id,Date versionRow,Long id_area,Long id_sub_area,Long id_nivel,String infinitivo,String pasado,String participio,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.verboirregularOriginal=this;
		
 		this.id_area=id_area;
 		this.id_sub_area=id_sub_area;
 		this.id_nivel=id_nivel;
 		this.infinitivo=infinitivo;
 		this.pasado=pasado;
 		this.participio=participio;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public VerboIrregular (Long id_area,Long id_sub_area,Long id_nivel,String infinitivo,String pasado,String participio,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.verboirregularOriginal=this;
		
 		this.id_area=id_area;
 		this.id_sub_area=id_sub_area;
 		this.id_nivel=id_nivel;
 		this.infinitivo=infinitivo;
 		this.pasado=pasado;
 		this.participio=participio;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		VerboIrregular verboirregularLocal=null;
		
		if(object!=null) {
			verboirregularLocal=(VerboIrregular)object;
			
			if(verboirregularLocal!=null) {
				if(this.getId()!=null && verboirregularLocal.getId()!=null) {
					if(this.getId().equals(verboirregularLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!VerboIrregular_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=VerboIrregular_util.getVerboIrregularDescripcion(this);
		} else {
			sDetalle=VerboIrregular_util.getVerboIrregularDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public VerboIrregular getVerboIrregularOriginal() {
		return this.verboirregularOriginal;
	}
	
	public void setVerboIrregularOriginal(VerboIrregular verboirregular) {
		try {
			this.verboirregularOriginal=verboirregular;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_area() {
		return this.id_area;
	}
    
	
	public Long getid_sub_area() {
		return this.id_sub_area;
	}
    
	
	public Long getid_nivel() {
		return this.id_nivel;
	}
    
	
	public String getinfinitivo() {
		return this.infinitivo;
	}
    
	
	public String getpasado() {
		return this.pasado;
	}
    
	
	public String getparticipio() {
		return this.participio;
	}
    
	
	public String gettraduccion() {
		return this.traduccion;
	}
    
	
	public String getpronunciacion() {
		return this.pronunciacion;
	}
	
    
	public void setid_area(Long newid_area)throws Exception
	{
		try {
			if(this.id_area!=newid_area) {
				if(newid_area==null) {
					//newid_area=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna id_area");
					}
				}

				this.id_area=newid_area;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sub_area(Long newid_sub_area)throws Exception
	{
		try {
			if(this.id_sub_area!=newid_sub_area) {
				if(newid_sub_area==null) {
					//newid_sub_area=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna id_sub_area");
					}
				}

				this.id_sub_area=newid_sub_area;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_nivel(Long newid_nivel)throws Exception
	{
		try {
			if(this.id_nivel!=newid_nivel) {
				if(newid_nivel==null) {
					//newid_nivel=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna id_nivel");
					}
				}

				this.id_nivel=newid_nivel;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setinfinitivo(String newinfinitivo)throws Exception
	{
		try {
			if(this.infinitivo!=newinfinitivo) {
				if(newinfinitivo==null) {
					//newinfinitivo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna infinitivo");
					}
				}

				if(newinfinitivo!=null&&newinfinitivo.length()>30) {
					newinfinitivo=newinfinitivo.substring(0,28);
					System.out.println("VerboIrregular:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna infinitivo");
				}

				this.infinitivo=newinfinitivo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado(String newpasado)throws Exception
	{
		try {
			if(this.pasado!=newpasado) {
				if(newpasado==null) {
					//newpasado="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna pasado");
					}
				}

				if(newpasado!=null&&newpasado.length()>30) {
					newpasado=newpasado.substring(0,28);
					System.out.println("VerboIrregular:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna pasado");
				}

				this.pasado=newpasado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setparticipio(String newparticipio)throws Exception
	{
		try {
			if(this.participio!=newparticipio) {
				if(newparticipio==null) {
					//newparticipio="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna participio");
					}
				}

				if(newparticipio!=null&&newparticipio.length()>30) {
					newparticipio=newparticipio.substring(0,28);
					System.out.println("VerboIrregular:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna participio");
				}

				this.participio=newparticipio;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settraduccion(String newtraduccion)throws Exception
	{
		try {
			if(this.traduccion!=newtraduccion) {
				if(newtraduccion==null) {
					//newtraduccion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>40) {
					newtraduccion=newtraduccion.substring(0,38);
					System.out.println("VerboIrregular:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=40 en columna traduccion");
				}

				this.traduccion=newtraduccion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpronunciacion(String newpronunciacion)throws Exception
	{
		try {
			if(this.pronunciacion!=newpronunciacion) {
				if(newpronunciacion==null) {
					//newpronunciacion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VerboIrregular:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>30) {
					newpronunciacion=newpronunciacion.substring(0,28);
					System.out.println("VerboIrregular:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna pronunciacion");
				}

				this.pronunciacion=newpronunciacion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Area getArea() {
		return this.area;
	}

	public SubArea getSubArea() {
		return this.subarea;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	
	
	public String getarea_descripcion() {
		return this.area_descripcion;
	}

	public String getsubarea_descripcion() {
		return this.subarea_descripcion;
	}

	public String getnivel_descripcion() {
		return this.nivel_descripcion;
	}

	
	
	public  void  setArea(Area area) {
		try {
			this.area=area;
		} catch(Exception e) {
			;
		}
	}


	public  void  setSubArea(SubArea subarea) {
		try {
			this.subarea=subarea;
		} catch(Exception e) {
			;
		}
	}


	public  void  setNivel(Nivel nivel) {
		try {
			this.nivel=nivel;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setarea_descripcion(String area_descripcion) {
		try {
			this.area_descripcion=area_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  setsubarea_descripcion(String subarea_descripcion) {
		try {
			this.subarea_descripcion=subarea_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  setnivel_descripcion(String nivel_descripcion) {
		try {
			this.nivel_descripcion=nivel_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<VerboIrregularDetalle> getVerboIrregularDetalles() {
		return this.verboirregulardetalles;
	}

	
	
	public  void  setVerboIrregularDetalles(List<VerboIrregularDetalle> verboirregulardetalles) {
		try {
			this.verboirregulardetalles=verboirregulardetalles;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_area_descripcion="";
	String id_sub_area_descripcion="";
	String id_nivel_descripcion="";
	
	
	
	public String getid_area_descripcion() {
		return id_area_descripcion;
	}
	public String getid_sub_area_descripcion() {
		return id_sub_area_descripcion;
	}
	public String getid_nivel_descripcion() {
		return id_nivel_descripcion;
	}
	
	
	public void setid_area_descripcion(String newid_area_descripcion)throws Exception {
		try {
			this.id_area_descripcion=newid_area_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_sub_area_descripcion(String newid_sub_area_descripcion)throws Exception {
		try {
			this.id_sub_area_descripcion=newid_sub_area_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_nivel_descripcion(String newid_nivel_descripcion)throws Exception {
		try {
			this.id_nivel_descripcion=newid_nivel_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_area_descripcion="";
		this.id_sub_area_descripcion="";
		this.id_nivel_descripcion="";
	}
	
	
	Object verboirregulardetallesDescripcionReporte;
	
	
	public Object getverboirregulardetallesDescripcionReporte() {
		return verboirregulardetallesDescripcionReporte;
	}

	
	
	public  void  setverboirregulardetallesDescripcionReporte(Object verboirregulardetalles) {
		try {
			this.verboirregulardetallesDescripcionReporte=verboirregulardetalles;
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

	public Map<String, Object> getMap_VerboIrregular() {
		return map_VerboIrregular;
	}

	public void setMap_VerboIrregular(Map<String, Object> map_VerboIrregular) {
		this.map_VerboIrregular = map_VerboIrregular;
	}

	public void setMapValue_VerboIrregular(String sKey,Object oValue) {
		this.map_VerboIrregular.put(sKey, oValue);
	}
	
	public Object getMapValue_VerboIrregular(String sKey) {
		return this.map_VerboIrregular.get(sKey);
	}
}

