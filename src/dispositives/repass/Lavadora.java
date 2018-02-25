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
public class Lavadora extends Electrodomesticos {
    static final int CARGA = 5;
    int carga;

    public Lavadora(int carga, int precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }
    public Lavadora(){
        this.carga= CARGA;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int finalPrice() {
        super.finalPrice(); //To change body of generated methods, choose Tools | Templates.
        if(carga > 30)
            this.precioBase = 50;
       return precioBase;
    }
    
    
    
   
    
    
}
