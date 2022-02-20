/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clse37bthreads;

import static java.lang.Thread.sleep;

/**
 *
 * @author tomas
 */
public class Productor implements Runnable{
    ArbolManzanas cesta;
    static int idProductor;
    
    public Productor (ArbolManzanas cestacomun){
        cesta=cestacomun;
        idProductor++;
        
    }
    public void run(){
        for(int i=0;i<cesta.arraymanzanas.length;i++){
            try{
                cesta.put(i);
                //System.out.println("El productor " +idProductor +" ha añadido a la cesta comun de manzanas " +i);
                sleep(10);
                
            }catch(InterruptedException e){
                
            }
        }
    }
    
}
