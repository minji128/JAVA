package ch20;

public class NestLoopTest {

	public static void main(String[] args) {

		int dan = 2;
		int count = 1;
		
//		for(; dan <= 9; dan++) {
//			for(count=1; count <=9; count++) {
//				System.out.println(dan+"X"+count+"="+dan*count);
//			}
//			System.out.println();
//		}
//		
		count = 1;
		dan = 2;
		while(dan<=9) {
			while(count<=9) {
				System.out.println(dan+"X"+count+"="+dan*count);
				count++;
			}
			count = 1;
			dan++;
		}
	}

}
