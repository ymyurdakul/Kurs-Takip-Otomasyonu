 
package com.Settings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import sun.security.tools.keytool.Main;

 
public class MainLookAndFeel {
    private static LookAndFeel view=null;
    private MainLookAndFeel() throws FileNotFoundException, IOException
    {
        
         
        Properties pr=new Properties();
        if(new File("C:\\Kurs Takip\\feel.prop").exists())
        {
        pr.load(new FileInputStream("C:\\Kurs Takip\\feel.prop"));
       
        switch(pr.getProperty("feel"))
        {
            case "Nimbus":
                view=new NimbusLookAndFeel();
             break;
            case "Metal":
                view=new MetalLookAndFeel();
        }
        }
        //Default olarak secilmistir
        if(view==null)
        view=new MetalLookAndFeel();
        
    }
    public static void setLookAndFeel(LookAndFeel lk)
    {
        view=lk;
    }
    public static LookAndFeel getLookAndView() throws IOException
    {
        if(view==null)
            new MainLookAndFeel();
        return view;
    }
    public static void save() throws FileNotFoundException, IOException
    {
        Properties property=new Properties();
        property.put("feel", getLookAndView().getName().toString());
        property.save(new FileOutputStream("C:\\Kurs Takip\\feel.prop"),"");
        
    }
    
    
}
