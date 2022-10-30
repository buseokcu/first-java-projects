package oktobervierundzwanzig;

import java.util.Scanner;

public class ders4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*
	*	System.out.println("Toplamak istediğiniz ilk sayıyı giriniz:");
	*	int a = scan.nextInt();
	*	
	*	System.out.println("İkinci sayıyı giriniz:");
	*	int b = scan.nextInt();
	*/	
		
	/*
	*	System.out.println("Çarpmak istediğiniz iki ondalıklı sayının ilki:");
	*	double a = scan.nextDouble();
	*	
	*	System.out.println("İkincisi:");
	**	double b = scan.nextDouble();
	*	
	*/
		
		System.out.println("Bölünen?");
		int a = scan.nextInt();
		
		System.out.println("Bölen?");
		int b = scan.nextInt();
		
		
		System.out.println("işlemin sonucu " + (a/b) + " dir");
		
		System.out.println("kalan sayı " + (a%b) + " dir");
		
		
	}
	
	
}
