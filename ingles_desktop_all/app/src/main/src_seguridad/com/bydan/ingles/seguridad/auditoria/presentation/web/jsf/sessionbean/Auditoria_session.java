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
package com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.business.entity.GeneralEntitySessionBean;

import com.bydan.ingles.seguridad.auditoria.business.entity.*;

@SuppressWarnings("unused")
public class Auditoria_session  extends GeneralEntitySessionBean {
	private static final long serialVersionUID = 1L;
	
	protected Auditoria auditoria;
	protected Boolean isPermiteNavegacionHaciaFKDesde;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaFKDesde;
	protected Boolean isBusquedaDesdeFKSesionFK;
	protected Long lIdActualFK;	
	
	protected Long lIdActualFKParaPosibleAtras;
	protected Boolean isBusquedaDesdeFKSesionFKParaPosibleAtras;
	protected String sUltimaBusqueda;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	public String sStyleDivArbol="";	
	public String sStyleDivContent="";
	public String sStyleDivOpcionesBanner="";	
	public String sStyleDivExpandirColapsar="";	
	public String sStyleDivHeader="";
	public String sPermiteRecargarInformacion="display:none";
	
	protected String sFuncionBusquedaRapida="";
	
	
	public Boolean isBusquedaDesdeFKSesionUsuario=false;
	public Long lidUsuarioActual=0L;
	
	private Long id;
	private Long id_usuario;
	private String nombre_tabla;
	private String proceso;
	private String nombre_pc;
	private String ip_pc;
	private String usuario_pc;
	private Timestamp fecha_hora;
	private Timestamp fecha_horaFinal;
	private String observacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	public Auditoria_session () throws Exception {
		this.inicializar_session();
	}
	
	public void inicializar_session () throws Exception {	
		
		this.sPermiteRecargarInformacion="display:none";
		
		this.auditoria=new Auditoria();
		
		this.isPermiteNavegacionHaciaFKDesde=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaFKDesde="";
		this.isBusquedaDesdeFKSesionFK=false;
		this.lIdActualFK=0L;
		this.lIdActualFKParaPosibleAtras=0L;
		this.isBusquedaDesdeFKSesionFKParaPosibleAtras=false;
		this.sUltimaBusqueda ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:table-row;width:20%;height:800px;visibility:visible";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";		
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;//Estaba true, pero para guardar no ingresa a save
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		//FOREIGN_KEY
		//Se deshabilita, se debe asignar y quitar en los momentos exactos, sino se pierde al abrir detalle desde padre
		

		//this.isBusquedaDesdeFKSesionUsuario=false;
		//this.lidUsuarioActual=0L; 
		//FOREIGN_KEY_FIN
		
		
		
 		this.id_usuario=-1L;
 		this.nombre_tabla="";
 		this.proceso="";
 		this.nombre_pc="";
 		this.ip_pc="";
 		this.usuario_pc="";
 		this.fecha_hora=new Timestamp((new Date()).getTime());
		this.fecha_horaFinal=new Timestamp((new Date()).getTime());
 		this.observacion="";
		
		
		
		
		
    } 
	
