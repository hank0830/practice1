public class Circle extends allShape{
	private double halflengh;
	private String name;
	private double pi = 3.14159265359;

	public Circle(String n,double h){
		this.name = n;
		this.halflengh = h;
	}
	public double area(){
		return Math.pow(this.halflengh,2) * this.pi;
	}
	public String nickname(){
		return this.name;
	}
	
}