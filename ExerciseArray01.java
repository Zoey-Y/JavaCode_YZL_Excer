public class ExerciseArray01{
	public static void main(String[] args) {
		/*
		Ŀ��:����һ��char���͵�26��Ԫ�ص�����,�ֱ��'A'~'Z'.
		ʹ��forѭ������Ԫ�ز���ӡ����.��ʾ:char������������'A'+2 -> 'C'
		*/
		char[] let = new char[26];
		for(int i = 0;i < 26;i++){
			let[i] = (char)('A' + i);
			System.out.print(" " + let[i] + " ");
		}
	}
}