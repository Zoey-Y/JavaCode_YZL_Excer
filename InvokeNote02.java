public class InvokeNote02{
    public static void main(String[] args){
      person p3 = new person();
      int sum = p3.result(5);
        System.out.println("sum = " + sum);
    }
}
class person{
	int sum = 1;
    //������ͬһ�����е��÷���,����ֱ�ӵ�����Ҫ�ķ���
    public int calculate(int i){
     	 sum += i;  
     	 return sum;  
    }
    public int result(int j){
        sum = calculate(j);//��ʱ����ֱ��д�ͺ�
    }
    
}