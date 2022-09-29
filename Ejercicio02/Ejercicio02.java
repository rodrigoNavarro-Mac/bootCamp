package Ejercicio02;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        int numeroIf, numeroWhile,numeroDowhile,estacion;
        Scanner lee = new Scanner(System.in);
        System.out.println("\t***Ejercicio 02****\n\n Favor de ingresar un dato: \n");
        numeroIf = lee.nextInt();
        
// // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        if(numeroIf >0){
            System.out.println("El numero " + numeroIf +" es postivo :D!!" );
        }
        else{
            System.out.println("El numero " + numeroIf +" es negativo >:D!!" );

        }
// // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
//    el bloque de código que tendrá el bucle deberá:
// // Incrementar el valor de la variable en uno cada vez que se ejecute.
// // Mostrarlo por pantalla cada vez que se ejecute.
        numeroWhile = 0;
        System.out.println("Inicio de numeroWhile: "+ numeroWhile );
        while(numeroWhile <=3){
            numeroWhile ++;
            System.out.println("Las veces que se ejecuto el while fueron: "+numeroWhile);
        }

// // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        numeroDowhile = 0;
        System.out.println("Inicio de numeroDoWhile: "+ numeroDowhile);
        do{
            numeroDowhile ++;
            System.out.println("Las veces que se ejecuto el while fueron: "+numeroDowhile);
        }while(numeroDowhile <=3);

        // // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual
//  o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for(int i = 0; i <= 3 ; i++){
            System.out.println("Recorrido en el for: "+ i);
        }

// // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
//  Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en 
//  la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        System.out.println("\t**Estaciones del año**\n1) Primavera\n2) Verano\n3) Otoño\n4) Invierno\nFavor de Ingresar la estacion del año: ");
        estacion = lee.nextInt();
        switch(estacion){
            case 1: 
            System.out.println("ESTAMOS EN PRIMAVERA :D!!!!");
            break;
            case 2: 
            System.out.println("ESTAMOS EN VERANO B)!!!!");
            break;
            case 3: 
            System.out.println("ESTAMOS EN OTOÑO :o!!!!");
            break;
            case 4: 
            System.out.println("ESTAMOS EN INVIERNO <:D!!!!");
            break;
            default:
            System.out.println("Eso no es una estacion");
        }
        lee.close();
    }
}
