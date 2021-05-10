import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row, column;
		
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz!");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz!");
		
		System.out.print("Satýr Sayýsý : ");
		row = scanner.nextInt();
		System.out.print("Sütün Sayýsý : ");
		column = scanner.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row, column);
		mayin.run();

	}

}
