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
package com.bydan.ingles.gramatica.tipogrammar.business.entity;

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
//import com.bydan.ingles.gramatica.util.TipoGrammarConstantesFunciones;
import com.bydan.ingles.gramatica.tipogrammar.util.*;

//FK


//REL

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;







@SuppressWarnings("unused")
public class TipoGrammar extends GeneralEntitySinIdGenerated implements Serializable ,Cloneable {//TipoGrammarAdditional,GeneralEntity
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
	
	
	private transient TipoGrammar tipogrammarOriginal;
	
	private Map<String, Object> map_TipoGrammar;
	
	public void inicializarMap_TipoGrammar() {
		this.map_TipoGrammar = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=TipoGrammar_util.S_REGEX_NOMBRE,message=TipoGrammar_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
			
	
	
	
	
	
	public List<Pronun> pronuns;
	public List<Grammar> grammars;
		
	public TipoGrammar () throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.tipogrammarOriginal=this;
		
 		this.nombre="";
		
		
		
		
		
		
		this.pronuns=null;
		this.grammars=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public TipoGrammar (Long id,Date versionRow,String nombre) throws Exception {
		super();		
		
		this.id=id;
		this.idOriginal=this.id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.tipogrammarOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public TipoGrammar (String nombre) throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.tipogrammarOriginal=this;
		
 		this.nombre=nombre;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		TipoGrammar tipogrammarLocal=null;
		
		if(object!=null) {
			tipogrammarLocal=(TipoGrammar)object;
			
			if(tipogrammarLocal!=null) {
				if(this.getId()!=null && tipogrammarLocal.getId()!=null) {
					if(this.getId().equals(tipogrammarLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!TipoGrammar_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=TipoGrammar_util.getTipoGrammarDescripcion(this);
		} else {
			sDetalle=TipoGrammar_util.getTipoGrammarDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public TipoGrammar getTipoGrammarOriginal() {
		return this.tipogrammarOriginal;
	}
	
	public void setTipoGrammarOriginal(TipoGrammar tipogrammar) {
		try {
			this.tipogrammarOriginal=tipogrammar;
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
						System.out.println("TipoGrammar:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("TipoGrammar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
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
	Object grammarsDescripcionReporte;
	
	
	public Object getpronunsDescripcionReporte() {
		return pronunsDescripcionReporte;
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

	public Map<String, Object> getMap_TipoGrammar() {
		return map_TipoGrammar;
	}

	public void setMap_TipoGrammar(Map<String, Object> map_TipoGrammar) {
		this.map_TipoGrammar = map_TipoGrammar;
	}

	public void setMapValue_TipoGrammar(String sKey,Object oValue) {
		this.map_TipoGrammar.put(sKey, oValue);
	}
	
	public Object getMapValue_TipoGrammar(String sKey) {
		return this.map_TipoGrammar.get(sKey);
	}
}

