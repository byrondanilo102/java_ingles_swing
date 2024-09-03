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
package com.bydan.ingles.gramatica.vocabulariodetalle.business.entity;

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
//import com.bydan.ingles.gramatica.util.VocabularioDetalleConstantesFunciones;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.*;

//FK

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;

//REL








@SuppressWarnings("unused")
public class VocabularioDetalle extends GeneralEntity implements Serializable ,Cloneable {//VocabularioDetalleAdditional,GeneralEntity
	private static final long serialVersionUID=1L;
	
	 protected Long id;
	 protected boolean isNew;
	 protected boolean isChanged;
	 protected boolean isDeleted;
	 protected boolean isSelected;
	 protected Date versionRow;
	 protected String sVersionRow;
	 protected String sType;
	
	
	private transient VocabularioDetalle vocabulariodetalleOriginal;
	
	private Map<String, Object> map_VocabularioDetalle;
	
	public void inicializarMap_VocabularioDetalle() {
		this.map_VocabularioDetalle = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_vocabulario;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Digits(integer=19,fraction=0,message=ConstantesValidacion.S_VALIDACION_BIGINT)
	//@Min(value=0,message=ConstantesValidacion.S_VALIDACION__OPCION_MIN)
	private Long id_tipo_grammar_detalle;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=VocabularioDetalle_util.S_REGEX_IDEA,message=VocabularioDetalle_util.S_MENSAJE_REGEX_IDEA)
	private String idea;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VocabularioDetalle_util.S_REGEX_TRADUCCION,message=VocabularioDetalle_util.S_MENSAJE_REGEX_TRADUCCION)
	private String traduccion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VocabularioDetalle_util.S_REGEX_PRONUNCIACION,message=VocabularioDetalle_util.S_MENSAJE_REGEX_PRONUNCIACION)
	private String pronunciacion;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=VocabularioDetalle_util.S_REGEX_DESCRIPCION,message=VocabularioDetalle_util.S_MENSAJE_REGEX_DESCRIPCION)
	private String descripcion;
			
	
	public Vocabulario vocabulario;
	public TipoGrammarDetalle tipogrammardetalle;
	
	
	private String vocabulario_descripcion;
	private String tipogrammardetalle_descripcion;
	
	
		
	public VocabularioDetalle () throws Exception {
		super();		
		
		this.id=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.vocabulariodetalleOriginal=this;
		
 		this.id_vocabulario=-1L;
 		this.id_tipo_grammar_detalle=-1L;
 		this.idea="";
 		this.traduccion="";
 		this.pronunciacion="";
 		this.descripcion="";
		
		
		this.vocabulario=null;
		this.tipogrammardetalle=null;
		
		
		this.vocabulario_descripcion="";
		this.tipogrammardetalle_descripcion="";
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public VocabularioDetalle (Long id,Date versionRow,Long id_vocabulario,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.vocabulariodetalleOriginal=this;
		
 		this.id_vocabulario=id_vocabulario;
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
	public VocabularioDetalle (Long id_vocabulario,Long id_tipo_grammar_detalle,String idea,String traduccion,String pronunciacion,String descripcion) throws Exception {
		super();		
		
		this.id=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.vocabulariodetalleOriginal=this;
		
 		this.id_vocabulario=id_vocabulario;
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
		VocabularioDetalle vocabulariodetalleLocal=null;
		
		if(object!=null) {
			vocabulariodetalleLocal=(VocabularioDetalle)object;
			
			if(vocabulariodetalleLocal!=null) {
				if(this.getId()!=null && vocabulariodetalleLocal.getId()!=null) {
					if(this.getId().equals(vocabulariodetalleLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!VocabularioDetalle_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=VocabularioDetalle_util.getVocabularioDetalleDescripcion(this);
		} else {
			sDetalle=VocabularioDetalle_util.getVocabularioDetalleDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public VocabularioDetalle getVocabularioDetalleOriginal() {
		return this.vocabulariodetalleOriginal;
	}
	
	public void setVocabularioDetalleOriginal(VocabularioDetalle vocabulariodetalle) {
		try {
			this.vocabulariodetalleOriginal=vocabulariodetalle;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public Long getid_vocabulario() {
		return this.id_vocabulario;
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
	
    
	public void setid_vocabulario(Long newid_vocabulario)throws Exception
	{
		try {
			if(this.id_vocabulario!=newid_vocabulario) {
				if(newid_vocabulario==null) {
					//newid_vocabulario=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna id_vocabulario");
					}
				}

				this.id_vocabulario=newid_vocabulario;
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
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna id_tipo_grammar_detalle");
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
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna idea");
					}
				}

				if(newidea!=null&&newidea.length()>50) {
					newidea=newidea.substring(0,48);
					System.out.println("VocabularioDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna idea");
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
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna traduccion");
					}
				}

				if(newtraduccion!=null&&newtraduccion.length()>50) {
					newtraduccion=newtraduccion.substring(0,48);
					System.out.println("VocabularioDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna traduccion");
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
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna pronunciacion");
					}
				}

				if(newpronunciacion!=null&&newpronunciacion.length()>50) {
					newpronunciacion=newpronunciacion.substring(0,48);
					System.out.println("VocabularioDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna pronunciacion");
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
						System.out.println("VocabularioDetalle:Valor nulo no permitido en columna descripcion");
					}
				}

				if(newdescripcion!=null&&newdescripcion.length()>50) {
					newdescripcion=newdescripcion.substring(0,48);
					System.out.println("VocabularioDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna descripcion");
				}

				this.descripcion=newdescripcion;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Vocabulario getVocabulario() {
		return this.vocabulario;
	}

	public TipoGrammarDetalle getTipoGrammarDetalle() {
		return this.tipogrammardetalle;
	}

	
	
	public String getvocabulario_descripcion() {
		return this.vocabulario_descripcion;
	}

	public String gettipogrammardetalle_descripcion() {
		return this.tipogrammardetalle_descripcion;
	}

	
	
	public  void  setVocabulario(Vocabulario vocabulario) {
		try {
			this.vocabulario=vocabulario;
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


	
	
	public  void  setvocabulario_descripcion(String vocabulario_descripcion) {
		try {
			this.vocabulario_descripcion=vocabulario_descripcion;
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
	String id_vocabulario_descripcion="";
	String id_tipo_grammar_detalle_descripcion="";
	
	
	
	public String getid_vocabulario_descripcion() {
		return id_vocabulario_descripcion;
	}
	public String getid_tipo_grammar_detalle_descripcion() {
		return id_tipo_grammar_detalle_descripcion;
	}
	
	
	public void setid_vocabulario_descripcion(String newid_vocabulario_descripcion)throws Exception {
		try {
			this.id_vocabulario_descripcion=newid_vocabulario_descripcion;
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
		
		this.id_vocabulario_descripcion="";
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

	public Map<String, Object> getMap_VocabularioDetalle() {
		return map_VocabularioDetalle;
	}

	public void setMap_VocabularioDetalle(Map<String, Object> map_VocabularioDetalle) {
		this.map_VocabularioDetalle = map_VocabularioDetalle;
	}

	public void setMapValue_VocabularioDetalle(String sKey,Object oValue) {
		this.map_VocabularioDetalle.put(sKey, oValue);
	}
	
	public Object getMapValue_VocabularioDetalle(String sKey) {
		return this.map_VocabularioDetalle.get(sKey);
	}
}

