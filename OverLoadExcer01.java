public class OverLoadExcer01{
	public static void main(String[] args) {
		/*
			��д����Method���ص��ã�������Ϊm,
				1.��һ��method����һ��int
				2.�ڶ���method��������int
				3.������method����һ���ַ�������
			��Method�Ϸֱ�ִ��:
			    a.ƽ�����㲢������
			    b.��˲�������
			    c.����ַ�����Ϣ
		*/
		Method m = new Method();
		m.method(2);
		m.method(2,3);
		m.method("yaszbx;"); 
	}
}
class Method{
	//a.ƽ�����㲢������    ƽ��������i * i(��������),Ҳ������Math.pow(i,2)--->�����������float����   
	public void method(int i){
		System.out.println("����1:" + i * i); 
	}
	//b.��˲�������
	public void method(int n1,int n2){
		System.out.println("����2:" + n1 * n2);
	}
	public void method(String w){
		System.out.println("����3:" + w);
	}
}