public class HomeWork08{
	public static void main(String[] args) {
		/*
			目标:求出1-1/2+1/3-1/4...1/100的和
		*/
		double sum = 0;
		int k = 1;//一开始为正
		for(double i = 1;i <= 100;i++){
				sum += 1/i * k;
				k = -k;//变号
		}
		System.out.println("1-1/2+1/3-1/4...1/100的和为:" + sum);
	}
}