//Statistician, a class for keeping statistics about a sequence of numbers.
//Distributed by James Vanderhyde, 28 August 2024
//Originally created by Michael Main for 
//  "Data Structures and Other Objects Using Java"
//  http://www.cs.colorado.edu/~main/edu/colorado/homework/Statistician.java

package battingaverage; //We'll just use a local package (jnv)

/******************************************************************************
* This class is a homework assignment;
* a <CODE>Statistician</CODE> keeps track of statistics about a sequence of
* double numbers.
*
* 
*   This file contains only blank implementations ("stubs")
*   because this is a Programming Project for my students.
*
* @version
*   Jan 24, 1999
******************************************************************************/
public class Statistician1
{
    
    private int numberOfNumbers;
    private double sumOfNumbers;
    private double meanOfNumbers;
    private double max;
    private double min;
    /**
    * Initializes a new Statistician.
    * 
    *   This Statistician is newly initialized and has not yet been given any
    *   numbers.
    **/
    public Statistician1( )
    {
        // Student implementation.
        numberOfNumbers = 0;
        sumOfNumbers = 0;
        meanOfNumbers = 0;
        max = 0;
        min = 0;
       
    }


    /**
    * Clears this Statistician.
    * 
    *   This Statistician is reinitialized as if it has never been given any
    *   numbers.
    **/
    public void clear( )
    {
        // Student implementation.
        numberOfNumbers = 0;
        sumOfNumbers = 0;
        meanOfNumbers = Double.NaN;
        max = Double.NaN;
        min = Double.NaN;
        
    }


    /**
    * Gives a new number to this Statistician.
    * 
    *   The specified number is given to this Statistician and
    *   it will be included in any subsequent statistics.
    * @param number
    *   the new number that is being given the this Statistician
    **/
    public void next(double number)
    {
        // Student implementation.
        this.numberOfNumbers++;
        this.sumOfNumbers += number;
        this.meanOfNumbers = sumOfNumbers/numberOfNumbers;
        max = number>max ? number : max;
        min = number<max ? number : min;
    }


    /**
    * Determines how many numbers have been given to this Statistician.
    * 
    *   Note: Giving a Statistician more than
    *   <CODE>Integer.MAX_VALUE</CODE> numbers, will
    *   cause failure with an arithmetic overflow.
    * @return
    *   the count of how many numbers have been given to this Statistician
    *   since it was initialized or reinitialized.
    **/
    public int length( )
    {
        // The student's code will replace this return statement:
        return numberOfNumbers;
    }


    /**
    * Determines the sum of all the numbers that have been given to this
    * Statistician.
    * 
    *   Note: If the sum exceeds the bounds of double numbers, then the answer
    *   from this method may be
    *   <CODE>Double.POSITIVE_INFINITY</CODE> or
    *   <CODE>Double.NEGATIVE_INFINITY</CODE>.
    * @return
    *   the sum of all the number that have been given to this
    *   Statistician
    *   since it was initialized or reinitialized.
    **/
    public double sum( )
    {
        // The student's code will replace this return statement:
        return sumOfNumbers;
    }


    /**
    * Determines the arithmetic average of all the numbers that have been given
    * to this Statistician.
    * 
    *   Note: If this Statistician has been given more than
    *   <CODE>Integer.MAX_VALUE</CODE> numbers, then this method fails
    *   because of arithmetic overflow.
    *   If <CODE>length()</CODE> is zero, then the answer from this method
    *   is <CODE>Double.NaN</CODE>.
    *   If <CODE>sum()</CODE> exceeds the bounds of double numbers, then the
    *   answer from this method may be
    *   <CODE>Double.POSITIVE_INFINITY</CODE> or
    *   <CODE>Double.NEGATIVE_INFINITY</CODE>.
    * @return
    *   the arithmetic mean of all the number that have been given to this
    *   Statistician
    *   since it was initialized or reinitialized.
    **/
    public double mean( )
    {
        // The student's code will replace this return statement:
        return meanOfNumbers;
    }


