
package clase_8_listas_arreglos;

public class Clase_8_listas_arreglos {

    //Estructuras de datos 
    //Una estructura de datos es una forma organizada de almacenar, gestionar 
    //y manipular datos para que puedan ser utilizado de manera eficiente. 
        public static void main(String[] args) { 

            //ARREGLOS
            //Un arreglo es una estructura de datos que posibilita la agrupación de 
            //elementos del mismo tipo en una sola variable. 
            //int[] arreglito; 
            //Un arreglo se debe inicializar para que tenga un espacio de memoria 
            //Es decir que si no le ponemos la cantidad de posiciones que va ha tener 
            //no iniciara o no servira
            System.out.println("//////ARREGLOS//////");
            int[] arreglito2= new int[5]; //Creaion de arreglo y asignacion de cant posiciones
            arreglito2[0]=8; //asignacion de valor 8 al indice 0
            //System.out.println(arreglito2[0]); //impresion del indice 0 
            //System.out.println( arreglito2.length); //impresion de la cantidad de indices que tiene en arreglo

            for(int i=0;i<arreglito2.length;i++){ 
            System.out.println(arreglito2[i]); // imprime el valo de los arreglos
            } 
            System.out.println("//////MATRICES//////");
            
            
            //Matrices 
            //Las matrices son arreglos multidimensionales, donde en Java se 
            //crea comúnmente las de dos dimensiones 
            int cantFilas = 3; 
            int cantCol = 2; 
           
            //Se crea la matriz "int[] [] matriz" y se le asigna las filas y columnas "= new int [cantFilas] [cantCol];"
            int[] [] matriz = new int [cantFilas] [cantCol];//tipodedato [cantFila) [cant Col] 
            matriz [0] [0] = 1; 
            matriz [0] [1] = 2; 
            matriz [1] [0] = 3;
            matriz [1] [1] = 4; 
            matriz [2] [0] = 5; 
            matriz [2] [1] = 6; 
            
            //ciclo anidado
            for(int i=0;i<cantFilas;i++){
                for(int q=0;q<cantCol;q++){
                    System.out.println(matriz[i][q]);
                }
            }

        } 
    
    }

