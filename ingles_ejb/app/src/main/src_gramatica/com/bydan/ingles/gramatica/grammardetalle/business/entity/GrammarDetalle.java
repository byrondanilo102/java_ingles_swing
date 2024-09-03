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
package com.bydan.ingles.gramatica.grammardetalle.business.entity;

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
//import com.bydan.ingles.gramatica.util.GrammarDetalleConstantesFunciones;
import com.bydan.ingles.gramatica.grammardetalle.util.*;

//FK

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL








@SuppressWarnings("unused")
public class GrammarDetalle extends GeneralEntity implements Serializable ,Cloneable {//GrammarDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient GrammarDetalle grammardetalleOriginal;
	
	private Map<String, Object> map_GrammarDetalle;
	
	public void inicializarMap_GrammarDetalle() {
		this.map_GrammarDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_grammar;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo_grammar_detalle;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=GrammarDetalle_util.S_REGEX_IDEA,message=GrammarDetalle_util.S_MENSAJE_REGEX_IDEA)
	private String idea;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=GrammarDetalle_util.S_REGEX_TRADUCCION,message=GrammarDetalle_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=GrammarDetalle_util.S_REGEX_PRONUNCIACION,message=GrammarDetalle_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=GrammarDetalle_util.S_REGEX_DESCRIPCION,message=GrammarDetalle_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
			
	
	public Grammar grammar;
	public TipoGrammarDetalle tipogrammardetalle;
	
	
	private String grammar_descripcion;
	private String tipogrammardetalle_descripcion;
	
	
		
	public GrammarDetalle () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.grammardetalleOriginal=this;
		
