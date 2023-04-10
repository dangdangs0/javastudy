class Accounting{
	public double valueOfSupply; //global variable(Field)
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : "+valueOfSupply); //공급가
		System.out.println("VAT : "+getVAT()); //부가가치세
		System.out.println("Total : "+getTotal());//소비자가낼돈
		System.out.println("Expense : "+getExpense()); //비용
		System.out.println("Income : "+getIncome());//이익
		System.out.println("Dividend : "+getDividend1());//배당 1
		System.out.println("Dividend : "+getDividend2());//배당 2
		System.out.println("Dividend : "+getDividend3());//배당 3
	}

	public double getDividend1() {
		return getIncome()*0.5;
	}
	
	public double getDividend2() {
		return getIncome()*0.3;
	}
	
	public double getDividend3() {
		return getIncome()*0.2;
	}

	public double getIncome() {
		return valueOfSupply-getExpense();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getTotal() {
		return valueOfSupply+getVAT();
	}

	public double getVAT() {
		return valueOfSupply*vatRate;
	}
}
public class AccountingClassApp {

	public static void main(String[] args) {
		//instance
		Accounting a1=new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2=new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}


}
