public class ChangeOrder extends allShape{
	private double area;
	private String nickname;

	public ChangeOrder(String s , double d){
		this.nickname = s;
		this.area = d ;
	}

	public double area(){
		return this.area;
	}

	public String nickname(){
		return this.nickname;
	}
}