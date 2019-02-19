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

//La clase MP3 implementa los métodos de la interfaz MediaPlayer
public class MP3 implements MediaPlayer {
    //La interfaz MediaPlayer llama al metodo play, reproduce audio en MP3 del filename
     @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
    
}

