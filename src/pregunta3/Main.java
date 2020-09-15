package pregunta3;
import java.util.Scanner ;

public class Main {
    public static  void  main(String[] args){

        System.out.println("QUE NUMERO QUIERE INSERTAR EN EL CONTADOR?");
        Scanner leerContador = new Scanner(System.in);
        int contadorNum = leerContador.nextInt();
        Contador contador = new Contador(contadorNum);

        System.out.println(contador.increment() + " Incrementado ");
        System.out.println(contador.descrement() + " Descrementado");

    }
}
