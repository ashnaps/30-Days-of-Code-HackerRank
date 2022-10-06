import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    public Student(String firstName, String lastName, int identification, int[] scores)
    {
        super(firstName, lastName, identification);
        this.testScores=scores;
    }
    
    public char calculate()
    {
        char grade;
        int sum=0;
        for(int i=0;i<testScores.length ;i++)
            sum=sum+testScores[i];
        int fsum=sum/testScores.length;
            
        if(fsum<= 100 && fsum>=90)
        return 'O';
        
        else if(fsum<= 90 && fsum>=80)
        return 'E';
        
        else if(fsum<= 80 && fsum>=70)
        return 'A';
        
        else if(fsum<70 && fsum>=55)
        return 'P';
        
        else if(fsum<=55  && fsum>=40)
        return 'D';
        
        else return 'T';
    }
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class Solution {