	public void setPaginaPopupVariables(Boolean isPopupVariables) { 		
		if(isPopupVariables) {
			if(!this.isPaginaPopup) {
				this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
				this.sStyleDivContent="height:800px;width:100%";;
				this.sStyleDivOpcionesBanner="display:none";
				this.sStyleDivExpandirColapsar="display:none";
				this.isPaginaPopup=true;
			}
		} else {
			if(this.isPaginaPopup) {
				this.sStyleDivArbol="display:table-row;width:15%;height:600px;visibility:visible;overflow:auto;";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Auditoria getAuditoria() {
		return this.auditoria;	
	}
	
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria=auditoria;	
	}
		
	public String getsPermiteRecargarInformacion() {
		return this.sPermiteRecargarInformacion;
	}

	public void setsPermiteRecargarInformacion(String sPermiteRecargarInformacion) {
		this.sPermiteRecargarInformacion=sPermiteRecargarInformacion;
	}
	
	public Boolean getisPermiteNavegacionHaciaFKDesde() {
		return this.isPermiteNavegacionHaciaFKDesde;
	}

	public void setisPermiteNavegacionHaciaFKDesde(
			Boolean isPermiteNavegacionHaciaFKDesde) {
		this.isPermiteNavegacionHaciaFKDesde= isPermiteNavegacionHaciaFKDesde;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaFKDesde() {
		return this.sNombrePaginaNavegacionHaciaFKDesde;
	}

	public void setsNombrePaginaNavegacionHaciaFKDesde(String sNombrePaginaNavegacionHaciaFKDesde) {
		this.sNombrePaginaNavegacionHaciaFKDesde = sNombrePaginaNavegacionHaciaFKDesde;
	}
	
	public Boolean getisBusquedaDesdeFKSesionFK() {
		return isBusquedaDesdeFKSesionFK;
	}

	public void setisBusquedaDesdeFKSesionFK(
			Boolean isBusquedaDesdeFKSesionFK) {
		this.isBusquedaDesdeFKSesionFK= isBusquedaDesdeFKSesionFK;
	}
					
	public Long getlIdActualFK() {
		return lIdActualFK;
	}

	public void setlIdActualFK(
			Long lIdActualFK) {
		this.lIdActualFK = lIdActualFK;
	}
				    
	public Long getlIdActualFKParaPosibleAtras() {
		return lIdActualFKParaPosibleAtras;
	}

	public void setlIdActualFKParaPosibleAtras(
			Long lIdActualFKParaPosibleAtras) {
		this.lIdActualFKParaPosibleAtras = lIdActualFKParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeFKSesionFKParaPosibleAtras() {
		return isBusquedaDesdeFKSesionFKParaPosibleAtras;
	}

	public void setisBusquedaDesdeFKSesionFKParaPosibleAtras(
			Boolean isBusquedaDesdeFKSesionFKParaPosibleAtras) {
		this.isBusquedaDesdeFKSesionFKParaPosibleAtras = isBusquedaDesdeFKSesionFKParaPosibleAtras;
	}
	
	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsServletGenerarHtmlReporte() {
		return sServletGenerarHtmlReporte;
	}

	public void setsServletGenerarHtmlReporte(String sServletGenerarHtmlReporte) {
		this.sServletGenerarHtmlReporte = sServletGenerarHtmlReporte;
	}
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	public String getsPathNavegacionActual() {
		return this.sPathNavegacionActual;
	}

	public void setsPathNavegacionActual(String sPathNavegacionActual) {
		this.sPathNavegacionActual = sPathNavegacionActual;
	}
	
	public Boolean getisPaginaPopup() {
		return this.isPaginaPopup;
	}

	public void setisPaginaPopup(Boolean isPaginaPopup) {
		this.isPaginaPopup = isPaginaPopup;
	}	
	
	public String getsStyleDivArbol() {
		return this.sStyleDivArbol;
	}

	public void setsStyleDivArbol(String sStyleDivArbol) {
		this.sStyleDivArbol = sStyleDivArbol;
	}
	
	public String getsStyleDivContent() {
		return this.sStyleDivContent;
	}

	public void setsStyleDivContent(String sStyleDivContent) {
		this.sStyleDivContent = sStyleDivContent;
	}
	
	public String getsStyleDivOpcionesBanner() {
		return this.sStyleDivOpcionesBanner;
	}

	public void setsStyleDivOpcionesBanner(String sStyleDivOpcionesBanner) {
		this.sStyleDivOpcionesBanner = sStyleDivOpcionesBanner;
	}	
	
	public String getsStyleDivExpandirColapsar() {
		return this.sStyleDivExpandirColapsar;
	}

	public void setsStyleDivExpandirColapsar(String sStyleDivExpandirColapsar) {
		this.sStyleDivExpandirColapsar = sStyleDivExpandirColapsar;
	}		
	
	public String getsFuncionBusquedaRapida() {
		return this.sFuncionBusquedaRapida;
	}

	public void setsFuncionBusquedaRapida(String sFuncionBusquedaRapida) {
		this.sFuncionBusquedaRapida = sFuncionBusquedaRapida;
	}
	
	public Boolean getConGuardarRelaciones() {
		return this.conGuardarRelaciones;
	}

	public void setConGuardarRelaciones(Boolean conGuardarRelaciones) {
		this.conGuardarRelaciones = conGuardarRelaciones;
	}	
	
	public Boolean getEstaModoGuardarRelaciones() {
		return this.estaModoGuardarRelaciones;
	}

	public void setEstaModoGuardarRelaciones(Boolean estaModoGuardarRelaciones) {
		this.estaModoGuardarRelaciones = estaModoGuardarRelaciones;
	}	
	
	public Boolean getEsGuardarRelacionado() {
		return this.esGuardarRelacionado;
	}

	public void setEsGuardarRelacionado(Boolean esGuardarRelacionado) {
		this.esGuardarRelacionado = esGuardarRelacionado;
	}	
	
	public Boolean getEstaModoBusqueda() {
		return this.estaModoBusqueda;
	}

	public void setEstaModoBusqueda(Boolean estaModoBusqueda) {
		this.estaModoBusqueda = estaModoBusqueda;
	}
	
	public Boolean getNoMantenimiento() {
		return this.noMantenimiento;
	}

	public void setNoMantenimiento(Boolean noMantenimiento) {
		this.noMantenimiento = noMantenimiento;
	}
	
    
	public Long getid() {
		return this.id;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public String getnombre_tabla() {
		return this.nombre_tabla;
	}
    
	public String getproceso() {
		return this.proceso;
	}
    
	public String getnombre_pc() {
		return this.nombre_pc;
	}
    
	public String getip_pc() {
		return this.ip_pc;
	}
    
	public String getusuario_pc() {
		return this.usuario_pc;
	}
    
	public Timestamp getfecha_hora() {
		return this.fecha_hora;
	}
		
	public Timestamp getfecha_horaFinal() {
		return this.fecha_horaFinal;
	}
    
	public String getobservacion() {
		return this.observacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_tabla(String newnombre_tabla)throws Exception
	{
		try {
			if(this.nombre_tabla!=newnombre_tabla) {
				if(newnombre_tabla==null) {
					//newnombre_tabla="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_tabla");
					}
				}

				if(newnombre_tabla!=null&&newnombre_tabla.length()>150) {
					newnombre_tabla=newnombre_tabla.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_tabla");
				}

				this.nombre_tabla=newnombre_tabla;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setproceso(String newproceso)throws Exception
	{
		try {
			if(this.proceso!=newproceso) {
				if(newproceso==null) {
					//newproceso="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna proceso");
					}
				}

				if(newproceso!=null&&newproceso.length()>150) {
					newproceso=newproceso.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna proceso");
				}

				this.proceso=newproceso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_pc(String newnombre_pc)throws Exception
	{
		try {
			if(this.nombre_pc!=newnombre_pc) {
				if(newnombre_pc==null) {
					//newnombre_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_pc");
					}
				}

				if(newnombre_pc!=null&&newnombre_pc.length()>50) {
					newnombre_pc=newnombre_pc.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre_pc");
				}

				this.nombre_pc=newnombre_pc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setip_pc(String newip_pc)throws Exception
	{
		try {
			if(this.ip_pc!=newip_pc) {
				if(newip_pc==null) {
					//newip_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna ip_pc");
					}
				}

				if(newip_pc!=null&&newip_pc.length()>20) {
					newip_pc=newip_pc.substring(0,18);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ip_pc");
				}

				this.ip_pc=newip_pc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setusuario_pc(String newusuario_pc)throws Exception
	{
		try {
			if(this.usuario_pc!=newusuario_pc) {
				if(newusuario_pc==null) {
					//newusuario_pc="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna usuario_pc");
					}
				}

				if(newusuario_pc!=null&&newusuario_pc.length()>50) {
					newusuario_pc=newusuario_pc.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna usuario_pc");
				}

				this.usuario_pc=newusuario_pc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_hora(Timestamp newfecha_hora)throws Exception
	{
		try {
			if(this.fecha_hora!=newfecha_hora) {
				if(newfecha_hora==null) {
					//newfecha_hora=new Timestamp((new Date()).getTime());
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna fecha_hora");
					}
				}

				this.fecha_hora=newfecha_hora;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setfecha_horaFinal(Timestamp newfecha_horaFinal)throws Exception
	{
		try {
			if(this.fecha_horaFinal!=newfecha_horaFinal) {
				if(newfecha_horaFinal==null) {
					//newfecha_horaFinal=new Timestamp((new Date()).getTime());
					if(Constantes.IS_DEVELOPING) {
						System.out.println("AuditoriaFinal:Valor nulo no permitido en columna fecha_horaFinal");
					}
				}

				this.fecha_horaFinal=newfecha_horaFinal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setobservacion(String newobservacion)throws Exception
	{
		try {
			if(this.observacion!=newobservacion) {
				if(newobservacion==null) {
					//newobservacion="";
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna observacion");
					}
				}

				if(newobservacion!=null&&newobservacion.length()>200) {
					newobservacion=newobservacion.substring(0,198);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna observacion");
				}

				this.observacion=newobservacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeFKSesionUsuario() {
		return isBusquedaDesdeFKSesionUsuario;
	}

	public void setisBusquedaDesdeFKSesionUsuario(
		Boolean isBusquedaDesdeFKSesionUsuario) {
		this.isBusquedaDesdeFKSesionUsuario = isBusquedaDesdeFKSesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	
	
		
	
}
