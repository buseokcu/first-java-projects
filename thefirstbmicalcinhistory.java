package oktobervierundzwanzig;

import java.util.Scanner; 

public class oktoberachtundzwanzig {

	public static void main (String [] args) {
	
	Scanner scan = new Scanner (System.in);

	
	System.out.println("Cinsiyetinizi giriniz: ");
	
	
	String cinsiyet = scan.nextLine();

   
    System.out.println("Kilonuzu giriniz: ");
    
    int a = scan.nextInt();
    
    System.out.println("Boyunuzu giriniz: ");
    
    double b = scan.nextDouble();
    
    if (cinsiyet.equals("erkek")) {
    	
    if (a/(b*b) >= 50) {
    	
    	System.out.println("İdeal kilonun çok çok üstündesiniz");
    }
    	
    else if (a/(b*b) >= 40) {
    	
    	System.out.println("İdeal kilonun çok üstündesiniz");
    }
    
    else if  (a/(b*b) >= 35) {
    	
    	System.out.println("İdeal kilonun üstündesiniz");
    }
    	
    else if (a/(b*b) >= 28) {
    	
    	System.out.println("İdeal kilonuzdasınız");
    }
     
    else {
    	
    	System.out.println("İdeal kilonun altındasınız");
    }
    
    }
   
    else if (cinsiyet.equals("kadın")){
    	
    	if (a/(b*b) >= 40) {
        	
        	System.out.println("İdeal kilonun çok çok üzerindesiniz");
        }
        	
        else if (a/(b*b) >= 30) {
        	
        	System.out.println("İdeal kilonun çok üzerindesiniz");
        }
        
        else if  (a/(b*b) >= 25) {
        	
        	System.out.println("İdeal kilonun üzerindesiniz");
        }
        	
        else if (a/(b*b) >= 18) {
        	
        	System.out.println("İdeal kilonuzdasınız");
        }
         
        else {
        	
        	System.out.println("İdeal kilonun altındasınız");
        }
    	
 
    }

	}
}
