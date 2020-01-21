import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
// 		Scanner scan= new Scanner(System.in);
// 		String str = scan.nextLine();
    String str = "Hello my name is Deepanshu";
		String result = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(result);
	}
}
