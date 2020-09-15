
////// EDISON PADILLA 2019-8370

package pregunta1;

public class Main {

    public static void main(String[] args) {

////        DOCTOR
        Doctor doctor  = new Doctor() ;
        doctor.nombre = "Edison";
        doctor.apellido = "Padilla";
        doctor.edad = 27 ;
        doctor.casado = true ;
        doctor.profesion = "Doctor";
        doctor.numeroDocumentoIdentidad = "056-0125586-1";
        doctor.saludar(doctor.nombre , doctor.profesion);
        doctor.cirujia();
        doctor.cirujiaFallida();
        doctor.cirujiaExitosa();

//      PROGRAMADOR
        Programador programador = new Programador();
        programador.nombre = "Pedro";
        programador.apellido = "Paulino";
        programador.edad = 25 ;
        programador.casado = false ;
        programador.profesion = "Programador";
        programador.numeroDocumentoIdentidad= "056-0125586-1";
        programador.saludar(programador.nombre, programador.profesion);
        programador.bebiendoCafe();
        programador.irARecortarme();
        programador.estudiarJava();

//      CANTANTE
        Cantante cantante = new Cantante();
        cantante.nombre =  "Esteysi " ;
        cantante.apellido = "German";
        cantante.edad = 12 ;
        cantante.casado = true ;
        cantante.profesion = "Cantante";
        cantante.numeroDocumentoIdentidad="056-01245226-1";
        cantante.saludar(cantante.nombre , cantante.profesion);
        cantante.cantar("'APOYATE EN MI'");
        cantante.irEntrevista("hack rock cafe");
        cantante.hacerConciento();

//        PELOTERO
            Pelotero pelotero = new Pelotero();
            pelotero.nombre = "Wilson";
            pelotero.apellido ="Padilla";
            pelotero.edad = 19 ;
            pelotero.casado = false ;
            pelotero.profesion = "Pelotero";
            pelotero.numeroDocumentoIdentidad = "056-01245226-1";
            pelotero.saludar(pelotero.nombre , pelotero.profesion);
            pelotero.batear();
            pelotero.correr("Estadio Quisqueya");
            pelotero.irAposicion("3ra base");

//        ABOGADO
            Abogado abogado = new Abogado();
            abogado.nombre = "Yensi";
            abogado.apellido = "Zoe";
            abogado.edad = 30;
            abogado.casado = true;
            abogado.profesion = "Abogado";
            abogado.numeroDocumentoIdentidad="056-01245226-1";
            abogado.saludar(abogado.nombre , abogado.profesion);
            abogado.enganar("Arthur");
            abogado.ganarJuicio();
            abogado.perderJuicio("Jeffrey");

//            PROFESOR
            Profesor profesor = new Profesor();
            profesor.nombre = "Freydi";
            profesor.apellido = "Nunez" ;
            profesor.edad = 35 ; // no lo se
            profesor.casado = true ; // tampoco  lo se
            profesor.profesion = "Profesor";
            profesor.numeroDocumentoIdentidad="056-01245226-1";
            profesor.saludar(profesor.nombre , profesor.profesion);
            profesor.darclase();
            profesor.excusa();
            profesor.darExamen();

//            ARQUITECTO
            Arquitecto arquitecto = new Arquitecto();
            arquitecto.nombre = " Wilber";
            arquitecto.apellido = " Burgos";
            arquitecto.edad = 22 ;
            arquitecto.casado = false ;
            arquitecto.profesion = "Arquitecto";
            arquitecto.numeroDocumentoIdentidad="056-01245226-1";
            arquitecto.saludar(arquitecto.nombre, arquitecto.profesion);
            arquitecto.dibujarPlanos();
            arquitecto.verPlanos();
            arquitecto.mostrarPlanos();


    }
}
