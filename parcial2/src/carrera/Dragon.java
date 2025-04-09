/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author majin
 */
public class Dragon extends Criatura {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre());
        objetivo.defender(this.fuerza + 10);
    }

    @Override
    public void defender(int danio) {
        this.salud -= danio - 5; 
        System.out.println(nombre + " resistió con escamas. Salud restante: " + salud);
    }
}
