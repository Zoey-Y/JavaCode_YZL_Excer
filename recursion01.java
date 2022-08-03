public class recursion01{
	public static void main(String[] args) {
		/*
			要求:
				1.用一个例子表示递归
		*/
		Recursion R1 = new Recursion();
		R1.R(4);
	}
}
class Recursion{
	public void R(int i) {
		if(i > 2){
			R(i - 1);
		}
		System.out.print(i);
	}
}