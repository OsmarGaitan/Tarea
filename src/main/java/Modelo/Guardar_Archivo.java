
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author osmar
 */
public class Guardar_Archivo {
    
    
  
     public void save(File f){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
            os.writeObject(this); 
            os.flush();
            os.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
     
//    public Person Open(File f){
//        try{
//            ObjectInputStream is = new ObjectInputStream(new FileInputStream(f));
//            Person p = (Person)is.readObject();
//            is.close();
//            return p;
//        }
//        catch(Exception ex){
//            ex.printStackTrace();
//            return null;
//        }
//    }
}
