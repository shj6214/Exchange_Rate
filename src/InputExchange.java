package Exchange_1;

import java.util.Scanner;

public class InputExchange {
	
		
	public int choice = 0;
	public double inputWon=0;
		
	public Scanner input = new Scanner(System.in);
	
	public void inputChoice() {
		System.out.printf("ȯ���� ���� ���� (1:USD  2:EUR  3:JPY  0:����)?");
		choice = input.nextInt();
	}
	public void inputWon() {
		System.out.print("���� ��ȭ �Է�:");
		inputWon = input.nextDouble();
	}
	
}
