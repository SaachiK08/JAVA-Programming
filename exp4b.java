import java.util.*;
class Main {
Main(String name){
System.out.println("The name of candidiate is : "+name);
}
Main(String name,String city){
System.out.println("The name of candidiate is : "+name+" and resites in City"+city);
}
Main(String name,String city, int phone){
System.out.println("The name of candidiate is : "+name+" and resites in City " +city+ "
Contact given is "+phone);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Name: Saachi Kokate \n Roll no.: 50 \n Div: S13");
System.out.println("Enter Required Details : \n 1.NAME\n2. NAME & CITY\n 3. NAME, CITY
& PHONE NO.");
int details= sc.nextInt();
switch (details) {
case 1:
new Main("NIKI");
break;
case 2:
new Main("NIKI","MUMBAI");
break;
case 3:
new Main("NIKI","MUMBAI",992233440);
break;
default:
break;
}
}
}