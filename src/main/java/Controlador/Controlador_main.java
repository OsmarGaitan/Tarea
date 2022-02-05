/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Bloc_Notas;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Osmar
 */
public class Controlador_main implements ActionListener{

VentanaPrincipal vp;

    public Controlador_main(VentanaPrincipal vp) {
        this.vp = vp;
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
          case"bloc":
              shownuevobloc();
              break;
               case"salir":
              System.exit(0);
              break;
              
              
              
           }
    
    
    
    }

    private void shownuevobloc() {
        Bloc_Notas bc = new Bloc_Notas();
        vp.showChild(bc,true);
    }

    
 }
