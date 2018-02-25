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
public interface Entregable {
    
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public String compareTo(Object o);
}
