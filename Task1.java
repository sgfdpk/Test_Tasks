import java.io.*;
import java.util.Scanner;

public class Task1{
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();
        int matches=0;
        if(Math.sqrt(square)%1==0)
        {
            int side = (int)Math.sqrt(square);
            matches = side*4+(2*(side*(side-1)));

        }
        else {
            int nMin = square;
            int nMax = square;
            int extra = 0;
            int missing=0;
            while (Math.sqrt(nMin) % 1 != 0) {
                nMin--;
                extra++;
            }
            while (Math.sqrt(nMax) % 1 != 0) {
                nMax++;
                missing++;
            }
            if(square-nMin<nMax-square)
            {
                int side = (int) Math.sqrt(nMin);
                matches = (side * 4 + (2 * (side * (side - 1)))) + ((extra - 1) * 2) + 3;
            }
            else
            { int side = (int) Math.sqrt(nMax);
                matches = (side * 4 + (2 * (side * (side - 1))))  - (missing*2);
            }
        }
        System.out.println(matches);

    }
}