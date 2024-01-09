package Vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char frase[] = new char[10];
		
		frase[0]='H';
		frase[1]='O';
		frase[2]='L';
		frase[3]='A';
		frase[4]=' ';
		frase[5]='H';
		frase[6]='O';
		frase[7]='L';
		frase[8]='A';           
		frase[9]='!';                  
		
		
		for(int i=0;i<frase.length;i++) {
			
			//System.out.println("pos "+i+" = "+frase[i]);
			
			System.out.print(frase[i]);
		}
		

		System.out.println(" ");
		
		for(int i=frase.length-1;i>=0;i--) {
				
			System.out.print(frase[i]);
		}
		
	
	}
	
}
