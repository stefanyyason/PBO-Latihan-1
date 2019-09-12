import java.util.Scanner;
public class scanner{
	public static void main (String[] args){
		Scanner masukkan = new Scanner (System.in);
		int var_a, var_b;
		System.out.print("Masukkan nilai var var_a : ");
			var_a = masukkan.nextInt();
		System.out.print("Masukkan nilai var var_b : ");
			var_b = masukkan.nextInt();
		System.out.println();
		System.out.println("Variabel yang terdapat dalam program: ");
		System.out.println("var_a= " + var_a);
		System.out.println("var_b= " + var_b);}
}