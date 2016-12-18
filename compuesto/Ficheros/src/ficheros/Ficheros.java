/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

/**
 *
 * @author javier
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Directorio carpeta1 = new Carpeta("documentos","contiene  documentos");
        Directorio carpeta2 = new Carpeta("escritorio","escritorio");
         Directorio carpeta3 = new Carpeta("imagenes","fotografias");
         Directorio carpeta4 = new Carpeta("imagenes","bajadas");
         
         
         Directorio doc = new Archivo("documento 1","es un word",".doc",250);
          Directorio doc2 = new Archivo("documento 2","es un word",".doc",100);
           Directorio doc3 = new Archivo("documento 3","es un word",".doc",75);
           
           
           Directorio img1 = new Archivo("imagen 1","es una imagen",".jpg",300);
           Directorio img2 = new Archivo("imagen 2","es una imagen",".png",400);
           
           carpeta3.add(img1);
           carpeta3.add(img2);
           carpeta3.add(carpeta4);
           
           carpeta1.add(doc);
           carpeta1.add(doc2);
           carpeta1.add(doc3);
           
           
        carpeta2.add(carpeta3);
        carpeta2.add(carpeta1);
       
        
        
        carpeta2.print();
        
    }
    
}
