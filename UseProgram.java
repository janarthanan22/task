package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UseProgram {

	public static void main(String[] args) {

		Program p1=new Program("jana","be",4554,"java",true);
		Program p2=new Program("jana1","be",4554,"java",false);
		Program p4=new Program("jana4","be",55554,"java",true);
		Program p5=new Program("jana5","be",4554,"java",true);
		
		ArrayList<Program> pp=new ArrayList<>();
		
		List<Program>pp1=new ArrayList<>();
		
		
		
		pp.add(p1);
		pp.add(p2);
		pp.add(p4);
		pp.add(p5);
		
		
		ArrayList<Program>pp2=new ArrayList<>();
		
		for(int i=0;i<pp.size();i++) {
			
			if(pp.get(i).isMale()==true) {
				pp2.add(pp.get(i));
				
			}
			
			
			
		}
		System.out.println(pp2);
		for(int i=0;i<pp2.size();i++) {
			System.out.println(pp2.get(i));
		}
		
		
		for(int i=0;i<pp2.size();i++) {
			if(pp2.get(i).getSalary()>50000 && pp2.get(i).getCodingLanguage()=="java") {
				System.out.println("adadf"+pp2.get(i));
			}
		}
		
		
		
	}

}
