public class Rectangle extends allShape{
	private double lentgh,width;
	private String name;

	public Rectangle(String n,double l,double w){
		this.name = n;
		this.lentgh = l;
		this.width = w;
	}
	public double area(){
		return this.lentgh * this.width;
	}

	public String nickname(){
		return this.name;
	}

}