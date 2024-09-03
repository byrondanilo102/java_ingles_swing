package com.bydan.framework.ingles.presentation.desktop.swing;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.Pagination;
import com.bydan.framework.ingles.resources.config.AuxiliarConfig;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Constantes2;
//import com.bydan.ingles.seguridad.service.ejb.interfaces.UpdateAdditionable;
//import com.bydan.ingles.seguridad.service.ejb.interfaces.UpdateAdditionableHome;
import com.bydan.framework.ingles.util.ParameterDbType;
import com.bydan.framework.ingles.util.funcionalidad.MainMigracionDatos;

/*
import com.bydan.framework.ingles.business.logic.Pagination;
import com.bydan.ingles.contabilidad.business.logic.TipoRetencion_logic;
import com.bydan.ingles.tesoreria.business.logic.TipoRetencionFuenteIva_logic;
import com.bydan.ingles.tesoreria.business.entity.TipoRetencionFuenteIva;
*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

//import com.bydan.ingles.seguridad.service.ejb.interfaces.SistemaAdditionable;
//import com.bydan.ingles.seguridad.service.ejb.interfaces.SistemaAdditionableHome;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;


@SuppressWarnings("unused")
public class Main {
	
	public static LoginJFrame loginJFrame;
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//com.bydan.framework.ingles.util.Constantes.PROVIDER_URL="http://bydan.homelinux.com:80/invoker/JNDIFactory";
		//System.out.println(com.bydan.framework.ingles.util.Constantes.PROVIDER_URL);
		//com.bydan.framework.ingles.util.Constantes.PROVIDER_URL="http://0.0.0.0:80/invoker/JNDIFactory";
		// TODO Auto-generated method stub
		
		//ESTILOS GLOBAL
		//PARAMETRO COMANDO INICIAL
		//(MEJOR, AZUL-PLOMO) - "javax.swing.plaf.nimbus.NimbusLookAndFeel"
		//(JAVA) - "javax.swing.plaf.metal.MetalLookAndFeel"		
		//(VIOLETA) - "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
		//(WINDOWS) - com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		
		try {			
			
			//Class<?> classe=Class.forName("com.bydan.erp.seguridad.presentation.swing.jinternalframes.AnioBeanSwingJInternalFrame");
			
			System.setProperty("sun.java2d.noddraw", Boolean.TRUE.toString());
			  
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");			
			
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
			
			//System.out.println(UIManager.getSystemLookAndFeelClassName());
			
			/*
			String property = System.getProperty("java.library.path");
			StringTokenizer parser = new StringTokenizer(property, ";");
			
			while (parser.hasMoreTokens()) {
			    System.err.println(parser.nextToken());
			}
			*/
			
			//CARGAR CONSTANTES DESDE CONFIGURACION
			Main.cargarConstantesDesdeConfiguracion();
			
			//ABRIR VENTANA INICIAL
			if(!Constantes2.ISDEVELOPING_QUERY_EXPORT && !Constantes2.IS_DEVELOPING_MIGRATION) {
		        SwingUtilities.invokeLater(new Runnable() {						
				      public void run() {
				        try {
				        	
				        	String S_TIPO_PROCESO="NORMAL";//"NOPCION";"NORMAL";"DMIGRA";  
				        	
				        	//S_TIPO_PROCESO="DMIGRA";//"NOPCION";
				        	//S_TIPO_PROCESO="NOPCION";
				        	
				        	if(Constantes.PARAMETERDBTYPE.equals(ParameterDbType.SQLITE)) {
				        		Constantes2.PS="";
				        		
				        		Constantes.SCHEMA="";
				        		Constantes.SCHEMA_SEGURIDAD="";
				        		Constantes.SCHEMA_GENERAL="";
				        		Constantes.SCHEMA_GRAMATICA="";
				        		
				        		/*
				        		Constantes.SCHEMA_SEMESTRE01="";
				        		Constantes.SCHEMA_SEMESTRE02="";
				        		Constantes.SCHEMA_SEMESTRE03="";
				        		Constantes.SCHEMA_SEMESTRE04="";
				        		Constantes.SCHEMA_SEMESTRE05="";
				        		*/
				        		
				        		String sCurrentPathDb = System.getProperty("user.dir");
				        		sCurrentPathDb+= "/2015_ingles.db";
				        				
				        		//System.out.println(sCurrentPathDb);
				        		
				        		Constantes.SCONNEXION_SQLITE=sCurrentPathDb;
				        		
				        		//Constantes.SCONNEXION_SQLITE="/home/bydan_lf/Documents/sql_lite_example/db_02.db";
				        	}
				        					        	
				        	
				        	//MainMigracion.ProcesarMigracion();
				        	
				        	
				        	//connect();
				        	
				        	
				        	if(S_TIPO_PROCESO.equals("NOPCION")) {
				        		TestOpcionLogic("N");//TestLogic
				        		TestPerfilOpcionLogic("N");
				        		
				        	} else if(S_TIPO_PROCESO.equals("DMIGRA")) {
				        		MainMigracionDatos.ProcesarMigracion();
				        	}
				        	
				        	
				        	//Insert_Sistema();
				        	
				        	
				        					        	
				        			//LoginJFrame.SetLookAndFeel(5);
				        	
				        	if(S_TIPO_PROCESO.equals("NORMAL")) {
				        		Main.loginJFrame=new LoginJFrame();
				        	}
				        	
				        			//Main.loginJFrame.startProcessLoginAux(true);
				        					        	
				        			//SwingUtilities.updateComponentTreeUI(Main.loginJFrame);
				        	
				        			//Main.loginJFrame.pack();
				        	
				        	if(S_TIPO_PROCESO.equals("NORMAL")) {
				        		Main.loginJFrame.setVisible(true);
				        	}
				        	
						        	//SplashScreenJFrame splashScreenJFrame=new SplashScreenJFrame();
						        	//splashScreenJFrame.setVisible(true);
						        	
						        	
									//new LoginJFrame().setVisible(true);
									
						        	//new MigrationJFrame().setVisible(true);
									
						        	//new MapaSitioJFrame().setVisible(true);
									
						        	//Main.loginJFrame.finishProcessLoginAux(true);
				        	
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}				    	
				      }
				});
			} else {
				SwingUtilities.invokeLater(new Runnable() {						
				      public void run() {
				        //new LoginJFrame().setVisible(true);
				    	//new MigrationJFrame().setVisible(true);
				      }
				});
			}
	        
	 	 } catch (IOException ex) {
	 		ex.printStackTrace();
	     }				
	}
	
	public static void TestTraerLogic() throws Exception {
		Sistema_logic sistemaLogic=new Sistema_logic();		
		String sFinalQuery="";
				
		sistemaLogic.getTodosWithConnection(sFinalQuery, new Pagination());
						
		for(Sistema sistema:sistemaLogic.getSistemas()) {
			//sistemaAux=sistema;
			System.out.println(sistema);
		}		
	}
	
	public static void TestLogic(String sTipo) throws Exception {
		Sistema sistemaAux=new Sistema();
		Sistema_logic sistemaLogic=new Sistema_logic();		
		
		if(sTipo.equals("S")) {
			TestTraerLogic();
			
		} else if(sTipo.equals("N")) {
			sistemaAux.setIsNew(true);
			sistemaAux.setcodigo("C7");
			sistemaAux.setnombre_principal("NP7");
			sistemaAux.setnombre_secundario("NS7");
			sistemaAux.setestado(true);
			
			sistemaLogic.setSistema(sistemaAux);
			
			sistemaLogic.saveWithConnection();
			
			System.out.println("Ok Ingresar");
			
		} else if(sTipo.equals("A")) {
			sistemaLogic.getEntityWithConnection(5L);
			
			sistemaLogic.getSistema().setnombre_principal("NP333");
			sistemaLogic.getSistema().setnombre_secundario("NS333");
			sistemaLogic.getSistema().setestado(false);
			
			sistemaLogic.saveWithConnection();
			
			System.out.println("Ok Actualizar");
			
		} else if(sTipo.equals("E")) {
			sistemaLogic.getEntityWithConnection(2L);
			
			sistemaLogic.getSistema().setIsDeleted(true);
			
			sistemaLogic.saveWithConnection();
			
			System.out.println("Ok Eliminar");
			
		} else if(sTipo.equals("T")) {
			connect();
		}
	}
	
	public static void TestOpcionLogic(String sTipo) throws Exception {
		Opcion opcionAux=new Opcion();
		Opcion_logic opcionLogic=new Opcion_logic();		
		Short posicion=5;
		
		if(sTipo.equals("S")) {
			TestTraerLogic();
			
		} else if(sTipo.equals("N")) {
			opcionAux.setIsNew(true);
			
			opcionAux.setid_sistema(2L);;
			opcionAux.setid_opcion(10L);
			opcionAux.setcodigo("REPASO2");
			opcionAux.setnombre("Repaso 2");
			posicion=5;
			opcionAux.setposicion(posicion);
			opcionAux.seticon_name("x");
			opcionAux.setnombre_clase("MantenimientoSortExcellPreguntaRespuestas.jsf");
			opcionAux.setpaquete("funcionalidad");
			opcionAux.setes_para_menu(true);
			opcionAux.setestado(true);
			opcionAux.setmodulo("funcionalidad");
			opcionAux.setsub_modulo("");
			opcionAux.setes_guardar_relaciones(false);
			opcionAux.setcon_mostrar_acciones_campo(false);
			
			opcionLogic.setOpcion(opcionAux);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Ingresar Opcion");
			
		} else if(sTipo.equals("A")) {
			opcionLogic.getEntityWithConnection(5L);
			
			//opcionLogic.getOpcion().setnombre_principal("NP333");
			//opcionLogic.getOpcion().setnombre_secundario("NS333");
			opcionLogic.getOpcion().setestado(false);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Actualizar");
			
		} else if(sTipo.equals("E")) {
			opcionLogic.getEntityWithConnection(2L);
			
			opcionLogic.getOpcion().setIsDeleted(true);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Eliminar");
			
		} else if(sTipo.equals("T")) {
			connect();
		}
	}
	
	public static void TestPerfilOpcionLogic(String sTipo) throws Exception {
		PerfilOpcion opcionAux=new PerfilOpcion();
		PerfilOpcion_logic opcionLogic=new PerfilOpcion_logic();		
		Short posicion=5;
		
		if(sTipo.equals("S")) {
			TestTraerLogic();
			
		} else if(sTipo.equals("N")) {
			opcionAux.setIsNew(true);
			
			opcionAux.setid_perfil(23L);;
			opcionAux.setid_opcion(12L);
			opcionAux.settodo(true);
			opcionAux.setingreso(true);
			opcionAux.setmodificacion(true);
			opcionAux.seteliminacion(true);
			opcionAux.setconsulta(true);
			opcionAux.setbusqueda(true);
			opcionAux.setreporte(true);
			opcionAux.setestado(true);
			
			
			opcionLogic.setPerfilOpcion(opcionAux);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Ingresar Pefil Opcion");
			
		} else if(sTipo.equals("A")) {
			opcionLogic.getEntityWithConnection(5L);
			
			//opcionLogic.getPerfilOpcion().setnombre_principal("NP333");
			//opcionLogic.getPerfilOpcion().setnombre_secundario("NS333");
			opcionLogic.getPerfilOpcion().setestado(false);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Actualizar");
			
		} else if(sTipo.equals("E")) {
			opcionLogic.getEntityWithConnection(2L);
			
			opcionLogic.getPerfilOpcion().setIsDeleted(true);
			
			opcionLogic.saveWithConnection();
			
			System.out.println("Ok Eliminar");
			
		} else if(sTipo.equals("T")) {
			connect();
		}
	}
	
	public static Connection connect() throws ClassNotFoundException, ParseException {
        // SQLite connection string
		Class.forName("org.sqlite.JDBC");
		
		String url = "jdbc:sqlite:/home/bydan_lf/Documents/sql_lite_example/db_02.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            
            String sql = "SELECT * FROM seg_sistema";
            
            try (
            	Statement stmt  = conn.createStatement();
            		
                ResultSet rs    = stmt.executeQuery(sql)){
                
            	String svr="";
            	
                // loop through the result set
                while (rs.next()) {
                	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                	svr=rs.getString("version_row");
                	
                    Date parsedDate = dateFormat.parse(svr);
                    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                    
                    System.out.println(svr);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	
	public static void Insert_Sistema() throws ClassNotFoundException {
		
		
		String url = "jdbc:sqlite:/home/bydan_lf/Documents/sql_lite_example/db_02.db";
        Connection conn = null;
        
         
        String sql = "INSERT INTO seg_sistema(codigo,nombre_principal,nombre_secundario,estado) VALUES(?,?,?,?)";
 
        try {
        	
        	Class.forName("org.sqlite.JDBC");
        		
        	conn = DriverManager.getConnection(url);
        	       
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        	org.sqlite.jdbc4.JDBC4PreparedStatement ps = (org.sqlite.jdbc4.JDBC4PreparedStatement)pstmt;
        	ParameterMetaData p=pstmt.getParameterMetaData();
        	
            pstmt.setString(1, "C8");
            pstmt.setString(2, "NP8");
            pstmt.setString(3, "NS8");
            pstmt.setInt(4, 1);
            
            //pstmt.executeUpdate();                    
           
            System.out.println(pstmt.toString());
            
            System.out.println(ps.getParameterCount());
            
            System.out.println(ps.getParameterClassName(1));
            
            Object o=ps.getMetaData();
            
            System.out.println(o);
            
            System.out.println(pstmt);
            
            System.out.println(ps.toString());
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public static void cargarConstantesDesdeConfiguracion() throws Exception {
		Properties propertiesConfig = new Properties();
		
		 //load a properties file
		//propertiesConfig.load(new FileInputStream("config/config.properties"));

		propertiesConfig.load(AuxiliarConfig.class.getResourceAsStream("config.properties"));
		
        //get the property value and print it out
        //System.out.println(propertiesConfig.getProperty("is_debug"));
 		
		
		//DATABASE USER
		if(propertiesConfig.getProperty("db_user")!=null) {
			Constantes.SCONNEXION_USER=propertiesConfig.getProperty("db_user");
			
		} else {
			Constantes.SCONNEXION_USER="root";
		}
		//DATABASE USER_FIN		
				
		//DATABASE USER
		if(propertiesConfig.getProperty("db_password")!=null) {
			Constantes.SCONNEXION_PASSWORD=propertiesConfig.getProperty("db_password");
			
		} else {
			Constantes.SCONNEXION_PASSWORD="root";
		}
		//DATABASE USER_FIN		
				
		//DATABASE CONNEXION
		if(propertiesConfig.getProperty("database")!=null) {
			Constantes.SCONNEXION_POSTGRES=propertiesConfig.getProperty("database")+":5432/bydan_erp";
					
		} else {
			Constantes.SCONNEXION_POSTGRES="127.0.0.1:5432/bydan_erp";
		}
		//DATABASE CONNEXION_FIN	
		
		
				
		//ISDEVELOPING --> IS_DEBUG
		if(propertiesConfig.getProperty("is_debug")!=null) {
			if(propertiesConfig.getProperty("is_debug").equals("true")) {
				Constantes.IS_DEVELOPING=true;
			} else {
				Constantes.IS_DEVELOPING=false;
			}
		} else {
			Constantes.IS_DEVELOPING=false;
		}
		
		
		//ISDEVELOPING2 --> IS_DEBUG2
		if(propertiesConfig.getProperty("is_debug2")!=null) {
			if(propertiesConfig.getProperty("is_debug2").equals("true")) {
				Constantes2.IS_DEVELOPING2=true;
			} else {
				Constantes2.IS_DEVELOPING2=false;
			}
		} else {
			Constantes2.IS_DEVELOPING2=false;
		}
		
		
		//ISDEVELOPING_SQL --> IS_SQL
		if(propertiesConfig.getProperty("is_sql")!=null) {
			if(propertiesConfig.getProperty("is_sql").equals("true")) {
				Constantes2.IS_DEVELOPING_SQL=true;
			} else {
				Constantes2.IS_DEVELOPING_SQL=false;
			}
		} else {
			Constantes2.IS_DEVELOPING_SQL=false;
		}
		
		
		//ISDEVELOPING_QUERY_EXPORT --> IS_QUERY
		if(propertiesConfig.getProperty("is_query")!=null) {
			if(propertiesConfig.getProperty("is_query").equals("true")) {
				Constantes2.ISDEVELOPING_QUERY_EXPORT=true;
			} else {
				Constantes2.ISDEVELOPING_QUERY_EXPORT=false;
			}				
		} else {
			Constantes2.ISDEVELOPING_QUERY_EXPORT=false;
		}
		
		
		//ISDEVELOPING_MIGRATION --> IS_MIGRATION
		if(propertiesConfig.getProperty("is_migration")!=null) {
			if(propertiesConfig.getProperty("is_migration").equals("true")) {
				Constantes2.IS_DEVELOPING_MIGRATION=true;
			} else {
				Constantes2.IS_DEVELOPING_MIGRATION=false;
			}				
		} else {
			Constantes2.IS_DEVELOPING_MIGRATION=false;
		}


		//ISDEVELOPING_SQL --> IS_DEVELOPING_SQL
		if(propertiesConfig.getProperty("is_developing_sql")!=null) {
			if(propertiesConfig.getProperty("is_developing_sql").equals("true")) {
				Constantes2.IS_DEVELOPING_SQL=true;
			} else {
				Constantes2.IS_DEVELOPING_SQL=false;
			}				
		} else {
			Constantes2.IS_DEVELOPING_SQL=false;
		}


		//PRECARGAR WEB --> IS_DEVELOPING_SQL
		if(propertiesConfig.getProperty("con_precargar_web")!=null) {
			if(propertiesConfig.getProperty("con_precargar_web").equals("true")) {
				Constantes2.CON_PRECARGAR_CLASES_WEB=true;
			} else {
				Constantes2.CON_PRECARGAR_CLASES_WEB=false;
			}				
		} else {
			Constantes2.CON_PRECARGAR_CLASES_WEB=false;
		}

		//FORZAR-MANUAL
		//Constantes.IS_DEVELOPING=true;		
	}
}
