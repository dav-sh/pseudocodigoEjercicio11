import java.util.*;
public class Exercise11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count_odd = 0; //impar
        int count_averageEven = 0; //par
        int count_numbers =0; //13-24
        int bigger = 0;
        int count = 0;
        int sumEven = 0;
        do{
            System.out.println("Enter a number between 0 and 36");
            int n = scanner.nextInt();
            if(0<=n && n<=36){
                if(n%2!=0){
                    count_odd++;
                }if(n%2==0 && n!=0){
                    count_averageEven++;
                    sumEven+=n;
                }if(13<=n && n<=24){
                    count_numbers++;
                }if(n>bigger){
                    bigger=n;
                }
                count++;
            
            }
            else{
                System.out.println("Try again...");
            }
        } while(count<10);
        System.out.println("Number of odd numbers: "+count_odd);
        System.out.println("Average of even numbers: "+(sumEven/count_averageEven));
        System.out.println("Number of numbers between 13-24: "+ count_numbers);
        System.out.println("Bigger number: "+bigger);
    }
}