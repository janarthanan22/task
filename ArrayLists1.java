package ArrayList;
import java.util.*;

public class ArrayLists1 {

	public static void main(String[] args) {

		ArrayList <String> al=new ArrayList<>();
		
		
		al.add("jana");
		al.add("vicky");
		al.add("guru");
		
		al.set(0, "janarthan");
		
		System.out.println(al.get(2));
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {

			System.out.println(al.get(i));
			
			
		}
		
		
		
		for(String a:al) {
			System.out.println(a);
			
		}
		
		al.forEach(a->System.out.println(a)) ;
		
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).charAt(0));
		}
		
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).charAt(al.get(i).length()-1)+"last");
		}
		
		
		int max=al.get(0).length();
		String temp="";
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()>=max) {
				temp=al.get(i);
			}
		}
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
