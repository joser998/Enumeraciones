package test;
//Importacion de la Clase Dias, que se encuentra en otro paquete.
import enumeraciones.Continentes;
import enumeraciones.Dias;
public class EjemploEnumeraciones {
    public static void main(String[] args) {
        /*
          Presentamos las enumeraciones que habiamos creado en la otra Clase llamada 'Dias' basta con importar la clase
            y no es necesario usar una instancia para interceder a estas, basta hacerlo como se muestra.
            Valores de la enumeracion
        */
        System.out.println("Valor 1: "+Dias.LUNES);
        System.out.println("Valor 2: "+Dias.MARTES);
        
        
        /*Utilizamos la enumeracion de paises. */
        System.out.println("\nContinente no. 4: "+Continentes.AMERICA);
        
        
        /*Somos capaces tambien de acceder al parametro de cada pais (Cantidad de paises del continente) que agregamos
            en la enumeracion de la clase Continentes */
        System.out.println("\nAccedemos al numero de paises del continente 4: "+Continentes.AMERICA.getPaises());
        System.out.println("Accedemos al numero de paises del contiente 2: "+Continentes.EUROPA.getPaises());
        
        
        /* Le mando la enumeracion de DOMINGO de la Clase 'Dias', se le puede mandar cualquier otra enumeracion como 
            parametro
        */ 
        indicarDia(Dias.LUNES);
        
    }
    
    /* Recibo como parametro la variable 'dias' que es de tipo enumeracion de la clase Dias.
        Si le mando DOMINGO o cualquier otra enumeracion pasa al switch y ejecuta la sentencia que este en ese case*/
    private static void indicarDia(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("\nPrimer Dia de la semana: Lunes");
                break;
            case DOMINGO:
                System.out.println("\nUltimo Dia de la semana: Domingo");
                break;
            case JUEVES:
                System.out.println("\nDia Jueves");
                break;
        }
    }
}