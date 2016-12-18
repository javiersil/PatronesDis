/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuesto;

/**
 *
 * @author javier
 */
public class Compuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ComponenteMenu menuCasa = new Menu("menu de casa","desayuno");
       ComponenteMenu menuComida = new Menu("menu de comida","comida"); 
       ComponenteMenu todoslosmenu= new Menu("todos los menu","todos");
       
        
        
        menuCasa.add(new ElementoMenu("desayuno","jugo", false,25.0));
        
        
        todoslosmenu.add(menuComida);
        todoslosmenu.add(menuCasa);
        
        
        
        todoslosmenu.print();
        menuCasa.print();
        
        
    }
    
}
