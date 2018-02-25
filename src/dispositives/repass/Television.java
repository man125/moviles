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
public class Television extends Electrodomesticos {
    int resolucion;
    boolean sintonizador;

    public Television(int resolucion, boolean sintonizador, int precioBase, String color,
            char consumo, int peso) {
        
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizador= false;
    }
    public Television(int res, boolean sin){
        super();
        this.resolucion = 20;
        this.sintonizador= false;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public int finalPrice() {
        //To change body of generated methods, choose Tools | Templates.
        if(this.resolucion >= 40) 
            precioBase += precioBase * 0.30;
       
        if(this.sintonizador)
            precioBase += 50;
        
         return precioBase;
    }

   
    
    
    
}
