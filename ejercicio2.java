
package com.mycompany.examen2programacion;

/**
 *
 * @author Manuel Alejandro Brito Rojas
 */
public class ejercicio2 {
//suma las filas
    public static int[][] sumfilas(int [][] horas){
        int[][] suma={{0,1,2,3,4,5,6,7},{0,0,0,0,0,0,0,0}};        
        int horasTotales=0;
        for(int i=0;i<horas.length;i++){            
            for(int j=0;j<horas[i].length;j++){
             horasTotales+=horas[i][j];
            }
            suma[i][1]=horasTotales;
            horasTotales=0;
        }     
        return suma;
    }
    //imprime la matriz
    public static void muestra(int[][] suma){        
        System.out.println("Empleado \t Horas semanales");
        System.out.println("---------------------------------------");        
        for(int i=0;i<suma.length;i++){
            System.out.println(suma[i][0]+"\t"+suma[i][1]);
        }
    }
    public static void main(String[] args) {      
        int[][] horas = {
          {2,4,3,4,5,8,8}, 
          {7,3,4,3,3,4,4}, 
          {3,3,4,3,3,2,2},
          {9,3,4,7,3,4,1},
          {3,5,4,3,6,3,8},
          {3,4,4,6,3,4,4},
          {3,7,4,8,3,8,4},
          {6,3,5,9,2,7,9}
        };
        //suma las horas por filas        
        int sumando[][]=sumfilas(horas);
        //muestra la suma de las horas de cada empleado
        muestra(sumando);
    }
}
