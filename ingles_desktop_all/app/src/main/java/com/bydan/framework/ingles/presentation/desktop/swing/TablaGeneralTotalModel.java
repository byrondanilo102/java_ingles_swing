package com.bydan.framework.ingles.presentation.desktop.swing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.util.Constantes2;

@SuppressWarnings("unused")
public class TablaGeneralTotalModel extends AbstractTableModel {		 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = {Constantes2.S_TIPO,Constantes2.S_TOTAL,};

	private List<DatoGeneral> arrDatoGeneralTotales;
	
	//NO SE UTILIZA
	public TablaGeneralTotalModel(List<DatoGeneral> arrDatoGeneralTotales) {
		this.arrDatoGeneralTotales=arrDatoGeneralTotales;
	}
	
	public TablaGeneralTotalModel() {
		this.arrDatoGeneralTotales=new ArrayList<DatoGeneral>();
	}	    	    
	
	@Override
	public String getColumnName(int columnIndex) {
	return columnNames[columnIndex];	    	
	}
	
	@Override
	public int getRowCount() {
	return this.arrDatoGeneralTotales.size();
	}
	
	@Override
	public int getColumnCount() {	    	
	return this.columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0: return this.arrDatoGeneralTotales.get(rowIndex).getsDescripcion();		
			case 1: return this.arrDatoGeneralTotales.get(rowIndex).getdValorDouble();
			default: return null;
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0: return String.class;		
			case 1: return Double.class;          
			default: return String.class;
		}	    		        
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0: return true;		
			case 1: return true;            
			default: return true;
		}	
	}
	
	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		DatoGeneral datoGeneral = this.arrDatoGeneralTotales.get(rowIndex);
		
		switch (columnIndex) {
			case 0: try {datoGeneral.setsDescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;		
			case 1: try {datoGeneral.setdValorDouble((Double) value);} catch (Exception e) {e.printStackTrace();} break;
		}
		
		fireTableCellUpdated(rowIndex, columnIndex);
	}
}
