package day1;

import java.util.Scanner;

public class C01_ifelse {

	public static void main(String[] args) {
		// Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
		// Ornek: gun=Pazar output = “Hafta sonu”
		// gun=Sali output = “Hafta ici

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen haftanin gun ismi giriniz");
		String gun = scan.next();

		if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba")
				|| gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma")) {
			System.out.println("haftaici");

		} else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
			System.out.println("haftasonu");
		} else {
			System.out.println("lutfen gecerli bir gun giriniz");
		}
        scan.close();
	}

}
