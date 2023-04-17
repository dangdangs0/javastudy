
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores= {10,20,30};

		try {
			System.out.println(2);
//			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0); 
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("wrong Calculation"+e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Something Wrong.");
		}
		
		System.out.println(5);
	}

}
