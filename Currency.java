import java.util.*;

public class Currency
{
    public static void main (String [] args)
    {
        int n,count2000=0, count500=0,count200=0,count100=0,count50=0,count20=0,count10=0,count5=0,count2=0,count1=0;
        System.out.print("Enter the amount:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("For the given amount you will need:");
        count2000 = n/2000;
        if(count2000 > 0)
        {   n = n%2000;
           System.out.println("Notes of 2000 = "+count2000); }
        count500 = n/500;
        if(count500 > 0)
        {    n = n%500;
            System.out.println("Notes of 500 = "+count500); }
        count200 = n/200;
        if(count200 > 0)
        {    n = n%200;
            System.out.println("Notes of 200 = "+count200); }
        count100 = n/100;
        if(count100 > 0)
        {    n = n%100;
            System.out.println("Notes of 100 = "+count100); }
        count50 = n/50;
        if(count50 > 0)
        {    n = n%50;
            System.out.println("Notes of 50 = "+count50); }
        count20 = n/20;
        if(count20 > 0)
        {    n = n%20;
            System.out.println("Notes of 20 = "+count20); }
        count10 = n/10;
        if(count10 > 0)
        {    n = n%10;
            System.out.println("Notes of 10 = "+count10); }
        count5 = n/5;
        if(count5 > 0)
        {    n =  n%5;
            System.out.println("Notes of 5 = "+count5); }
        count2 = n/2;
        if(count2 > 0)
        {    n = n%2;
            System.out.println("Notes of 2 = "+count2); }
        count1 = n/1;
        if(count1 > 0)
        {    n = n%1;
            System.out.println("Notes of 1 = "+count1); }
    }
}
