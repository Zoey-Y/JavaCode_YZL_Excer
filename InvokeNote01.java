public class InvokeNote01{
    public static void main(String[] args){
       person p2 = new person();
       double sum = p2.calculate(3,23.2);
         System.out.println("sum = " + sum);  
        
        //打印方法的两个结果
        int[] twoResult = p2.reTwo();
        System.out.println("两个结果分别是：" + twoResult[0] + "\t" + twoResult[1]);
    }
}
class person{
    //方法 由 访问修饰符 + 返回类型 +方法名(形参列表)+{方法体}构成
    public double calculate(int i, double j){
        double sum =i + j;
        return sum;
    }
    //返回两个及以上的数
    public int[] reTwo(){
        int[] twoArr = new int[2];
        twoArr[0] = 1 + 1;
        twoArr[1] = 1 - 1;
        return twoArr;
    }
}