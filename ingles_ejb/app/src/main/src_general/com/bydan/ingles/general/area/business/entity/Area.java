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
package com.bydan.ingles.general.area.business.entity;

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
//import com.bydan.ingles.general.util.AreaConstantesFunciones;
import com.bydan.ingles.general.area.util.*;

//FK


//REL

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;







@SuppressWarnings("unused")
public class Area extends GeneralEntity implements Serializable ,Cloneable {//AreaAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Area areaOriginal;
	
	private Map<String, Object> map_Area;
	
	public void inicializarMap_Area() {
		this.map_Area = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Area_util.S_REGEX_NOMBRE,message=Area_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	
	
	
	
	public List<VerboIrregular> verboirregulars;
	public List<Expresion> expresions;
	public List<Diccionario> diccionarios;
	public List<VerboCompuesto> verbocompuestos;
	public List<SubArea> subareas;
	public List<Vocabulario> vocabularios;
		
	public Area () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.areaOriginal=this;
		
 		this.nombre="";
		
		
		
		
		
		
		this.verboirregulars=null;
		this.expresions=null;
		this.diccionarios=null;
		this.verbocompuestos=null;
		this.subareas=null;
		this.vocabularios=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Area (Long id,Date versionRow,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.areaOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Area (String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.areaOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Area areaLocal=null;
		
		if(object!=null) {
			areaLocal=(Area)object;
			
			if(areaLocal!=null) {
				if(this.getId()!=null && areaLocal.getId()!=null) {
					if(this.getId().equals(areaLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Area_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Area_util.getAreaDescripcion(this);
		} else {
			sDetalle=Area_util.getAreaDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Area getAreaOriginal() {
		return this.areaOriginal;
	}
	
	public void setAreaOriginal(Area area) {
		try {
			this.areaOriginal=area;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setnombre(String newnombre)throws Exception
	{
		try {
			if(this.nombre!=newnombre) {
				if(newnombre==null) {
					//newnombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Area:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Area:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<VerboIrregular> getVerboIrregulars() {
		return this.verboirregulars;
	}

	public List<Expresion> getExpresions() {
		return this.expresions;
	}

	public List<Diccionario> getDiccionarios() {
		return this.diccionarios;
	}

	public List<VerboCompuesto> getVerboCompuestos() {
		return this.verbocompuestos;
	}

	public List<SubArea> getSubAreas() {
		return this.subareas;
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

	public  void  setDiccionarios(List<Diccionario> diccionarios) {
		try {
			this.diccionarios=diccionarios;
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

	public  void  setSubAreas(List<SubArea> subareas) {
		try {
			this.subareas=subareas;
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
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
	}
	
	
	Object verboirregularsDescripcionReporte;
	Object expresionsDescripcionReporte;
	Object diccionariosDescripcionReporte;
	Object verbocompuestosDescripcionReporte;
	Object subareasDescripcionReporte;
	Object vocabulariosDescripcionReporte;
	
	
	public Object getverboirregularsDescripcionReporte() {
		return verboirregularsDescripcionReporte;
	}

	public Object getexpresionsDescripcionReporte() {
		return expresionsDescripcionReporte;
	}

	public Object getdiccionariosDescripcionReporte() {
		return diccionariosDescripcionReporte;
	}

	public Object getverbocompuestosDescripcionReporte() {
		return verbocompuestosDescripcionReporte;
	}

	public Object getsubareasDescripcionReporte() {
		return subareasDescripcionReporte;
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

	public  void  setdiccionariosDescripcionReporte(Object diccionarios) {
		try {
			this.diccionariosDescripcionReporte=diccionarios;
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

	public  void  setsubareasDescripcionReporte(Object subareas) {
		try {
			this.subareasDescripcionReporte=subareas;
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

	public Map<String, Object> getMap_Area() {
		return map_Area;
	}

	public void setMap_Area(Map<String, Object> map_Area) {
		this.map_Area = map_Area;
	}

	public void setMapValue_Area(String sKey,Object oValue) {
		this.map_Area.put(sKey, oValue);
	}
	
	public Object getMapValue_Area(String sKey) {
		return this.map_Area.get(sKey);
	}
}

