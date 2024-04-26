import java.util.Scanner;

public class ejercicio {
    static Scanner scanner = new Scanner(System.in);

//1. Escribir un programa usando ciclos que calcule la suma de los números naturales
//desde 1 hasta n, donde n es un número ingresado por el usuario. Realice el ruteo para
//n= 10.
    public static void ejercicio1(){
        int n = 0;
        int suma = 0;
        System.out.print("Ingrese un numero: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            suma += i;
        }
        System.out.println(suma);
    }

//2. Escribir un programa que calcule el factorial usando recursividad para un número
//entero positivo ingresado por el usuario.
    public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }


    public static void ejercicio2(){
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        int resultado = factorial(numero);
        System.out.println("El factorial del " + numero + " es " + resultado);
    }

//3. Escribir un programa que calcule la potencia usando ciclos de un número ingresado
//por el usuario elevado a un exponente entero positivo también ingresado por el
//usuario. Realice el ruteo para n1=3 y n2 = 4
    public static void ejercicio3(){
        System.out.print("Ingrese un numero: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese la potencia del numero: ");
        int exponente = scanner.nextInt();
        int resultado = potencia(base, exponente);
        System.out.println(resultado);
    }

    public static int potencia(int base, int exponente) {
        int poten = 1;
        for (int i = 0; i < exponente; i++){
            poten *= base;
        }
        return poten;
    }

//4. Escribir un programa que determine si un número entero es primo o no usando ciclos.
    public static void ejercicio4(){
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        boolean resultado = esprimo(numero);
        if (resultado){
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    public static boolean esprimo (int numero) {
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

//5. Escribir un programa que determine si un año es bisiesto (366 dias) o no utilizando recursividad.
    public static void ejercicio5(){
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        if (esbisiesto(año, 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

    public static boolean esbisiesto(int año, int a) {
        if (a == 3) {
            return false;
        } else if (año % 400 == 0) {
            return true;
        } else if (año % 100 == 0) {
            return false;
        } else if (año % 4 == 0) {
            return true;
        } else {
            return esbisiesto(año + 1, a + 1);
        }
    }
    

//6. Escribir un programa que determine si un número entero es primo o no utilizando
//recursividad. Realice el ruteo para n = 7
    public static void ejercicio6(){
        System.out.println("Ingrese un número entero positivo:");
        int num = scanner.nextInt();

        if (esprimo2(num, 2)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }

    public static boolean esprimo2(int numero, int divisor) {
        if (numero <= 2) {
            return (numero == 2);
        }
        if (numero % divisor == 0) {
            return false;
        }
        if (divisor * divisor > numero) {
            return true;
        }
        return esprimo2(numero, divisor + 1);
    }
    

//7. Escribir un programa que determine si un año es bisiesto o no utilizando ciclos.
    public static void ejercicio7(){
        System.out.println("Ingrese un año para verificar si es bisiesto:");
        int año = scanner.nextInt();

        if (esbisiesto2(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

    public static boolean esbisiesto2 (int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    
    }

//8. Escribir un programa que calcule la suma de los dígitos pares de un número entero
//utilizando ciclos. Realice el ruteo para n = 1435
    public static void ejercicio8(){
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        int resultado = sumadigitos(num);
        System.out.println("La suma de los dígitos pares es: " + resultado);
    }
    

    public static int sumadigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

//9. Escribir un programa que calcule el producto de los dígitos de un número entero
//utilizando recursividad.
    public static void ejercicio9(){
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int resultado = producto(numero);
        System.out.println("El producto de los digitos es: " + resultado);
    }

    public static int producto(int num) {
        if (num < 10) {
            return num;
        }
        int resto = num%10;
        int numerosrestantes = num / 10;
        return resto * producto(numerosrestantes);  
    }
}