package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static int _min( int[] numbers ){

        int minimal = numbers[0];
        for(int n: numbers){
            if (minimal > n){

                minimal = n;
            }
        }

        return minimal;
    }
    public static int _max( int[] numbers ){

        int maximum = numbers[0];
        for(int n: numbers){
            if (maximum < n){

                maximum = n;
            }
        }

        return maximum;
    }

    public static int _sum( int[] numbers ){

        int summary = 0;
        for(int n: numbers){
            summary += n;
        }

        return summary;
    }

    public static int _mul( int[] numbers ){

        int composition = 1;
        for(int n: numbers){
            composition *= n;
        }

        return composition;
    }

    public static void main( String[] args ) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        String file_name = scan.next();

        int[] array = {1,2,3,4,5};
        System.out.println( _mul(array) );


    }

}
