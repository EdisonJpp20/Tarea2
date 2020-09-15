package pregunta5;

 public class Fraccion {

     int numerador ;
     int denominador;

     public Fraccion(int numerador , int denominador){
         this.numerador = numerador;
         if(denominador == 0 ){
             denominador = 1 ;
         }
         this.denominador = denominador ;
     }

     private int mcd(){
         int u = Math.abs(numerador);
         int v = Math.abs(denominador);
         if(v == 0){
             return u;
         }
         int r;
         while(v != 0){
             r = u % v;
             u = v;
             v = r;
         }
         return u;
     }

     private void simplificar() {
         int n = mcd(); //se calcula el mcd de la fracción
         numerador = numerador / n;
         denominador = denominador / n;
     }

     public String sumar(Fraccion f) {
         Fraccion aux = new Fraccion(numerador , denominador); // //fracción para guardar la suma
         aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
         aux.denominador = this.denominador * f.denominador;
         aux.simplificar();  //se simplifica antes de devolverla
         return aux.numerador +  "/" + aux.denominador ;
     }

     public String restar(Fraccion f) {
         Fraccion aux = new Fraccion(numerador , denominador);
         aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
         aux.denominador = this.denominador * f.denominador;
         aux.simplificar();
         return aux.numerador +  "/" + aux.denominador ;
     }


     public String multiplicar(Fraccion f) {
         Fraccion aux = new Fraccion(numerador , denominador);
         aux.numerador = this.numerador * f.denominador;
         aux.denominador = this.denominador * f.numerador;
         aux.simplificar();
         return aux.numerador +  "/" + aux.denominador ;
     }

     public String dividir(Fraccion f) {
         Fraccion aux = new Fraccion(numerador , denominador);
         aux.numerador = this.numerador * f.numerador;
         aux.denominador = this.denominador * f.denominador;
         aux.simplificar();
         return aux.numerador +  "/" + aux.denominador ;
     }

 }
