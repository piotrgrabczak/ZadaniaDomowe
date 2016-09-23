import java.util.Scanner;


public class Zad6_7 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj liczbę, do której mają być wyświetlane liczby nieparzyste");
		
		odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		
		for (int i=1; i<=liczba; i++)
		{
			//sprawdza czy jest to liczba nieparzysta
			if (i%2 != 0){
			System.out.println(i+" ");
			}
		}
	}

}
