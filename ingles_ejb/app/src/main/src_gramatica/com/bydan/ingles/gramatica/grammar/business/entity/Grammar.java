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
package com.bydan.ingles.gramatica.grammar.business.entity;

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
//import com.bydan.ingles.gramatica.util.GrammarConstantesFunciones;
import com.bydan.ingles.gramatica.grammar.util.*;

//FK

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;

//REL

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;







@SuppressWarnings("unused")
public class Grammar extends GeneralEntity implements Serializable ,Cloneable {//GrammarAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient Grammar grammarOriginal;
	
	private Map<String, Object> map_Grammar;
	
	public void inicializarMap_Grammar() {
		this.map_Grammar = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_nivel;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo_grammar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=30,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Grammar_util.S_REGEX_CODIGO,message=Grammar_util.S_MENSAJE_REGEX_CODIGO)
	private String codigo;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=Grammar_util.S_REGEX_NOMBRE,message=Grammar_util.S_MENSAJE_REGEX_NOMBRE)
	private String nombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=100,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=Grammar_util.S_REGEX_DESCRIPCION,message=Grammar_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
			
	
	public Nivel nivel;
	public TipoGrammar tipogrammar;
	
	
	private String nivel_descripcion;
	private String tipogrammar_descripcion;
	
	
	public List<GrammarDetalle> grammardetalles;
		
	public Grammar () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.grammarOriginal=this;
		
 		this.id_nivel=-1L;
 		this.id_tipo_grammar=-1L;
 		this.codigo="";
 		this.nombre="";
 		this.descripcion="";
		
		
		this.nivel=null;
		this.tipogrammar=null;
		
		
		this.nivel_descripcion="";
		this.tipogrammar_descripcion="";
		
		
		this.grammardetalles=null;
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public Grammar (Long id,Date versionRow,Long id_nivel,Long id_tipo_grammar,String codigo,String nombre,String descripcion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.grammarOriginal=this;
		
 		this.id_nivel=id_nivel;
 		this.id_tipo_grammar=id_tipo_grammar;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public Grammar (Long id_nivel,Long id_tipo_grammar,String codigo,String nombre,String descripcion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.grammarOriginal=this;
		
 		this.id_nivel=id_nivel;
 		this.id_tipo_grammar=id_tipo_grammar;
 		this.codigo=codigo;
 		this.nombre=nombre;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		Grammar grammarLocal=null;
		
		if(object!=null) {
			grammarLocal=(Grammar)object;
			
			if(grammarLocal!=null) {
				if(this.getId()!=null && grammarLocal.getId()!=null) {
					if(this.getId().equals(grammarLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!Grammar_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=Grammar_util.getGrammarDescripcion(this);
		} else {
			sDetalle=Grammar_util.getGrammarDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public Grammar getGrammarOriginal() {
		return this.grammarOriginal;
	}
	
	public void setGrammarOriginal(Grammar grammar) {
		try {
			this.grammarOriginal=grammar;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_nivel() {
		return this.id_nivel;
	}
    
	
	public Long getid_tipo_grammar() {
		return this.id_tipo_grammar;
	}
    
	
	public String getcodigo() {
		return this.codigo;
	}
    
	
	public String getnombre() {
		return this.nombre;
	}
    
	
	public String getdescripcion() {
		return this.descripcion;
	}
	
    
	public void setid_nivel(Long newid_nivel)throws Exception
	{
		try {
			if(this.id_nivel!=newid_nivel) {
				if(newid_nivel==null) {
					//newid_nivel=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Grammar:Valor nulo no permitido en columna id_nivel");
					}
				}

				this.id_nivel=newid_nivel;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grammar(Long newid_tipo_grammar)throws Exception
	{
		try {
			if(this.id_tipo_grammar!=newid_tipo_grammar) {
				if(newid_tipo_grammar==null) {
					//newid_tipo_grammar=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Grammar:Valor nulo no permitido en columna id_tipo_grammar");
					}
				}

				this.id_tipo_grammar=newid_tipo_grammar;
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
						System.out.println("Grammar:Valor nulo no permitido en columna codigo");
					}
				}

				if(newcodigo!=null&&newcodigo.length()>30) {
					newcodigo=newcodigo.substring(0,28);
					System.out.println("Grammar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=30 en columna codigo");
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
						System.out.println("Grammar:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("Grammar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setdescripcion(String newdescripcion)throws Exception
	{
		try {
			if(this.descripcion!=newdescripcion) {
				if(newdescripcion==null) {
					//newdescripcion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Grammar:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>100) {
					newdescripcion=newdescripcion.substring(0,98);
					System.out.println("Grammar:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=100 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Nivel getNivel() {
		return this.nivel;
	}

	public TipoGrammar getTipoGrammar() {
		return this.tipogrammar;
	}

	
	
	public String getnivel_descripcion() {
		return this.nivel_descripcion;
	}

	public String gettipogrammar_descripcion() {
		return this.tipogrammar_descripcion;
	}

	
	
	public  void  setNivel(Nivel nivel) {
		try {
			this.nivel=nivel;
		} catch(Exception e) {
			;
		}
	}


	public  void  setTipoGrammar(TipoGrammar tipogrammar) {
		try {
			this.tipogrammar=tipogrammar;
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


	public  void  settipogrammar_descripcion(String tipogrammar_descripcion) {
		try {
			this.tipogrammar_descripcion=tipogrammar_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	public List<GrammarDetalle> getGrammarDetalles() {
		return this.grammardetalles;
	}

	
	
	public  void  setGrammarDetalles(List<GrammarDetalle> grammardetalles) {
		try {
			this.grammardetalles=grammardetalles;
		} catch(Exception e) {
			;
		}
	}

	
	/*PARA REPORTES*/
	String id_nivel_descripcion="";
	String id_tipo_grammar_descripcion="";
	
	
	
	public String getid_nivel_descripcion() {
		return id_nivel_descripcion;
	}
	public String getid_tipo_grammar_descripcion() {
		return id_tipo_grammar_descripcion;
	}
	
	
	public void setid_nivel_descripcion(String newid_nivel_descripcion)throws Exception {
		try {
			this.id_nivel_descripcion=newid_nivel_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_tipo_grammar_descripcion(String newid_tipo_grammar_descripcion)throws Exception {
		try {
			this.id_tipo_grammar_descripcion=newid_tipo_grammar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_nivel_descripcion="";
		this.id_tipo_grammar_descripcion="";
	}
	
	
	Object grammardetallesDescripcionReporte;
	
	
	public Object getgrammardetallesDescripcionReporte() {
		return grammardetallesDescripcionReporte;
	}

	
	
	public  void  setgrammardetallesDescripcionReporte(Object grammardetalles) {
		try {
			this.grammardetallesDescripcionReporte=grammardetalles;
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

	public Map<String, Object> getMap_Grammar() {
		return map_Grammar;
	}

	public void setMap_Grammar(Map<String, Object> map_Grammar) {
		this.map_Grammar = map_Grammar;
	}

	public void setMapValue_Grammar(String sKey,Object oValue) {
		this.map_Grammar.put(sKey, oValue);
	}
	
	public Object getMapValue_Grammar(String sKey) {
		return this.map_Grammar.get(sKey);
	}
}

