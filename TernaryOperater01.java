public class TernaryOperater01{
	public static void main(String[] args){
		/*ÓÃÒ»ÌõÈýÄ¿ÔËËã·ûÇó³öÈý¸öÖµµÄ×î´óÖµ*/
		int a = 11;
		int b = 14;
		int c = 16;
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		/*(a > b ? a : b)ÊÇÇó³öÒ»¸ö×î´óÖµµÄ½á¹ûÁË£¬
		  ÔÙ°ÑÕâ¸ö×î´óÖµµÄ½á¹ûÓëÁíÒ»¸öÖµ±È½ÏµÃ³ö×îÖÕµÄ×î´óÖµ*/
		System.out.println(max);
	}
}