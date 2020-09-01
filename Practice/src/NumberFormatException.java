import java.io.IOException;

public class NumberFormatException {

	public static void main(String[] args) throws IOException {
		 // "akki" is not a number 
		int num = Integer.parseInt ("akki") ; 
  
		System.out.println(num); 

	}

}
