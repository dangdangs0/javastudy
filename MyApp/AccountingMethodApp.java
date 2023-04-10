
public class AccountingMethodApp {

	public static double valueOfSupply; //global variable(Field)
	public static double vatRate;
	public static double expenseRate;
	
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
				
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply); //공급가
		System.out.println("VAT : "+getVAT()); //부가가치세
		System.out.println("Total : "+getTotal());//소비자가낼돈
		System.out.println("Expense : "+getExpense()); //비용
		System.out.println("Income : "+getIncome());//이익
		System.out.println("Dividend : "+getDividend1());//배당 1
		System.out.println("Dividend : "+getDividend2());//배당 2
		System.out.println("Dividend : "+getDividend3());//배당 3
	}

	public static double getDividend1() {
		return getIncome()*0.5;
	}
	
	public static double getDividend2() {
		return getIncome()*0.3;
	}
	
	public static double getDividend3() {
		return getIncome()*0.2;
	}

	public static double getIncome() {
		return valueOfSupply-getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
