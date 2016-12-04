import javax.swing.JOptionPane;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			String answer = JOptionPane.showInputDialog("Enter a number");
			int a = Integer.parseInt(answer);
			if (isPrime(a)) {
				JOptionPane.showMessageDialog(null, "Your number is prime.");
			} else {
				JOptionPane.showMessageDialog(null, "Your number isn't prime.");
			}
		}

	}

	private static boolean isPrime(int a) {
		// TODO Auto-generated method stub
		if (a < 2) {
			return false;
		} else if (a == 2 || a == 3) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
