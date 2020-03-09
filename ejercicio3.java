
package com.mycompany.examen2programacion;

import java.util.Scanner;

/**
 *
 * @author Manuel Alejandro Brito Rojas
 */
public class ejercicio3 {
    public ejercicio3(){}
    //inicializa el arreglo con numeros al azar
    public static double[][] setMatrix(int n){    
        double array[][];
        array = new double[n][n];       
        for(int i=0;i<array.length;i++){            
            for(int j=0;j<array[i].length;j++){                
             array[i][j] = (int)(Math.random()*10+1);                
            }
        }
        return array;
    }
    //muestra el arreglo
    public static void getMatrix(double[][] m){
        for(int i=0;i<m.length;i++){            
            for(int j=0;j<m[i].length;j++){        
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    //muestra la diagonal secundaria y calcula la media
    public static double getMedia2DSec(double[][] m){
        System.out.println("Calculo media secundaria");
        double media=0;
        int contador=0;
        int j=m.length;
        for(int i=0;i>m.length-1;i++){
                contador++;
                System.out.print(m[i][j]);
                media+=m[i][j];
                System.out.println(media+""+contador);                
                j--;
            }            
        media=media/contador;
        System.out.println(media);        
        return media;
        
    }
    public static void main(String[] args) {                 
        Scanner recibe= new Scanner(System.in); 
            System.out.println("Introduzca la dimension n x n :"); 
            int numero=recibe.nextInt();
            do{
                if(numero>=3){
                    //inicializa el arreglo
                    double array2[][]=setMatrix(numero);
                    //muestra matriz
                    getMatrix(array2);
                    //saca media secundaria
                    getMedia2DSec(array2);
                }
                else{
                    System.out.println("valor no valido");
                }
            }while(numero<3);
            
        
    }
    
}
