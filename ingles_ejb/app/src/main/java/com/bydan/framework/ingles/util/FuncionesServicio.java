package com.bydan.framework.ingles.util;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
import com.bydan.ingles.activosfijos.business.logic.ActivosFijosLogic;
import com.bydan.ingles.cartera.business.logic.CarteraLogic;
import com.bydan.ingles.comisiones.business.logic.ComisionesLogic;
import com.bydan.ingles.contabilidad.business.logic.ContabilidadLogic;
import com.bydan.ingles.facturacion.business.logic.FacturacionLogic;
import com.bydan.ingles.importaciones.business.logic.ImportacionesLogic;
import com.bydan.ingles.inventario.business.logic.InventarioLogic;
import com.bydan.ingles.nomina.business.logic.NominaLogic;
import com.bydan.ingles.produccion.business.logic.ProduccionLogic;
import com.bydan.ingles.puntoventa.business.logic.PuntoVentaLogic;
import com.bydan.ingles.seguridad.business.logic.SeguridadLogic;
import com.bydan.ingles.sris.business.logic.SrisLogic;
import com.bydan.ingles.tesoreria.business.logic.TesoreriaLogic;
*/

import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;

@SuppressWarnings("unused")
public class FuncionesServicio {
	
	public static void PublicarServicioRmi(String sNameServicio,String sNameServicioCompleto,Integer iCount, Remote remoteInterface,Remote objectSessionRemote) throws Exception { 
		//,Class<?> clas
		//,SecurityManager securityManager,
		
		/*
		if (System.getSecurityManager() == null) {
            System.setSecurityManager(securityManager);
        }
		*/

        try {
        	
        	//System.out.println(System.getProperty("java.rmi.server.codebase"));
        	
        	Registry registry = LocateRegistry.getRegistry(Constantes.SSERVICIO_RMI_IP,Constantes.SSERVICIO_RMI_PORT);                                 	
                        
            registry.rebind(sNameServicio, remoteInterface);
            
            System.out.println(iCount+") Servicio "+sNameServicioCompleto + " Inicializado.... ");
            
        } catch (Exception e) {
           e.printStackTrace();
           
           throw e;
        }
	}
	
	public static Remote GetServicioRmi(String sNameServicio) throws Exception {
		//,Class<?> clas
		
		Remote remoteInterface=null;//new Remote();
		
		/*
        if (System.getSecurityManager() == null) {
        	SecurityManager securityManager=new SecurityManager();
        	
            System.setSecurityManager(securityManager);
        }
        */

        try {
        	        	        	
            Registry registry = LocateRegistry.getRegistry(Constantes.SSERVICIO_RMI_IP,Constantes.SSERVICIO_RMI_PORT);
            
            remoteInterface = registry.lookup(sNameServicio);
                                               
        } catch (Exception e) {
           e.printStackTrace();
           
           throw e;
        }
        
        return remoteInterface;
    }  
	
	/*
	 public static void main(String[] args) {
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
	        }
	        try {
	        	
	        	//System.err.println(System.getProperty("user.dir"));
	        	
	        	System.out.println(System.getProperty("java.rmi.server.codebase"));//, pathToCodebase);
	        	
	            String name = "Calcular";
	            
	            Calcular calcular = new Calcular();
	            
	            CalcularInterface calcularStub = (CalcularInterface) UnicastRemoteObject.exportObject(calcular, 0);
	            
	            Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);
	            
	            registry.rebind(name, calcularStub);
	            
	            System.out.println("Calcular bound");
	            
	        } catch (Exception e) {
	            System.err.println("Calcular Excepcion:");
	            e.printStackTrace();
	        }
	    } 
	*/ 	
	
	public static void main(String[] args) {
		//SecurityManager securityManager=new SecurityManager();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		Boolean conReportesProcesos=true;
		
		double dStart = 0; 
		double dEnd = 0; 
		double dDif = 0; 
		double dDifSeg = 0; 
		
		dStart=(double)System.currentTimeMillis();
		
		/*
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(securityManager);
	    }
		 */

		 /*
		 ActivosFijosLogic.PublicarServiciosRmiActivosFijos(securityManager,datoGeneralMinimo,conReportesProcesos);
		 CarteraLogic.PublicarServiciosRmiCartera(securityManager,datoGeneralMinimo,conReportesProcesos);			
		 ComisionesLogic.PublicarServiciosRmiComisiones(securityManager,datoGeneralMinimo,conReportesProcesos);
		 ContabilidadLogic.PublicarServiciosRmiContabilidad(securityManager,datoGeneralMinimo,conReportesProcesos);
		 FacturacionLogic.PublicarServiciosRmiFacturacion(securityManager,datoGeneralMinimo,conReportesProcesos);
		 ImportacionesLogic.PublicarServiciosRmiImportaciones(securityManager,datoGeneralMinimo,conReportesProcesos);
		 InventarioLogic.PublicarServiciosRmiInventario(securityManager,datoGeneralMinimo,conReportesProcesos);		 
		 NominaLogic.PublicarServiciosRmiNomina(securityManager,datoGeneralMinimo,conReportesProcesos);			
		 ProduccionLogic.PublicarServiciosRmiProduccion(securityManager,datoGeneralMinimo,conReportesProcesos);		 
		 */
		 
		//PuntoVentaLogic.PublicarServiciosRmiPuntoVenta(securityManager,datoGeneralMinimo,conReportesProcesos);			
		 
		 //SeguridadLogic.PublicarServiciosRmiSeguridad(securityManager,datoGeneralMinimo,conReportesProcesos);
		 /*
		 SrisLogic.PublicarServiciosRmiSris(securityManager,datoGeneralMinimo,conReportesProcesos);		 
		 TesoreriaLogic.PublicarServiciosRmiTesoreria(securityManager,datoGeneralMinimo,conReportesProcesos);
		 */
		 
		 dEnd =(double)System.currentTimeMillis();
		 
		 dDif=dEnd - dStart;
		 dDifSeg=dDif / 1000;
		 
		 System.out.println("Tiempo Carga Servicios RMI: " + dDif + "(ms) --> " + dDifSeg + "(seg)");
	}
}
