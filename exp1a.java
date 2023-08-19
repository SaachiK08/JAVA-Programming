import java.util.Scanner;
public class Vowel
{
public static void main(String[] args)
{
System.out.println("\nName: Saachi Kokate\n Name: Vaishnavi Nagwekar\n Batch:
S13\n Rollno: 50;66");
System.out.println("\nEnter a vowel");
Scanner sc = new Scanner (System.in);
char data = sc.nextLine().charAt(0);
if((data=='A')|| (data=='E')||(data=='I') ||(data == 'O')|| (data ==
'U')||(data=='a')||(data=='e')||(data=='i')||(data=='o')||(data=='u'))
{
System.out.println(data+ " is vowel");
}
else
{
System.out.println(data+"this is not a vowel");
}
}
}