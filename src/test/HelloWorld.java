package test;
import java.util.Scanner;

public class HelloWorld {
	static Scanner sc = new Scanner(System.in);
	
	static String imieWczytane;
	

	  
	  public static void main(String[] args) {
		  System.out.print("Podaj imiê: ");
		  imieWczytane = getUserInput();
		  System.out.println("Kocham mojego Daguszka! "+ imieWczytane);
		  }
	
	  public static String getUserInput() {
		    return sc.nextLine();
		}
	  
}
