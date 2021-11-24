import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,5};
		List<Character> listA = new ArrayList<Character>();
		List<Character> listB = new ArrayList<Character>();
		
		listA.add('a');
		listA.add('b');
		listA.add('c');
		
		listB.add('d');
		listB.add('e');
		listB.add('f');
		listB.add('g');
		
		listB.lastIndexOf(listB);
		
		
		
		List<Character> listC = new ArrayList<Character>();
		
		int i = 0;
		int j = 0;
		
		while (i < listA.size() && j <listB.size()) {
			
			listC.add(listA.get(i));
			listC.add(listB.get(j));
			i++;
			j++;
		}
		
		while (i < listA.size()) {
			listC.add(listA.get(i));
			i++;
		}
		
		while (j < listB.size()) {
			listC.add(listB.get(j));
			j++;
		}
		
		System.out.println(listC);
		
		
		
		
	}    
	
	
}
