package pregunta4;

public class Libro {
     private int prestamos ;
     private int devolucion ;

     public  Libro(){
     }

     public  Libro( int prestamo ,int  devolucion){
         this.devolucion = devolucion ;
         this.prestamos = prestamo ;
     }

     public void setterPrestamo (int p) {
         this.prestamos = p ;
     }
     public int getterPrestamo(){
         return  this.prestamos ;
     }
     public void setterDevolucion (int p) {
        this.devolucion = p ;
    }
     public int getterDevolucion(){
        return  this.devolucion ;
    }

    public String toString(){
         return  " Tu prestamo es de " +  this.prestamos + " y tu devolucion es " + this.devolucion ;
    }






}
