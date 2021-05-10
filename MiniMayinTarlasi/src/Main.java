import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row, column;
		
		System.out.println("Mayın Tarlasına Hoşgeldiniz!");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz!");
		
		System.out.print("Satır Sayısı : ");
		row = scanner.nextInt();
		System.out.print("Sütun Sayısı : ");
		column = scanner.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row, column);
		mayin.run();

	}

}
