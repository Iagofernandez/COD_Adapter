/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadores;

/**
 *
 * @author ifernandezblanco
 */

//La clase Mp4 implementa los métodos de la interfaz Mediapackage
public class MP4 implements MediaPackage {
    //la clase playFile tiene un argumento de tipo String que imprime una frase y el String filename
      @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
    
    
}

