import java.util.Scanner;
public class Main {
public static void main(String[] args) {
System.out.println("NAME: Saachi Kokate \n ROLL NO : 50 \n BATCH : S13");
newmain obj = new newmain();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Enter your annual income:");
float income = sc.nextFloat();
System.out.println("Enter your marks:");
float marks = sc.nextFloat();
obj.scholarship(marks, income, name);
}
}
class newmain {
void display(String scholarship) {
System.out.println("Scholarship status : " + scholarship);
}
void scholarship(float marks, float income, String name) {
String scholarship;
if (income > 100000 && marks > 95) {
scholarship = "NOT ELIGIBLE";
} else if (income < 100000 && marks < 95) {
scholarship = "NOT ELIGIBLE";
} else if (income <= 100000 && marks > 95) {
scholarship = "ELIGIBLE";
} else if (income > 100000 && marks < 95) {
scholarship = "CAN APPLY FOR DONATION HAHAHAHAH";
} else {
scholarship = "PUT VALID DATA";
}
display(scholarship);
}
}