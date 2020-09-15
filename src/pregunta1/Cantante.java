package pregunta1;

public class Cantante extends Persona{

    public void cantar(String musica){
        System.out.println("Soy " + this.profesion + " y mi metodo 1 es --> CANTAR.");
        System.out.println("Cantare la musica " + musica +".");
    }

    public void irEntrevista( String lugar ){
        System.out.println(" MI metodo 2 es --> IR A ENTREVISTA. ");
        System.out.println("Ire a una entrevista en " + lugar + ".");
    }

    public void hacerConciento(){
        System.out.println("Mi metodo 3 --> HACER CONCIENTO.");
        System.out.println("Estoy haciendo un conciento....." + ".");
    };

}
