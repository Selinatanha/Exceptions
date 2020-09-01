import java.io.IOException;

public class stringIndexOutOfBoundExceptions {

	public static void main(String[] args) throws IOException {
		 String a = "This is like chipping "; // length is 22 
			char c = a.charAt(24); // accessing 25th element 
			System.out.println(c); 

	}

}
