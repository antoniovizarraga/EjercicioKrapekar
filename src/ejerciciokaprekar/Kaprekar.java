package ejerciciokaprekar;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Kaprekar {

	public static void main(String[] args) {
		int numberOfCases = 0;
		int cases[];
		int ascendInt = 0;
		int descendInt = 0;
		int result = 0;
		int count = 0;
		String swapStr = "";
		String kaprekar[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número de casos de prueba:");
		numberOfCases = sc.nextInt();
		
		cases = new int[numberOfCases];
		
		for(int x = 0; x < numberOfCases; x++) {
			System.out.println("Introduzca el número: ");
			cases[x] = sc.nextInt();
		}
		
		for(int z = 0; z < numberOfCases; z++) {
			ascendInt = cases[z];
			
			if(cases[z] % 1111 == 0) {
				System.out.println("El número de operaciones es: " + 8);
				continue;
			} else if(cases[z] == 6174) {
				System.out.println("El número de operaciones es: " + 0);
				continue;
			}
			
			do {
			
				
				
				// Meto al String el valor de ascendInt con un formato
				swapStr = String.format("%04d", ascendInt);
				
				
				
				/* Meto al Array un elemento por cada "letra" que haya
				 * en el String. Y dicho elemento contendrá la letra
				 * introducida en el String. */
				kaprekar = swapStr.split("");
				
				//Los ordeno de menor a mayor.
				Arrays.sort(kaprekar);
				
				// Vacío el String porque no hace falta.
				swapStr = "";
				
				for(int x = 0; x < kaprekar.length; x++) {
					swapStr += kaprekar[x];
				}
				
				ascendInt = Integer.parseInt(swapStr);
				
				swapStr = "";
				
				Arrays.sort(kaprekar, Collections.reverseOrder());
				
				for(int x = 0; x < kaprekar.length; x++) {
					swapStr += kaprekar[x];
				}
				
				descendInt = Integer.parseInt(swapStr);
				
				
				
				result = descendInt - ascendInt;
				
				ascendInt = result;
				count++;
				
				swapStr = "";
				
				
				
				
				
			
			
			
			} while(result != 6174);
			
			System.out.println("El número de operaciones es: " + count);
			count = 0;
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
