import java.util.*;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
{
String name,city;
int phone;
System.out.println("Name: Saachi Kokate \n Roll no.: 50 \n Div: S13");
System.out.println("Enter Required Details : \n 1.NAME\n2. NAME & CITY\n 3. NAME, CITY &
PINCODE");
int detail = sc.nextInt();
Main obj = new Main();
switch(detail){
case 1:
name = "NIKI";
obj.method1(name);
break;
case 2:
name = "NIKI";
city = "MUMBAI";
obj.method1(name,city);
break;
case 3:
phone = 992233445 ;
name = "NIKI";
city = "MUMBAI";
obj.method1(name,city,phone);
break;
default :
}
}
}
String name,city;
int phone;
void method1(String name){
System.out.println("The name of candidiate is : "+name);
}
void method1(String name,String city){
System.out.println("The name of candidiate is : "+name+" and resites in City"+city);
}
void method1(String name,String city,int phone){
System.out.println("The name of candidiate is : "+name+" and resites in City " +city+ " Contact
given is "+phone);
}
}