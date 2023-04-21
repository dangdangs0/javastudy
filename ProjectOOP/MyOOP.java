public class MyOOP {
	
	public static void main(String[] args) {
		
		Print p1=new Print();
		p1.delimiter="----"; //instance's delimiter
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2=new Print();
		p2.delimiter="****"; //instance's delimiter
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	}
	

}
