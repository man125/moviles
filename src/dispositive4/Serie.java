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
public class Serie implements Entregable {
    String titulo;
    boolean entrega;
    String autor;
    String genero;
    int numTemporadas;

    public Serie(String titulo, String autor, String genero, int numTemporadas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numTemporadas = numTemporadas;
        this.entrega= false;
    }
    public Serie(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
         this.genero = "";
        this.numTemporadas = 3;
        this.entrega= false;
    }
    public Serie(){
        this.titulo = "";
        this.entrega = false;
        this.autor = "";
        this.genero = "";
        this.numTemporadas = 3;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", entrega=" + entrega + ", autor=" + autor + ", genero=" + genero + ", numTemporadas=" + numTemporadas + '}';
    }
    
    
    @Override
    public void devolver() {
      entrega = false;
    }

    @Override
    public boolean isEntregado() {
      return this.entrega; 
    }

    @Override
    public String compareTo(Object o) {
        Serie v = (Serie) o;
        if(v.numTemporadas > this.numTemporadas)
           return "Es mayor "+ v.titulo;
        else
            return "Es menor "+ this.titulo;
    
    }

    @Override
    public void entregar() {
        entrega = true;
    }
    
    
}
