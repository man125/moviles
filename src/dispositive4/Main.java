/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositive4;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args) {
        VIdeojuego[] vid = new VIdeojuego[3];
        Serie[] s = new Serie[3];
        int c =0;
        
       vid[0] = new VIdeojuego("GOW","egames");
       vid[1] = new VIdeojuego("FIFA","SPORTS","EAGAMES",130);
       vid[2] = new VIdeojuego("Assasin","action","ubisoft",40);
       s[0] = new Serie("Breaking Bad","Wilson White");
       s[1] = new Serie();
       s[2] = new Serie("Friends","Jim Ryan","drama",5);
       
       VIdeojuego vidMayor = vid[0];
       Serie sMayor = s[0];
       s[2].entregar();
       vid[2].entregar();
       
       for(int i=0;i<3;i++){
           if(vid[i].isEntregado())
               c++;
           if(s[i].isEntregado())
               c++;
       
       }
        s[2].devolver();
       vid[2].devolver();
       
         for(int i=1;i<3;i++){
           if(vid[i].horas > vidMayor.getHoras())
               vidMayor = vid[i];
           if(s[i].numTemporadas > sMayor.numTemporadas)
               sMayor = s[i];
         }
         System.out.println(vid[0].compareTo(vid[2]));
         System.out.println(s[0].compareTo(s[2]));
         System.out.println("Los numeros de entrega son: "+ c);
         System.out.println("VIdeojuego mas horas: "+ vidMayor.toString());
         System.out.println("Serie mas temporadas: "+ sMayor.toString());
       
    }
}
