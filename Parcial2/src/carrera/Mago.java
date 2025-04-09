/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author Jhon Edinson R
 */

    public class Mago extends Criatura {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre());
        objetivo.defender(this.fuerza + 5);
    }

    @Override
    public void defender(int danio) {
        this.salud -= danio;
        System.out.println(nombre + " fue golpeado por magia. Salud restante: " + salud);
    }
}


