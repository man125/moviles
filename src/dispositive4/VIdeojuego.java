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
public class VIdeojuego implements Entregable {
    String titulo;
    String genero;
    String compañia;
    int horas;
    boolean entregado;

    public VIdeojuego(String titulo, String genero, String compañia, int horas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horas = horas;
        this.entregado = false;
    }
    public VIdeojuego(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = "";
        this.horas = 10;
        this.entregado = false;
    }
    public VIdeojuego() {
        this.titulo = "";
        this.genero = "";
        this.compañia = "";
        this.horas = 10;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "VIdeojuego{" + "titulo=" + titulo + ", genero=" + genero + ", compa\u00f1ia=" + compañia + ", horas=" + horas + ", entregado=" + entregado + '}';
    }

    @Override
    public void entregar() {
      entregado = true;
    }

    @Override
    public void devolver() {
      entregado = false;
    }

    @Override
    public boolean isEntregado() {
      return this.entregado; 
    }

    @Override
    public String compareTo(Object o) {
        VIdeojuego v = (VIdeojuego) o;
        if(v.horas > this.horas)
           return "Es mayor "+ v.titulo;
        else
            return "Es mayor "+ this.titulo;
    
    }
    
    
    
    
}
