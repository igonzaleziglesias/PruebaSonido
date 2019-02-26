/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandosonido;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author igonzaleziglesias
 */
public class ProbandoSonido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Clip sonido = AudioSystem.getClip();
            File a = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/Balloon.wav");
            sonido.open(AudioSystem.getAudioInputStream(a));
            sonido.start();
            System.out.println("Reproduciendo 1s. de sonido...");
            Thread.sleep(1000); // 1000 milisegundos (1 segundos)
            sonido.close();
        } catch (Exception tipoError) {
            System.out.println("" + tipoError);
        }
    }

}
