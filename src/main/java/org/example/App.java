package org.example;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static BigInteger[] read_file( String file_name ) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        String line = reader.readLine();
        String[] input = line.split(" ");

        BigInteger[] numbers = new BigInteger[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] =  BigInteger.valueOf( Integer.parseInt(input[i]) );
        }

        return numbers;
    }
    public static BigInteger _min( BigInteger[] numbers ){

        BigInteger minimal = numbers[0];
        for(BigInteger n: numbers){
            if (minimal.compareTo(n) == 1){

                minimal = n;
            }
        }

        return minimal;
    }
    public static BigInteger _max( BigInteger[] numbers ){

        BigInteger maximum = numbers[0];
        for(BigInteger n: numbers){
            if (maximum.compareTo(n) == -1){

                maximum = n;
            }
        }

        return maximum;
    }

    public static BigInteger _sum( BigInteger[] numbers ){

        BigInteger summary = BigInteger.ZERO;
        for(BigInteger n: numbers){
            summary = summary.add(n);
        }

        return summary;
    }

    public static BigInteger _mul( BigInteger[] numbers ){

        BigInteger composition = BigInteger.ONE;
        for(BigInteger n: numbers){
            if (n.compareTo(BigInteger.ZERO) == 0){
                return BigInteger.ZERO;
            }

            composition = composition.multiply(n);
        }

        return composition;
    }

}
