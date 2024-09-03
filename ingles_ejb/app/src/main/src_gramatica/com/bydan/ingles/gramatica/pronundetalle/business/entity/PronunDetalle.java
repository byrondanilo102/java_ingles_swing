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
package com.bydan.ingles.gramatica.pronundetalle.business.entity;

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
//import com.bydan.ingles.gramatica.util.PronunDetalleConstantesFunciones;
import com.bydan.ingles.gramatica.pronundetalle.util.*;

//FK

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL








@SuppressWarnings("unused")
public class PronunDetalle extends GeneralEntity implements Serializable ,Cloneable {//PronunDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient PronunDetalle pronundetalleOriginal;
	
	private Map<String, Object> map_PronunDetalle;
	
	public void inicializarMap_PronunDetalle() {
		this.map_PronunDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_pronun;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo_grammar_detalle;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=PronunDetalle_util.S_REGEX_IDEA,message=PronunDetalle_util.S_MENSAJE_REGEX_IDEA)
	private String idea;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronunDetalle_util.S_REGEX_TRADUCCION,message=PronunDetalle_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronunDetalle_util.S_REGEX_PRONUNCIACION,message=PronunDetalle_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronunDetalle_util.S_REGEX_DESCRIPCION,message=PronunDetalle_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
			
	
	public Pronun pronun;
	public TipoGrammarDetalle tipogrammardetalle;
	
	
	private String pronun_descripcion;
	private String tipogrammardetalle_descripcion;
	
	
		
	public PronunDetalle () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.pronundetalleOriginal=this;
		
 		this.id_pronun=-1L;
 		this.id_tipo_grammar_detalle=-1L;
 		this.idea="";
 		this.traduccion="";
 		this.pronunciacion="";
 		this.descripcion="";
		
		
		this.pronun=null;
		this.tipogrammardetalle=null;
		
		
		this.pronun_descripcion="";
		this.tipogrammardetalle_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PronunDetalle (Long id,Date versionRow,Long id_pronun,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.pronundetalleOriginal=this;
		
 		this.id_pronun=id_pronun;
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
	public PronunDetalle (Long id_pronun,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.pronundetalleOriginal=this;
		
 		this.id_pronun=id_pronun;
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
		PronunDetalle pronundetalleLocal=null;
		
		if(object!=null) {
			pronundetalleLocal=(PronunDetalle)object;
			
			if(pronundetalleLocal!=null) {
				if(this.getId()!=null && pronundetalleLocal.getId()!=null) {
					if(this.getId().equals(pronundetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PronunDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PronunDetalle_util.getPronunDetalleDescripcion(this);
		} else {
			sDetalle=PronunDetalle_util.getPronunDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PronunDetalle getPronunDetalleOriginal() {
		return this.pronundetalleOriginal;
	}
	
	public void setPronunDetalleOriginal(PronunDetalle pronundetalle) {
		try {
			this.pronundetalleOriginal=pronundetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_pronun() {
		return this.id_pronun;
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
	
    
	public void setid_pronun(Long newid_pronun)throws Exception
	{
		try {
			if(this.id_pronun!=newid_pronun) {
				if(newid_pronun==null) {
					//newid_pronun=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronunDetalle:Valor nulo no permitido en columna id_pronun");
					}
				}

				this.id_pronun=newid_pronun;
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
						System.out.println("PronunDetalle:Valor nulo no permitido en columna id_tipo_grammar_detalle");
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
						System.out.println("PronunDetalle:Valor nulo no permitido en columna idea");
					}
				}

				if(newidea!=null&&newidea.length()>50) {
					newidea=newidea.substring(0,48);
					System.out.println("PronunDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna idea");
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
						System.out.println("PronunDetalle:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("PronunDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("PronunDetalle:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>50) {
					newpronunciacion=newpronunciacion.substring(0,48);
					System.out.println("PronunDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna pronunciacion");
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
						System.out.println("PronunDetalle:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>50) {
					newdescripcion=newdescripcion.substring(0,48);
					System.out.println("PronunDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Pronun getPronun() {
		return this.pronun;
	}

	public TipoGrammarDetalle getTipoGrammarDetalle() {
		return this.tipogrammardetalle;
	}

	
	
	public String getpronun_descripcion() {
		return this.pronun_descripcion;
	}

	public String gettipogrammardetalle_descripcion() {
		return this.tipogrammardetalle_descripcion;
	}

	
	
	public  void  setPronun(Pronun pronun) {
		try {
			this.pronun=pronun;
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


	
	
	public  void  setpronun_descripcion(String pronun_descripcion) {
		try {
			this.pronun_descripcion=pronun_descripcion;
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
	String id_pronun_descripcion="";
	String id_tipo_grammar_detalle_descripcion="";
	
	
	
	public String getid_pronun_descripcion() {
		return id_pronun_descripcion;
	}
	public String getid_tipo_grammar_detalle_descripcion() {
		return id_tipo_grammar_detalle_descripcion;
	}
	
	
	public void setid_pronun_descripcion(String newid_pronun_descripcion)throws Exception {
		try {
			this.id_pronun_descripcion=newid_pronun_descripcion;
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
		
		this.id_pronun_descripcion="";
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

	public Map<String, Object> getMap_PronunDetalle() {
		return map_PronunDetalle;
	}

	public void setMap_PronunDetalle(Map<String, Object> map_PronunDetalle) {
		this.map_PronunDetalle = map_PronunDetalle;
	}

	public void setMapValue_PronunDetalle(String sKey,Object oValue) {
		this.map_PronunDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_PronunDetalle(String sKey) {
		return this.map_PronunDetalle.get(sKey);
	}
}

