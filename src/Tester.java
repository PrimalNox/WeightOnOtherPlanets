import java.lang.Math;
import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is your weight on Earth? ");
		int eW = kbReader.nextInt();
		
		System.out.println("1. Voltar \n2. Krypton \n3. Fertos \n4. Servontos \n\nSelection?");
		int sel = kbReader.nextInt();
		
		switch (sel)
		{
		case 1:
			System.out.println("Your weight on Voltar would be " + (double)eW*0.091 );
			break;
		case 2:
			System.out.println("Your weight on Krypton would be " + (double)eW*0.720 );
			break;
		case 3:
			System.out.println("Your weight on Fertos would be " + (double)eW*0.865 );
			break;
		case 4:
			System.out.println("Your weight on Voltar would be " + (double)eW*4.612 );
			break;
		default:
			System.out.println("Thats not an option!");
			break;
		}
				
	} 

}
