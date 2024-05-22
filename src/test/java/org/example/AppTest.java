package org.example;

import static org.junit.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;

public class AppTest {

    public static BigInteger[] read_file(String file_name ) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        String line = reader.readLine();
        String[] input = line.split(" ");

        BigInteger[] numbers = new BigInteger[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] =  BigInteger.valueOf( Integer.parseInt(input[i]) );
        }

        return numbers;
    }

    @Test
    public void shouldAnswerWithTrue() {

        try {
            BigInteger[] input = read_file( "numbers.txt" );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertTrue( true );
    }
}
