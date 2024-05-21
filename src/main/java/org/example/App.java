package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

        BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
        String line = reader.readLine();
        String[] input = line.split(" ");

        int[] numbers = new int[input.length];

        for(int i = 0; i < input.length; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println( _min(numbers) );
        System.out.println( _max(numbers) );
        System.out.println( _sum(numbers) );
        System.out.println( _mul(numbers) );
    }

}
