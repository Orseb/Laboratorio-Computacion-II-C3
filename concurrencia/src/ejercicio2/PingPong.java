package ejercicio2;
import static java.lang.Thread.sleep;

public class PingPong implements Runnable {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras
    public PingPong(String queDecir, int cadaCuantosMs){
        word = queDecir; delay = cadaCuantosMs; };
    public void run(){
        while(true){
            System.out.print(word + " ");
            try{ sleep(delay);
            }catch(InterruptedException e){return;}
        }
    }
}