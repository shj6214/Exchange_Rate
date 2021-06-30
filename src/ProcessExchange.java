package Exchange_1;

public class ProcessExchange {
	
	public double exchangeRate = 0, exchange=0;
	public int returnMoney=0, returnKrMoney=0;
	
	// ȯ�� �ݾ�, �Ž�����
	public void processExchange(String selectType, double inputWon) {
		exchange = inputWon / exchangeRate;
		returnMoney = (int) exchange; // ȯ�� ȭ�� 
		exchange = exchange - returnMoney;
		returnKrMoney = (int) (exchange * exchangeRate);
		returnKrMoney = returnKrMoney / 10 * 10; // �Ž�����
		
		System.out.printf("������ �ݾ��� %d %s �� %d ���Դϴ�.\n", returnMoney, selectType, returnKrMoney);
	}
	
	// case 1
	public void processUSD(String selectType) {
		int[] USD = {100,50,20,10,5,2,1};
		for(int i=0;i<USD.length;i++) { 
			System.out.printf("%d %s\t: %d\n", USD[i],selectType,returnMoney/USD[i]);
			returnMoney %= USD[i];}
	}
	
	// case 2
	public void processEUR(String selectType) {
		int[] EUR = {500,200,100,50,20,10,5,2,1};
		for(int i=0;i<EUR.length;i++) {
			System.out.printf("%d %s\t: %d\n", EUR[i],selectType,returnMoney/EUR[i]);
			returnMoney %= EUR[i];}
	}
	
	// case 3
	public void processJPY(String selectType) {
		int[] JPY = {500,100,50,10,5,1};
		for(int i=0;i<JPY.length;i++) {
				System.out.printf("%d %s\t: %d\n", JPY[i],selectType,returnMoney/JPY[i]);
				returnMoney %= JPY[i];}
	}
	// �Ž����� 
	public void processKR(int choice) {
		if(choice==1||choice==2||choice==3) {
			int[] won = {1000,500,100,50,10};
			for(int i=0;i<won.length;i++) {
				System.out.printf("%d ��\t: %d\n", won[i],returnKrMoney/won[i]);
				returnKrMoney %= won[i];}
			System.out.println("------------------------------------------------");
		}
	}
}
