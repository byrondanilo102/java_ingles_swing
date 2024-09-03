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
package com.bydan.ingles.seguridad.pais.business.entity;

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
//import com.bydan.ingles.seguridad.util.PaisConstantesFunciones;
import com.bydan.ingles.seguridad.pais.util.*;

//FK


//REL

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;







@SuppressWarnings("unused")
public class Pais extends GeneralEntity implements Serializable ,Cloneable {//PaisAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Pais paisOriginal;
	
	private Map<String, Object> map_Pais;
	
	public void inicializarMap_Pais() {
		this.map_Pais = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Pais_util.S_REGEX_CODIGO,message=Pais_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=200,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Pais_util.S_REGEX_NOMBRE,message=Pais_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	
	
	
	
	public List<DatoGeneralUsuario> datogeneralusuarios;
	public List<Provincia> provincias;
		
	public Pais () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.paisOriginal=this;
		
 		this.codigo="";
 		this.nombre="";
		
		
		
		
		
		
		this.datogeneralusuarios=null;
		this.provincias=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Pais (Long id,Date versionRow,String codigo,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paisOriginal=this;
		
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Pais (String codigo,String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.paisOriginal=this;
		
 		this.codigo=codigo;
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Pais paisLocal=null;
		
		if(object!=null) {
			paisLocal=(Pais)object;
			
			if(paisLocal!=null) {
				if(this.getId()!=null && paisLocal.getId()!=null) {
					if(this.getId().equals(paisLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Pais_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Pais_util.getPaisDescripcion(this);
		} else {
			sDetalle=Pais_util.getPaisDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Pais getPaisOriginal() {
		return this.paisOriginal;
	}
	
	public void setPaisOriginal(Pais pais) {
		try {
			this.paisOriginal=pais;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setcodigo(String newcodigo)throws Exception
	{
		try {
			if(this.codigo!=newcodigo) {
				if(newcodigo==null) {
					//newcodigo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Pais:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>50) {
					newcodigo=newcodigo.substring(0,48);
					System.out.println("Pais:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna codigo");
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
						System.out.println("Pais:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>200) {
					newnombre=newnombre.substring(0,198);
					System.out.println("Pais:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<DatoGeneralUsuario> getDatoGeneralUsuarios() {
		return this.datogeneralusuarios;
	}

	public List<Provincia> getProvincias() {
		return this.provincias;
	}

	
	
	public  void  setDatoGeneralUsuarios(List<DatoGeneralUsuario> datogeneralusuarios) {
		try {
			this.datogeneralusuarios=datogeneralusuarios;
		} catch(Exception e) {
			;
		}
	}

	public  void  setProvincias(List<Provincia> provincias) {
		try {
			this.provincias=provincias;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
	}
	
	
	Object datogeneralusuariosDescripcionReporte;
	Object provinciasDescripcionReporte;
	
	
	public Object getdatogeneralusuariosDescripcionReporte() {
		return datogeneralusuariosDescripcionReporte;
	}

	public Object getprovinciasDescripcionReporte() {
		return provinciasDescripcionReporte;
	}

	
	
	public  void  setdatogeneralusuariosDescripcionReporte(Object datogeneralusuarios) {
		try {
			this.datogeneralusuariosDescripcionReporte=datogeneralusuarios;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setprovinciasDescripcionReporte(Object provincias) {
		try {
			this.provinciasDescripcionReporte=provincias;
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

	public Map<String, Object> getMap_Pais() {
		return map_Pais;
	}

	public void setMap_Pais(Map<String, Object> map_Pais) {
		this.map_Pais = map_Pais;
	}

	public void setMapValue_Pais(String sKey,Object oValue) {
		this.map_Pais.put(sKey, oValue);
	}
	
	public Object getMapValue_Pais(String sKey) {
		return this.map_Pais.get(sKey);
	}
}

