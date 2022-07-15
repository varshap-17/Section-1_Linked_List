package ex.bridgelabzs;

import java.util.Scanner;

public class Linkedlist_uc2 {
		
		public static void main(String[] args) {
			System.out.println("Welcome to data structures using generics");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 1 to add the data at the start");
	        switch (scanner.nextInt()) {
	        case 1:
                Operations.addDataAtStart();
                break;
		}
  }
}