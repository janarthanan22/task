package ArrayList;

public class Pen {
	
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isBallpoint() {
		return isBallpoint;
	}
	public void setBallpoint(boolean isBallpoint) {
		this.isBallpoint = isBallpoint;
	}
	private int price;
	public boolean isBallpoint;
	
	
	
	public Pen(String brand,int price,boolean isBallpoint) {
		this.brand=brand;
		this.price=price;
		this.isBallpoint=isBallpoint;
		
	}
	
	public String toString() {
		return brand+" "+price+" "+isBallpoint;
	}
	
	
	
	
	
	
	
	
	

}
