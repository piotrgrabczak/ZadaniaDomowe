
public class Zad6_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//dodaje nowy komentarz do zmiany
		
	
		StringBuilder slowo1 = new StringBuilder("MALPKA");
		StringBuilder slowo2 = new StringBuilder("szympans");
		StringBuilder slowo3 = new StringBuilder();
		
		for (int i=0; i<slowo1.length(); i+=3)
		{
			slowo3.append(slowo1.substring(i,i+3)).append("");
			if (i<=slowo2.length())
			{
				
				slowo3.append(slowo2.substring(i,i+3)).append("");
			}
		}
		System.out.println(slowo3+slowo2.substring(6,8));
		
		
	}

}
