import java.util.Scanner;


public class bonus {

	private static Scanner odczyt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Program będzie miał za zadanie obliczanie funkcji kwadratowej z wartościami
		podanymi przez usera*/
		
		System.out.println("Wprowadź wartość dla a");
		odczyt = new Scanner(System.in);
		double a = odczyt.nextFloat();
		System.out.println("Wprowadź wartość dla b");
		double b = odczyt.nextFloat();
		System.out.println("Wprowadź wartość dla c");
		double c = odczyt.nextFloat();
		
		System.out.println("Twoja funkcja kwadratowa wygląda następująco: "+a+"x2"+b+"x"+c+"=0");
		
		double delta = Math.pow(b, 2)-(4*a*c);
		
		System.out.println("Delta wynosi: "+delta);
		
		if (delta > 0)
		{
			double x1 = (-b)+Math.sqrt(delta)/2*a;
			double x2 = (-b)-Math.sqrt(delta)/2*a;
			System.out.println("X1 wynosi: "+x1);
			System.out.println("X2 wynosi: "+x2);
		}
		else if (delta == 0)
		{
			double x0 = (-b)/2*a;
			System.out.println("Jedno miejsce zerowe. x0 wynosi: "+x0);
		}
		else
		{
			System.out.println("Delta jest mniejsza od zera, więc brak miejsc zerowych.");
		}
	}

}
