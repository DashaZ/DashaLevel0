
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		for (int i = 0; i < 12; i++) {
			if (a == 0) {
				System.out.println(1);
				a = 1;
			} else {
				int f = b + a;
				System.out.println(f);
				b = a;
				a = f;

			}
		}
	}
}