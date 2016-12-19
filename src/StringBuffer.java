import java.util.StringTokenizer;

public class StringBuffer {
	
	
	public static void main(String[] args) {
		
		String string = "1,2,3,4,5,6,7,8,9,0" ;
		
		String[] strings = string.split(",");
		
		for (int i = 0; i < 15; i++) {
			System.out.println(strings[i]);
		}
		
		System.out.println(string.length());
		//StringTokenizer tokenizer = StringTokenizer(string,",");
		
	}

}
