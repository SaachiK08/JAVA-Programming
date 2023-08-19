import java.util.Scanner;
public class Main
{
public static void main(String[] arg) {
// InputStreamReader r = new InputStreamReader(System.in);
Scanner sc = new Scanner(System.in);
System.out.println("\n Name : SAACHI KOAKTE \n Batch : S1-3 \n Roll no. : 50 ");
System.out.println("\n Enter the marks for PHYSICS :");
int PHYSICS =sc.nextInt();
System.out.println("\n Enter the marks for CHEMISTRY :");
float CHEMISTRY = sc.nextFloat();
System.out.println("\n Enter the marks for MATHS :");
int MATHS = sc.nextInt();
float Average= (PHYSICS+MATHS+CHEMISTRY)/3;
System.out.println("\n Average is = " +Average);
}
}