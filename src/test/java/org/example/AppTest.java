package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.time.Duration;
import java.util.Arrays;
import org.junit.Test;


public class AppTest {

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

    public static BigInteger FindMin( BigInteger[] numbers ){

        return Arrays.stream(numbers).min(BigInteger::compareTo).get();
    }

    public static BigInteger FindMax( BigInteger[] numbers ){

        return Arrays.stream(numbers).max(BigInteger::compareTo).get();
    }

    public static BigInteger FindSum( BigInteger[] numbers ){

        return Arrays.stream(numbers).reduce(BigInteger.ZERO, BigInteger::add);
    }

    public static BigInteger FindMul( BigInteger[] numbers ){

        return Arrays.stream(numbers).reduce(BigInteger.ONE, BigInteger::multiply);
    }

    @Test
    public void TestMinFunction() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        assertEquals( FindMin(data1), App._min(data1) );
        assertEquals( FindMin(data2), App._min(data2) );
        assertEquals( FindMin(data3), App._min(data3) );
        assertEquals( FindMin(data4), App._min(data4) );
        assertEquals( FindMin(data5), App._min(data5) );
        assertEquals( FindMin(data6), App._min(data6) );
    }

    @Test
    public void TestMaxFunction() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");


        assertEquals( FindMax(data1), App._max(data1) );
        assertEquals( FindMax(data2), App._max(data2) );
        assertEquals( FindMax(data3), App._max(data3) );
        assertEquals( FindMax(data4), App._max(data4) );
        assertEquals( FindMax(data5), App._max(data5) );
        assertEquals( BigInteger.ONE, App._max(data6) );
    }

    @Test
    public void TestSumFunction() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        assertEquals( FindSum(data1), App._sum(data1) );
        assertEquals( FindSum(data2), App._sum(data2) );
        assertEquals( FindSum(data3), App._sum(data3) );
        assertEquals( FindSum(data4), App._sum(data4) );
        assertEquals( FindSum(data5), App._sum(data5) );
        assertEquals( FindSum(data6), App._sum(data6) );

    }

    @Test
    public void TestMulFunction() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
//        BigInteger[] data6 = read_file("test6.txt");

        assertEquals( FindMul(data1), App._mul(data1) );
        assertEquals( FindMul(data2), App._mul(data2) );
        assertEquals( FindMul(data3), App._mul(data3) );
        assertEquals( FindMul(data4), App._mul(data4) );
        assertEquals( FindMul(data5), App._mul(data5) );
