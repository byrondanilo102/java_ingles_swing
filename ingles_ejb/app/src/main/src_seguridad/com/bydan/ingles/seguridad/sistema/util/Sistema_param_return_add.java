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
package com.bydan.ingles.seguridad.sistema.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;

import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;


import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;

import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityConstantesFunciones;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterReturnGeneral;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
//import com.bydan.ingles.seguridad.business.entity.GrupoOpcion;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;


import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;


@SuppressWarnings("unused")
public class Sistema_param_return_add  extends GeneralEntityReturnGeneral implements Serializable{		
	private static final long serialVersionUID = 1L;
	
	public Sistema_param_return_add ()  throws Exception {
		this.opcions=new ArrayList<Opcion>();
		//this.grupoopcions=new ArrayList<GrupoOpcion>();	
		
		//PARA CARGAR VENTANAS
		this.perfilOpcion=new PerfilOpcion();
		this.accions=new ArrayList<Accion>();
		this.accionsFormulario=new ArrayList<Accion>();
		this.opcionsRelacionadas=new ArrayList<Opcion>();
    } 
	
	//PARA LOGIN
		//public List<GrupoOpcion> grupoopcions;
		public List<Opcion> opcions;

		//PARA CARGAR VENTANAS	
		public PerfilOpcion perfilOpcion;
		public List<Accion> accions;
		public List<Accion> accionsFormulario;
		public List<Opcion> opcionsRelacionadas;
		
		
		public static void inicializarSinSeguridad(Sistema_param_return sistemaReturnGeneral) {
			sistemaReturnGeneral.setEsValidado(true);
		}
		
		public List<Opcion> getOpcions() {
			return opcions;
		}

		public void setOpcions(List<Opcion> opcions) {
			this.opcions = opcions;
		}

		/*
		public List<GrupoOpcion> getGrupoopcions() {
			return grupoopcions;
		}

		public void setGrupoopcions(List<GrupoOpcion> grupoopcions) {
			this.grupoopcions = grupoopcions;
		}
		*/
		public PerfilOpcion getPerfilOpcion() {
			return perfilOpcion;
		}

		public void setPerfilOpcion(PerfilOpcion perfilOpcion) {
			this.perfilOpcion = perfilOpcion;
		}

		public List<Accion> getAccions() {
			return accions;
		}

		public void setAccions(List<Accion> accions) {
			this.accions = accions;
		}

		public List<Accion> getAccionsFormulario() {
			return accionsFormulario;
		}

		public void setAccionsFormulario(List<Accion> accionsFormulario) {
			this.accionsFormulario = accionsFormulario;
		}				

		public List<Opcion> getOpcionsRelacionadas() {
			return opcionsRelacionadas;
		}

		public void setOpcionsRelacionadas(List<Opcion> opcionsRelacionadas) {
			this.opcionsRelacionadas = opcionsRelacionadas;
		}
	
}
