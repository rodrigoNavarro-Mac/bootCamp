import java.util.Scanner;
    
    // Crear una clase coche.
    // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    // Una función que incremente el número de puertas que tiene el coche.
    // Crear un objeto miCoche en el main y añadirle una puerta.
    // Mostrar el número de puertas que tiene el objeto.
public class Coche {
        public int nPuertas;
        public Coche(){
            nPuertas = 1;
        }

        public void añadirPuerta(){
            nPuertas++;
        }

//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

    public static int sumaTresDigitos(int x,int y,int z){
        x += y + z;
        return x;
    }

    
    public static void main(String[] args) {
        int x,y,z,opc;
        Scanner lee = new Scanner(System.in);
        System.out.println("\t-Ejercicio 01-\n\t****Parte 1***");
        System.out.println("Favor de ingresar el primer dato a sumar: \n");
        x = lee.nextInt();
        System.out.println("Favor de ingresar el segundo dato a sumar: \n");
        y= lee.nextInt();
        System.out.println("Favor de ingresar el tercer dato a sumar: \n");
        z = lee.nextInt();
        System.out.print("El resultado es de: "+sumaTresDigitos(x,y,z));
        System.out.println("\n\n\t****Parte 2***");
        Coche coche = new Coche();
        do{
            System.out.println("\n\nEl Numero actual de puertas es de: "+ coche.nPuertas);
            System.out.println("¿Desea agregar otra puerta?\n\tElige una opcion\n1) Si\n2) No");
            opc = lee.nextInt();
            switch(opc){
                case 1:{
                    coche.añadirPuerta();
                    break;
                }
                case 2:{
                    System.out.println("El Numero Final de puertas es de: "+ coche.nPuertas);
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Elige una opcion valida");
            }
        }while(opc !=2);
        lee.close();
    }
}

