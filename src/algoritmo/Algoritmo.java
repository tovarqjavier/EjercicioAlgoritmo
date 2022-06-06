package algoritmo;

import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamaño de la lista: ");
        int x = entrada.nextInt();
        
        int arreglo[] = new int[x];
        int menor = 0, mayor = 0, temp = 0, temp2 = 0;
        int bandera = 0, bandera2 = 0, bandera3 = 0;
        
        System.out.println("Digite la lista: ");
        for(int i=0; i<x; i++){
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nLa lista es: ");
        for(int i=0; i<x; i++){
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("\n\nTamaño de la lista a consultar: ");
        int y = entrada.nextInt();
        int consulta[] = new int[y];
        
        System.out.println("Digite la lista a consultar: ");
        for(int i=0; i<y; i++){
            consulta[i] = entrada.nextInt();
        }
        
        System.out.println("\nLa lista a consultar es: ");
        for(int i=0; i<y; i++){
            System.out.print(consulta[i]+" ");
        }
       
        System.out.println("\n\nEl resultado es: \n");
        
        for(int j=0; j<consulta.length; j++){
            mayor = 0; menor = 0; bandera = 0; 
            bandera2 = 0; bandera3 = 0;            
            for(int i=0; i<arreglo.length; i++){
                //Comparo y guardo los menores
                if((arreglo[i] < consulta[j])){
                    temp = arreglo[i];
                    bandera = 1;
                    // Comparo y guardo el mayor de los menores
                    if(temp > menor ){
                        menor = temp;                       
                    }
                }

                if(bandera3 == 0){
                    if((arreglo[i] > consulta[j])){                        
                        bandera2 = 1;
                        bandera3 = 1;
                        mayor = arreglo[i];                     
                    }                    
                }
                else{
                    //Comparo y guardo los mayores
                    if((arreglo[i] > consulta[j])){
                        temp2 = arreglo[i];
                        //Comparo y guardo el menor de los mayores
                        if(temp2 < mayor ){
                            mayor = temp2;                       
                        }
                    }
                }                
            }
            //Si no hay menores imprima X
            if(bandera == 0){
                System.out.print("X ");
            } else{
                System.out.print(menor + " ");
            }
            //Si no hay mayores imprima X
            if(bandera2 == 0){
                System.out.println("X ");
            } else{
                System.out.println(mayor);
            }            
        }        
    }
}
