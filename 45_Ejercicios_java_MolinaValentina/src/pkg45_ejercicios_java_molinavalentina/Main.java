
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
                int cero = 0;
                int negativo = 0;
                int positivo = 0;
                int num;
                char continuar;

                do {
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();

                    if (num == 0) {
                        cero++;
                    } else if (num < 0) {
                        negativo++;
                    } else {
                        positivo++;
                    }

                    System.out.print("¿Desea ingresar otro número? (s/n): ");
                    continuar = scanner.next().charAt(0);
                } while (continuar == 's' || continuar == 'S');

                System.out.println("Cantidad ceros: " + cero);
                System.out.println("Cantidad negativos: " + negativo);
                System.out.println("Cantidad positivos: " + positivo);

                scanner.close();
    }
            
//20. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
//número más grande y el más pequeño ingresado.            
            case 20 -> {
                System.out.println("Cuantos numeros ingresaras");
                
                int cant=scanner.nextInt();
                int numMe=0;
                int numMa=0;
                //int numMe2=Interger.MAX_VALUE;
                
                for (int i = 0; i <cant; i++) {
                    System.out.println("ingrese el numero "+(i+1));
                    int nos=scanner.nextInt();
                    if (i==0){
                        numMe=nos;
                        numMa=nos;
                    }else if (nos<numMe){
                        numMe=nos;                   
                    }
                    if(nos>numMa){
                        numMa=nos;
                    }    
                }
                System.out.println("El numero menor es"+numMe);
                System.out.println("El numero mayor es"+numMa);
            }
            
//21. Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
//divisibles por 9.
            case 21 -> {
                
                int suma = 0;
                System.out.println("Números divisibles por 9 entre 100 y 200:");
                
                for (int i = 100; i <= 200; i++) {
                    if (i % 9 == 0) {
                        System.out.println(i);
                        suma += i;
                    }
                }
                System.out.println("La suma de los números es: " + suma);
            }

//22. Escribe un programa para convertir un número binario a decimal sin usar arreglos, funciones ni bucles
//while.            
            case 22 -> {

                int bin = 101101;
                int dec = 0;
                int pot = 1;

                dec += (bin % 10) * pot;
                bin /= 10;
                pot *= 2;

                dec += (bin % 10) * pot;
                bin /= 10;
                pot *= 2;

                dec += (bin % 10) * pot;
                bin /= 10;
                pot *= 2;

                dec += (bin % 10) * pot;
                bin /= 10;
                pot *= 2; 

                dec += (bin % 10) * pot;
                bin /= 10;
                pot *= 2;

                dec += (bin % 10) * pot;
                bin /= 10; 

                System.out.println("El número binario " + 101101 + " es igual a " + dec + " en decimal.");
            }

            
//23. Escribe un programa para verificar si un número es un Número Fuerte o no.           
            case 23 -> {
                int numero = 30;
                int original = numero;
                int suma = 0;

                int digitos = String.valueOf(numero).length();

                for (int i = 0; i < digitos; i++) {
                    int digito = numero % 10;
                    int potencia = 1;
                    for (int j = 0; j < digitos; j++) {
                        potencia *= digito;
                    }
                    suma += potencia;
                    numero /= 10;
                }

                if (suma == original) {
                    System.out.println(original + " es un número fuerte.");
                } else {
                    System.out.println(original + " no es un número fuerte.");
                }
            }
        
            
//24. Escribe un programa para convertir un número hexadecimal a decimal.            
            case 24 -> {
                String hexadecimal = "1A";
                int decimal = Integer.parseInt(hexadecimal, 16); 
                System.out.println("El número hexadecimal " + hexadecimal + " es igual a " + decimal + " en decimal.");
            }
            
//25. Escribe un programa para convertir un número hexadecimal a octal.            
            case 25 -> {
                String hexadecimal = "1A"; 
                int decimal = Integer.parseInt(hexadecimal, 16);

                String octal = Integer.toOctalString(decimal);
                System.out.println("El número hexadecimal " + hexadecimal + " es igual a " + octal + " en octal.");
            }
           
