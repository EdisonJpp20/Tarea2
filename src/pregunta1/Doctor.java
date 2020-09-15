package pregunta1;

public class Doctor extends  Persona {

    public void cirujia (){
        System.out.println(" Mi metodo 1 --> CIRUJIA.");
        System.out.println("Haciendo cirujia....");
    }

    public void cirujiaFallida() {
        System.out.println("Mi metodo 2 --> CiRUJIA FALLIDA. ");
        System.out.println("Lo siento.... El paciente murio!");
    }

    public void  cirujiaExitosa(){
        System.out.println("Mi metodo 3 --> CIRUJIA EXITOSA! " );
        System.out.println("Huuuuuraaaaa, la cirujia fue exitosa! " );
    }
}
