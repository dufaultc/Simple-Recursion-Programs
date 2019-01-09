// Programmer: Cameron Dufault
// Date: march 5 2017
// File: Palindrome.java
// Description: This program determines if an entered word is a palindrome
import java.io.*;
public class Palindrome
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));

	String word; //the word to be checked
	System.out.print ("Please enter the word to be checked: ");
	word = kbi.readLine (); //recieving input from user
	word = word.trim (); //trimming beginning and trailing whitespace from word
	word = word.toLowerCase (); //converrting word to lowercase

	System.out.println ("Is this word a palindrome: " + palindromeCheck (word)); //outputting if a palindrome or not
    } //main method


    //this method recursively determines if the word passed to it is a palindrome
    public static boolean palindromeCheck (String word)
    {
	boolean palindrome; //true if word is palindrome, false if not
	//this structure determines whether or not the endpoint of the recuresive structure is reached
	if (word.length () > 1)  //if the word is more than one character
	{
	    if (word.charAt (0) == word.charAt (word.length () - 1)) //if the first character is equal to the last character
		palindrome = palindromeCheck (word.substring (1, word.length () - 1)); //the word is sent back shortened by one character on each side
	    else
		palindrome = false; //if the frist and last characters are not equal at any point, the word is not a palindrome
	}
	else  //the word is one character or less, the word has to be a palindrome
	{
	    palindrome = true;
	}

	return palindrome;
    } //paindromeCheck method
} //palindrome class

