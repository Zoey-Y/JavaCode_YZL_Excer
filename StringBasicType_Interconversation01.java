public class StringBasicType_Interconversation01{
	public static void main(String[] args){
		/*BasicType����>String*/
		//GrammarIs:String s = BasicTypeName +"";eg:
		int i = 2;
		float f =1.9f;
		boolean b = false;
		String si = i + "";		
		String sf = f + "";		
		String sb = b + "";		
		System.out.println(si + sf  + sb);
		/*BasicType ����> String*/
		System.out.println("==============");
		String s = "30";
		//'.'��ǰ����Ƕ�Ӧ�����������͵İ�װ�࣬'.'�������parase(����)��Ӧ�Ļ�������
		// �������Ͱ�����ĸҪ��д.parse�����ɵ�����ҲҪ��д
		//������()������ַ���
		int s1 = Integer.parseInt(s);//30
		double s2 = Double.parseDouble(s);//30.0
		float s3 = Float.parseFloat(s);//30.0
		long s4 = Long.parseLong(s);//30
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}