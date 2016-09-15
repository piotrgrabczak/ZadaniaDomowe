import java.util.Scanner;


public class Zad6_5 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Podaj słowo, które ma być wyświetlone od końca: ");
		odczyt = new Scanner(System.in);
		StringBuilder slowo = new StringBuilder (odczyt.nextLine());
		String wynik = "";
		
		for (int i=slowo.length()-1; i>=0; --i)
		{
			wynik = wynik + slowo.charAt(i);
		
		}
		System.out.println(wynik);
	}

}
