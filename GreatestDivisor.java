// Programmer: Cameron Dufault
// Date: march 5 2017
// File: GreatestDivisor.java
// Description: This program displays the greatest common divisor of two numbers.
public class GreatestDivisor
{
    public static void main (String[] args)
    {
	System.out.print (divising (60, 96)); //outputting the greates common divisor of two positive integers
    } //main method


    //this method recursively determines the greates common divisor of two numbers passed to it.
    public static int divising (int num1, int num2)  //num 1 is dividend, num2 is divisor
    {
	int gcd; //the greatest common divisor

	//this structure determines when the endpoint is reached
	if (num2 != 0) //if the endpoint has not been reached
	{
	    gcd = divising (num2, num1 % num2); //the remainder is repeateadly divided into the previous divisor, previous dividosr becomes dividend
	}
	else //the endpoint has been reached
	{
	    gcd = num1; //when the remainder is 0, the divisor is the greatest common divisor
	}

	return gcd;
    } //divising method
} // GreatestDivisor class
