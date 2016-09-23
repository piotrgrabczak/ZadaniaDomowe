import java.util.Scanner;


public class Zad6_6 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj rozmiar tablicy jednowymiarowej");
		
		odczyt = new Scanner(System.in);
		int rozmiar = odczyt.nextInt();
		
		for (int i=0; i<rozmiar; i++)
		{
			int[] tab = new int[rozmiar];
			System.out.println("Podaj liczbę, którą ma zapisać w tablicy");
			int liczba = odczyt.nextInt();
			tab[i] = liczba;
		
		}
		

	}

}
