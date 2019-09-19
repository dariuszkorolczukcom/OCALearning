package src.basic;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FindPerfectNumbers
{
	static List<Integer> num = new ArrayList<>();

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n,m,o;
	System.out.print("start with: ");
	o = sc.nextInt();
	System.out.print("until: ");
	m = sc.nextInt();
		for (;o<=m;o++) {
			int sum=0, i=1;
			n=o;
			while (i < n) {
				if (n % i == 0) {
					sum = sum + i;
				}
				i++;
			}

			if (sum == n) {
				System.out.println(i + " is a perfect number");
				num.add(i);
			} else {
				System.out.print("\033[H\033[2J");
				System.out.println(i + " is not a perfect number");
				System.out.println(num);

			}
		}
		System.out.println(num);
	}
}