    /**
    * Determines the largest number that has been given
    * to this Statistician.
    * 
    *   Note: If <CODE>length()</CODE> is zero, then the answer from this method
    *   is <CODE>Double.NaN</CODE>.
    * @return
    *   the largest number that has been given to this
    *   Statistician
    *   since it was initialized or reinitialized.
    **/
    public double maximum( )
    {
        // The student's code will replace this return statement:
        return max;
    }


    /**
    * Determines the smallest number that has been given
    * to this Statistician.
    * 
    *   Note: If <CODE>length()</CODE> is zero, then the answer from this method
    *   is <CODE>Double.NaN</CODE>.
    * @return
    *   the smallest number that has been given to this
    *   Statistician
    *   since it was initialized or reinitialized.
    **/
    public double minimum( )
    {
        // The student's code will replace this return statement:
        return min;
    }


    /**
    * Compares this <CODE>Statistician</CODE> to another object for equality.
    * 
    *   Note: If <CODE>obj</CODE> is null or does not refer to a
    *   <CODE>Statistician</CODE> object, then the answer is
    *   <CODE>false</CODE>.
    * @param obj
    *   an object with which this <CODE>Statistician</CODE> will be compared
    * @return
    *   A return value of <CODE>true</CODE> indicates that
    *   <CODE>obj</CODE> refers to a
    *   <CODE>Statistician</CODE> object with the same length, sum, mean,
    *   minimum and maximum as this
    *   <CODE>Statistician</CODE>. Otherwise the return value is
    *   <CODE>false</CODE>.
    **/
    public boolean equals(Object obj)
    {
        // The student's code will replace this return statement:
        if(obj == null){
            return false;
        }
        
        Statistician1 s2 = (Statistician1) obj;
        
        return this.numberOfNumbers==s2.numberOfNumbers && this.sumOfNumbers==s2.sumOfNumbers && Double.compare(this.meanOfNumbers,s2.meanOfNumbers)==0
                && Double.compare(this.max,s2.max)==0 && Double.compare(this.min,s2.min)==0;
        
        
        
    }


    /**
    * Adds the numbers of another Statistician to this Statistician.
    * 
    *   The numbers from <CODE>addend</CODE> are added to this
    *   Statistician. After the operation, this Statistician acts as if
    *   if was given all of its numbers and also given all of the numbers
    *   from the addend.
    * @param addend
    *   a Statistician whose numbers will be added to this Statistician
    * @throws NullPointerException
    *   Indicates that <CODE>addend</CODE> is null.
    **/
    public void addAll(Statistician1 addend)
    {
        // Student implementation.
        if(addend==null){
            throw new NullPointerException("Addend is null");
        }
        this.numberOfNumbers += addend.numberOfNumbers;
        this.sumOfNumbers += addend.sumOfNumbers;
        this.meanOfNumbers = this.sumOfNumbers/this.numberOfNumbers;
        this.max = Math.max(this.max, addend.max) ;
        this.min = Math.min(this.min, addend.min) ;
        
        
    }


    /**
    * Creates a new Statistician that behaves as if it was given all the
    * numbers from two other Statisticians.
    * @param s1
    *   the first of two Statisticians
    * @param s2
    *   the second of two Statisticians
    * @return
    *   a new Statistician that acts as if it was given all the numbers from
    *   s1 and s2.
    * @throws NullPointerException
    *   Indicates that one of the arguments is null.
    **/
    public static Statistician1 union(Statistician1 s1, Statistician1 s2)
    {
        // The student's code will replace this return statement:
        if(s1 == null || s2 == null ){
            throw new NullPointerException("One argument is null");            
        }
        
        Statistician1 combine = new Statistician1();
        
        combine.numberOfNumbers = s1.numberOfNumbers+s2.numberOfNumbers;
        combine.sumOfNumbers = s1.sumOfNumbers+s2.sumOfNumbers;
        combine.meanOfNumbers = combine.sumOfNumbers/combine.numberOfNumbers;
        
        combine.max = Math.max(s1.max,s2.max);
        combine.min = Math.min(s1.min,s2.min);
        
        return combine;
        
    }

}
