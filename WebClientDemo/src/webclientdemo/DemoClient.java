/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webclientdemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import webservicedemo.DemoWS;
import webservicedemo.DemoWSService;

/**
 *
 * @author Rocco
 */
public class DemoClient {
    private static DemoWSService service;
    private static DemoWS port;
    private static int counter=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    service=new DemoWSService();
    port=service.getDemoWSPort();
   Runnable r=new Runnable() {

            @Override
            public void run() {                
           Integer c= new Integer(counter) ;           
                try {
                    Thread.sleep((long) (3000*Math.random()));
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                int int1= (int) (100*Math.random());
                int int2= (int) (100*Math.random());
                  int result= port.add(int1, int2);
        System.out.println("["+c+"] "+int1 +"+"+int2+"= "+result);
            }
        };

        for (int i = 0; i <= 30; i++) {
            counter++;
        new Thread(r).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
   
    }
    void test(){
    
      
    
    }
    

    
}
 