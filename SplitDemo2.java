public class SplitDemo2{
	public static void main (String[] args){
		String text = "abcdebcadxbc";

		System.out.println("原字串 : " + text);
		System.out.print("根據\" .bc\"正則表示分離字串");
		String[] tokens = text.split(".bc");
		for(String token : tokens){
			System.out.print(token + " ");
		}
		System.out.println();

		System.out.print("根據\"..cd\" 正則表示分離字串");
		tokens = text.split("..cd");
		for(String token :tokens){
			System.out.print(token + " ");
		}
		System.out.println();
	}
}