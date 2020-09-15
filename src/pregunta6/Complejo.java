package pregunta6;

public class Complejo {
    double real ;
    double imaginario ;

    public  Complejo ( ){
    }

    public  Complejo(double real , double imaginario){
        this.real = real ;
        this.imaginario = imaginario ;
    }

    public String sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imaginario = imaginario + c.imaginario;
        return "(" + aux.real + ", " + aux.imaginario + ")";
    }

    public  String restar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real - c.real;
        aux.imaginario = imaginario - c.imaginario;
        return "(" + aux.real + ", " + aux.imaginario + ")";
    }

    public String multiplicar(Complejo c ){
        Complejo aux = new Complejo();
        aux.real = c.real * real  * imaginario;
        aux.imaginario = c.imaginario * imaginario * real ;
        return "(" + aux.real + ", " + aux.imaginario + ")";

    }

    public String dividir(Complejo c){
        Complejo aux = new Complejo();
        aux.real = (real * c.real + imaginario * c.imaginario)/(c.real * c.real + c.imaginario * c.imaginario);
        aux.imaginario = (imaginario * c.real - real * c.imaginario)/(c.real * c.real + c.imaginario * c.imaginario);
        return "(" + aux.real + ", " + aux.imaginario + ")";
    }









}
