public class InvokeNote03{
    public static void main(String[] args){
     //主函数里面分别实例化两个类
        //第一个
        willPrint a = new willPrint();
        a.A();
        //第二个
        nowPrint b = new nowPrint();
        b.B();
    }
}
//跨类调用方法
class willPrint{
    public void A(){
        System.out.println("大GG");
    }  
}
class nowPrint{
    public void B(){
        //跨类调用willPrint类需要先创建一个来自willPrint的空间
        willPrint p1 = new willPrint();
        //第二步就是调用方法
        System.out.println("这是跨类调用的打印");
        p1.A();
    }
}