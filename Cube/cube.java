import java.util.Scanner;

public class cube {
   public static void main(String args[]){
      int n = 5;
      System.out.println("Enter the limit ::");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i=1;i<=num;i++)
      {
      System.out.println(i+"\t :"+i*i*i);
   }
}
}

