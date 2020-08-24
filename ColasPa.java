/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class ColasPa {

    int iTope = -1;
    char caracteres[];

    ColasPa() {
        int max = 0;
        caracteres = new char[max];
    }

    public boolean llena() {
        if (iTope == caracteres.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vacia() {
        if (iTope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push() {
        char dato = 0;
        if (llena() == true) {
            System.out.print("Overflow");
        } else {
            iTope++;
            caracteres[iTope] = dato;
        }
    }

    public char pop() {
        char aux = 0;
        if (vacia() == true) {
            System.out.println("Empty");
        } else {
            aux = caracteres[iTope];
            iTope--;
        }
        return aux;
    }

    public static void main(String[] args) throws IOException {
        int opt, m = 0;
        Scanner sc = new Scanner(System.in);
        //cola de tamaño sea 10
        System.out.println("ingresa el tamaño de la cola");
        m = sc.nextInt();//10
        Colas c = new Colas(m);
        int validarpop = 0;
        int validarpush = 0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sIngreso;

        ColasPa ps = new ColasPa();

        System.out.println("Ingresa cadena: ");
        sIngreso = buff.readLine();

        for (int iCont = 0; iCont < sIngreso.length(); iCont++) {

            System.out.println(sIngreso.charAt(iCont));
            if (sIngreso.charAt(iCont) == '{') {
                ps.push();
                validarpush++;
            }
            if (sIngreso.charAt(iCont) == '[') {
                ps.push();
                validarpush++;
            }

            if (sIngreso.charAt(iCont) == '(') {
                ps.push();
                validarpush++;
            }
            if (sIngreso.charAt(iCont) == ')') {
                ps.pop();
                validarpop++;
            }
            if (sIngreso.charAt(iCont) == ']') {
                ps.pop();
                validarpop++;
            }
            if (sIngreso.charAt(iCont) == '}') {
                ps.pop();
                validarpop++;
            }
        }
        if (ps.vacia() == true && validarpop == validarpush) {
            System.out.println("Entrada valida");
        } else {
            System.out.println("Entrada Erronea");
        }
                    //(()))[][[](  correcta o incorrecta

    }
}
