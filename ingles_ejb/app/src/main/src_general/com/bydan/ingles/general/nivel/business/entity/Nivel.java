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
package com.bydan.ingles.general.nivel.business.entity;

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
//import com.bydan.ingles.general.util.NivelConstantesFunciones;
import com.bydan.ingles.general.nivel.util.*;

//FK


//REL

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;







@SuppressWarnings("unused")
public class Nivel extends GeneralEntitySinIdGenerated implements Serializable ,Cloneable {//NivelAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected Long idOriginal;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Nivel nivelOriginal;
	
	private Map<String, Object> map_Nivel;
	
	public void inicializarMap_Nivel() {
		this.map_Nivel = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=20,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Nivel_util.S_REGEX_NOMBRE,message=Nivel_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	
	
	
	
	public List<Pronun> pronuns;
	public List<VerboIrregular> verboirregulars;
	public List<Expresion> expresions;
	public List<Diccionario> diccionarios;
	public List<VerboCompuesto> verbocompuestos;
	public List<Vocabulario> vocabularios;
	public List<Grammar> grammars;
		
	public Nivel () throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.nivelOriginal=this;
		
 		this.nombre="";
		
		
		
		
		
		
		this.pronuns=null;
		this.verboirregulars=null;
		this.expresions=null;
		this.diccionarios=null;
		this.verbocompuestos=null;
		this.vocabularios=null;
		this.grammars=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Nivel (Long id,Date versionRow,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.idOriginal=this.id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.nivelOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Nivel (String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.nivelOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Nivel nivelLocal=null;
		
		if(object!=null) {
			nivelLocal=(Nivel)object;
			
			if(nivelLocal!=null) {
				if(this.getId()!=null && nivelLocal.getId()!=null) {
					if(this.getId().equals(nivelLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Nivel_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Nivel_util.getNivelDescripcion(this);
		} else {
			sDetalle=Nivel_util.getNivelDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Nivel getNivelOriginal() {
		return this.nivelOriginal;
	}
	
	public void setNivelOriginal(Nivel nivel) {
		try {
			this.nivelOriginal=nivel;
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
						System.out.println("Nivel:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>20) {
					newnombre=newnombre.substring(0,18);
					System.out.println("Nivel:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public List<Pronun> getPronuns() {
		return this.pronuns;
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

	public List<Vocabulario> getVocabularios() {
		return this.vocabularios;
	}

	public List<Grammar> getGrammars() {
		return this.grammars;
	}

	
	
	public  void  setPronuns(List<Pronun> pronuns) {
		try {
			this.pronuns=pronuns;
		} catch(Exception e) {
			;
		}
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

	public  void  setVocabularios(List<Vocabulario> vocabularios) {
		try {
			this.vocabularios=vocabularios;
		} catch(Exception e) {
			;
		}
	}

	public  void  setGrammars(List<Grammar> grammars) {
		try {
			this.grammars=grammars;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
	}
	
	
	Object pronunsDescripcionReporte;
	Object verboirregularsDescripcionReporte;
	Object expresionsDescripcionReporte;
	Object diccionariosDescripcionReporte;
	Object verbocompuestosDescripcionReporte;
	Object vocabulariosDescripcionReporte;
	Object grammarsDescripcionReporte;
	
	
	public Object getpronunsDescripcionReporte() {
		return pronunsDescripcionReporte;
	}

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

	public Object getvocabulariosDescripcionReporte() {
		return vocabulariosDescripcionReporte;
	}

	public Object getgrammarsDescripcionReporte() {
		return grammarsDescripcionReporte;
	}

	
	
	public  void  setpronunsDescripcionReporte(Object pronuns) {
		try {
			this.pronunsDescripcionReporte=pronuns;
		} catch(Exception ex) {
			;
		}
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

	public  void  setvocabulariosDescripcionReporte(Object vocabularios) {
		try {
			this.vocabulariosDescripcionReporte=vocabularios;
		} catch(Exception ex) {
			;
		}
	}

	public  void  setgrammarsDescripcionReporte(Object grammars) {
		try {
			this.grammarsDescripcionReporte=grammars;
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
	
	public Long getIdOriginal() {
		return this.idOriginal;
	}
	
	public void setIdOriginal(Long newIdOriginal) {		
		this.idOriginal=newIdOriginal;
		super.setIdOriginal(newIdOriginal);
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

	public Map<String, Object> getMap_Nivel() {
		return map_Nivel;
	}

	public void setMap_Nivel(Map<String, Object> map_Nivel) {
		this.map_Nivel = map_Nivel;
	}

	public void setMapValue_Nivel(String sKey,Object oValue) {
		this.map_Nivel.put(sKey, oValue);
	}
	
	public Object getMapValue_Nivel(String sKey) {
		return this.map_Nivel.get(sKey);
	}
}

