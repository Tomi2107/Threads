/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clse37bthreads;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tomas
 */
public class Consumidor implements Runnable{
    ArbolManzanas cesta;
    static int idConsumidor=0;
    int myid;    
    ArrayList<Integer> micestapropia;
    
    
    public Consumidor (ArbolManzanas cestacomun){
        cesta=cestacomun;
        myid=idConsumidor;
        idConsumidor++;
        micestapropia=new ArrayList<Integer>();
        
    }
    public void imprimecesta(){
        Iterator<Integer> it=micestapropia.iterator();
        System.out.print("El consumidor "+myid+" tiene ");
        while(it.hasNext()){
            int nummanzana=it.next();
            System.out.print("|"+nummanzana+"|");
        }
    }
    
    public void run(){
        for(int i=0;i<cesta.arraymanzanas.length/2;i++){
            try{
                int manzanarecogida=cesta.get();
                micestapropia.add(manzanarecogida);
                //System.out.println("El consumidor " +idConsumidor +" ha recogido la manzanas " +manzanarecogida);
                sleep(200);
                
            }catch(InterruptedException e){
                
            }
        }
        this.imprimecesta();
    }
    
    
}
