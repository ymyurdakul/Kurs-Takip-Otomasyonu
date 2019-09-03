package com.Settings;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import sun.swing.FilePane;


 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
public class DosyaIslem {
    
    public static void mainDirectoryCreate()
    {
        
         File anaDizin=new File("C:\\Kurs Takip");
         if(anaDizin.exists()==false)
             anaDizin.mkdir();    
    }
    
    
    
    
}
