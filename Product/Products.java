// Define a class product with data members pcode,pname & price . create 3 objects of the class and find the product having the lowest price.

import java.util.Scanner;
class Product {
int pcode,price;
String pname;
Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
class Products {
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product code:");
int pcode=sc.nextInt();
System.out.println("Enter the product name:");
String pname=sc.next();
System.out.println("Enter the product price:");
int price=sc.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(1,"book",50);
ps[2]=new Product(2,"pen",10);
int minprice=ps[0].price;
System.out.print("\ncode\tname\tprice");
System.out.print("\n--------------------");
for(Product p:ps)
{
System.out.print("\n"+p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice > p.price)
{
minprice=p.price;
}
}
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\n");

System.out.print("\nlowest product details");
System.out.print("\n--------------------");
System.out.print("\nproduct code="+p.pcode);
System.out.print("\nproduct name="+p.pname);
System.out.print("\nproduct price="+p.price+"\n");
}
}
}
}
