/** 
 * Title: Assignment 4
 * Semester: COP3337 – Fall 2019
 * @author Megan Jane Thompson
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program extends NumberFormatter interface 
 * and formats an integer the usual way.
*/
public class DefaultFormatter implements NumberFormatter{
  
  /**
   * This method intakes an integer n, formats the integer
   * to a String and returns that String.
   * 
   * @param n is the number as an integer.
   * @return the integer as a String.
  */
  public String format (int n){
    String num = Integer.toString(n);  //formats integer to a String
    return num;                        //returns number as a String
  }
}