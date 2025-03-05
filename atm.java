package calısma;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		int parola = 123;
		int para = 1000;
		System.out.println("şifrenizi giriniz:");

		int hak = 3;
		int şifre = g.nextInt();
		if (şifre != parola) {
			for (int i = 1; i < hak; i++) {
				System.out.println("Yanlış Şifre.");
				System.out.println("Tekrar Deneyiniz.");
				şifre = g.nextInt();
			}
		}

		if (şifre == parola) {
			System.out.println("İşlem seçiniz:");
			System.out.println("1=Para Çekme.");
			System.out.println("2=Para Yatırma.");
			System.out.println("3=Bakiye Sorgulama.");
			int işlem = g.nextInt();
			switch (işlem) {
			case 1:
				System.out.println("Bakiye:" + para);
				System.out.println("miktarı girin:");
				int miktar = g.nextInt();
				System.out.println("Paranızı alınız...");
				System.out.println("Son Bakiye:" + (para - miktar));
				break;
			case 2:
				System.out.println("Bakiye:" + para);
				System.out.println("miktarı girin:");
				int miktar1 = g.nextInt();
				System.out.println("Paranızı Koyunuz...");
				System.out.println("Son Bakiye:" + (para + miktar1));
				break;
			case 3:
				System.out.println("Bakiyeniz:" + para);
				break;
			}
		}
		

	}

}
