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
//Clase VLC que implementa de la Interfaz MediaPackage
public class VLC implements MediaPackage{
    //La interfaz MediaPackage llama la metodo playFile, que reproduce en VLC el filename
     @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
}
}
