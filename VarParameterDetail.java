public class VarParameterDetail{
	public static void main(String[] args) {
		//ϸ��1:�ɱ��������Ϊ����
		int[] arr ={1,2,3};
		T t = new T();
		t.D1(arr);

			
		
	}
}
class T{
	public int D1(int... nums){//nums�ǵ�ַ,�ɱ�����ı��ʾ�������
		
		System.out.println("�ɱ��������Ϊ����");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		return 0;
	}
	//ϸ��2:�ɱ������������ͨ���͵Ĳ�������һ��,���ǿɱ����Ҫ�������
	/*public void D2(double...nums,string str){
		//���Ǵ���д��
	}*/
	//��ȷд��:
	public void D2(String str,double... nums){
		//�ɱ��������ͨ���Ͳ������������ȷ
	}


	//ϸ��3:ÿ������ֻ����һ���ɱ����
	/*public void D3(double... nums1,int... nums2){
		//����д��	
	}*/
	public void D3(double... nums1){
			//��Ŷ�
	}

}