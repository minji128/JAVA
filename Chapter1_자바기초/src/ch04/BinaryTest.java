package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; //0B: 뒤에 나오는 수는 2진수임을 나타냄
		int oNum = 012; // 0: 뒤에 나오는 수가 8진수
		int xNum = 0xA; // 0x: 뒤에 나오는 수가 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
