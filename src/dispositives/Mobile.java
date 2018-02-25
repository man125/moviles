/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositives;
import dispositives.repass.*;

/**
 *
 * @author manuel
 */
public class Mobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Electrodomesticos[] ele = new Electrodomesticos[5];
       int sum =0;
       int l =0; 
       int t =0;
       
       Electrodomesticos artelec = new Electrodomesticos(30,"negro",'C',200);
        Lavadora l1 = new Lavadora(200, 30);
        Lavadora l2 = new Lavadora(30, 20, "azul", 'B', 20);
        Television t1 = new Television(100,15);
        Television t2 = new Television(40, true,100,"azul",'C',56);
        ele[0] = l1;
        ele[1] = t2;
        ele[2] = t1;
        ele[3] = l2;
        ele[4] = artelec;
        for(Electrodomesticos e : ele){
            if(e instanceof Lavadora){
                System.out.println("Lavadora: "+ e.finalPrice());
                l += e.finalPrice();
            }else{
                 System.out.println("Televisor: "+ e.finalPrice());
                t += e.finalPrice();
            }
        
            sum+= e.finalPrice();    
    }
         System.out.println("ELectrodomesticos: "+ sum);
         System.out.println("Televisores: "+ t);
         System.out.println("Lavadoras: "+ l);
    }
    
}
