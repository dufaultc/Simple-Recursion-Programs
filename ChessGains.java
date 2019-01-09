// Programmer: Cameron Dufault
// Date: march 5 2017
// File: ChessGains.java
// Description: This program determines the total number of rice on a chess board if each square has double the amount on the preceeding square

public class ChessGains
{
    public static void main (String[] args)
    {
	int squareNum = 4; //the last square number to include the rice of

	System.out.print ("The total number of rice grains is " + grainNum (squareNum) + " including squares 1 to " + squareNum);
    } //main method


    //this method determines the total number of rice on chess board if each subsequent square has double the square before
    public static double grainNum (int square)  //square - the current square on the board
    {
	double tot; //the total number of rice
	//this structure determines whether or not the endpoint has been reached
	if (square != 1) //the current square is not the first
	{
	    tot = grainNum (square - 1) + Math.pow (2, square - 1); //the method calls upon itself and sends back the square before the current one and adds double the number of rice as was on the previous square
	}
	else //if the current square is the first there is only one rice grain
	    tot = 1;

	return tot;
    } //grainNum method
} //ChessGains Class


