public class recursion01{
	public static void main(String[] args) {
		/*
			Ҫ��:
				1.��һ�����ӱ�ʾ�ݹ�
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