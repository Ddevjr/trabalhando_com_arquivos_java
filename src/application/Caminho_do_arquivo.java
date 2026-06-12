package application;

import java.io.File;
import java.util.Scanner;

public class Caminho_do_arquivo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a fold path: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		sc.close();
	}
}
