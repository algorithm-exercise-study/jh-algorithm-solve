package algorithm;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class recursiveFunction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(loop(n));

	}

	public static int loop(int n) {

		int num = 1;

		for (int i = n; i >= 1; i--) {
			num *= i;
		}
		return num;
	}
	
//	public static int factorial(int n) {
//		
//		if(n == 1) {
//			return n;
//		}
//		
//		return n * factorial(n-1);
//	}
}