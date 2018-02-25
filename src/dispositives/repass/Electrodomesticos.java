/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositives.repass;

/**
 *
 * @author manuel
 */
public class Electrodomesticos {
        int precioBase;
        String color;
        char consumo;
       int peso;
        
        final static String BLANCO ="blanco";
        final static char ENERGIA ='F';
        final static int BASE = 100;
        final static int PESO = 5;
        

    public Electrodomesticos(int precioBase, String color, char consumo, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        checkColor();
        checkEnergy();
    }
    protected Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.color = BLANCO;
        this.consumo = ENERGIA;
        this.peso = peso;
    }
    protected Electrodomesticos() {
        this.precioBase = BASE;
        this.color = BLANCO;
        this.consumo = ENERGIA;
        this.peso = PESO;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    } 
    
    private char checkEnergy(){
        if(this.consumo != 'B' || this.consumo != 'C' || this.consumo != 'D' ||
                this.consumo != 'E' || this.consumo != 'F' )
            this.consumo = ENERGIA;
          
        return consumo;
    }
    
    private String checkColor(){
        switch(this.color){
            case "negro": this.color = "negro";break;
            case "rojo":  this.color = "rojo";break;
            case "azul":  this.color = "azul";break;
            case "gris":  this.color = "gris";break;
            default:  this.color = BLANCO;break;
        }
        return this.color;
    }
    
    public int finalPrice(){
        
         switch(this.consumo){
            case 'A':
                this.precioBase += 100;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            case 'C':
                this.precioBase += 60;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            case 'D':
                this.precioBase += 50;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            case 'E':
                this.precioBase += 30;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            case 'F':
                this.precioBase += 10;
                if(peso >0 && peso <= 19)
                    this.precioBase += 10;
                else if(peso > 19 &&  peso <= 49)
                    this.precioBase += 50;
                else if(peso > 49 && peso <= 79)
                    this.precioBase +=80;
                else
                    this.precioBase += 100;
                break;
            
    }
         return precioBase;
  }    
        
}
