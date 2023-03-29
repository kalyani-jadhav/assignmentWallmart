package assignment;

import java.io.*;
import java.util.Scanner;
public class demo
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(new File("G:\\Demo.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();
    }
}

