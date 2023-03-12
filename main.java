import java.util.Scanner;
import java.util.InputMismatchException;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Bienvenido a la maravillosa beta de este juego, el juego consta de 2 jugadores, un aliado y un enemigo cada uno con diferentes características.\nADVERTENCIA AL CONSUMIDOR:\n - Al tratarse de una BETA ninguna de las características está configurada.\n - El juego actualmente finalizará al recorrerse el ARRAY.");

        Jugador p1 = new Jugador();
        Enemigo p2 = new Enemigo();

        Entidad [] array = new Entidad[2];

        array[0] = p1;
        array[1] = p2;
        
        int accion = 0;
        boolean comprobar = true;
//El bloque catch funciona erróneamente y se crea un bucle infinito, pendiente de revisión para corregir el error
        for (int i = 0; i<3;i++) {
            do {
                try {
                    comprobar = true;
                    System.out.println("Jugador 1, elija la acción a realizar escribiendo el nº de dicha acción:"+"\n1. Ataque"+"\n2. Defensa"+"\n3. Pasar turno");
                    accion = sc.nextInt();
                } catch (InputMismatchException ex) {
                    comprobar = false;
                    System.out.println("Se ha producido un error dado que usted ha intentado romper el juego");
                }
            } while (!comprobar);

            array[0].turno(accion);

            do {
                try {
                    comprobar = true;
                    System.out.println("Jugador 2, elija la acción a realizar escribiendo el nº de dicha acción:"+"\n1. Ataque"+"\n2. Defensa"+"\n3. Pasar turno");
                    accion = sc.nextInt();
                } catch (InputMismatchException ex) {
                    comprobar = false;
                    System.out.println("Se ha producido un error dado que usted ha intentado romper el juego");
                }
            } while (!comprobar);

            array[1].turno(accion);
        }
/*Este tipo de construcciones nos sirve para invocar a un mismo mensaje/método desde diferentes objetos lo cual identificar de la misma manera a diferentes objetos
pero que cada uno desempeñe una función diferente. A grandes rasgos esto se traduce en una mayor limpieza del código y facilidad de compresión del mismo así como 
nos permite reducir los costes en memoría de procesado de la información
*/
    }
}