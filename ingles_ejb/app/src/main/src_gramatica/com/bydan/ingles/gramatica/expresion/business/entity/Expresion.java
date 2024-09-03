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
package com.bydan.ingles.gramatica.expresion.business.entity;

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
//import com.bydan.ingles.gramatica.util.ExpresionConstantesFunciones;
import com.bydan.ingles.gramatica.expresion.util.*;

//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;







@SuppressWarnings("unused")
public class Expresion extends GeneralEntity implements Serializable ,Cloneable {//ExpresionAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Expresion expresionOriginal;
	
	private Map<String, Object> map_Expresion;
	
	public void inicializarMap_Expresion() {
		this.map_Expresion = new HashMap<String,Object>();
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
	//@Pattern(regexp=Expresion_util.S_REGEX_NOMBRE,message=Expresion_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Expresion_util.S_REGEX_DETALLE,message=Expresion_util.S_MENSAJE_REGEX_DETALLE)
	private String detalle;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Expresion_util.S_REGEX_TRADUCCION,message=Expresion_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=40,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Expresion_util.S_REGEX_PRONUNCIACION,message=Expresion_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
			
	
	public Area area;
	public SubArea subarea;
	public Nivel nivel;
	
	
	private String area_descripcion;
	private String subarea_descripcion;
	private String nivel_descripcion;
	
	
	public List<ExpresionDetalle> expresiondetalles;
		
	public Expresion () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.expresionOriginal=this;
		
 		this.id_area=-1L;
 		this.id_sub_area=-1L;
 		this.id_nivel=-1L;
 		this.nombre="";
 		this.detalle="";
 		this.traduccion="";
 		this.pronunciacion="";
		
		
		this.area=null;
		this.subarea=null;
		this.nivel=null;
		
		
		this.area_descripcion="";
		this.subarea_descripcion="";
		this.nivel_descripcion="";
		
		
		this.expresiondetalles=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Expresion (Long id,Date versionRow,Long id_area,Long id_sub_area,Long id_nivel,String nombre,String detalle,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.expresionOriginal=this;
		
 		this.id_area=id_area;
 		this.id_sub_area=id_sub_area;
 		this.id_nivel=id_nivel;
 		this.nombre=nombre;
 		this.detalle=detalle;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Expresion (Long id_area,Long id_sub_area,Long id_nivel,String nombre,String detalle,String traduccion,String pronunciacion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.expresionOriginal=this;
		
 		this.id_area=id_area;
 		this.id_sub_area=id_sub_area;
 		this.id_nivel=id_nivel;
 		this.nombre=nombre;
 		this.detalle=detalle;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Expresion expresionLocal=null;
		
		if(object!=null) {
			expresionLocal=(Expresion)object;
			
			if(expresionLocal!=null) {
				if(this.getId()!=null && expresionLocal.getId()!=null) {
					if(this.getId().equals(expresionLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Expresion_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Expresion_util.getExpresionDescripcion(this);
		} else {
			sDetalle=Expresion_util.getExpresionDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Expresion getExpresionOriginal() {
		return this.expresionOriginal;
	}
	
	public void setExpresionOriginal(Expresion expresion) {
		try {
			this.expresionOriginal=expresion;
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
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getdetalle() {
		return this.detalle;
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
						System.out.println("Expresion:Valor nulo no permitido en columna id_area");
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
						System.out.println("Expresion:Valor nulo no permitido en columna id_sub_area");
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
						System.out.println("Expresion:Valor nulo no permitido en columna id_nivel");
					}
				}

				this.id_nivel=newid_nivel;
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
						System.out.println("Expresion:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>30) {
					newnombre=newnombre.substring(0,28);
					System.out.println("Expresion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setdetalle(String newdetalle)throws Exception
	{
		try {
			if(this.detalle!=newdetalle) {
				if(newdetalle==null) {
					//newdetalle="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Expresion:Valor nulo no permitido en columna detalle");
					}
				}

				if(newdetalle!=null&&newdetalle.length()>50) {
					newdetalle=newdetalle.substring(0,48);
					System.out.println("Expresion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna detalle");
				}

				this.detalle=newdetalle;
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
						System.out.println("Expresion:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("Expresion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("Expresion:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>40) {
					newpronunciacion=newpronunciacion.substring(0,38);
					System.out.println("Expresion:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=40 en columna pronunciacion");
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


	
	
	public List<ExpresionDetalle> getExpresionDetalles() {
		return this.expresiondetalles;
	}

	
	
	public  void  setExpresionDetalles(List<ExpresionDetalle> expresiondetalles) {
		try {
			this.expresiondetalles=expresiondetalles;
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
	
	
	Object expresiondetallesDescripcionReporte;
	
	
	public Object getexpresiondetallesDescripcionReporte() {
		return expresiondetallesDescripcionReporte;
	}

	
	
	public  void  setexpresiondetallesDescripcionReporte(Object expresiondetalles) {
		try {
			this.expresiondetallesDescripcionReporte=expresiondetalles;
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

	public Map<String, Object> getMap_Expresion() {
		return map_Expresion;
	}

	public void setMap_Expresion(Map<String, Object> map_Expresion) {
		this.map_Expresion = map_Expresion;
	}

	public void setMapValue_Expresion(String sKey,Object oValue) {
		this.map_Expresion.put(sKey, oValue);
	}
	
	public Object getMapValue_Expresion(String sKey) {
		return this.map_Expresion.get(sKey);
	}
}

