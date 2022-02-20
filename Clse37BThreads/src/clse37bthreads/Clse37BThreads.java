/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clse37bthreads;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author tomas
 */
public class Clse37BThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolManzanas a=new ArbolManzanas();
        Consumidor c=new Consumidor(a);
        Consumidor c2=new Consumidor(a);
        Productor p=new Productor(a);
        Thread t1=new Thread(c);
        Thread t3=new Thread(c2);
        Thread t2=new Thread(p);
        t1.start();
        t3.setPriority(MAX_PRIORITY);
        t1.setPriority(MIN_PRIORITY);
        t2.start();
        t3.start();
        
        // TODO code application logic here
    }
    
}
