import java.util.*;

public class HashTest {
	
	public static void main(String[] args){
	
		HashTableSC<Integer> hash = new HashTableSC<Integer>(10);
		Scanner in = new Scanner(System.in);
	
		System.out.println("Choose one of the following operations:\n"
			+ "- Insert (enter the letter i)\n"
			+ "- Delete (enter the letter d)\n"
			+ "- Print (enter the letter p)\n"
			+ "- Find (enter the letter f)\n"
			+ "- Check if Empty (enter the letter e)\n"
			+ "- Quit (enter the letter q)\n");

		String answer = in.next();
		char answer2 = answer.charAt(0);
		while(answer2 != 'q' || answer2 != 'Q'){
			if(answer2 == 'i' || answer2 == 'I'){
				System.out.println("Enter a number to insert: ");
				int num = in.nextInt();
				hash.insert(num);
				System.out.println(num + " added");			
			} else if(answer2 == 'd' || answer2 == 'D'){
				System.out.println("Enter a number to delete: ");
				int num = in.nextInt();
				hash.delete(num);
			} else if(answer2 == 'p' || answer2 == 'P'){
				hash.print();
			} else if(answer2 == 'f' || answer2 == 'F'){
				System.out.println("Enter a number to find: ");
				int num = in.nextInt();
				System.out.println(hash.find(num));	
			} else if(answer2 == 'e' || answer2 == 'E'){
				System.out.println(hash.isEmpty());
			} else if(answer2 == 'q' || answer2 == 'Q'){
				break;
			} else {
				System.out.println("Invalid choice");
			}
			System.out.println("Choose another operation: ");
			answer = in.next();
			answer2 = answer.charAt(0);
		}
	}
}
