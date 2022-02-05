/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Bloc_Notas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/**
 *
 * @author acer
 */
public class Bloc_nota_Controlador implements ActionListener {

    private Bloc_Notas notas; 
 
   public Bloc_nota_Controlador(){
           notas =   new Bloc_Notas();
   }
   
  public Bloc_nota_Controlador(Bloc_Notas notas) {
        this.notas = notas;
    }
 
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         switch(e.getActionCommand()){
             case"abrirFile":
             showFile();
             break;
             
            case"guardarFile":
            guardarFile();
              break;
         
         
          }
        
        
           }

    private void showFile() {
        notas.showText(abrirFile());    
    }
      private String abrirFile() {
  JFileChooser fd = new JFileChooser();
       fd.showOpenDialog(notas);
       File f = fd.getSelectedFile();
        BufferedReader br = null;
        try {
            StringBuilder sb = new StringBuilder();           
            br = new BufferedReader(new FileReader(f));
            String strLine = br.readLine();
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
            }
            br.close();
            return sb.toString();
        } catch (Exception ex) {
            Logger.getLogger(Bloc_nota_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
                return"";
    }
      }

    private void  guardarFile() {
        try {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(notas);
            if(fc.getSelectedFile()!=null){
                FileWriter myWriter = new FileWriter(fc.getSelectedFile());
                myWriter.write(notas.getText());
                myWriter.close();
            }

        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }

 } 

 
