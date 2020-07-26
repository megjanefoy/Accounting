import java.text.NumberFormat;

/** 
 * Title: Assignment 4
 * Semester: COP3337 – Fall 2019
 * @author Megan Jane Thompson
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program extends NumberFormatter interface 
 * and formats an integer with decimal separators.
 * For example one million as 1,000,000.
*/
public class DecimalSeparatorFormatter implements NumberFormatter{
  
  /**
   * This method intakes an integer n, formats the integer
   * to a String including commas, and returns that String.
   * 
   * @param n is the number as an integer.
   * @return the integer with commas as a String.
  */
  public String format (int n){
	//formats number to a String with commas
    String num = NumberFormat.getIntegerInstance().format(n);             
    return num;     //returns number with commas as a String 
  }
}