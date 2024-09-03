package com.bydan.framework.ingles.presentation.desktop.swing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.SwingUtilities;

import com.bydan.framework.ingles.util.Constantes;

@SuppressWarnings("unused")
public class MainTestErp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//com.bydan.framework.ingles.util.Constantes.PROVIDER_URL="http://bydan.homelinux.com:80/invoker/JNDIFactory";
		//System.out.println(com.bydan.framework.ingles.util.Constantes.PROVIDER_URL);
		//com.bydan.framework.ingles.util.Constantes.PROVIDER_URL="http://0.0.0.0:80/invoker/JNDIFactory";
		// TODO Auto-generated method stub
		
		Properties propertiesConfig = new Properties();
		
		try {
			
			System.out.println("Cambio Realizado");
            //load a properties file
			//propertiesConfig.load(new FileInputStream("config/config.properties"));
	
	        //get the property value and print it out
	        //System.out.println(propertiesConfig.getProperty("is_debug"));
	 		
			/*
			if(propertiesConfig.getProperty("is_debug").equals("true")) {
				Constantes.ISDEVELOPING=true;
			} else {
				Constantes.ISDEVELOPING=false;
			}
			*/
			
	        SwingUtilities.invokeLater(new Runnable() {						
			      public void run() {
			        new LoginJFrameErp().setVisible(true);
			    	//new MigrationJFrame().setVisible(true);
			      }
			});
	        
	 	 } catch (Exception ex) {
	 		ex.printStackTrace();
	     }				
	}

}
