package pregunta2;
import  java.util.Scanner;
public class Cuenta {

    int reintegro ;
    int ingreso ;

    public String ingresar(){
        System.out.println("INSERTE LA CANTIDAD QUE QUIERE INGRESAR");
            Scanner leerNum = new Scanner(System.in);
            this.reintegro = leerNum.nextInt();
            this.ingreso +=  this.reintegro ;
            String message = "INSERTASTE " + this.reintegro + " pesos.  Tu CUENTA TIENE:   "  + this.ingreso ;
            return message ;
    }

    public String mostrar(){
       String  message = "Su saldo es de:  "+  this.ingreso ;
       return message ;
    }



}

