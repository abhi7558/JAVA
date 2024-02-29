class Cpu{
int price=45000;
class processor{
int noofCores=5;
String manufacturer="intel corp";
void display(){
System.out.println("No of cores ="+noofCores);
System.out.println("Manufacturer ="+manufacturer);
}
}
void display(){
processor p= new processor();
p.display();
System.out.println("price ="+price);
}
static class ram{
int memory=8;
String manufacturer="corsair";
void display(){
System.out.println("Ram Informtion");
System.out.println("Memory ="+memory);
System.out.println("Manufacturer ="+manufacturer);
}
}
}
class Cpus{
public static void main(String[]args){
Cpu c1= new Cpu();
c1.display();
Cpu.ram r1= new Cpu.ram();
r1.display();
}
}

 

