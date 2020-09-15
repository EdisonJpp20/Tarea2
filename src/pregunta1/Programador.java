package pregunta1;

public class Programador extends Persona {

    public void  bebiendoCafe(){
        System.out.println("Mi metodo 1 ---> BEBIENDO CAFE.");
        System.out.println("Estoy bebiendo cafee mientras programo , me gusta ser " + this.profesion + ".");
    }

    public void irARecortarme(){
        System.out.println("Mi metodo 2 --> IR A RECORTARME.");
        System.out.println("Mahhh'!  ire a recortarme! ");
    }

    public void  estudiarJava(){
        System.out.println("Mi metodo 3 --> ESTUDIAR JAVA.");
        System.out.println("Estoy estudiante java, cosas de " + this.profesion +".");
    }
}
