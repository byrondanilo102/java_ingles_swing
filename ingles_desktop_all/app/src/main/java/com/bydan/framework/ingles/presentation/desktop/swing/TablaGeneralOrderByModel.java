package com.bydan.framework.ingles.presentation.desktop.swing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.util.Constantes2;

@SuppressWarnings("unused")
public class TablaGeneralOrderByModel extends AbstractTableModel {		 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = {OrderBy.ISSELECTED,OrderBy.NOMBRE,OrderBy.ESDESC};//,OrderBy.NOMBREDB

	private List<OrderBy> arrOrderBy;
	
	//NO SE UTILIZA
	public TablaGeneralOrderByModel(List<OrderBy> arrOrderBy) {
		this.arrOrderBy=arrOrderBy;
	}
	
	public TablaGeneralOrderByModel() {
		this.arrOrderBy=new ArrayList<OrderBy>();
	}	    	    
	
	@Override
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];	    	
	}
	
	@Override
	public int getRowCount() {
		return this.arrOrderBy.size();
	}
	
	@Override
	public int getColumnCount() {	    	
		return this.columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0: return this.arrOrderBy.get(rowIndex).getisSelected();		
			case 1: return this.arrOrderBy.get(rowIndex).getsNombre();
			//case 2: return this.arrOrderBy.get(rowIndex).getsNombreDB();
			case 2: return this.arrOrderBy.get(rowIndex).getesDesc();
			default: return null;
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0: return Boolean.class;		
			case 1: return String.class;          
			//case 2: return String.class;
			case 2: return Boolean.class;
			default: return String.class;
		}	    		        
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0: return true;		
			case 1: return true;
			//case 2: return true;
			case 2: return true;
			default: return true;
		}	
	}
	
	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		OrderBy orderBy = this.arrOrderBy.get(rowIndex);
		
		switch (columnIndex) {
			case 0: try {orderBy.setisSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;		
			case 1: try {orderBy.setsNombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
			//case 2: try {orderBy.setsNombreDB((String) value);} catch (Exception e) {e.printStackTrace();} break;
			case 2: try {orderBy.setesDesc((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
		}
		
		fireTableCellUpdated(rowIndex, columnIndex);
	}
}
