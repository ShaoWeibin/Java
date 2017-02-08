import java.io.Console;
import java.nio.file.Paths;
import java.util.*;

public class Test2 {
	static final int NMAX = 10;
	
	public static void main(String[] args)
	{
		System.out.printf("%tc\n", new Date());
		System.out.println(new Date().toString());
		
		System.out.println(Arrays.toString(args));
		
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 1000);
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int[][] aa = new int[10][10];
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++)
				aa[i][j] = (int) (Math.random() * 1000);
		}
		
		//Arrays.sort(aa);
		System.out.println(Arrays.deepToString(aa));
		
		
		int[][] odds = new int[NMAX][];
		for (int n = 0; n < NMAX; n++)
		{
			odds[n] = new int[n + 1];
			for (int m = 0; m < odds[n].length; m++)
			{
				odds[n][m] = m + 1;
				System.out.print(odds[n][m]);
			}
			System.out.println();
		}
		
		String[] strs = new String[100];
		for (int i = 0; i < a.length; i++) {
			strs[i] = "abc";
		}
		
		System.out.println(Arrays.toString(strs));
		//Scanner in = new Scanner("D:\\Eclipse\\workspace\\Test2\\src\\Test2.java");
		
		//System.out.printf("%D", new Date());
		/*Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println(name);*/
		
		//Console cons = System.console();
		//String username = cons.readLine("User name: ");
		//char[] psswd = cons.readPassword("Password: ");
		
		/*String str = "Hello World!";
		for (int i = 0; i < str.length(); ++i)
			System.out.println(str.charAt(i));
		System.out.println("Hello World!");
		
		char data[] = {'a', 'b', 'c'};
		System.out.println(data[0]);*/
	}
}
