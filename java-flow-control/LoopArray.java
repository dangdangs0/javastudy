
public class LoopArray {

	public static void main(String[] args) {
		
		/*
		 * 	<li>hyejin</li>
		 * 	<li>dang</li>
		 * <li>dangdang</li>
		 */
		
		
		String[] users=new String[3];
		users[0]="hyejin";
		users[1]="dang";
		users[2]="dangdang";
		
		for(int i=0;i<users.length;i++) {
//			System.out.println("<li>"+users[i]+"</li>");
			if(i!=users.length-1) {
				System.out.println(users[i]+",");
			}
			else {
				System.out.println(users[i]+".");
			}
			
		}
	}

}
