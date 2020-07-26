/** 
 * Title: Assignment 4
 * Semester: COP3337 – Fall 2019
 * @author Megan Jane Thompson
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program extends NumberFormatter interface
 * and formats the number as base n, where n is
 * any number between 2 and 36 that is provided 
 * in the constructor.
*/
public class BaseFormatter implements NumberFormatter{
  private int base = 2;            //sets default base to 2
  
  /**
   * This method constructs BaseFormatter and checks 
   * if n is between 2 and 36 inclusive.
   * 
   * @param n is the number as an integer.
  */
  public BaseFormatter(int n){
    if (base >= 2 || base <= 36){  //checks to see if base is between 2 & 36 inclusive
      base = n;                    //sets base to n if true
    }
  }
    
  
  /**
   * This method intakes an integer n, formats the 
   * integer as base n, then formats to a String, 
   * and returns that String.
   * 
   * @param n is the number as an integer.
   * @return the integer as base n as a String.
  */
  public String format (int n){
    String num = Integer.toString(n, base); //formats integer as base n as a String
    return num;                    //returns integer as base n as a String
  }
}