//        assertEquals( FindMul(data6), App._mul(data6) );
    }

    @Test
    public void MinTimeTest() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        long time_point1 = System.currentTimeMillis();
        App._min(data1);
        long time_point2 = System.currentTimeMillis();
        App._min(data2);
        long time_point3 = System.currentTimeMillis();
        App._min(data3);
        long time_point4 = System.currentTimeMillis();
        App._min(data4);
        long time_point5 = System.currentTimeMillis();
        App._min(data5);
        long time_point6 = System.currentTimeMillis();
        App._min(data6);
        long time_point7 = System.currentTimeMillis();

        System.out.println();
        System.out.println("Min function time test: ");
        System.out.println("First data: " + String.valueOf(time_point2 - time_point1) + " ms");
        System.out.println("Second data: " + String.valueOf(time_point3 - time_point2) + " ms");
        System.out.println("Third data: " + String.valueOf(time_point4 - time_point3) + " ms");
        System.out.println("Fourth data: " + String.valueOf(time_point5 - time_point4) + " ms");
        System.out.println("Fifth data: " + String.valueOf(time_point6 - time_point5) + " ms");
        System.out.println("Sixth data: " + String.valueOf(time_point7 - time_point6) + " ms");

    }

    @Test
    public void MaxTimeTest() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        long time_point1 = System.currentTimeMillis();
        App._max(data1);
        long time_point2 = System.currentTimeMillis();
        App._max(data2);
        long time_point3 = System.currentTimeMillis();
        App._max(data3);
        long time_point4 = System.currentTimeMillis();
        App._max(data4);
        long time_point5 = System.currentTimeMillis();
        App._max(data5);
        long time_point6 = System.currentTimeMillis();
        App._max(data6);
        long time_point7 = System.currentTimeMillis();

        System.out.println();
        System.out.println("Max function time test: ");
        System.out.println("First data: " + String.valueOf(time_point2 - time_point1) + " ms");
        System.out.println("Second data: " + String.valueOf(time_point3 - time_point2) + " ms");
        System.out.println("Third data: " + String.valueOf(time_point4 - time_point3) + " ms");
        System.out.println("Fourth data: " + String.valueOf(time_point5 - time_point4) + " ms");
        System.out.println("Fifth data: " + String.valueOf(time_point6 - time_point5) + " ms");
        System.out.println("Sixth data: " + String.valueOf(time_point7 - time_point6) + " ms");

    }

    @Test
    public void SumTimeTest() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        long time_point1 = System.currentTimeMillis();
        App._sum(data1);
        long time_point2 = System.currentTimeMillis();
        App._sum(data2);
        long time_point3 = System.currentTimeMillis();
        App._sum(data3);
        long time_point4 = System.currentTimeMillis();
        App._sum(data4);
        long time_point5 = System.currentTimeMillis();
        App._sum(data5);
        long time_point6 = System.currentTimeMillis();
        App._sum(data6);
        long time_point7 = System.currentTimeMillis();

        System.out.println();
        System.out.println("Sum function time test: ");
        System.out.println("First data: " + String.valueOf(time_point2 - time_point1) + " ms");
        System.out.println("Second data: " + String.valueOf(time_point3 - time_point2) + " ms");
        System.out.println("Third data: " + String.valueOf(time_point4 - time_point3) + " ms");
        System.out.println("Fourth data: " + String.valueOf(time_point5 - time_point4) + " ms");
        System.out.println("Fifth data: " + String.valueOf(time_point6 - time_point5) + " ms");
        System.out.println("Sixth data: " + String.valueOf(time_point7 - time_point6) + " ms");

    }

    @Test
    public void MulTimeTest() throws IOException {

        BigInteger[] data1 = read_file("test1.txt");
        BigInteger[] data2 = read_file("test2.txt");
        BigInteger[] data3 = read_file("test3.txt");
        BigInteger[] data4 = read_file("test4.txt");
        BigInteger[] data5 = read_file("test5.txt");
        BigInteger[] data6 = read_file("test6.txt");

        long time_point1 = System.currentTimeMillis();
        App._mul(data1);
        long time_point2 = System.currentTimeMillis();
        App._mul(data2);
        long time_point3 = System.currentTimeMillis();
        App._mul(data3);
        long time_point4 = System.currentTimeMillis();
        App._mul(data4);
        long time_point5 = System.currentTimeMillis();
        App._mul(data5);
        long time_point6 = System.currentTimeMillis();
//        App._mul(data6);
//        long time_point7 = System.currentTimeMillis();

        System.out.println();
        System.out.println("Mul function time test: ");
        System.out.println("First data: " + String.valueOf(time_point2 - time_point1) + " ms");
        System.out.println("Second data: " + String.valueOf(time_point3 - time_point2) + " ms");
        System.out.println("Third data: " + String.valueOf(time_point4 - time_point3) + " ms");
        System.out.println("Fourth data: " + String.valueOf(time_point5 - time_point4) + " ms");
        System.out.println("Fifth data: " + String.valueOf(time_point6 - time_point5) + " ms");
//        System.out.println("Sixth data: " + String.valueOf(time_point7 - time_point6) + " ms");

    }

    @Test
    public void MulTimeoutTest() throws IOException {

        BigInteger[] data = read_file("test5.txt");
        assertTimeout( Duration.ofMillis(3000), () -> {
            App._mul(data);
        } );
    }
}
