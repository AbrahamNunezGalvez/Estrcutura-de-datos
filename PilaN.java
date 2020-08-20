
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abraham
 */
public class PilaN { 

    public static void main(String[] args) {
// TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tope2 = 0, tam, tam1, aux, N, M;//variables del programa a realizar
        M = 150;//se asigna un valor a las variables M y N 
        N = 200;

//double aleatoria = Math.random();
        int valorEntero = (int) Math.floor(Math.random() * (N - M + 1) + M);//funcion random para los numeros aleatorios
        Boolean encontrado = false;
        System.out.println("ingresa el tamaño de la pila");//se ceran las pilas
        int pila[] = new int[tam = sc.nextInt()];
        System.out.println("ingresa el tamaño de la pila");
        int pila2[] = new int[tam1 = sc.nextInt()];
        do {
            System.out.println("1- agregar \n"//se crea el menu de opciones para el programa
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- mostrar ultimos 3\n"
                    + "5- llenar\n"
                    + "6- vaciar\n"
                    + "7 salir ");
            switch (opt = sc.nextInt()) {
                case 1://codigo para ir agregado los valores de la pila
                    if (tope < tam) {
                        System.out.println("tope = " + tope);
                        System.out.println("agregar elemento a la pila");
                        pila[tope] = sc.nextInt();
                        tope++;

                        System.out.println("tope = " + tope);
                    } else {
                        System.out.println("pila llena..");
                    }
                    break;
                case 2://codigo para mostrar los valores de la pila
                    if (tope > 0) {
                        System.out.println("contenido de pila 1");
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println("posicion: " + i + " tiene el dato: " + pila[i]);
                        }
                        System.out.println("contenido de pila 2");
                        for (int i = tope2 - 1; i >= 0; i--) {
                            System.out.println("posicion: " + i + " tiene el dato: " + pila2[i]);
                        }
                    } else {
                        System.out.println("pila vacia..");
                    }
                    break;
                case 3://codigo para ir eliminando de uno por uno los valores de la pila
                    System.out.println("dato eliminado...");
                    tope--;
                    System.out.println("tope = " + tope);
                    break;
                case 4://codigo para mostrar losultimos tres numeros de la pila
                    System.out.println("ultimos 3");
                    int cont = 0;
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.println("posicion: " + i + " tiene el dato: " + pila[i]);
                        cont++;
                        if (cont == 3) {
                            break;
                        }
                    }
                    break;
                case 5://codigo para agregar automaticamente los valores de la pila y que no se repitan los valores
                    for (int i = 0; i < tam; i++) {
                        valorEntero = (int) Math.floor(Math.random() * (N - M + 1) + M);
                        if (valorEntero == valorEntero) {
                            valorEntero = (int) Math.floor(Math.random() * (N - M + 1) + M);
                        }
                        System.out.println(valorEntero);
                        pila[tope] = valorEntero;
                        tope++;
                    }
                   
                    for (int i = 0; i < tam1; i++) {
                       valorEntero = (int) Math.floor(Math.random() * (N - M + 1) + M);
                        if (valorEntero == valorEntero) {
                            valorEntero = (int) Math.floor(Math.random() * (N - M + 1) + M);
                        }
                        System.out.println(valorEntero);
                        pila2[tope2] = valorEntero;
                        tope2++;
                    }
                    break;

                case 6://codigo para vaciar la pila
                    tope=0;
                    
                    System.out.println("pila vacia");
                    break;
            }
        } while (opt != 7);//codigo parra finalizar el programa
    }
}

