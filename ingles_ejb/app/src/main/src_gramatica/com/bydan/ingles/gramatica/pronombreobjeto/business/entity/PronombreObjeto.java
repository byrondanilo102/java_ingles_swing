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
package com.bydan.ingles.gramatica.pronombreobjeto.business.entity;

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
//import com.bydan.ingles.gramatica.util.PronombreObjetoConstantesFunciones;
import com.bydan.ingles.gramatica.pronombreobjeto.util.*;

//FK


//REL








@SuppressWarnings("unused")
public class PronombreObjeto extends GeneralEntitySinIdGenerated implements Serializable ,Cloneable {//PronombreObjetoAdditional,GeneralEntity
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
	
	
	private transient PronombreObjeto pronombreobjetoOriginal;
	
	private Map<String, Object> map_PronombreObjeto;
	
	public void inicializarMap_PronombreObjeto() {
		this.map_PronombreObjeto = new HashMap<String,Object>();
	}
	
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@NotEmpty(message=ConstantesValidacion.S_VALIDACION_NOVACIO)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRONOMBRE,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRONOMBRE)
	private String pronombre;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRESENTE,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRESENTE)
	private String presente;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRESENTE_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRESENTE_CONTRA)
	private String presente_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRESENTE_NO,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRESENTE_NO)
	private String presente_no;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRESENTE_NO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRESENTE_NO_CONTRA)
	private String presente_no_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PRESENTE_NO_SE,message=PronombreObjeto_util.S_MENSAJE_REGEX_PRESENTE_NO_SE)
	private String presente_no_se;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=25,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PERFECTO,message=PronombreObjeto_util.S_MENSAJE_REGEX_PERFECTO)
	private String perfecto;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PERFECTO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PERFECTO_CONTRA)
	private String perfecto_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PERFECTO_NO,message=PronombreObjeto_util.S_MENSAJE_REGEX_PERFECTO_NO)
	private String perfecto_no;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PERFECTO_NO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PERFECTO_NO_CONTRA)
	private String perfecto_no_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PERFECTO_NO_SE,message=PronombreObjeto_util.S_MENSAJE_REGEX_PERFECTO_NO_SE)
	private String perfecto_no_se;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=25,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PASADO,message=PronombreObjeto_util.S_MENSAJE_REGEX_PASADO)
	private String pasado;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PASADO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PASADO_CONTRA)
	private String pasado_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PASADO_NO,message=PronombreObjeto_util.S_MENSAJE_REGEX_PASADO_NO)
	private String pasado_no;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=10,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PASADO_NO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_PASADO_NO_CONTRA)
	private String pasado_no_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_PASADO_NO_SE,message=PronombreObjeto_util.S_MENSAJE_REGEX_PASADO_NO_SE)
	private String pasado_no_se;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=25,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_FUTURO,message=PronombreObjeto_util.S_MENSAJE_REGEX_FUTURO)
	private String futuro;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_FUTURO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_FUTURO_CONTRA)
	private String futuro_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_FUTURO_NO,message=PronombreObjeto_util.S_MENSAJE_REGEX_FUTURO_NO)
	private String futuro_no;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=50,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_FUTURO_NO_CONTRA,message=PronombreObjeto_util.S_MENSAJE_REGEX_FUTURO_NO_CONTRA)
	private String futuro_no_contra;
	
	//@Expose
	//@NotNull(message=ConstantesValidacion.S_VALIDACION_NOTNULL)
	//@Size(min=0,max=15,message=ConstantesValidacion.S_VALIDACION_LENGTH)
	//@Pattern(regexp=PronombreObjeto_util.S_REGEX_FUTURO_NO_SE,message=PronombreObjeto_util.S_MENSAJE_REGEX_FUTURO_NO_SE)
	private String futuro_no_se;
			
	
	
	
	
	
		
	public PronombreObjeto () throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		
		
		this.versionRow=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());//new Date();
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		this.sType="NONE";
		
		this.pronombreobjetoOriginal=this;
		
 		this.pronombre="";
 		this.presente="";
 		this.presente_contra="";
 		this.presente_no="";
 		this.presente_no_contra="";
 		this.presente_no_se="";
 		this.perfecto="";
 		this.perfecto_contra="";
 		this.perfecto_no="";
 		this.perfecto_no_contra="";
 		this.perfecto_no_se="";
 		this.pasado="";
 		this.pasado_contra="";
 		this.pasado_no="";
 		this.pasado_no_contra="";
 		this.pasado_no_se="";
 		this.futuro="";
 		this.futuro_contra="";
 		this.futuro_no="";
 		this.futuro_no_contra="";
 		this.futuro_no_se="";
		
		
		
		
		
		
		
			
		
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
    //PARA REPORTES
	public PronombreObjeto (Long id,Date versionRow,String pronombre,String presente,String presente_contra,String presente_no,String presente_no_contra,String presente_no_se,String perfecto,String perfecto_contra,String perfecto_no,String perfecto_no_contra,String perfecto_no_se,String pasado,String pasado_contra,String pasado_no,String pasado_no_contra,String pasado_no_se,String futuro,String futuro_contra,String futuro_no,String futuro_no_contra,String futuro_no_se) throws Exception {
		super();		
		
		this.id=id;
		this.idOriginal=this.id;
		this.versionRow=versionRow;
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.pronombreobjetoOriginal=this;
		
 		this.pronombre=pronombre;
 		this.presente=presente;
 		this.presente_contra=presente_contra;
 		this.presente_no=presente_no;
 		this.presente_no_contra=presente_no_contra;
 		this.presente_no_se=presente_no_se;
 		this.perfecto=perfecto;
 		this.perfecto_contra=perfecto_contra;
 		this.perfecto_no=perfecto_no;
 		this.perfecto_no_contra=perfecto_no_contra;
 		this.perfecto_no_se=perfecto_no_se;
 		this.pasado=pasado;
 		this.pasado_contra=pasado_contra;
 		this.pasado_no=pasado_no;
 		this.pasado_no_contra=pasado_no_contra;
 		this.pasado_no_se=pasado_no_se;
 		this.futuro=futuro;
 		this.futuro_contra=futuro_contra;
 		this.futuro_no=futuro_no;
 		this.futuro_no_contra=futuro_no_contra;
 		this.futuro_no_se=futuro_no_se;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	 //PARA REPORTES
	public PronombreObjeto (String pronombre,String presente,String presente_contra,String presente_no,String presente_no_contra,String presente_no_se,String perfecto,String perfecto_contra,String perfecto_no,String perfecto_no_contra,String perfecto_no_se,String pasado,String pasado_contra,String pasado_no,String pasado_no_contra,String pasado_no_se,String futuro,String futuro_contra,String futuro_no,String futuro_no_contra,String futuro_no_se) throws Exception {
		super();		
		
		this.id=0L;
		this.idOriginal=0L;
		this.versionRow=new Date();
		
		this.isNew=true;
		this.isChanged=false;
		this.isDeleted=false;
		
		this.pronombreobjetoOriginal=this;
		
 		this.pronombre=pronombre;
 		this.presente=presente;
 		this.presente_contra=presente_contra;
 		this.presente_no=presente_no;
 		this.presente_no_contra=presente_no_contra;
 		this.presente_no_se=presente_no_se;
 		this.perfecto=perfecto;
 		this.perfecto_contra=perfecto_contra;
 		this.perfecto_no=perfecto_no;
 		this.perfecto_no_contra=perfecto_no_contra;
 		this.perfecto_no_se=perfecto_no_se;
 		this.pasado=pasado;
 		this.pasado_contra=pasado_contra;
 		this.pasado_no=pasado_no;
 		this.pasado_no_contra=pasado_no_contra;
 		this.pasado_no_se=pasado_no_se;
 		this.futuro=futuro;
 		this.futuro_contra=futuro_contra;
 		this.futuro_no=futuro_no;
 		this.futuro_no_contra=futuro_no_contra;
 		this.futuro_no_se=futuro_no_se;
		
		/*PARA REPORTES*/
		this.inicializarVariablesParaReporte();
		/*PARA REPORTES*/
    } 
	
	public boolean equals(Object object) {
		boolean equal=false;
		PronombreObjeto pronombreobjetoLocal=null;
		
		if(object!=null) {
			pronombreobjetoLocal=(PronombreObjeto)object;
			
			if(pronombreobjetoLocal!=null) {
				if(this.getId()!=null && pronombreobjetoLocal.getId()!=null) {
					if(this.getId().equals(pronombreobjetoLocal.getId())) {
						equal=true;
					}
				}
			}
		}
		
		return equal;
	}
	
	public String toString() {
		String sDetalle="";
		
		if(!PronombreObjeto_util.CON_DESCRIPCION_DETALLADO) {
        	sDetalle=PronombreObjeto_util.getPronombreObjetoDescripcion(this);
		} else {
			sDetalle=PronombreObjeto_util.getPronombreObjetoDescripcionDetallado(this);
		}
		
		return sDetalle;
    }
	
	public PronombreObjeto getPronombreObjetoOriginal() {
		return this.pronombreobjetoOriginal;
	}
	
	public void setPronombreObjetoOriginal(PronombreObjeto pronombreobjeto) {
		try {
			this.pronombreobjetoOriginal=pronombreobjeto;
		} catch(Exception e) {
			;
		}
	}
	
	
    
	
	public String getpronombre() {
		return this.pronombre;
	}
    
	
	public String getpresente() {
		return this.presente;
	}
    
	
	public String getpresente_contra() {
		return this.presente_contra;
	}
    
	
	public String getpresente_no() {
		return this.presente_no;
	}
    
	
	public String getpresente_no_contra() {
		return this.presente_no_contra;
	}
    
	
	public String getpresente_no_se() {
		return this.presente_no_se;
	}
    
	
	public String getperfecto() {
		return this.perfecto;
	}
    
	
	public String getperfecto_contra() {
		return this.perfecto_contra;
	}
    
	
	public String getperfecto_no() {
		return this.perfecto_no;
	}
    
	
	public String getperfecto_no_contra() {
		return this.perfecto_no_contra;
	}
    
	
	public String getperfecto_no_se() {
		return this.perfecto_no_se;
	}
    
	
	public String getpasado() {
		return this.pasado;
	}
    
	
	public String getpasado_contra() {
		return this.pasado_contra;
	}
    
	
	public String getpasado_no() {
		return this.pasado_no;
	}
    
	
	public String getpasado_no_contra() {
		return this.pasado_no_contra;
	}
    
	
	public String getpasado_no_se() {
		return this.pasado_no_se;
	}
    
	
	public String getfuturo() {
		return this.futuro;
	}
    
	
	public String getfuturo_contra() {
		return this.futuro_contra;
	}
    
	
	public String getfuturo_no() {
		return this.futuro_no;
	}
    
	
	public String getfuturo_no_contra() {
		return this.futuro_no_contra;
	}
    
	
	public String getfuturo_no_se() {
		return this.futuro_no_se;
	}
	
    
	public void setpronombre(String newpronombre)throws Exception
	{
		try {
			if(this.pronombre!=newpronombre) {
				if(newpronombre==null) {
					//newpronombre="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pronombre");
					}
				}

				if(newpronombre!=null&&newpronombre.length()>15) {
					newpronombre=newpronombre.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna pronombre");
				}

				this.pronombre=newpronombre;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpresente(String newpresente)throws Exception
	{
		try {
			if(this.presente!=newpresente) {
				if(newpresente==null) {
					//newpresente="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna presente");
					}
				}

				if(newpresente!=null&&newpresente.length()>15) {
					newpresente=newpresente.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna presente");
				}

				this.presente=newpresente;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpresente_contra(String newpresente_contra)throws Exception
	{
		try {
			if(this.presente_contra!=newpresente_contra) {
				if(newpresente_contra==null) {
					//newpresente_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna presente_contra");
					}
				}

				if(newpresente_contra!=null&&newpresente_contra.length()>10) {
					newpresente_contra=newpresente_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna presente_contra");
				}

				this.presente_contra=newpresente_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpresente_no(String newpresente_no)throws Exception
	{
		try {
			if(this.presente_no!=newpresente_no) {
				if(newpresente_no==null) {
					//newpresente_no="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna presente_no");
					}
				}

				if(newpresente_no!=null&&newpresente_no.length()>15) {
					newpresente_no=newpresente_no.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna presente_no");
				}

				this.presente_no=newpresente_no;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpresente_no_contra(String newpresente_no_contra)throws Exception
	{
		try {
			if(this.presente_no_contra!=newpresente_no_contra) {
				if(newpresente_no_contra==null) {
					//newpresente_no_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna presente_no_contra");
					}
				}

				if(newpresente_no_contra!=null&&newpresente_no_contra.length()>10) {
					newpresente_no_contra=newpresente_no_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna presente_no_contra");
				}

				this.presente_no_contra=newpresente_no_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpresente_no_se(String newpresente_no_se)throws Exception
	{
		try {
			if(this.presente_no_se!=newpresente_no_se) {
				if(newpresente_no_se==null) {
					//newpresente_no_se="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna presente_no_se");
					}
				}

				if(newpresente_no_se!=null&&newpresente_no_se.length()>15) {
					newpresente_no_se=newpresente_no_se.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna presente_no_se");
				}

				this.presente_no_se=newpresente_no_se;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setperfecto(String newperfecto)throws Exception
	{
		try {
			if(this.perfecto!=newperfecto) {
				if(newperfecto==null) {
					//newperfecto="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna perfecto");
					}
				}

				if(newperfecto!=null&&newperfecto.length()>25) {
					newperfecto=newperfecto.substring(0,23);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna perfecto");
				}

				this.perfecto=newperfecto;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setperfecto_contra(String newperfecto_contra)throws Exception
	{
		try {
			if(this.perfecto_contra!=newperfecto_contra) {
				if(newperfecto_contra==null) {
					//newperfecto_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna perfecto_contra");
					}
				}

				if(newperfecto_contra!=null&&newperfecto_contra.length()>10) {
					newperfecto_contra=newperfecto_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna perfecto_contra");
				}

				this.perfecto_contra=newperfecto_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setperfecto_no(String newperfecto_no)throws Exception
	{
		try {
			if(this.perfecto_no!=newperfecto_no) {
				if(newperfecto_no==null) {
					//newperfecto_no="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna perfecto_no");
					}
				}

				if(newperfecto_no!=null&&newperfecto_no.length()>15) {
					newperfecto_no=newperfecto_no.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna perfecto_no");
				}

				this.perfecto_no=newperfecto_no;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setperfecto_no_contra(String newperfecto_no_contra)throws Exception
	{
		try {
			if(this.perfecto_no_contra!=newperfecto_no_contra) {
				if(newperfecto_no_contra==null) {
					//newperfecto_no_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna perfecto_no_contra");
					}
				}

				if(newperfecto_no_contra!=null&&newperfecto_no_contra.length()>10) {
					newperfecto_no_contra=newperfecto_no_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna perfecto_no_contra");
				}

				this.perfecto_no_contra=newperfecto_no_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setperfecto_no_se(String newperfecto_no_se)throws Exception
	{
		try {
			if(this.perfecto_no_se!=newperfecto_no_se) {
				if(newperfecto_no_se==null) {
					//newperfecto_no_se="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna perfecto_no_se");
					}
				}

				if(newperfecto_no_se!=null&&newperfecto_no_se.length()>15) {
					newperfecto_no_se=newperfecto_no_se.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna perfecto_no_se");
				}

				this.perfecto_no_se=newperfecto_no_se;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado(String newpasado)throws Exception
	{
		try {
			if(this.pasado!=newpasado) {
				if(newpasado==null) {
					//newpasado="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pasado");
					}
				}

				if(newpasado!=null&&newpasado.length()>25) {
					newpasado=newpasado.substring(0,23);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna pasado");
				}

				this.pasado=newpasado;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado_contra(String newpasado_contra)throws Exception
	{
		try {
			if(this.pasado_contra!=newpasado_contra) {
				if(newpasado_contra==null) {
					//newpasado_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pasado_contra");
					}
				}

				if(newpasado_contra!=null&&newpasado_contra.length()>10) {
					newpasado_contra=newpasado_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna pasado_contra");
				}

				this.pasado_contra=newpasado_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado_no(String newpasado_no)throws Exception
	{
		try {
			if(this.pasado_no!=newpasado_no) {
				if(newpasado_no==null) {
					//newpasado_no="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pasado_no");
					}
				}

				if(newpasado_no!=null&&newpasado_no.length()>15) {
					newpasado_no=newpasado_no.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna pasado_no");
				}

				this.pasado_no=newpasado_no;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado_no_contra(String newpasado_no_contra)throws Exception
	{
		try {
			if(this.pasado_no_contra!=newpasado_no_contra) {
				if(newpasado_no_contra==null) {
					//newpasado_no_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pasado_no_contra");
					}
				}

				if(newpasado_no_contra!=null&&newpasado_no_contra.length()>10) {
					newpasado_no_contra=newpasado_no_contra.substring(0,8);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=10 en columna pasado_no_contra");
				}

				this.pasado_no_contra=newpasado_no_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setpasado_no_se(String newpasado_no_se)throws Exception
	{
		try {
			if(this.pasado_no_se!=newpasado_no_se) {
				if(newpasado_no_se==null) {
					//newpasado_no_se="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna pasado_no_se");
					}
				}

				if(newpasado_no_se!=null&&newpasado_no_se.length()>15) {
					newpasado_no_se=newpasado_no_se.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna pasado_no_se");
				}

				this.pasado_no_se=newpasado_no_se;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfuturo(String newfuturo)throws Exception
	{
		try {
			if(this.futuro!=newfuturo) {
				if(newfuturo==null) {
					//newfuturo="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna futuro");
					}
				}

				if(newfuturo!=null&&newfuturo.length()>25) {
					newfuturo=newfuturo.substring(0,23);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=25 en columna futuro");
				}

				this.futuro=newfuturo;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfuturo_contra(String newfuturo_contra)throws Exception
	{
		try {
			if(this.futuro_contra!=newfuturo_contra) {
				if(newfuturo_contra==null) {
					//newfuturo_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna futuro_contra");
					}
				}

				if(newfuturo_contra!=null&&newfuturo_contra.length()>50) {
					newfuturo_contra=newfuturo_contra.substring(0,48);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna futuro_contra");
				}

				this.futuro_contra=newfuturo_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfuturo_no(String newfuturo_no)throws Exception
	{
		try {
			if(this.futuro_no!=newfuturo_no) {
				if(newfuturo_no==null) {
					//newfuturo_no="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna futuro_no");
					}
				}

				if(newfuturo_no!=null&&newfuturo_no.length()>15) {
					newfuturo_no=newfuturo_no.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna futuro_no");
				}

				this.futuro_no=newfuturo_no;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfuturo_no_contra(String newfuturo_no_contra)throws Exception
	{
		try {
			if(this.futuro_no_contra!=newfuturo_no_contra) {
				if(newfuturo_no_contra==null) {
					//newfuturo_no_contra="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna futuro_no_contra");
					}
				}

				if(newfuturo_no_contra!=null&&newfuturo_no_contra.length()>50) {
					newfuturo_no_contra=newfuturo_no_contra.substring(0,48);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna futuro_no_contra");
				}

				this.futuro_no_contra=newfuturo_no_contra;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfuturo_no_se(String newfuturo_no_se)throws Exception
	{
		try {
			if(this.futuro_no_se!=newfuturo_no_se) {
				if(newfuturo_no_se==null) {
					//newfuturo_no_se="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("PronombreObjeto:Valor nulo no permitido en columna futuro_no_se");
					}
				}

				if(newfuturo_no_se!=null&&newfuturo_no_se.length()>15) {
					newfuturo_no_se=newfuturo_no_se.substring(0,13);
					System.out.println("PronombreObjeto:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=15 en columna futuro_no_se");
				}

				this.futuro_no_se=newfuturo_no_se;
				this.setIsChanged(true);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*PARA REPORTES*/
	
	
	
	
	
	
	public void inicializarVariablesParaReporte() {
		
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

	public Map<String, Object> getMap_PronombreObjeto() {
		return map_PronombreObjeto;
	}

	public void setMap_PronombreObjeto(Map<String, Object> map_PronombreObjeto) {
		this.map_PronombreObjeto = map_PronombreObjeto;
	}

	public void setMapValue_PronombreObjeto(String sKey,Object oValue) {
		this.map_PronombreObjeto.put(sKey, oValue);
	}
	
	public Object getMapValue_PronombreObjeto(String sKey) {
		return this.map_PronombreObjeto.get(sKey);
	}
}

