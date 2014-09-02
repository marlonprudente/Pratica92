
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import utfpr.ct.dainf.if62c.pratica.MinutoTask;
import utfpr.ct.dainf.if62c.pratica.MinutoTaskImpar;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica92 {
    public static void main(String[] args) throws IOException {
        long hora = 60000;
        
        Timer timer = new Timer("hora-timer1");
        Timer timer2 = new Timer("hora-loading-timer2");
        
        long atraso = hora - new Date().getTime() % hora;
        
        timer.scheduleAtFixedRate(new MinutoTask(), atraso, hora);

        
        System.in.read();
        timer2.cancel();
        timer.cancel();
        
        
    }
}
