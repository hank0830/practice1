public class Triangle extends allShape{
	private String name;
	private double base,height;

	public Triangle(String n , double b , double h){
		this.name = n;
		this.base = b;
		this.height = h;
	}
	public double area(){
		return this.base * this.height / 2;
		
	}
	public String nickname(){
		return this.name;
	}




}