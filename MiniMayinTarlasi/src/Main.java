import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row, column;
		
		System.out.println("May�n Tarlas�na Ho�geldiniz!");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz!");
		
		System.out.print("Sat�r Say�s� : ");
		row = scanner.nextInt();
		System.out.print("S�t�n Say�s� : ");
		column = scanner.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row, column);
		mayin.run();

	}

}
