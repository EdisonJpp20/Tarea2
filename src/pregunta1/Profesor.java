package pregunta1;

public class Profesor  extends  Persona{
    public void darclase(){
        System.out.println("Este es mi metodo 1 ->> DAR CLASE.");
        System.out.println("Dando clase....!");
    }

    public  void excusa(){
        System.out.println("Este es mi metodo 2 ->> EXCUSA.");
        System.out.println("No podre dar clases hoy. me operaron ayer!");
    }

    public void darExamen(){
        System.out.println("Este es mi metodo 3 ->> DAR EXAMEN.");
        System.out.println("Aqui estan sus examenes!");
    }
}
