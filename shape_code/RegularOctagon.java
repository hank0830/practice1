public class RegularOctagon extends allShape{
	private String name;
	private double length;

	public RegularOctagon(String n , double l){
		this.name = n;
		this.length = l;
	}

	public double area(){
		return (2 + Math.sqrt(8)) * Math.pow(this.length , 2);
	}
	public String nickname(){
		return this.name;
	}


}