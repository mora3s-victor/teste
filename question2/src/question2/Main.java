package question2;

public class Main {
	public static void main(String[] args) {
		int n = 10;
		int t1 = 0, t2 = 1;

		System.out.println("Sequ�ncia de Fibonacci de " + n + " termos: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + " + ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}
