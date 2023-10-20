package ArrayList;

import java.util.ArrayList;

public class UsePen {

	public static void main(String[] args) {

		Pen p1=new Pen("cello",4556,false);
		Pen p2=new Pen("natraj",5,false);
		
		ArrayList<Pen> pens =new ArrayList<> ();
		
		pens.add(p1);
		pens.add(p2);
		
		for(int i=0;i<pens.size();i++) {
			//System.out.println(pens.get(i).getBrand());
			
			if(pens.get(i).getPrice()%2==0) {
			System.out.println(pens.get(i).getPrice());
			}
		}
		
		
		
		for(int i=0;i<pens.size();i++) {
			if(pens.get(i).isBallpoint()==true) {
				System.out.println(pens.get(i).isBallpoint());
			}
		}
		
		
		for(int i=0;i<pens.size();i++) {
			if(pens.get(i).getPrice()>80) {
				System.out.println(pens.get(i).getBrand());
			}
		}
		for(int i=0;i<pens.size();i++) {
			if(pens.get(i).isBallpoint()==false) {
				System.out.println(pens.get(i).getPrice()-5);
			}
		}
		
		ArrayList<Pen> balls=new ArrayList<> ();
		
		
		
		
		
		for(int i=0;i<pens.size();i++) {
			if(pens.get(i).isBallpoint==false) {
				balls.add(pens.get(i));
				
			}
		}
		
		System.out.println(balls);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
