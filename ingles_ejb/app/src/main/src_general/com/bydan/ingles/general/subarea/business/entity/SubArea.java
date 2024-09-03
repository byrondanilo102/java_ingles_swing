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
package com.bydan.ingles.general.subarea.business.entity;

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
//import com.bydan.ingles.general.util.SubAreaConstantesFunciones;
import com.bydan.ingles.general.subarea.util.*;

//FK

import com.bydan.ingles.general.area.business.entity.Area;

//REL

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;







@SuppressWarnings("unused")
public class SubArea extends GeneralEntity implements Serializable ,Cloneable {//SubAreaAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient SubArea subareaOriginal;
	
	private Map<String, Object> map_SubArea;
	
	public void inicializarMap_SubArea() {
		this.map_SubArea = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_area;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=SubArea_util.S_REGEX_NOMBRE,message=SubArea_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	public Area area;
	
	
	private String area_descripcion;
	
	
	public List<VerboIrregular> verboirregulars;
	public List<Expresion> expresions;
	public List<VerboCompuesto> verbocompuestos;
	public List<Vocabulario> vocabularios;
		
	public SubArea () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.subareaOriginal=this;
		
 		this.id_area=-1L;
 		this.nombre="";
		
		
		this.area=null;
		
		
		this.area_descripcion="";
		
		
		this.verboirregulars=null;
		this.expresions=null;
		this.verbocompuestos=null;
		this.vocabularios=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public SubArea (Long id,Date versionRow,Long id_area,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.subareaOriginal=this;
		
 		this.id_area=id_area;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public SubArea (Long id_area,String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.subareaOriginal=this;
		
 		this.id_area=id_area;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		SubArea subareaLocal=null;
		
		if(object!=null) {
			subareaLocal=(SubArea)object;
			
			if(subareaLocal!=null) {
				if(this.getId()!=null && subareaLocal.getId()!=null) {
					if(this.getId().equals(subareaLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!SubArea_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=SubArea_util.getSubAreaDescripcion(this);
		} else {
			sDetalle=SubArea_util.getSubAreaDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public SubArea getSubAreaOriginal() {
		return this.subareaOriginal;
	}
	
	public void setSubAreaOriginal(SubArea subarea) {
		try {
			this.subareaOriginal=subarea;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_area() {
		return this.id_area;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid_area(Long newid_area)throws Exception
	{
		try {
			if(this.id_area!=newid_area) {
				if(newid_area==null) {
					//newid_area=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("SubArea:Valor nulo no permitido en columna id_area");
					}
				}

				this.id_area=newid_area;
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
						System.out.println("SubArea:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("SubArea:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Area getArea() {
		return this.area;
	}

	
	
	public String getarea_descripcion() {
		return this.area_descripcion;
	}

	
	
	public  void  setArea(Area area) {
		try {
			this.area=area;
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


	
	
	public List<VerboIrregular> getVerboIrregulars() {
		return this.verboirregulars;
	}

	public List<Expresion> getExpresions() {
		return this.expresions;
	}

	public List<VerboCompuesto> getVerboCompuestos() {
		return this.verbocompuestos;
	}

	public List<Vocabulario> getVocabularios() {
		return this.vocabularios;
	}

	
	
	public  void  setVerboIrregulars(List<VerboIrregular> verboirregulars) {
		try {
			this.verboirregulars=verboirregulars;
		} catch(Exception e) {
			;
		}
	}

	public  void  setExpresions(List<Expresion> expresions) {
		try {
			this.expresions=expresions;
		} catch(Exception e) {
			;
		}
	}

	public  void  setVerboCompuestos(List<VerboCompuesto> verbocompuestos) {
		try {
			this.verbocompuestos=verbocompuestos;
		} catch(Exception e) {
			;
		}
	}

	public  void  setVocabularios(List<Vocabulario> vocabularios) {
		try {
			this.vocabularios=vocabularios;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_area_descripcion="";
	
	
	
	public String getid_area_descripcion() {
		return id_area_descripcion;
	}
	
	
	public void setid_area_descripcion(String newid_area_descripcion)throws Exception {
		try {
			this.id_area_descripcion=newid_area_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_area_descripcion="";
	}
	
	
	Object verboirregularsDescripcionReporte;
	Object expresionsDescripcionReporte;
	Object verbocompuestosDescripcionReporte;
	Object vocabulariosDescripcionReporte;
	
	
	public Object getverboirregularsDescripcionReporte() {
		return verboirregularsDescripcionReporte;
	}

	public Object getexpresionsDescripcionReporte() {
		return expresionsDescripcionReporte;
	}

	public Object getverbocompuestosDescripcionReporte() {
		return verbocompuestosDescripcionReporte;
	}

	public Object getvocabulariosDescripcionReporte() {
		return vocabulariosDescripcionReporte;
	}

	
	
	public  void  setverboirregularsDescripcionReporte(Object verboirregulars) {
		try {
			this.verboirregularsDescripcionReporte=verboirregulars;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setexpresionsDescripcionReporte(Object expresions) {
		try {
			this.expresionsDescripcionReporte=expresions;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setverbocompuestosDescripcionReporte(Object verbocompuestos) {
		try {
			this.verbocompuestosDescripcionReporte=verbocompuestos;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setvocabulariosDescripcionReporte(Object vocabularios) {
		try {
			this.vocabulariosDescripcionReporte=vocabularios;
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

	public Map<String, Object> getMap_SubArea() {
		return map_SubArea;
	}

	public void setMap_SubArea(Map<String, Object> map_SubArea) {
		this.map_SubArea = map_SubArea;
	}

	public void setMapValue_SubArea(String sKey,Object oValue) {
		this.map_SubArea.put(sKey, oValue);
	}
	
	public Object getMapValue_SubArea(String sKey) {
		return this.map_SubArea.get(sKey);
	}
}

