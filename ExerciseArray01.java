public class ExerciseArray01{
	public static void main(String[] args) {
		/*
		目标:创建一个char类型的26个元素的数组,分别放'A'~'Z'.
		使用for循环所以元素并打印出来.提示:char类型数据运算'A'+2 -> 'C'
		*/
		char[] let = new char[26];
		for(int i = 0;i < 26;i++){
			let[i] = (char)('A' + i);
			System.out.print(" " + let[i] + " ");
		}
	}
}