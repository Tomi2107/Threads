/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clse37bthreads;

/**
 *
 * @author tomas
 */
public class ArbolManzanas {
   
    int actual;
    int ultima;
    boolean disponible=false;
    int[] arraymanzanas={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public ArbolManzanas(){
        actual=0;
    }
    public synchronized void put(int x){
        try{
            while(disponible==true){
                wait();
            }
            
        }catch(InterruptedException e){
            
        }
        disponible=true;
        ultima=actual;
        notifyAll();
        this.arraymanzanas[actual++]=x;
        System.out.println("se ha añadido una manzana " + this.arraymanzanas[ultima]);
        
    }
    
    public synchronized int get(){
        try{
            while(disponible==false){
                wait();
            }
            
        }catch(InterruptedException e){
            
        }
        disponible=false;
        notifyAll();
        System.out.println("se ha recogido la manzana " + this.arraymanzanas[ultima]);
        return this.arraymanzanas[ultima];
    }
    
    
}
