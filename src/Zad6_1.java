import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Zad6_1 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tworzenie tablicy z liczb podanych przez użytkownika.
		System.out.println("Podaj 5 liczb, które mają znaleźć się w tablicy: ");
		odczyt = new Scanner(System.in);
		
		int liczba1 = odczyt.nextInt();
		int liczba2 = odczyt.nextInt();
		int liczba3 = odczyt.nextInt();
		int liczba4 = odczyt.nextInt();
		int liczba5 = odczyt.nextInt();
		
		Integer[] tab = {liczba1, liczba2, liczba3, liczba4, liczba5};
		//Arrays.asList(tab);
	
		for (int i=0; i<tab.length; i++){
			
			for (int j=0; j<tab.length-1; i++)
			{
				if (tab[j]>tab[j+1])
				{
					int wynik;
					wynik = tab[j+1];		
					tab[j+1] = tab[j+1];
					tab[j] = wynik;
				
				}
			}
			
		}
		System.out.print(tab);
	}
	
}
