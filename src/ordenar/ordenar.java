package ordenar;

import java.util.Scanner;

public class ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numeros[];
		numeros = new float[3];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
		System.out.println("Escribe el numero "+i+":");
		numeros[i]= in.nextInt();
		}
		float aux;
	       for (int i = 1; i <3 ; i++) {
	           for (int k = 2; k >= i; k--) {
	               if(numeros[k] < numeros[k-1]){
	                   aux = numeros[k];
	                   numeros[k] = numeros[k-1];
	                   numeros[k-1]=  aux;
	               }
	           }
	       }
	       System.out.println("El numero mayor es:"+ numeros[2]);
	       System.out.println("Los numeros de menor a mayor son:"+numeros[0]+","+numeros[1]+","+numeros[2]);
	       System.out.println("Los numeros de mayor a menor son:"+numeros[2]+","+numeros[1]+","+numeros[0]);
	}
	
		
}


