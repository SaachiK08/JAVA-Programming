import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class buffer
{
public static void main(String[] arg) throws IOException{
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
System.out.println("\n Name : SAACHI KOAKTE \n Batch : S1-3 \n Roll no. : 50 ");
System.out.println("Enter the marks for PHYSICS : ");
int PHYSICS = Integer.parseInt(br.readLine());
System.out.println("Enter the marks for CHEMISTRY : ");
float CHEMISTRY = Float.parseFloat(br.readLine());
System.out.println("Enter the marks for MATHS : ");
int MATHS = Integer.parseInt(br.readLine());
float Average= (PHYSICS+MATHS+CHEMISTRY)/3;
System.out.println("Average is = " +Average);
}
}