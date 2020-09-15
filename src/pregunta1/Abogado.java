package pregunta1;

public class Abogado extends  Persona {

    public void enganar(String juradoName){
        System.out.println("soy " + this.profesion + " y este es mi metodo 1 -> ENGAÑAR.");
        System.out.println("Hoy engañe al jurado, su nombre es " + juradoName + ".");
    }
    public void ganarJuicio(){
        System.out.println("Este es mi metodo 2 -> GANAR JUICIO.");
        System.out.println("Gane el juicio.....!");
    }

    public void perderJuicio(String contra){
        System.out.println("Este es mi metodo 2 -> PERDER JUICIO.");
        System.out.println("Hoy perdi el juicio contra " + contra + ".");
    }
}
