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
package com.bydan.ingles.gramatica.tipogrammardetalle.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.business.entity.GeneralEntitySessionBean;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;

@SuppressWarnings("unused")
public class TipoGrammarDetalle_session  extends GeneralEntitySessionBean {
	private static final long serialVersionUID = 1L;
	
	protected TipoGrammarDetalle tipogrammardetalle;
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
	
	
	
	private Long id;
	private String nombre;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	public TipoGrammarDetalle_session () throws Exception {
		this.inicializar_session();
	}
	
	public void inicializar_session () throws Exception {	
		
		this.sPermiteRecargarInformacion="display:table-row";
		
		this.tipogrammardetalle=new TipoGrammarDetalle();
		
		this.isPermiteNavegacionHaciaFKDesde=false;
		
		this.isPermiteRecargarInformacion=true;
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
		 
		//FOREIGN_KEY_FIN
		
		
		
 		this.nombre="";
		
		
		
		
		
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
	
	public TipoGrammarDetalle getTipoGrammarDetalle() {
		return this.tipogrammardetalle;	
	}
	
	public void setTipoGrammarDetalle(TipoGrammarDetalle tipogrammardetalle) {
		this.tipogrammardetalle=tipogrammardetalle;	
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
    
	public String getnombre() {
		return this.nombre;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.IS_DEVELOPING) {
						System.out.println("TipoGrammarDetalle:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
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
						System.out.println("TipoGrammarDetalle:Valor nulo no permitido en columna nombre");
					}
				}

				if(newnombre!=null&&newnombre.length()>50) {
					newnombre=newnombre.substring(0,48);
					System.out.println("TipoGrammarDetalle:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre");
				}

				this.nombre=newnombre;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
