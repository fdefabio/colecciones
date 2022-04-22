package proyecto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class carnetAnimal {
    public static void main(String args []){
        Animal perro = new Animal("perro" , "4" , "carnivoro");

        Animal pez = new Animal("pez" , "0" , "obnivoro");

        Animal gato = new Animal("gato" , "0" , "carnivoro");

        Animal araña = new Animal("araña" , "8" , "carnivoro");

        Animal pajaro = new Animal("pajaro" , "0" , "obnivoro");

        Set<Animal> animales = new HashSet<Animal>();

        animales.add(perro);
        animales.add(pez);
        animales.add(gato);
        animales.add(araña);
        animales.add(pajaro);


        for (Animal animal: animales) {
            System.out.println("Nombre: "                + animal.getNombre() + " " +
                               "Numero de patas: "       + animal.getNumeroDePatas() + " " +
                                "Tipo de alimentacion: " + animal.getTipoDeAlimentacion());
        }
    }
}
