package pregunta6;

public class Main {
    public  static  void main(String[] args){

            Complejo c1 = new Complejo(1.0 , 2.0);
            Complejo c2 = new Complejo(1.0 , 4.0);
            String c3  = c1.sumar(c2);

            System.out.println( "SUMA DE COMPLEJOS " + "\n" +  "(" +c1.real + ", " +c1.imaginario + ") +" + " (" + c2.real +  ", " +  c2.imaginario+ ")" + " = " + c3);

            c3 = c1.restar(c2);

            System.out.println( "RESTA DE COMPLEJOS " + "\n" +  "(" +c1.real + ", " +c1.imaginario + ") -" + " (" + c2.real +  ", " +  c2.imaginario+ ")" + " = " + c3);

            c3 = c1.multiplicar(c2);

            System.out.println( "MULTIPLICACION DE COMPLEJOS " + "\n" +  "(" +c1.real + ", " +c1.imaginario + ") *" + " (" + c2.real +  ", " +  c2.imaginario+ ")" + " = " + c3);

            c3 = c1.dividir(c2);

            System.out.println( "DIVICION DE COMPLEJOS " + "\n" +  "(" +c1.real + ", " +c1.imaginario + ") /" + " (" + c2.real +  ", " +  c2.imaginario+ ")" + " = " + c3);

    }
}
