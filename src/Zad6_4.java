import java.util.Scanner;


public class Zad6_4 {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		odczyt = new Scanner(System.in);
		System.out.println("Podaj pierwsze słowo: ");
		StringBuilder slowo1 = new StringBuilder(odczyt.nextLine());
		System.out.println("Podaj drugie słowo: ");
		StringBuilder slowo2 = new StringBuilder(odczyt.nextLine());
		StringBuilder wynik = new StringBuilder();
	
		if (slowo1.length() < slowo2.length())
		{
			return;
		}
		else
		{
			for (int i=0; i<slowo1.length(); i+=2)
			{
					wynik.append(slowo1.substring(i,i+2));
					if (i<slowo2.length()){
					wynik.append(slowo2.substring(i,i+2));
					}
				
			}
			System.out.println(wynik);
		}
		
	}

}
