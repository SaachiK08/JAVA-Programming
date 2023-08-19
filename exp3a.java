import java.io.*;
import java.util.Scanner;
public class Main
{
String name,teacher;
String roll,batch;
void read()
{
System.out.println("NAME: Saachi Kokate \n ROLL NO : 50 \n BATCH : S13");
Scanner sc = new Scanner(System.in);
System.out.println("Name of the student : ");
name=sc.nextLine();
System.out.println("Enter the roll no. of the student : ");
roll=sc.nextLine();
System.out.println("Enter batch of the student : ");
batch=sc.nextLine();
System.out.println("Enter the teachers name : ");
teacher=sc.nextLine();
}
void display()
{
System.out.println("Student Name : "+name);
System.out.println("Roll no. : "+roll);
System.out.println("Batch : "+batch);
System.out.println("Teachers Name: "+teacher);
}
public static void main(String args[])
{
Main sc=new Main();
sc.read();
sc.display();
}
}