package ejerciciokaprekar;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Kaprekar {

	public static void main(String[] args) {
		int numberOfCases = 0;
		int cases[] = new int [numberOfCases];
		int ascendInt = 0;
		int descendInt = 0;
		int result = 0;
		int count = 0;
		String swapStr = "";
		String kaprekar[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número de casos de prueba:");
		numberOfCases = sc.nextInt();
		
		
		
		for(int x = 0; x < numberOfCases; x++) {
			System.out.println("Introduzca el número: ");
			cases[x] = sc.nextInt();
		}
		
		do {
			
			for(int y = 0; y < numberOfCases; y++) {
				
				ascendInt = cases[y];
				
				swapStr = String.format("%04d", ascendInt);
				
				kaprekar = swapStr.split("");
				Arrays.sort(kaprekar);
				
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
				
				System.out.println(count);
			}
			
			
			
			
		} while(result != 6174 && result != 0);
		
		
		
		
		
		
		sc.close();
	}

}
