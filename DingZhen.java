import java.util.Scanner;
public class DingZhen{
	public static void main(String[] args){
		/*
		目的:
	      		实现登陆验证,有三次机会,如果用户名为"丁真",密码"666"提示登陆成功,
			否则提示还有几次机会,使用for+break完成
		思路:
			1.  for循环3次,若 (用户名) 和 (密码) 正确则跳出循环提示登陆成功
			2. 若输入错误则提示还有几次机会
			3.若三次机会使用完,则跳出 并提示 登陆机会以用完
		*/
		//总共的登陆机会次数
		Scanner enter = new Scanner(System.in);

		int totalChance = 3;
		int count = 3;//统计可用剩余次数
		for(int chance = 1; chance <= totalChance ; chance++){  	//正在使用的登陆机会次数为chance
			//账号：
			System.out.println("please enter your account number>: ");
			String account = enter.next();
			//密码：
			System.out.println("please enter your password>: ");
			String passWord = enter.next(); 	
				//字符串之间的比较用equal
				/*
					字符串比较语法：
			        1.     account.equals("丁真");  — (可能会写成)—>account.equals("");//account指向了空指针
					2.     "丁真".equals(account); //推荐:可避免空指针
				*/
				if("丁真".equals(account) && "666".equals(passWord)){
					System.out.println("登陆成功!");	
					break;
				}
				     	count--;
						if(count == 0){
					System.out.println("你登陆的次数已用完.");
					break;
					}

					System.out.println("输入错误,你还有"+ count + "次机会,请继续登陆" );		
				
		}				
		
		
	}
}