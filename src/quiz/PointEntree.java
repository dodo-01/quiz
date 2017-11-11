/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      //main c'est comme le menu principal
        // TODO code application logic here
   
  
    //Affiche menu principal
    boolean quitter = false;
    while(quitter==true){
        
        
        //1.Afficher options possibles
        System.out.println("Menu principal");
        System.out.println("--------------");
        System.out.println("1.Créer quiz");
        System.out.println("2.Démarrer quiz");
        
        //2.Scan
        Scanner scan = new Scanner (System.in);
        String choix = scan.nextLine();
        
        
        //3.switch choix
        switch(choix){
            case "1.creer quiz":
                afficheCreerQuiz();
                break;
                
            case "2.Démarrer quiz":
                afficheDemarrerQuiz();
                break;
                
            default:
                break;
        }
    
        
        
       
        
        
        
        
        
        
    }
    
    
    
    }   

    private static void afficheCreerQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void afficheDemarrerQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
