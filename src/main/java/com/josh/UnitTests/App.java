package com.josh.UnitTests;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Ive got the travis file now do somehting
        System.out.println( "Hello World!" );
        MathClass mathClass = new MathClass();
        int result = mathClass.add(1,2);
        System.out.println("Result: " + result);
    }
}
