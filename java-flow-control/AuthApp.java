
public class AuthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		
		String id="hyejin";
		String inputId=args[0];
		
		String pw="1111";
		String inputPw=args[1];
		
		System.out.println("hi");
		
//		if(inputId==id) {
//		if(inputId.equals(id)) {
//			if(inputPw.equals(pw)) {
//				System.out.println("Master!");
//			}
//			else {
//				System.out.println("Wrong password!");
//			}
//		}
//		else {
//			System.out.println("Who are you?");
//		}
		
		if(inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("Master!");
		}
		else {
			System.out.println("Who are you?");
		}
	}

}
