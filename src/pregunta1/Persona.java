package pregunta1;

public class Persona {
    String nombre  ;
    String apellido  ;
    String profesion ;
    int  edad  ;
    boolean casado ;
    String numeroDocumentoIdentidad ;

     public void saludar( String nombre , String profesions){
        System.out.println("Hola mi nombre es  " + nombre + " , soy " +  profesions + "." );
    }
}
