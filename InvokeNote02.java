public class InvokeNote02{
    public static void main(String[] args){
      person p3 = new person();
      int sum = p3.result(5);
        System.out.println("sum = " + sum);
    }
}
class person{
	int sum = 1;
    //方法在同一个类中调用方法,可以直接调用需要的方法
    public int calculate(int i){
     	 sum += i;  
     	 return sum;  
    }
    public int result(int j){
        sum = calculate(j);//此时调用直接写就好
    }
    
}