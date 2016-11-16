public class Square extends allShape{
	private String name;
	private double length;

	public Square(String n , double l){
		this.name = n;
		this.length = l;
	}

	public double area(){
		return this.length * this.length;
	}
	public String nickname(){
		return this.name;
	}
}