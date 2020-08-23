
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
public class pilasNombres {
    
    public static void main(String[] args) {
        // TODO code application logic here}

        Scanner sc = new Scanner(System.in);   
        int opt, tam, tope=0;
        List dato = new LinkedList<>();
        Boolean encontrado = false;
        System.out.println("ingresa el tamaño de la pila uno");
        String pila[] = new String[tam = sc.nextInt()];
        String aux = null;
        
        do {
            System.out.println("1- llenar \n"
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- ordenar\n"
                    + "5 salir ");
            switch (opt = sc.nextInt()) {
                case 1:                  
        for (int i = 0; i < pila.length; i++) {
            if (tope < tam) {
                        System.out.println("tope : " + tope);
                        System.out.println("nombre:");
                        aux = sc.next();
                        dato.add(aux);
                        tope++;
                        System.out.println("nombre:" + tope);
                    } else {
                        System.out.println("pila llena..");
                    } 
        }
                break;
                case 2:
                       System.out.println("contenido de pila 1");
                    for (int i = tope-1; i >= 0; i--) {
                        System.out.println("posicion: " + i + " tiene el dato" + dato);
                    }
                    break;
                case 3: 
                    dato.remove(aux);
                    tope--;
                    System.out.println("Dato eliminado");
                    break;
                case 4:
                    Collections.sort(dato);
                    for (Object nombre : dato) {
            System.out.println(nombre);
        }
                    break;
            } 
        } while (opt != 5);
    }
    }