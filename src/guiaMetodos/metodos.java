/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaMetodos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author clorf
 */
public class metodos {
    Scanner entrada = new Scanner(System.in);
public int longitudpalabra(String cadena1){
         int c1,c2;
         c1= cadena1.length();
        return c1;
}

    public String concatenar(String cadena1,String cadena2){
        String union;
        union = cadena1+cadena2;
        return union;
    }
    public String llenar() {
        System.out.println("digite la cadena: ");
        String palabra = entrada.nextLine();
        return palabra;
    }

    public int elementos(String palabra) {
        int elementos = palabra.length();
        int letrasnumeros = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                letrasnumeros++;
            }
        }
        System.out.println("esta cadena tiene " + letrasnumeros + " elementos");
        return elementos;
    }

    public int contarVocales(String palabra) {
        int totalVocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
                totalVocales++;
            }
        }
        System.out.println("las vocales que tiene esta cadena son: " + totalVocales);
        return totalVocales;
    }

    public String quitarVocales(String palabra) {

        String cadena = palabra;
        cadena = cadena.replace("a", "");
        cadena = cadena.replace("e", "");
        cadena = cadena.replace("i", "");
        cadena = cadena.replace("o", "");
        cadena = cadena.replace("u", "");
        cadena = cadena.replace("A", "");
        cadena = cadena.replace("E", "");
        cadena = cadena.replace("I", "");
        cadena = cadena.replace("O", "");
        cadena = cadena.replace("U", "");
        System.out.println("cadena sin vocales: " + cadena);
        return cadena;
    }

    public void cambiarvocales(String palabra) {

        String cadena = palabra;
        cadena = cadena.replace("a", "4");
        cadena = cadena.replace("A", "4");
        cadena = cadena.replace("e", "3");
        cadena = cadena.replace("E", "3");
        System.out.println("reemplazando los caracteres por numeros: " + cadena);
    }

    public void incluidas(String palabra, String palabra2) {
        String cadena1 = palabra;
        String cadena2 = palabra2;
    }

    public String unidas(String palabra, String palabra2) {
        System.out.println(palabra + palabra2);
        return null;

    }

    public String mayusculas(String palabra) {

        String c1 = palabra;
        System.out.println("cadena en mayusculas: " + c1.toUpperCase());

        return null;
    }

    public int[] crearvector() {
        int x;
        int n;
        System.out.println("digite la cantidad de posiciones del vector");
        n = entrada.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20) + 1;
        }
        System.out.println("");
        System.out.println("los valores del vector son");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("{ " + vector[i] + " }");
            System.out.println("");
        }
        return vector;
    }

    public int[] crearvectorManual() {
        int x;
        int n;
        System.out.println("digite la cantidad de posiciones del vector");
        n = entrada.nextInt();
        int[] vector = new int[n];
        System.out.println("ingrese loa valores del vector: ");
        for (int i = 0; i < n; i++) {
            vector[i] = entrada.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("{ " + vector[i] + " }");
        }
        return vector;
    }

    public int[] posicionmenormayor(int vector[]) {

        int mayor = vector[0];
        int menor = vector[0];
        int posMenor = 0, posMayor = 0;

        for (int i = 0; i < vector.length; i++) {
            {
                if (vector[i] > mayor) {
                    mayor = vector[i];
                }
                posMayor = i;
                if (vector[i] < menor) {
                    menor = vector[i];
                    posMenor = i;
                }
            }
        }
        System.out.println("posicion menor: " + posMenor);
        System.out.println("posicion mayor: " + posMayor);

        return null;
    }

    public double promedio(int vector[]) {
        int a[] = vector;
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
        }
        double promedio = total / vector.length;
        System.out.println("la suma del vector es: " + total);
        System.out.println("el promedio del vector es: " + promedio);
        return promedio;
    }

    public double promediopares(int vector[]) {
        int a[] = vector;
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                total += vector[i];
            }
        }
        double promedio = total / vector.length;
        System.out.println("la suma de los numeros pares del vector es: " + total);
        System.out.println("el promedio de los numeros pares del vector es: " + promedio);
        return promedio;
    }

    public int reemplazarXZ(int vector[]) {
        int x, z;
        System.out.println("digite el valor que quiere reemplazar");
        x = entrada.nextInt();
        System.out.println("digite el valor por el que lo quiere reemplazar");
        z = entrada.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == x) {
                vector[i] = z;
            }
            System.out.println("los valores reemplazados serian: " + vector[i]);
        }
        return 0;
    }

    public void frecuenciaLetras() {
        String oracion;
        int contadorA = 0, contadorB = 0, contadorC = 0, contadorD = 0, contadorE = 0, contadorF = 0, contadorG = 0, contadorH = 0, contadorI = 0, contadorJ = 0, contadorK = 0, contadorL = 0;
        int contadorM = 0, contadorN = 0, contadorO = 0, contadorP = 0, contadorQ = 0, contadorR = 0, contadorS = 0, contadorT = 0, contadorU = 0, contadorV = 0, contadorW = 0, contadorX = 0;
        int contadorY = 0, contadorZ = 0;
        System.out.println("digite una oracion: ");
        oracion = entrada.nextLine();
        char[] arrayChar = oracion.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if ((oracion.charAt(i) == 'a') || (oracion.charAt(i) == 'A')) {
                contadorA++;
            }
            if ((oracion.charAt(i) == 'b') || (oracion.charAt(i) == 'B')) {
                contadorB++;
            }
            if ((oracion.charAt(i) == 'c') || (oracion.charAt(i) == 'C')) {
                contadorC++;
            }
            if ((oracion.charAt(i) == 'd') || (oracion.charAt(i) == 'D')) {
                contadorD++;
            }
            if ((oracion.charAt(i) == 'e') || (oracion.charAt(i) == 'E')) {
                contadorE++;
            }
            if ((oracion.charAt(i) == 'f') || (oracion.charAt(i) == 'F')) {
                contadorF++;
            }
            if ((oracion.charAt(i) == 'g') || (oracion.charAt(i) == 'G')) {
                contadorJ++;
            }
            if ((oracion.charAt(i) == 'h') || (oracion.charAt(i) == 'H')) {
                contadorH++;
            }
            if ((oracion.charAt(i) == 'i') || (oracion.charAt(i) == 'I')) {
                contadorI++;
            }
            if ((oracion.charAt(i) == 'j') || (oracion.charAt(i) == 'J')) {
                contadorJ++;
            }
            if ((oracion.charAt(i) == 'k') || (oracion.charAt(i) == 'K')) {
                contadorK++;
            }
            if ((oracion.charAt(i) == 'l') || (oracion.charAt(i) == 'L')) {
                contadorL++;
            }
            if ((oracion.charAt(i) == 'm') || (oracion.charAt(i) == 'M')) {
                contadorM++;
            }
            if ((oracion.charAt(i) == 'n') || (oracion.charAt(i) == 'N')) {
                contadorN++;
            }
            if ((oracion.charAt(i) == 'o') || (oracion.charAt(i) == 'O')) {
                contadorO++;
            }
            if ((oracion.charAt(i) == 'p') || (oracion.charAt(i) == 'P')) {
                contadorP++;
            }
            if ((oracion.charAt(i) == 'q') || (oracion.charAt(i) == 'Q')) {
                contadorQ++;
            }
            if ((oracion.charAt(i) == 'r') || (oracion.charAt(i) == 'R')) {
                contadorR++;
            }
            if ((oracion.charAt(i) == 's') || (oracion.charAt(i) == 'S')) {
                contadorS++;
            }
            if ((oracion.charAt(i) == 't') || (oracion.charAt(i) == 'T')) {
                contadorT++;
            }
            if ((oracion.charAt(i) == 'u') || (oracion.charAt(i) == 'U')) {
                contadorU++;
            }
            if ((oracion.charAt(i) == 'v') || (oracion.charAt(i) == 'V')) {
                contadorV++;
            }
            if ((oracion.charAt(i) == 'w') || (oracion.charAt(i) == 'W')) {
                contadorW++;
            }
            if ((oracion.charAt(i) == 'x') || (oracion.charAt(i) == 'X')) {
                contadorX++;
            }
            if ((oracion.charAt(i) == 'y') || (oracion.charAt(i) == 'Y')) {
                contadorY++;
            }
            if ((oracion.charAt(i) == 'z') || (oracion.charAt(i) == 'Z')) {
                contadorZ++;
            }
        }
        System.out.println("a :" + contadorA);
        System.out.println("b :" + contadorB);
        System.out.println("c :" + contadorC);
        System.out.println("d :" + contadorD);
        System.out.println("e :" + contadorE);
        System.out.println("f :" + contadorF);
        System.out.println("j :" + contadorG);
        System.out.println("h :" + contadorH);
        System.out.println("i :" + contadorI);
        System.out.println("j :" + contadorJ);
        System.out.println("k :" + contadorK);
        System.out.println("l :" + contadorL);
        System.out.println("m :" + contadorM);
        System.out.println("n :" + contadorN);
        System.out.println("o :" + contadorO);
        System.out.println("p :" + contadorP);
        System.out.println("q :" + contadorQ);
        System.out.println("r :" + contadorR);
        System.out.println("s :" + contadorS);
        System.out.println("t :" + contadorT);
        System.out.println("u :" + contadorU);
        System.out.println("v :" + contadorV);
        System.out.println("w :" + contadorW);
        System.out.println("x :" + contadorX);
        System.out.println("y :" + contadorY);
        System.out.println("z :" + contadorZ);

    }

    public void SinEspacio() {
        String palabra;

        System.out.println("ingrese la frase: ");
        palabra = entrada.nextLine();
        String cadena = palabra;
        cadena = cadena.replace(" ", "");
        System.out.println("la frase sin espacios: " + cadena);
    }

    public void hileraMUL() {
        String s;
        int n;
        System.out.println("ingrese la hilera: ");
        s = entrada.nextLine();

        System.out.println("ingrese el multiplicador: ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    public int[] edad(int n) {
        int edad[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la edad del usuario " + (i + 1));
            edad[i] = entrada.nextInt();
        }
        return edad;
    }

    public int[] codigoN(int n) {
        int codigo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el codigo del usuario " + (i + 1));
            codigo[i] = entrada.nextInt();
        }
        return codigo;
    }

    public int[] sexo(int n) {
        int sexo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("usuario " + (i + 1));
            System.out.println("femenino:0 masculino:1");
            sexo[i] = entrada.nextInt();
        }
        return sexo;
    }

    public String[] estadocivil(int n) {
        String estado[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("estado civil // usuario " + (i + 1));
            estado[i] = entrada.next();
        }
        return estado;
    }

    public int[] hobby(int n) {
        int hobby[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("hobby // usuario " + (i + 1));
            System.out.println("0: futbol 1: natacion 2: videojuegos 3: taekwondo 4: gimnasia 5: leer 6: otro");
            hobby[i] = entrada.nextInt();
            switch (hobby[i]) {
                case 0:
                    System.out.println("futbol");
                    break;
                case 1:
                    System.out.println("natacion");
                    break;
                case 2:
                    System.out.println("videojuegos");
                    break;
                case 3:
                    System.out.println("taekwondo");
                    break;
                case 4:
                    System.out.println("gimnasia");
                    break;
                case 5:
                    System.out.println("leer");
                    break;
                case 6:
                    System.out.println("otro");
                    break;
            }
        }

        return hobby;
    }

    public int conteoHombres(int sexo[]) {
        int CHombres = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1) {
                CHombres++;
            }
        }
        System.out.println("la cantidad de hombres que hay es: " + CHombres);
        return CHombres;
    }

    public int conteoMujeres(int sexo[]) {
        int CMujeres = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 0) {
                CMujeres++;

            }
        }
        System.out.println("la cantidad de mujeres que hay es: " + CMujeres);
        return CMujeres;
    }

    public int cantidadpersonas() {
        int n;
        System.out.println("digite la cantidad de personas");
        n = entrada.nextInt();
        return n;
    }

    public int mayoresEdad(int edad[], int n) {
        int edades[] = new int[n];
        for (int i = 0; i < edades.length; i++) {
            int Cmayor = 0;
            if (edades[i] >= 18) {
                Cmayor++;
            }
            System.out.println("la cantidad de gente mayor es: " + Cmayor);
        }
        return 0;
    }

    public int menoresEdad(int edad[], int n) {
        int edades[] = new int[n];
        for (int i = 0; i < edades.length; i++) {
            int Cmenor = 0;
            if (edades[i] <= 18) {
                Cmenor++;
            }
            System.out.println("la cantidad de gente menor es: " + Cmenor);
        }
        return 0;
    }

    public int hombres50(int edad[], int sexo[], int n) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 1 && edad[i] >= 50) {
                contador++;
            }
        }
        System.out.println("la cantidad de hombres mayores de 50 años: " + contador);
        return contador;
    }

    public String[] nombre(int n) {
        String nombre[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("digite el nombre del usuario " + (i + 1));
            nombre[i] = entrada.nextLine();
        }
        return nombre;
    }

    public int meujere20y30(int[] sexo, int[] edad) {
        int contadormujer = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 0 && edad[i] >= 20 && edad[i] <= 30) {
                contadormujer++;
            }
        }
        System.out.println("las mujeres mayores a 20 y menores a 30 son: " + contadormujer);
        return contadormujer;

    }

    public int hobbymenores30(int[] hobby) {

        int maximoRepeticiones = 0;
        int moda = 0;
        for (int i = 0; i < hobby.length; i++) {
            int repeticiones = 0;
            for (int h = 0; h < hobby.length; h++) {
                if (hobby[i] == hobby[i]) {
                    repeticiones++;
                }
                if (repeticiones > maximoRepeticiones) {
                    moda = hobby[i];
                    maximoRepeticiones = repeticiones;
                }
            }
        }
        System.out.println("la moda del hobby es: " + moda + "y las repeticiones que tiene son :" + maximoRepeticiones);
        return moda;
    }

    public int mayormenor(int vector[], int vector2[]) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("{ " + Math.max(vector[i], vector2[i]) + " }");
        }
        return 0;
    }

    public int[] normalinverso(int vector[]) {

        int numero, x, i;
        System.out.println("");
        System.out.println("-----------------------------valores-----------------------------");
        for (x = 0; x < vector.length; x++) {
            System.out.println("{ " + vector[x] + " }");
        }
        System.out.println("-----------------------------inversamente-----------------------------");
        for (i = 0; i <= vector.length; i++) {
            System.out.println("{ " + vector[x - i - 1] + " }");
        }
        return null;

    }

    public int[] numerosiguales(int vector1[], int vector2[]) {

        int a = 0, b = 0;
        int contador = 0;
        if (vector1[a] == vector2[b]) {
            contador++;

        }
        System.out.println("");
        System.out.println("los numeros iguales son " + contador);
        return null;
    }

    public int[] multplicador(int vector[]) {
        int total = 0, numero;
        double n;
        System.out.println("ingrese el numero por el que desea multiplicar el vector");
        n = entrada.nextDouble();
        for (int i = 0; i < vector.length; i++) {
            System.out.println("{ " + vector[i] + " }");
            numero = vector[i];
            for (int x = 1; x < vector.length; x++) {
                total = (int) (double) (numero * n);
            }
            System.out.println("valor multiplicados");
            System.out.println("*************************************");
            System.out.println(total);
        }
        return null;
    }

    public int[] numerorepetido(int vector[]) {
        int repetido, x, contador = 0;
        System.out.println("digite un numero para ver cuanto veces esta en el vector");
        repetido = entrada.nextInt();

        for (x = 0; x < vector.length; x++) {
            if (vector[x] == repetido) {
                contador++;
                System.out.println("el valor " + vector[x] + " esta repetido " + contador + " veces");
            }
        }
        return null;
    }

    public int[] v1apartirv2(int[] vector1, int[] vector2) {
        int aux;
        for (int x = 0; x < vector2.length; x++) {
            aux = vector2[x];
            vector2[x] = vector1[x];
            vector1[x] = aux;
            System.out.println("valores del V1 intercambiado");
            System.out.println(vector1[x]);
            System.out.println("valores del V2 intercambiado");
            System.out.println(vector2[x]);
        }
        return null;
    }

    public int puntajedesportitas() {
        float puntaje = 0;
        int n, x, c, sumas = 0, promedio = 0;
        System.out.println("ingrese el numero de deportitas");
        n = entrada.nextInt();
        System.out.println("ingrese el numero de calificadores");
        c = entrada.nextInt();
        int deportistas[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("deportista " + (j + 1));
            for (x = 0; x < c; x++) {
                System.out.println("calificador " + (x + 1));
                puntaje = entrada.nextInt();
                System.out.println("______________________________");
                sumas = (int) puntaje + x;
                promedio = promedio + sumas / c;
            }
            System.out.println("deportista " + (j + 1));
            System.out.println("sus calificacioes fueron");
            System.out.println("***************************");
            System.out.println(promedio);
        }
        return 0;
    }

    public int multoplos3multiplos5(int vector[]) {
        int v3 = 0, v5 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 5 == 0) {
                v5++;
            }
            if (vector[i] % 3 == 0) {
                v3++;
            }

        }

        System.out.println("multiplos de 3 = " + v3);
        System.out.println("multiplos de 5 = " + v5);
        return 0;
    }

    public char inversoletra() {
        char vector[] = new char[15];

        char i = 0, n = 15;
        for (i = 0; i <= 14; i++) {
            System.out.println(" ingrese " + (15 - i) + " letras");
            vector[i] = entrada.next().charAt(0);
        }
        System.out.println("las letras son");
        for (i = 0; i <= 14; i++) {
            System.out.println(vector[i]);

        }
        System.out.println("las letras inversas serian");
        for (i = 0; i <= 14; i++) {
            System.out.println(vector[n - i - 1]);
        }
        return 0;
    }

    public void parimpar() {

        int par;
        par = entrada.nextInt();
        if (par % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero no es par");
        }
    }

    public int mayornumero(int vector[]) {
        int mayornumero, menornumero;
        mayornumero = menornumero = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayornumero) {
                mayornumero = vector[i];
            }
            if (vector[i] < menornumero) {
                menornumero = vector[i];
            }
        }
        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println("el numero mayor es: " + mayornumero);
        System.out.println("el numero menor es: " + menornumero);
        return 0;
    }

    public int[] naranjas() {
        int x;
        int n, suma, suma1, suma2;
        System.out.println("digite la cantidad de parcelas 1<=n>=50");
        n = entrada.nextInt();
        int[] naranja = new int[n];
        System.out.println("ingrese los valores del vector: ");
        for (int i = 0; i < naranja.length; i++) {
            System.out.println("cantidad para comer  // parcela N" + (i + 1));
            naranja[i] = entrada.nextInt();
            suma1 = naranja[i];
            System.out.println("cantidad para jugo  // parcela N" + (i + 1));
            naranja[i] = entrada.nextInt();
            suma2 = naranja[i];
            System.out.println("la cantidad total de la parcela N" + (i + 1));
            suma = suma1 + suma2;
            System.out.println(suma);
        }

        return naranja;
    }

    public int eliminardato(int[] naranja) {
        int eliminar;
        System.out.println("parcela que desea eliminar");
        eliminar = entrada.nextInt();

        for (int i = 0; i < naranja.length; i++) {
            if (naranja[i] == eliminar) {
                naranja[i] = naranja[i] - eliminar;
                System.out.println(naranja[i]);
            }
        }
        return 0;
    }

    public int imprimirparcelas(int[] naranja) {
        int mostrar;
        System.out.println("parcela que quiere mostar");
        mostrar = entrada.nextInt();
        mostrar = mostrar * 2;
        for (int i = 0; i < naranja.length; i++) {
            if (naranja[i] == mostrar) {
                System.out.println(mostrar);
            }
        }
        return 0;
    }

    public void parimparvectores() {

        int a[], b[], c[];
        a = new int[15];
        b = new int[20];
        c = new int[35];

        for (int i = 0; i < 15; i++) {
            System.out.println("el numero " + (i + 1) + " del vector A ");
            a[i] = entrada.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("el numero " + (i + 1) + " del vector b ");
            b[i] = entrada.nextInt();
        }
        int x = 0;
        for (int i = 0; i < 20; i++) {
            c[x] = a[i];
            x++;
            c[x] = b[i];
            x++;
        }

        System.out.println(" el vector resultante");
        for (int i = 0; i < 35; i++) {
            System.out.println(c[x]);
        }
    }

    public int[][] crearmatriz() {

        int[][] matriz = new int[5][5];

        for (int a = 0; a < matriz.length; a++) {
            System.out.println("COLUMNA " + (a + 1));
            for (int b = 0; b < matriz.length; b++) {
                System.out.println(matriz[b][a] = (int) (Math.random() * 100) + 1);
            }
        }
        return matriz;
    }

    public int[][] mostrarmatriz(int[][] matriz) {
        for (int a = 0; a < matriz.length; a++) {
            System.out.println(Arrays.toString(matriz[a]));
        }
        return matriz;
    }

    public int[][] sumafilasmatriz(int[][] matriz) {
        int suma = 0;
        for (int a = 0; a < matriz.length; a++) {
            System.out.println("");
            System.out.println("fila " + (a + 1));
            for (int b = 0; b < matriz.length; b++) {
                System.out.print(matriz[a][b]);
                if (b < matriz.length - 1) {
                    System.out.print(" + ");
                }
                suma += matriz[b][a];

            }
            System.out.print(" = " + suma);
            System.out.println("");
            suma = 0;
        }
        return null;
    }

    public int fila() {

        int fila;
        System.out.println("digite la cantidad de filas");
        fila = entrada.nextInt();
        return fila;
    }

    public int columna() {

        int columna;
        System.out.println("digite la cantidad de colunmas");
        columna = entrada.nextInt();
        return columna;
    }

    public int[][] crearmatrizmanual(int fila, int columna) {
        int a = 0, b = 0;
        int[][] matriz = new int[fila][columna];

        for (a = 0; a < fila; a++) {
            for (b = 0; b < columna; b++) {
                System.out.println(matriz[a][b] = (int) (Math.random() * 100) + 1);
            }
        }

        for (a = 0; a < matriz.length; a++) {
            for (b = 0; b < matriz[a].length; b++) {
                System.out.print(matriz[a][b]);
            }
        }
        return matriz;
    }

    public int[][] mayormenormatriz(int matriz[][], int fila, int columna) {
        int mayor = 0, menor = 0, filamenor = 0, filamayor = 0, colmenor = 0, colmayor = 0;
        int a = 0, b = 0;

        for (a = 0; a < matriz.length; a++) {
            for (b = 0; b < matriz[a].length; b++) {
                if (matriz[a][b] > mayor) {
                    mayor = matriz[a][b];
                    filamayor = a;
                    colmayor = b;
                } else if (matriz[a][b] > menor) {
                    menor = matriz[a][b];
                    filamenor = a;
                    colmenor = b;
                }

            }
            System.out.println("elemento mayor es: " + mayor);
            System.out.println("fila: " + filamayor + " columna: " + colmayor);
            System.out.println("elemento menor: " + menor);
            System.out.println("fila: " + filamenor + " columna: " + colmenor);
        }
        return null;
    }
}
