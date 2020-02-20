package learn.demo.bits;

public class TestBits {

	public static void main(String[] args) {
		/*
		 * 二进制
		 * 		1		= 1
		 *     10		= 2
		 * 	   11		= 3
		 *    100		= 4
		 *    101		= 5
		 *    110		= 6
		 *    111		= 7 
		 *   1000		= 8
		 */
		
		for (int i=1; i<=8; ++i) {
			int n = i >> 1;
		
			System.out.println("i:" + i + ",n:" + n);
		}

	}
}