//25. Escribe un programa para convertir un número hexadecimal a octal.           
            case 26 -> {
                String hexadecimal = "1A"; 
                int decimal = Integer.parseInt(hexadecimal, 16);
                String octal = Integer.toOctalString(decimal);
                System.out.println("El número hexadecimal " + hexadecimal + " es igual a " + octal + " en octal.");
            }

//27. Escribe un programa para convertir un número decimal a hexadecimal.            
            case 27 -> {
                int decimal = 26;
                String hexadecimal = Integer.toHexString(decimal);
                System.out.println("El número decimal " + decimal + " es igual a " + hexadecimal + " en hexadecimal.");
            }
            
//28. Escribe un programa para convertir un número decimal a octal.
            case 28 -> {
                int decimal = 25; 
                String octal = Integer.toOctalString(decimal);
                System.out.println("El número decimal " + decimal + " es igual a " + octal + " en octal.");
            }
            
//29. Escribe un programa para convertir un número decimal a binario.            
            case 29 -> {
                int decimal = 25;
                String binario = Integer.toBinaryString(decimal);
                System.out.println("El número decimal " + decimal + " es igual a " + binario + " en binario.");
            }
            
//30. Escribe un programa para convertir un número binario a octal.            
            case 30 -> {
                String binario = "110101";
                int decimal = Integer.parseInt(binario, 2);
                String octal = Integer.toOctalString(decimal);
                System.out.println("El número binario " + binario + " es igual a " + octal + " en octal.");
            }
            
//31. Escribe un programa para convertir un número binario a decimal.       
            case 31 -> {
                String binario = "101101";
                int decimal = Integer.parseInt(binario, 2);
                System.out.println("El número binario " + binario + " es igual a " + decimal + " en decimal.");
            }
//32. Escribe un programa para convertir un número binario a hexadecimal.            
            case 32 -> {
                String binario = "110101";
                int decimal = Integer.parseInt(binario, 2);
                String hexadecimal = Integer.toHexString(decimal);
                System.out.println("El número binario " + binario + " es igual a " + hexadecimal + " en hexadecimal.");
            }
            
//33. Escribe un programa para convertir un número octal a binario.           
            case 33 -> {
                String octal = "65";
                int decimal = Integer.parseInt(octal, 8);
                String binario = Integer.toBinaryString(decimal);
                System.out.println("El número octal " + octal + " es igual a " + binario + " en binario.");                
            }
            
//34. Escribe un programa para convertir un número octal a decimal.            
            case 34 -> {
                String octal = "31";
                int decimal = Integer.parseInt(octal, 8);
                System.out.println("El número octal " + octal + " es igual a " + decimal + " en decimal.");
            }
            
//35. Escribe un programa para convertir un número octal a hexadecimal.            
            case 35 -> {
                String octal = "31";
                int decimal = Integer.parseInt(octal, 8);
                String hexadecimal = Integer.toHexString(decimal);
                System.out.println("El número octal " + octal + " es igual a " + hexadecimal + " en hexadecimal.");
            }
            
//36. Escribe un programa para encontrar el complemento a 1 de un número en Java.            
            case 36 -> {
                String binario = "101101";
                StringBuilder complemento = new StringBuilder();
                for (char bit : binario.toCharArray()) {
                    complemento.append(bit == '0' ? '1' : '0');
                }
                System.out.println("El complemento a 1 de " + binario + " es " + complemento.toString());
            }
            
//37. Escribe un programa para encontrar el complemento a 2 de un número binario en Java.            
            case 37 -> {
                String binario = "101101";
                String complementoA1 = new StringBuilder(binario).reverse().toString().replace('0', '#').replace('1', '0').replace('#', '1');
                String complementoA2 = Integer.toBinaryString(Integer.parseInt(complementoA1, 2) + 1);
                System.out.println("El complemento a 2 de " + binario + " es " + complementoA2);
            }
            
