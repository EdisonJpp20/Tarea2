package pregunta4;

public class Main {
    public static void main(String[] args){

        Libro libro = new Libro(50000 , 300);

        libro.setterPrestamo(90000);
        System.out.println(" getterPrestamo " + "\n" + libro.getterPrestamo());

        libro.setterDevolucion(1000);
        System.out.println(" getterDevolucion " + "\n" + libro.getterDevolucion());

        System.out.println("To String:" + "\n" + libro.toString() );

    }
}
