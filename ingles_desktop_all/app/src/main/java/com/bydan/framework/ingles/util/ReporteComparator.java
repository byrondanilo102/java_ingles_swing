package com.bydan.framework.ingles.util;

import java.util.Comparator;

import com.bydan.framework.ingles.business.entity.Reporte;

public class ReporteComparator implements Comparator<Reporte> {
    @Override
    public int compare(Reporte reporte1, Reporte reporte2) {
    	
    	String reporteDescripcion1 = reporte1.getsDescripcion().toUpperCase();
		String reporteDescripcion2 = reporte2.getsDescripcion().toUpperCase();
		   
		return reporteDescripcion1.compareTo(reporteDescripcion2);
		 
        //return Integer.valueOf(reporte1.getsDescripcion()).compareTo(Integer.valueOf(reporte2.getsDescripcion()));
    }
}
