package pregunta5;
public class Main {
    public  static  void  main(String[] args){

        Fraccion f1 = new Fraccion(2, 3); // Fracción 1/4
        Fraccion f2 = new Fraccion(4, 3); // Fracción 1/2
        var suma = f1.sumar(f2);
        var resta = f1.restar(f2);
        var multiplicar = f1.multiplicar(f2);
        var dividir = f1.dividir(f2);


        System.out.println("SUMA" +  "\n" + f1.numerador + "/" + f1.denominador + " + " + f2.numerador + "/" + f2.denominador + " = " + suma);
        System.out.println( "RESTA" +  "\n" + f1.numerador + "/" + f1.denominador + " + " + f2.numerador + "/" + f2.denominador + " = " + resta);
        System.out.println( "MULTIPLICAR" +  "\n" + f1.numerador + "/" + f1.denominador + " + " + f2.numerador + "/" + f2.denominador + " = " + multiplicar);
        System.out.println( "DIVIDIR" +  "\n" + f1.numerador + "/" + f1.denominador + " + " + f2.numerador + "/" + f2.denominador + " = " + dividir);

    }
}
