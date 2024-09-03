package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import com.bydan.framework.ingles.business.entity.Reporte;

public class TipoReporteDefaultListCellRenderer  extends DefaultListCellRenderer {
	private static final long serialVersionUID = 1L;
	
	protected Boolean conEnabled=true;
	
	public TipoReporteDefaultListCellRenderer() {
		super();
		this.conEnabled=true;
	}
	
	public TipoReporteDefaultListCellRenderer(Boolean conEnabled) {
		super();
		
		this.conEnabled=conEnabled;
	}
	
	@SuppressWarnings("rawtypes")
	public Component getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		if(value instanceof Reporte) {
			Reporte reporte=(Reporte)value;
			this.setText(reporte.getsDescripcion());
		}
		
		this.setEnabled(this.conEnabled);
		
		return this;
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
