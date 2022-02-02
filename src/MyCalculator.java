//Exception handling using "THROWS" keyword
//Calculator
import java.util.Scanner;

public class MyCalculator {
    long power(long n,long p) throws Exception
        {
            if(n<0 || p<0)
            {
                throw new Exception("n or p should not be negative");
            }
            else if(n==0 && p==0)
            {
                throw new Exception("n and p should not be zero");
            }
            else
            {
                return (long)Math.pow(n,p);
            }

        }

        public static void main(String[] args) throws Exception {
            long a,b;
            Scanner s=new Scanner(System.in);
            a=s.nextLong();
            b=s.nextLong();
            MyCalculator m=new MyCalculator();
            System.out.println(m.power(a,b));
        }
    }


