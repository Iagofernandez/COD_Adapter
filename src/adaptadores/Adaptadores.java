
package adaptadores;

/**
 *
 * @author ifernandezblanco
 */
public class Adaptadores {

    
    public static void main(String[] args) {
        //instancio un player de MP3
         MediaPlayer player = new MP3();
         //recibo el play de MP3
        player.play("file.mp3");
        //instancio otro player MP4
        player = new FormatAdapter(new MP4());
        //ahora uso la clase FormatAdapter ya que no sirve el play de MediaPlayer, pero aun asi es necesario puesto que la implementa
        player.play("file.mp4");
        //instancio otro player de VLC
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }
//se crea una clase nueva que implementa de MediaPlayer
    private static class FormatAdapter implements MediaPlayer {
//Se crea este Mediapackage a fin de adaptar el play de Mediaplayer a las clases MP4 y VCL
        private MediaPackage media;
//Constructor que recibe el parametro MediaPackage
        public FormatAdapter(MediaPackage m) {
            media = m;
        }
//mediante este override se sobrescribe el metodo de play de MP3 y gracias al adapter tambien las clases VLC y MP4 sobrescriben el metodo
        @Override
        //esta clase implementa el play y sirve para llamar los metodos de las interfaces, incluida playfile 
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
    }
}
    
    

