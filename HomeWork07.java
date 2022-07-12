public class HomeWork07{
	public static void main(String[] args) {
		/*
		目标:输出小写的a~z和大写的Z~A
		*/
		char smWord = 0;
		char biWord = 0;
		for(smWord = 97;smWord <= 122;smWord++){
			System.out.print(smWord + " ");
		} 
		for(biWord = 65;biWord <= 90;biWord++){
			System.out.print(biWord + " ");
		} 
	}
}