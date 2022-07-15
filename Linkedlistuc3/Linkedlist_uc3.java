package ex.bridgelabzs;

import java.util.Scanner;

public class Linkedlist_uc3 {
	public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the End");
        switch (scanner.nextInt()) {
        case 1:
            Operations.addDataAtEnd();
            break;
	}
  }
}
