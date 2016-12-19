import java.util.Scanner;

public class TestIput {
	
	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		while (1 == 1) {
			String string = "" ;
			System.out.println("please input Strings : ");
			//string = scanner.next();
			int num = scanner.nextInt();
			System.out.println(Fun(num));
		}*/
		
		for (int i = 2; i < 20 ; i ++) {
			System.out.println(Fun(i));
		}
		
	}
	
	public static int Fun(int num) {
		
		if (num > 2) {
			return Fun(num - 1) * num ;
		} else {
			return num ;
		}
		
	}
	
	
	

}
