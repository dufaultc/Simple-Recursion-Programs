// Programmer: Cameron Dufault
// Date: march 5 2017
// File: CollatzConjecture.java
// Description: This program displays the numbers which the collatz algorithm follows to reach 1

public class CollatzConjecture
{
    public static void main (String[] args)
    {
	System.out.println (collatz (8));
    } //main method


    //this method outputs the sequence of numbers that the collatz algorithm creates when the itinial number is passed to it
    public static String collatz (int num)  //num - the current number in the algorithm
    {
	String data; //holds the number sequence

	//this structure determines if the endpoint has been reached
	if (num != 1) //if the algorithm has not yet reached 1
	{
	    if (num % 2 == 0) //even numbers are divided by two then sent back throught the method
	    {
		data = String.valueOf (num) + " " + collatz (num / 2);
	    }
	    else    //odd number are multiplied by 3 and then added with 1 befire being send back through the method
	    {
		data = String.valueOf (num) + " " + collatz ((num * 3) + 1);
	    }
	}
	else //the endpoint has been reached
	{
	    data = "1"; //the collatz algorithm always ends with 1
	}
	return data;
    } //collatz method
} //CollatzConjecture class


