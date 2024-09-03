package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.*;

import java.awt.*;

import javax.swing.*;
import java.awt.*;
import com.bydan.framework.ingles.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Constantes2;

@SuppressWarnings("unused")
public class SplashScreenJFrame extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayout = new BorderLayout();
	private JLabel lbl_Imagen = new JLabel();
	
	private GridBagLayout gridaBagLayout = new GridBagLayout();
	private JPanel pnl_Splash = new JPanelMe();
	private GridBagConstraints gridBagConstraints;
	
	public JProgressBar progress_Bar = new JProgressBar();
	private ImageIcon img_Icon;
	private Boolean isIndeterminate=true;
	private Boolean esMostrarGif=true;
	private Integer iNumeroEjecusionDemora=1;
	
	private static int MAX=100;
	private static int NUMERO_EJECUSION=1;
	//private static int RAZON_TAM_GIF=2;
	
	private static int WIDTH=300;
	private static int HEIGHT=210;
	
	private static int WIDTH_GIF=175;
	private static int HEIGHT_GIF=175;
	
	private int iWidthFinal=0;
	private int iHeightFinal=0;
	
	public SplashScreenJFrame() {	  
		this(true,true, SplashScreenJFrame.NUMERO_EJECUSION);
	}
	
	public SplashScreenJFrame(Boolean isIndeterminate,Boolean esMostrarGif) {	  
		this(isIndeterminate,esMostrarGif, SplashScreenJFrame.NUMERO_EJECUSION);
	}
	
  public SplashScreenJFrame(Boolean isIndeterminate,Boolean esMostrarGif,Integer iNumeroEjecusionDemora) {	
	this.setResizable(true);
	//this.setClosable(true);
	//this.setMaximizable(false);
	this.setBackground(Color.WHITE);   
	
	this.isIndeterminate=isIndeterminate;
	this.esMostrarGif=esMostrarGif;
	this.iNumeroEjecusionDemora=iNumeroEjecusionDemora;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  
	this.setTitle("PROCESANDO......");
	
	if(!this.esMostrarGif) {
		this.iWidthFinal=SplashScreenJFrame.WIDTH;
		this.iHeightFinal=SplashScreenJFrame.HEIGHT;
	} else {
		this.iWidthFinal=SplashScreenJFrame.WIDTH_GIF;
		this.iHeightFinal=SplashScreenJFrame.HEIGHT_GIF;
		
		//this.iWidthFinal=SplashScreenJInternalFrame.WIDTH/SplashScreenJInternalFrame.RAZON_TAM_GIF;
		//this.iHeightFinal=SplashScreenJInternalFrame.HEIGHT/SplashScreenJInternalFrame.RAZON_TAM_GIF;
	}
	
	int iWidthLocation=(screenSize.width/2 - this.iWidthFinal);
	int iHeightLocation=(screenSize.height/2 - this.iHeightFinal);
	
	this.setSize(this.iWidthFinal,this.iHeightFinal);		
	this.setLocation(iWidthLocation,iHeightLocation);	  		  	
            
    try {
    	this.initialize(isIndeterminate);
    	   	   	
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void initialize(Boolean isIndeterminate) throws Exception {
	ImageIcon img_Icon= new ImageIcon(AuxiliarImagenes.class.getResource("wait.gif"));	  
		
	//Image image = img_Icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	//img_Icon.setImage(image);
		
	this.img_Icon = img_Icon;
	this.lbl_Imagen.setIcon(this.img_Icon);
	    	    
	if(!this.esMostrarGif) {
		this.initializeJProgressBar(isIndeterminate);
	}
	  
	this.getJContentPane();

    //this.pack();
  }

  public void getJContentPane() {
	  	int iGridX=0;
	  	int iGridY=0;
	  	
	    this.gridaBagLayout = new GridBagLayout();
	    
	    this.pnl_Splash = new JPanel();
	    //this.pnl_Splash.setBorder(javax.swing.BorderFactory.createTitledBorder("PROCESANDO"));
	    this.pnl_Splash.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	    
	    this.pnl_Splash.setBackground(Color.WHITE);
		this.pnl_Splash.setName("pnl_Splash"); 
		
		this.pnl_Splash.setMinimumSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		this.pnl_Splash.setMaximumSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		this.pnl_Splash.setPreferredSize(new Dimension(this.iWidthFinal,this.iHeightFinal));
		
		
		this.pnl_Splash.setLayout(this.gridaBagLayout);
			

		if(!this.esMostrarGif) {
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraints.gridy = iGridY++;		
			this.gridBagConstraints.gridx = iGridX;
				
			this.pnl_Splash.add(this.progress_Bar, this.gridBagConstraints);
		
		} else {
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraints.gridy = iGridY++;		
			this.gridBagConstraints.gridx = iGridX;
				
			this.pnl_Splash.add(this.lbl_Imagen, this.gridBagConstraints);
		}
		
		//return this.pnl_Splash;
		
				
				
		this.setContentPane(new JPanel());
		
		GridBagLayout gridaBagLayoutPrincipal = new GridBagLayout();
		this.getContentPane().setLayout(gridaBagLayoutPrincipal);
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =0;
		this.gridBagConstraints.gridx =0;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;
		
		this.getContentPane().add(this.pnl_Splash, this.gridBagConstraints);
  }	
	
  
  public void initializeJProgressBar(Boolean isIndeterminate){
		this.progress_Bar = new JProgressBar(0, SplashScreenJFrame.MAX);
		this.progress_Bar.setValue(0);
		this.progress_Bar.setStringPainted(true);
		
		this.progress_Bar.setMinimumSize(new Dimension(300,50));
		this.progress_Bar.setMaximumSize(new Dimension(300,50));
		this.progress_Bar.setPreferredSize(new Dimension(300,50));
		
		this.progress_Bar.setIndeterminate(isIndeterminate);
		
		if(isIndeterminate) {
			this.progress_Bar.setStringPainted(false);
		} else {
			this.progress_Bar.setStringPainted(true);
		}
  }
  
  public void setProgressMax(int maxProgress) {
	  this.progress_Bar.setMaximum(maxProgress);
  }

	
	
	public void startProcess()throws Exception{
		
		try {
			//System.out.println("antes cursor"+new Date(System.currentTimeMillis()));
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			//this.setVisible(true);
			
			if(!this.isIndeterminate) {
				if(!this.esMostrarGif) {
					for (int iCountGeneral = 0; iCountGeneral < this.iNumeroEjecusionDemora; iCountGeneral++) {
						this.executeAuxProgress();
						
						this.setProgress("Ejecutanto " + 0, 0);
				    }
				}
			}
			
			//System.out.println("despues cursor"+new Date(System.currentTimeMillis()));
			
			//System.out.println("antes start progress"+new Date(System.currentTimeMillis()));			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	startProcessJProgressBar(); 
	            }
	        });
			*/
			this.startProcessJProgressBar();
			//System.out.println("despues start progress"+new Date(System.currentTimeMillis()));			
			
			//this.finishProcessJProgressBar();	
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void startProcessJProgressBar(){
		  //this.progress_Bar.setString("PROCESANDO...");
		if(!this.esMostrarGif) {
		  this.progress_Bar.setVisible(true);
		} else {
			this.lbl_Imagen.setVisible(true);
		}
					  //this.progress_Bar.setIndeterminate(true);
					  //this.progress_Bar.setValue(this.progress_Bar.getMinimum());		
	  }
	
	public void finishProcess()throws Exception{
		
		try {
			
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			//this.setVisible(false);
			
			//this.startProcessJProgressBar();
			
			this.finishProcessJProgressBar();
			
			
			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	finishProcessJProgressBar();
	            }
	        });
	        */
		} catch(Exception e) {
			throw e;
		}
	}
	
	 
		
	  public void finishProcessJProgressBar(){
		  if(!this.esMostrarGif) {
			this.progress_Bar.setVisible(false);
		  } else {
			  this.lbl_Imagen.setVisible(false);
		  }
			//this.progress_Bar.setString(null);		
						//this.progress_Bar.setIndeterminate(false); 
						//this.progress_Bar.setValue(this.progress_Bar.getMaximum());
	  }
	  
  public void setValueProgress(int valueProgress) {
	if(!this.esMostrarGif) {
	    final int theValueProgress = valueProgress;
	    
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        progress_Bar.setValue(theValueProgress);
	      }
	    });
	}
  }

  public void setProgress(String message, int valueProgress) {
	if(!this.esMostrarGif) {
	    final int theValueProgress = valueProgress;
	    final String theMessage = message;
	    
	    this.setValueProgress(valueProgress);
	    
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        progress_Bar.setValue(theValueProgress);
	        setMessage(theMessage);
	      }
	    });
	}
  }

  private void setMessage(String message) {
	if(!this.esMostrarGif) {
	    if (message==null) {
	    	message = "";
	    	this.progress_Bar.setStringPainted(false);
	      
	    } else {
	    	this.progress_Bar.setStringPainted(true);
	    }
	    
	    this.progress_Bar.setString(message);
	}
  }
  
  /*
  public void setVisibleScreen(boolean b) {
    final boolean boo = b;
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        setVisible(boo);
      }
    });
  }
   */
  
  public void executeAuxProgress() {
	  if(!this.esMostrarGif) {
	    // SIMULANDO PROCESO
	    for (int iCount = 0; iCount <= 100; iCount++) {
	      for (long jCount=0; jCount<50000; ++jCount) {
	        String sCountProceso = " " + (jCount + iCount);
	      }
	      // run either of these two -- not both
	      this.setProgress("Ejecutanto " + iCount, iCount);  // progress bar with a message
	      //screen.setProgress(i);           // progress bar with no message
	    }
	  }
  }

  private Image image=null;
  private Boolean conRepeatImage=true;
  
 
  public void paintComponent(Graphics g) {
     // super.paintComponent(g);
      
      String sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE+"_verde";
      
      image=FuncionesSwing.getImagenFondo(sPathImagen);//this.sPathImagen
      
      if(image!=null) {
	        if (conRepeatImage) {
	            int iw = image.getWidth(this);
	            int ih = image.getHeight(this);
	            
	            if (iw > 0 && ih > 0) {
	                for (int x = 0; x < getWidth(); x += iw) {
	                    for (int y = 0; y < getHeight(); y += ih) {
	                        g.drawImage(image, x, y, iw, ih, this);
	                    }
	                }
	            }
	            
	        } else {
	            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        }
      }
  }
  
	public JLabel getlbl_Imagen() {
		return lbl_Imagen;
	}
	
	public void setlbl_Imagen(JLabel lbl_Imagen) {
		this.lbl_Imagen = lbl_Imagen;
	}
	
	public JProgressBar getprogress_Bar() {
		return progress_Bar;
	}
	
	public void setprogress_Bar(JProgressBar progress_Bar) {
		this.progress_Bar = progress_Bar;
	}
	
	public ImageIcon getImg_Icon() {
		return img_Icon;
	}
	
	public void setImg_Icon(ImageIcon img_Icon) {
		this.img_Icon = img_Icon;
	}
	
	public Boolean getIsIndeterminate() {
		return isIndeterminate;
	}
	
	public void setIsIndeterminate(Boolean isIndeterminate) {
		this.isIndeterminate = isIndeterminate;
	}

	public Integer getiNumeroEjecusionDemora() {
		return iNumeroEjecusionDemora;
	}

	public void setiNumeroEjecusionDemora(Integer iNumeroEjecusionDemora) {
		this.iNumeroEjecusionDemora = iNumeroEjecusionDemora;
	}

	public JPanel getpnl_Splash() {
		return pnl_Splash;
	}

	public void setpnl_Splash(JPanel pnl_Splash) {
		this.pnl_Splash = pnl_Splash;
	}

	public Boolean getEsMostrarGif() {
		return esMostrarGif;
	}

	public void setEsMostrarGif(Boolean esMostrarGif) {
		this.esMostrarGif = esMostrarGif;
	}	
	
	
}