public class InverseOperator01{
	public static void main(String[] args){
		/*！:取反*/
	boolean logic03 = true;
	System.out.println(!logic03);
	System.out.println( "！(10 > 3) = " + !(10 > 3));
	/* ^ ,两个Boolean结果相同为false,不同为true*/
	boolean b = (2 > 3)^(3 > 4);//F^F=F
	System.out.println("(2 > 3)^(3 > 4) = " + b);
	boolean b2 = (3 >2)^(3 > 4);//T^F=T
	System.out.println("(3 >2)^(3 > 4) = " + b2);
	}
}