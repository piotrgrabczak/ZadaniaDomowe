import java.util.Scanner;


public class Zad7_2 {

	private static Scanner odczyt;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Podaj pierwsze słowo: ");
		odczyt = new Scanner(System.in);
		String	slowo1 = odczyt.nextLine();
		System.out.println("Podaj drugie słowo: ");
		String slowo2 = odczyt.nextLine();
		System.out.println("Podaj trzecie słowo: ");
		String slowo3 = odczyt.nextLine();

		System.out.println("Podaj separator oddzielający słowa: ");
		String separator = odczyt.nextLine();
		
		System.out.println(slowo1+separator+slowo2+separator+slowo3+separator);
		
		System.out.println(slowo1.split(separator)[0]+slowo2.split(separator)[1]+slowo3.split(separator)[2]);
	
	}

}
