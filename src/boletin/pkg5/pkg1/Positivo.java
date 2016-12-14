/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Positivo {
   
    public static int pedirNum(){
        
        int num1;
        String res = JOptionPane.showInputDialog("teclea numero ");
        num1=Integer.parseInt(res);
        return num1;
    }
    
 public static void Positivo (int num1){
    
     if (num1>0){
      JOptionPane.showMessageDialog(null, "es positivo ");
     }
       else 
      JOptionPane.showMessageDialog(null,"es negativo");   
          
    }  
}
