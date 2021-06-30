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
			
			// 환전 종류 
			inputEx.inputChoice();
			
			// 화폐 선택
			if (inputEx.choice == 1) { selectType = "USD"; processEx.exchangeRate = EXCAHNGE_RATE_USD;} 
			else if (inputEx.choice == 2) { selectType = "EUR";	processEx.exchangeRate = EXCAHNGE_RATE_EUR;} 
			else if (inputEx.choice ==3) { selectType = "JPY"; processEx.exchangeRate = EXCAHNGE_RATE_JPY;}
			else{ System.out.print("다시 입력해주세요\n"); continue;}
			
			// 원화 입력 
			inputEx.inputWon();
			
			// 환전 금액, 거스름돈 	
			processEx.processExchange(selectType, inputEx.inputWon);
				
			// 환전 종류별 거스름돈
			switch(inputEx.choice){
				case 1: processEx.processUSD(selectType);break;
				case 2: processEx.processEUR(selectType);break;
				case 3: processEx.processJPY(selectType);break;}
			
			// 거스름돈 
			processEx.processKR(inputEx.choice);
		}
	}
}
