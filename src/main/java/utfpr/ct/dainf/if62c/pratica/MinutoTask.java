/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Marlon Prudente
 */
public class MinutoTask extends TimerTask{
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Date currentTime = new Date();    
    Timer timer = new Timer("minuto-impar");
    TimerTask mti;
    
    public boolean eimpar(){
        return currentTime.getTime() % 120000 >= 60000;
    }
    
    @Override
    public void run() {
        currentTime.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(currentTime));
        if(eimpar()){
        mti = new MinutoTaskImpar();
        timer.scheduleAtFixedRate(mti, 10000, 10000);
        }
        else{
            if(mti!= null){
                mti.cancel();
            }
            
        }
    }
    
}
