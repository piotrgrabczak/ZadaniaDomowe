import java.util.Scanner;


public class Zad7_1 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Pobieramy od usera wielkość tablicy
		
		System.out.println("Podaj rozmiar tablicy, którą chcesz stworzyć: ");
		odczyt = new Scanner(System.in);
		int rozmiar = odczyt.nextInt();
		
		// user podaje liczby, które zapełnią parzyste wartości tablicy
		System.out.println("Podaj liczby, które chcesz wpisać do tablicy w miejsca parzyste: ");
		
		int[] tab = new int[rozmiar];
		for (int i=0; i<rozmiar; i++){
			//problem w tej pętli warunkowej.. 
			if (i % 2 == 0)
			{
				tab[i] = 0;
			}
			else
			{
				int liczba = odczyt.nextInt();
				tab[i] = liczba;		
			}
		}
		for(int i=0; i<tab.length; i++)
            System.out.print(tab[i]+" ");
	}

}