//38. Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
            case 38 -> {
                int n = 10;
                int a = 0, b = 1;
                System.out.print("Serie de Fibonacci hasta " + n + " términos: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a + " ");
                    int temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println();
            }
            
//39. Escribe un programa para verificar si un número es un Número Fuerte o no.           
            case 39 -> {
                    int numero = 153;
        int original = numero;
        int suma = 0;
        int digitos = String.valueOf(numero).length();
        for (int i = 0; i < digitos; i++) {
            int digito = numero % 10;
            int potencia = 1;
            for (int j = 0; j < digitos; j++) {
                potencia *= digito;
            }
            suma += potencia;
            numero /= 10;
        }
        if (suma == original) {
            System.out.println(original + " es un número fuerte.");
        } else {
            System.out.println(original + " no es un número fuerte.");
        }
            }
            
//40. Escribe un programa para imprimir todos los Números Fuertes del 1 al 100000.            
            case 40 -> {
                System.out.println("Números fuertes del 1 al 100000:");
                for (int i = 1; i <= 100000; i++) {
                    int original = i;
                    int suma = 0;
                    int digitos = String.valueOf(i).length();
                    for (int j = 0; j < digitos; j++) {
                        int digito = i % 10;
                        int potencia = 1;
                        for (int k = 0; k < digitos; k++) {
                            potencia *= digito;
                        }
                        suma += potencia;
                        i /= 10;
                    }
                    if (suma == original) {
                        System.out.println(original);
                    }
                    i = original;
                }
            }
            
//41. Escribe un programa para imprimir todos los Números Perfectos del 1 al 10000.            
            case 41 -> {
                System.out.println("Números perfectos del 1 al 10000:");
                for (int i = 1; i <= 10000; i++) {
                    int suma = 0;
                    for (int j = 1; j < i; j++) {
                        if (i % j == 0) {
                            suma += j;
                        }
                    }
                    if (suma == i) {
                        System.out.println(i);
                    }
                }
            }
            
            
            case 42 -> {
                int numero = 6;
                int suma = 0;
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) {
                        suma += i;
                    }
                }
                if (suma == numero) {
                    System.out.println(numero + " es un número perfecto.");
                } else {
                    System.out.println(numero + " no es un número perfecto.");
                }
            }
            
            
            case 43 -> {
                System.out.println("Números de Armstrong del 1 al 1000:");
                for (int i = 1; i <= 1000; i++) {
                    int original = i;
                    int suma = 0;
                    int digitos = String.valueOf(i).length();
                    for (int j = 0; j < digitos; j++) {
                        int digito = i % 10;
                        int potencia = 1;
                        for (int k = 0; k < digitos; k++) {
                            potencia *= digito;
                        }
                        suma += potencia;
                        i /= 10;
                    }
                    if (suma == original) {
                        System.out.println(original);
                    }
                    i = original;
                }
            }
            
            
            case 44 -> {
                int numero = 153;
                int original = numero;
                int suma = 0;
                int digitos = String.valueOf(numero).length();
                for (int i = 0; i < digitos; i++) {
                    int digito = numero % 10;
                    int potencia = 1;
                    for (int j = 0; j < digitos; j++) {
                        potencia *= digito;
                    }
                    suma += potencia;
                    numero /= 10;
                }
                if (suma == original) {
                    System.out.println(original + " es un número de Armstrong.");
                } else {
                    System.out.println(original + " no es un número de Armstrong.");
                }

            }
            
            
            case 45 -> {
                int numero = 36;
                System.out.print("Los factores primos de " + numero + " son: ");
                for (int i = 2; i <= numero; i++) {
                    while (numero % i == 0) {
                        System.out.print(i + " ");
                        numero /= i;
                    }
                }
                System.out.println();
                    }
        }   
    }   
}