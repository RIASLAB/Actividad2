/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author majin
 */
public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con espada a " + objetivo.getNombre());
        objetivo.defender(this.fuerza);
    }

    @Override
    public void defender(int danio) {
        this.salud -= danio - 2; 
        System.out.println(nombre + " bloqueó con escudo. Salud restante: " + salud);
    }
}
