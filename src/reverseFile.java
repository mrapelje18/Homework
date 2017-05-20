import java.io.*;
import java.util.*;

public class reverseFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("text.txt");
		PrintStream n = new PrintStream (new File("reverse.txt"));
		Scanner input = new Scanner(f);
		ArrayList<String> reverseL = new ArrayList<String>();
		
		while (input.hasNextLine()) {
			reverseL.add(input.nextLine());
		}
		reverse(reverseL);
		for (String s : reverseL) {
			ArrayList<String> reverseW = new ArrayList<String>();
			String[] ss = s.split(" ");
			for (String r : ss) {
				reverseW.add(r);
			}
			reverse(reverseW);
			for (String r : reverseW)
				n.print(r + " ");
			n.println();
		}
		
		input.close();
	}
	
	public static void reverse(ArrayList<String> reverseL) { //reverses order of elements in arraylist
		for (int i = 0; i < reverseL.size() / 2; i++) {
			String temp = reverseL.get(i);
			reverseL.set(i, reverseL.get(reverseL.size() - i - 1));
			reverseL.set(reverseL.size() - i - 1, temp);
		}
	}
}
