
public class AccountingApp {
	public static double valueOfSupply = 10000.0;
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Value of supply : "+valueOfSupply); //공급가
		System.out.println("VAT : "+getVAT()); //부가가치세
		System.out.println("Total : "+getTotal());//소비자가낼돈
	}

}
