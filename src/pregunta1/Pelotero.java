package pregunta1;

public class Pelotero extends Persona{

    public void batear(){
        System.out.println("Soy " + this.profesion + " y este es mi metodo 1 --> BATEAR.");
        System.out.println("Bateando....");
    }
    public void correr(String estadio){
        System.out.println( " Este es mi metodo 2 --> CORRER.");
        System.out.println("Corriendo en el " +  estadio + ".");
    }
    public void irAposicion(String posicion){
        System.out.println("Este es mi metodo 3 --> IR A MI POSICION.");
        System.out.println("Mi posicion es " + posicion + ", voy hacia ella.");
    }

}
