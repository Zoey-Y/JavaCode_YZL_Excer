public class InvokeNote01{
    public static void main(String[] args){
       person p2 = new person();
       double sum = p2.calculate(3,23.2);
         System.out.println("sum = " + sum);  
        
        //��ӡ�������������
        int[] twoResult = p2.reTwo();
        System.out.println("��������ֱ��ǣ�" + twoResult[0] + "\t" + twoResult[1]);
    }
}
class person{
    //���� �� �������η� + �������� +������(�β��б�)+{������}����
    public double calculate(int i, double j){
        double sum =i + j;
        return sum;
    }
    //�������������ϵ���
    public int[] reTwo(){
        int[] twoArr = new int[2];
        twoArr[0] = 1 + 1;
        twoArr[1] = 1 - 1;
        return twoArr;
    }
}