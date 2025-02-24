//Use the Statistician class to calculate batting average
//Created by James Vanderhyde, 30 August 2024
package battingaverage;
import java.util.Scanner;
public class BattingAverage
{
private static final Scanner cin = new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("What is the name of the baseball player?");
String player = cin.nextLine();
System.out.println("Now please enter the record for "+player+".");
System.out.println("For each at-bat, enter 1 for hit and 0 for out.(Exclude walks.)");
System.out.println("Enter -1 to stop.");
int entry = cin.nextInt();

Statistician1 s = new Statistician1();

while (entry != -1)
{
//Do something with the user entry:
// Count the at-bats and add up the hits.
//Read the next entry
    s.next(entry);
entry = cin.nextInt();


}
    System.out.println(player + "'s batting average was " + s.mean());
}
}

