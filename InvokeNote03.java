public class InvokeNote03{
    public static void main(String[] args){
     //����������ֱ�ʵ����������
        //��һ��
        willPrint a = new willPrint();
        a.A();
        //�ڶ���
        nowPrint b = new nowPrint();
        b.B();
    }
}
//������÷���
class willPrint{
    public void A(){
        System.out.println("��GG");
    }  
}
class nowPrint{
    public void B(){
        //�������willPrint����Ҫ�ȴ���һ������willPrint�Ŀռ�
        willPrint p1 = new willPrint();
        //�ڶ������ǵ��÷���
        System.out.println("���ǿ�����õĴ�ӡ");
        p1.A();
    }
}