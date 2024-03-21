import java.util.*;
import java.util.Scanner;
class StrManup
{
public static void main(String[]args)
{
System.out.print("CREATE NEW STRING USING NEW");
char chs[]={'W','E','L','C','O','M','E'};
String newstr=new String(chs);
System.out.print("\n\nNew String from char[] using new :"+newstr);
String s1="java";
String s2="PROGRAMMING";
System.out.print("\n\nstring 1 :"+s1);
System.out.print("\nstring 2 :"+s2);
System.out.print("\n\n*****STRING LENGTH*****");
System.out.print("\n\nlength of string "+s1+" :"+s1.length());
System.out.print("\n\n"+s1+" to uppercase :"+s1.toUpperCase());
System.out.print("\n\n"+s2+" to lowercase :"+s2.toLowerCase());
System.out.print("\n\n****CONCATENATION*****");
System.out.print("\n\nusing concat() :"+s1.concat(" "+s2));
System.out.print("using '+' operator :"+s1+" "+s2);
System.out.print("\n\n*****CHARACTER EXTRACTION*****");
System.out.print("\n\nCharacter at  2nd position is "+s1.charAt(2));
char c[]=new char[5];
s2.getChars(2,4,c,0);
System.out.println("Character between 2 and 4:"+new String(c));
s1="morning";
s2="MORNING";
System.out.print("\n\n*****CHARACTER COMPARISON*****");
System.out.println(s1+"\tEquals"+s2+":"+s1.equals(s2));
System.out.println(s1+"\tEquals Ignore Case "+s2+":"+s1.equalsIgnoreCase(s2));
System.out.println(s1+"\tCompare"+s2+":"+s1.compareTo(s2));
System.out.println(s1+"\tCompare Ignore Case "+s2+":"+s1.compareToIgnoreCase(s2));
System.out.println("Start with M "+":"+s2.startsWith("M")+"\n");
System.out.println("Ends with g "+":"+s2.endsWith("g")+"\n");
System.out.print("\n*****SEARCH SUBSTRING*****\n\n");
s1="Life is a rollercoaster";
System.out.println("Substring of "+s1+":"+s1.substring(7));
System.out.println("String Replacing :"+s1.replace("life is","is life"));
System.out.print("\n*****USING Valueof()*****\n\n");
float n=26.2f;
System.out.print(n+"Is converted to "+String.valueOf(n)+"\n");
}
}

