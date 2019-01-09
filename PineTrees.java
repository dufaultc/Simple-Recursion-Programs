// Programmer: Cameron Dufault
// Date: march 5 2017
// File: PineTrees.java
// Description: This program displays the number of pine trees a nursery has after a certain number of years

public class PineTrees
{
    public static void main (String[] args)
    {
	long treeNum = 6500; //the initial number of trees
	long years = 14; //how many years have passed

	//outputting result
	System.out.println ("The Forever Green Nursery owns " + futureTree (treeNum, years) + " trees after " + years + " years.");

    } //main method


    //this method recursively calculates the current number of trees when given the number of years that have passed and the original number of trees
    public static long futureTree (long num, long years)
    {
	long currentTreeNum; //the current number of trees

	//this structure determines whether or not to break down the problem further
	if (years > 0) //if more than one year has passed
	{
	    currentTreeNum = Math.round ((futureTree (num, years - 1) * 0.87)) + 700; //each time the method is called the year number is subtracted and sent back
	}
	else //if no years have passed
	{
	    currentTreeNum = num; //the inital amount of trees is returned
	}

	return currentTreeNum;

    } //futureTree
} //PineTrees class
