																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							package ArrayList;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

	ArrayList<Integer> li=new ArrayList<>();
	li.add(5);
	li.add(200);
	li.add(250);
	li.add(100);
	System.out.println(li.get(1));
	System.out.println(li.size());
	System.out.println(li.set(0, 20));
	System.out.println(li);
	
	
	
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i)+" jana");
	}
	
	for(Integer a:li) {
		System.out.println(a);
		
	}
	
	li.forEach(a->System.out.println(a));
	
		
		
	}
	
	

}
