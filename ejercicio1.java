
package com.mycompany.examen2programacion;

import java.util.Scanner;

/**
 *
 * @author Manuel Alejandro Brito Rojas
 */
public class ejercicio1 {
    public static void main(String[] args) {        
        Scanner recibe= new Scanner(System.in);        
        int array[];
        array = new int[10];
        int arrayaux[];
        arrayaux = new int[10];
        int contador=0,numero;
        //rellena array
        for(int i=0;i<array.length;i++){
            System.out.println("ingrese un numero");            
            numero=recibe.nextInt();
            if(numero>=1&&numero<=100){
                array[i]=numero;
            }
            else{
                i--;
                System.out.println("numero no valido");
            }
        }
        
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                    if(array[i]==array[j]){
                    contador++;
                    }  
            }
            System.out.print(array[i]+" sale "+contador);
            if(contador==1 ){
                System.out.println(" vez");
            }
            else{
                System.out.println(" veces");
            }
            contador=0;
        }
            
        }
        

        
    }
    
