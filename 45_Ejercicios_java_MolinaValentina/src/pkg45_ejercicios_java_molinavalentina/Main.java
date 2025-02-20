
package pkg45_ejercicios_java_molinavalentina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número del 1 al 45");
        
        menu = scanner.nextInt();
        scanner.nextLine();
        
        switch (menu){

// 1.imprimir todos los números naturales del 1 al n.
            case 1 -> {            
                int x;
                System.out.println("====================");                
                System.out.println("número n");
                int y = scanner.nextInt();
                
                for(x = 1;x<=y;x++){
                    System.out.println(x);
                }
            }
            
//2.imprimir todos los números naturales en orden inverso.            
            case 2 -> {
                System.out.println("====================");                
                System.out.println("número n");
                int n = scanner.nextInt();
                
                for(int i = n; i >= 1;i--){
                    System.out.println(i);                    
                }
            }
            
//3.imprimir tablas de multiplicar.
            case 3 -> {
                System.out.println("número de tabla de multiplicar que quieres ver");
                int num = scanner.nextInt();
                for(int i = 1;i<=10;i++){
                    System.out.println(num+"x"+i+"="+(num*i));
                }
            }
        
//4.imprimir tablas de multiplicar en orden inverso.            
            case 4 -> {
                System.out.println("número de tabla de multiplicar que quieres ver");
                int num = scanner.nextInt();
                for(int i = 10;i>=1;i--){
                    System.out.println(num+"x"+i+"="+(num*i));
                }          
            }
            
//5.imprimir todas las letras del alfabeto de la 'a' a la 'z'.           
            case 5 -> {
                char i;
                for (i='A';i<='Z';i++){
                    System.out.println(i);
                }
            }
           
//6.imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
            case 6 -> {
                char i;
                for (i='Z';i>='A';i--){
                    System.out.println(i);
                }            
            }
          
//7. imprimir todos los números pares entre 1 y 100.
            case 7 -> {
                for(int i = 2; i <= 100;i+=2){
                    System.out.println(i);
                }
            }

//8. imprimir todos los números impares entre 1 y 100.            
            case 8 -> {
                for(int i = 1; i <= 100;i+=2){
                    System.out.println(i);
                }
            }

//9.suma de todos los números naturales entre 1 y n.            
            case 9 -> {
                int num=1;
                int suma =0;
                System.out.println("numero n");
                int cant = scanner.nextInt();
                
                do{
                    suma=suma+num;
                    num=num+1;                    
                }
                
                while(num<=cant);
                    System.out.println("el resultado es:"+suma);                
            }            
            
//10.suma de todos los números pares entre 1 y n.
            case 10 -> {
                int n, sum=0;
                System.out.println("numero n");
                n= scanner.nextInt();
                
                for(int i=1;i<=n;i++){
                    if(i%2 == 0){
                        sum=sum+i;
                    }
                }
                System.out.println("la suma de impares de 1 al "+n+" es:"+sum);
            }
            case 11 -> {
                int n, sum=0;
                System.out.println("numero n");
                n= scanner.nextInt();
                
                for(int i=1;i<=n;i++){
                    if(i%2 != 0){
                        sum=sum+i;
                    }
                }
                System.out.println("la suma de impares de 1 al"+n+"es:"+sum);
            }
            
//12.imprimir los valores ASCII.
            case 12 -> {}
            
//13.encontrar el factorial de cualquier número.
            case 13 -> {
                System.out.println("ingrese un numero");
                int n = scanner.nextInt();
                int f =1;
                for (int i=1;i<=n;i++){
                    f=f*i;
                }
                System.out.println("el factorial de "+n+" es:"+f);
            }
            
//14.calcular el valor de un número elevado a la potencia de otro.            
            case 14 -> {
                
                System.out.println("número que quieres elevar");
                int num =scanner.nextInt();
                
                System.out.println("la potencia a la que quieres elevarlo");
                int ele = scanner.nextInt();
                
                int total =num;
                System.out.println(num);
                
                for(int i = 1;i < ele;i++){
                    total=total*num;
                    if (i== ele-1){
                    System.out.println("Resultado de potenciación"+total);
                    }
                }
                
            }
            
//15.invertir los dígitos de un número dado.            
            case 15 -> {
                System.out.println("ingresa las cadena de numeros que quieres invertir");
                int ingreso=scanner.nextInt();
                
                int numReves =0;
                
                while(ingreso!=0){
                numReves=numReves*10+ingreso%10;
                ingreso/=10;
                }
                System.out.println(numReves);
            }
            
//16. calcular la suma de los dígitos de un número.            
            case 16 -> {                  
                System.out.print("Ingrese un número");
                int num2 = scanner.nextInt();
                int suma3 = 0;
                while (num2 > 0) {
                    suma3 += num2 % 10;
                    num2 /= 10;
                }
                System.out.println("Suma de los dígitos es " + suma3);
                break;
            }
            
//17. Escribe un programa para verificar si un número dado es primo o no.
            case 17 -> {
                int n,i=1,c =0;
                System.out.println("numero a verificar");
                n=scanner.nextInt();
                while(i<=n){
                    if(n%i==0){
                        c++;
                    }i++;
                }if(c==2){
                    System.out.println("El numero "+n+" es primo");
                }else{
                    System.out.println("El numero "+n+" no es primo");
                }scanner.close();
            }
            
//18. Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados.            
            case 18 -> {
                int a,b,res,mcd=0;
                
                System.out.println("numero #1");
                a=scanner.nextInt();
                System.out.println("numero #2");
                b=scanner.nextInt();
                
                while(a % b != 0){
                    res=a%b;
                    a=b;
                    b=res;
                    mcd=b;
                }
                System.out.println("El MCD es "+mcd);

                
            }
            
//19. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
//cantidad de números positivos, negativos y ceros ingresados.            
            case 19 -> {
                
            }
            
//20. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
//número más grande y el más pequeño ingresado.            
            case 20 -> {}
            
//21. Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
//divisibles por 9.
            case 21 -> {}
            
//22. Escribe un programa para convertir un número binario a decimal sin usar arreglos, funciones ni bucles
//while.            
            case 22 -> {}
            
//23. Escribe un programa para verificar si un número es un Número Fuerte o no.           
            case 23 -> {}
            
//24. Escribe un programa para convertir un número hexadecimal a decimal.            
            case 24 -> {}
            
//25. Escribe un programa para convertir un número hexadecimal a octal.            
            case 25 -> {}
           
//25. Escribe un programa para convertir un número hexadecimal a octal.           
            case 26 -> {}
            
           
            case 27 -> {}
            
            
            case 28 -> {}
            
            
            case 29 -> {}
            
            
            case 30 -> {}
            
            
            case 31 -> {}
            
            
            case 32 -> {}
            
            
            case 33 -> {}
            
            
            case 34 -> {}
            
            
            case 35 -> {}
            
            
            case 36 -> {}
            
            
            case 37 -> {}
            
//38. Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
            case 38 -> {
                int x;
                System.out.println("====================");                
                System.out.println("número n");
                int y = scanner.nextInt();
                
                for(x = 1;x<=y;x++){
                    System.out.println(x);
                }
            }
            
            
            case 39 -> {}
            
            
            case 40 -> {}
            
            
            case 41 -> {}
            
            
            case 42 -> {}
            
            
            case 43 -> {}
            
            
            case 44 -> {}
            
            
            case 45 -> {}
        }   
    }   
}