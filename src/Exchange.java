package Exchange_1;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		
		final double EXCAHNGE_RATE_USD = 1131.80;
		final double EXCAHNGE_RATE_EUR = 1346.23;
		final double EXCAHNGE_RATE_JPY = 10.25;
		
		InputExchange inputEx = new InputExchange();
		ProcessExchange processEx = new ProcessExchange();
		String selectType = null;
		
		while(true) {
			
			// ȯ�� ���� 
			inputEx.inputChoice();
			
			// ȭ�� ����
			if (inputEx.choice == 1) { selectType = "USD"; processEx.exchangeRate = EXCAHNGE_RATE_USD;} 
			else if (inputEx.choice == 2) { selectType = "EUR";	processEx.exchangeRate = EXCAHNGE_RATE_EUR;} 
			else if (inputEx.choice ==3) { selectType = "JPY"; processEx.exchangeRate = EXCAHNGE_RATE_JPY;}
			else{ System.out.print("�ٽ� �Է����ּ���\n"); continue;}
			
			// ��ȭ �Է� 
			inputEx.inputWon();
			
			// ȯ�� �ݾ�, �Ž����� 	
			processEx.processExchange(selectType, inputEx.inputWon);
				
			// ȯ�� ������ �Ž�����
			switch(inputEx.choice){
				case 1: processEx.processUSD(selectType);break;
				case 2: processEx.processEUR(selectType);break;
				case 3: processEx.processJPY(selectType);break;}
			
			// �Ž����� 
			processEx.processKR(inputEx.choice);
		}
	}
}
