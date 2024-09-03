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
package com.bydan.ingles.general.diccionario.business.entity;

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
//import com.bydan.ingles.general.util.DiccionarioConstantesFunciones;
import com.bydan.ingles.general.diccionario.util.*;

//FK

import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.nivel.business.entity.Nivel;

//REL








@SuppressWarnings("unused")
public class Diccionario extends GeneralEntity implements Serializable ,Cloneable {//DiccionarioAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Diccionario diccionarioOriginal;
	
	private Map<String, Object> map_Diccionario;
	
	public void inicializarMap_Diccionario() {
		this.map_Diccionario = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_grupo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_area;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_nivel;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=40,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Diccionario_util.S_REGEX_EXPRESION,message=Diccionario_util.S_MENSAJE_REGEX_EXPRESION)
	private String expresion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Diccionario_util.S_REGEX_TRADUCCION1,message=Diccionario_util.S_MENSAJE_REGEX_TRADUCCION1)
	private String traduccion1;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Diccionario_util.S_REGEX_TRADUCCION2,message=Diccionario_util.S_MENSAJE_REGEX_TRADUCCION2)
	private String traduccion2;
			
	
	public Grupo grupo;
	public Tipo tipo;
	public Area area;
	public Nivel nivel;
	
	
	private String grupo_descripcion;
	private String tipo_descripcion;
	private String area_descripcion;
	private String nivel_descripcion;
	
	
		
	public Diccionario () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.diccionarioOriginal=this;
		
 		this.id_grupo=-1L;
 		this.id_tipo=-1L;
 		this.id_area=-1L;
 		this.id_nivel=-1L;
 		this.expresion="";
 		this.traduccion1="";
 		this.traduccion2="";
		
		
		this.grupo=null;
		this.tipo=null;
		this.area=null;
		this.nivel=null;
		
		
		this.grupo_descripcion="";
		this.tipo_descripcion="";
		this.area_descripcion="";
		this.nivel_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Diccionario (Long id,Date versionRow,Long id_grupo,Long id_tipo,Long id_area,Long id_nivel,String expresion,String traduccion1,String traduccion2) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.diccionarioOriginal=this;
		
 		this.id_grupo=id_grupo;
 		this.id_tipo=id_tipo;
 		this.id_area=id_area;
 		this.id_nivel=id_nivel;
 		this.expresion=expresion;
 		this.traduccion1=traduccion1;
 		this.traduccion2=traduccion2;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Diccionario (Long id_grupo,Long id_tipo,Long id_area,Long id_nivel,String expresion,String traduccion1,String traduccion2) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.diccionarioOriginal=this;
		
 		this.id_grupo=id_grupo;
 		this.id_tipo=id_tipo;
 		this.id_area=id_area;
 		this.id_nivel=id_nivel;
 		this.expresion=expresion;
 		this.traduccion1=traduccion1;
 		this.traduccion2=traduccion2;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Diccionario diccionarioLocal=null;
		
		if(object!=null) {
			diccionarioLocal=(Diccionario)object;
			
			if(diccionarioLocal!=null) {
				if(this.getId()!=null && diccionarioLocal.getId()!=null) {
					if(this.getId().equals(diccionarioLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Diccionario_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Diccionario_util.getDiccionarioDescripcion(this);
		} else {
			sDetalle=Diccionario_util.getDiccionarioDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Diccionario getDiccionarioOriginal() {
		return this.diccionarioOriginal;
	}
	
	public void setDiccionarioOriginal(Diccionario diccionario) {
		try {
			this.diccionarioOriginal=diccionario;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_grupo() {
		return this.id_grupo;
	}
    
	
	public Long getid_tipo() {
		return this.id_tipo;
	}
    
	
	public Long getid_area() {
		return this.id_area;
	}
    
	
	public Long getid_nivel() {
		return this.id_nivel;
	}
    
	
	public String getexpresion() {
		return this.expresion;
	}
    
	
	public String gettraduccion1() {
		return this.traduccion1;
	}
    
	
	public String gettraduccion2() {
		return this.traduccion2;
	}
	
    
	public void setid_grupo(Long newid_grupo)throws Exception
	{
		try {
			if(this.id_grupo!=newid_grupo) {
				if(newid_grupo==null) {
					//newid_grupo=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna id_grupo");
					}
				}

				this.id_grupo=newid_grupo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo(Long newid_tipo)throws Exception
	{
		try {
			if(this.id_tipo!=newid_tipo) {
				if(newid_tipo==null) {
					//newid_tipo=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna id_tipo");
					}
				}

				this.id_tipo=newid_tipo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_area(Long newid_area)throws Exception
	{
		try {
			if(this.id_area!=newid_area) {
				if(newid_area==null) {
					//newid_area=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna id_area");
					}
				}

				this.id_area=newid_area;
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
						System.out.println("Diccionario:Valor nulo no permitido en columna id_nivel");
					}
				}

				this.id_nivel=newid_nivel;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setexpresion(String newexpresion)throws Exception
	{
		try {
			if(this.expresion!=newexpresion) {
				if(newexpresion==null) {
					//newexpresion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna expresion");
					}
				}

				if(newexpresion!=null&&newexpresion.length()>40) {
					newexpresion=newexpresion.substring(0,38);
					System.out.println("Diccionario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=40 en columna expresion");
				}

				this.expresion=newexpresion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settraduccion1(String newtraduccion1)throws Exception
	{
		try {
			if(this.traduccion1!=newtraduccion1) {
				if(newtraduccion1==null) {
					//newtraduccion1="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna traduccion1");
					}
				}

				if(newtraduccion1!=null&&newtraduccion1.length()>50) {
					newtraduccion1=newtraduccion1.substring(0,48);
					System.out.println("Diccionario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion1");
				}

				this.traduccion1=newtraduccion1;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void settraduccion2(String newtraduccion2)throws Exception
	{
		try {
			if(this.traduccion2!=newtraduccion2) {
				if(newtraduccion2==null) {
					//newtraduccion2="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Diccionario:Valor nulo no permitido en columna traduccion2");
					}
				}

				if(newtraduccion2!=null&&newtraduccion2.length()>30) {
					newtraduccion2=newtraduccion2.substring(0,28);
					System.out.println("Diccionario:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna traduccion2");
				}

				this.traduccion2=newtraduccion2;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Grupo getGrupo() {
		return this.grupo;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public Area getArea() {
		return this.area;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	
	
	public String getgrupo_descripcion() {
		return this.grupo_descripcion;
	}

	public String gettipo_descripcion() {
		return this.tipo_descripcion;
	}

	public String getarea_descripcion() {
		return this.area_descripcion;
	}

	public String getnivel_descripcion() {
		return this.nivel_descripcion;
	}

	
	
	public  void  setGrupo(Grupo grupo) {
		try {
			this.grupo=grupo;
		} catch(Exception e) {
			;
		}
	}


	public  void  setTipo(Tipo tipo) {
		try {
			this.tipo=tipo;
		} catch(Exception e) {
			;
		}
	}


	public  void  setArea(Area area) {
		try {
			this.area=area;
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


	
	
	public  void  setgrupo_descripcion(String grupo_descripcion) {
		try {
			this.grupo_descripcion=grupo_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  settipo_descripcion(String tipo_descripcion) {
		try {
			this.tipo_descripcion=tipo_descripcion;
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


	public  void  setnivel_descripcion(String nivel_descripcion) {
		try {
			this.nivel_descripcion=nivel_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_grupo_descripcion="";
	String id_tipo_descripcion="";
	String id_area_descripcion="";
	String id_nivel_descripcion="";
	
	
	
	public String getid_grupo_descripcion() {
		return id_grupo_descripcion;
	}
	public String getid_tipo_descripcion() {
		return id_tipo_descripcion;
	}
	public String getid_area_descripcion() {
		return id_area_descripcion;
	}
	public String getid_nivel_descripcion() {
		return id_nivel_descripcion;
	}
	
	
	public void setid_grupo_descripcion(String newid_grupo_descripcion)throws Exception {
		try {
			this.id_grupo_descripcion=newid_grupo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_tipo_descripcion(String newid_tipo_descripcion)throws Exception {
		try {
			this.id_tipo_descripcion=newid_tipo_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_area_descripcion(String newid_area_descripcion)throws Exception {
		try {
			this.id_area_descripcion=newid_area_descripcion;
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
		
		this.id_grupo_descripcion="";
		this.id_tipo_descripcion="";
		this.id_area_descripcion="";
		this.id_nivel_descripcion="";
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

	public Map<String, Object> getMap_Diccionario() {
		return map_Diccionario;
	}

	public void setMap_Diccionario(Map<String, Object> map_Diccionario) {
		this.map_Diccionario = map_Diccionario;
	}

	public void setMapValue_Diccionario(String sKey,Object oValue) {
		this.map_Diccionario.put(sKey, oValue);
	}
	
	public Object getMapValue_Diccionario(String sKey) {
		return this.map_Diccionario.get(sKey);
	}
}