 		this.id_grammar=-1L;
 		this.id_tipo_grammar_detalle=-1L;
 		this.idea="";
 		this.traduccion="";
 		this.pronunciacion="";
 		this.descripcion="";
		
		
		this.grammar=null;
		this.tipogrammardetalle=null;
		
		
		this.grammar_descripcion="";
		this.tipogrammardetalle_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public GrammarDetalle (Long id,Date versionRow,Long id_grammar,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.grammardetalleOriginal=this;
		
 		this.id_grammar=id_grammar;
 		this.id_tipo_grammar_detalle=id_tipo_grammar_detalle;
 		this.idea=idea;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public GrammarDetalle (Long id_grammar,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.grammardetalleOriginal=this;
		
 		this.id_grammar=id_grammar;
 		this.id_tipo_grammar_detalle=id_tipo_grammar_detalle;
 		this.idea=idea;
 		this.traduccion=traduccion;
 		this.pronunciacion=pronunciacion;
 		this.descripcion=descripcion;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		GrammarDetalle grammardetalleLocal=null;
		
		if(object!=null) {
			grammardetalleLocal=(GrammarDetalle)object;
			
			if(grammardetalleLocal!=null) {
				if(this.getId()!=null && grammardetalleLocal.getId()!=null) {
					if(this.getId().equals(grammardetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!GrammarDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=GrammarDetalle_util.getGrammarDetalleDescripcion(this);
		} else {
			sDetalle=GrammarDetalle_util.getGrammarDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public GrammarDetalle getGrammarDetalleOriginal() {
		return this.grammardetalleOriginal;
	}
	
	public void setGrammarDetalleOriginal(GrammarDetalle grammardetalle) {
		try {
			this.grammardetalleOriginal=grammardetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_grammar() {
		return this.id_grammar;
	}
    
	
	public Long getid_tipo_grammar_detalle() {
		return this.id_tipo_grammar_detalle;
	}
    
	
	public String getidea() {
		return this.idea;
	}
    
	
	public String gettraduccion() {
		return this.traduccion;
	}
    
	
	public String getpronunciacion() {
		return this.pronunciacion;
	}
    
	
	public String getdescripcion() {
		return this.descripcion;
	}
	
    
	public void setid_grammar(Long newid_grammar)throws Exception
	{
		try {
			if(this.id_grammar!=newid_grammar) {
				if(newid_grammar==null) {
					//newid_grammar=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna id_grammar");
					}
				}

				this.id_grammar=newid_grammar;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_grammar_detalle(Long newid_tipo_grammar_detalle)throws Exception
	{
		try {
			if(this.id_tipo_grammar_detalle!=newid_tipo_grammar_detalle) {
				if(newid_tipo_grammar_detalle==null) {
					//newid_tipo_grammar_detalle=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna id_tipo_grammar_detalle");
					}
				}

				this.id_tipo_grammar_detalle=newid_tipo_grammar_detalle;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setidea(String newidea)throws Exception
	{
		try {
			if(this.idea!=newidea) {
				if(newidea==null) {
					//newidea="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna idea");
					}
				}

				if(newidea!=null&&newidea.length()>50) {
					newidea=newidea.substring(0,48);
					System.out.println("GrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna idea");
				}

				this.idea=newidea;
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
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("GrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>50) {
					newpronunciacion=newpronunciacion.substring(0,48);
					System.out.println("GrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna pronunciacion");
				}

				this.pronunciacion=newpronunciacion;
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
						System.out.println("GrammarDetalle:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>50) {
					newdescripcion=newdescripcion.substring(0,48);
					System.out.println("GrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Grammar getGrammar() {
		return this.grammar;
	}

	public TipoGrammarDetalle getTipoGrammarDetalle() {
		return this.tipogrammardetalle;
	}

	
	
	public String getgrammar_descripcion() {
		return this.grammar_descripcion;
	}

	public String gettipogrammardetalle_descripcion() {
		return this.tipogrammardetalle_descripcion;
	}

	
	
	public  void  setGrammar(Grammar grammar) {
		try {
			this.grammar=grammar;
		} catch(Exception e) {
			;
		}
	}


	public  void  setTipoGrammarDetalle(TipoGrammarDetalle tipogrammardetalle) {
		try {
			this.tipogrammardetalle=tipogrammardetalle;
		} catch(Exception e) {
			;
		}
	}


	
	
	public  void  setgrammar_descripcion(String grammar_descripcion) {
		try {
			this.grammar_descripcion=grammar_descripcion;
		} catch(Exception e) {
			;
		}
	}


	public  void  settipogrammardetalle_descripcion(String tipogrammardetalle_descripcion) {
		try {
			this.tipogrammardetalle_descripcion=tipogrammardetalle_descripcion;
		} catch(Exception e) {
			;
		}
	}


	
	
	
	
	
	/*PARA REPORTES*/
	String id_grammar_descripcion="";
	String id_tipo_grammar_detalle_descripcion="";
	
	
	
	public String getid_grammar_descripcion() {
		return id_grammar_descripcion;
	}
	public String getid_tipo_grammar_detalle_descripcion() {
		return id_tipo_grammar_detalle_descripcion;
	}
	
	
	public void setid_grammar_descripcion(String newid_grammar_descripcion)throws Exception {
		try {
			this.id_grammar_descripcion=newid_grammar_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	public void setid_tipo_grammar_detalle_descripcion(String newid_tipo_grammar_detalle_descripcion)throws Exception {
		try {
			this.id_tipo_grammar_detalle_descripcion=newid_tipo_grammar_detalle_descripcion;
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	public void inicializarVariablesParaReporte() {
		
		this.id_grammar_descripcion="";
		this.id_tipo_grammar_detalle_descripcion="";
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

	public Map<String, Object> getMap_GrammarDetalle() {
		return map_GrammarDetalle;
	}

	public void setMap_GrammarDetalle(Map<String, Object> map_GrammarDetalle) {
		this.map_GrammarDetalle = map_GrammarDetalle;
	}

	public void setMapValue_GrammarDetalle(String sKey,Object oValue) {
		this.map_GrammarDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_GrammarDetalle(String sKey) {
		return this.map_GrammarDetalle.get(sKey);
	}
}

