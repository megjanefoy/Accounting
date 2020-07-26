import java.text.DecimalFormat;

/** 
 * Title: Assignment 4
 * Semester: COP3337 – Fall 2019
 * @author Megan Jane Thompson
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program extends NumberFormatter interface 
 * and formats negative numbers with parenthesis.
 * For example, -1 as (1).
*/
public class AccountingFormatter implements NumberFormatter{
  final String PATTERN = "###0;(###0)";  //pattern to change negative to parenthesis
  
  /**
   * This method formats and integer and returns a String.
  */
  public String format (int n){
    DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(); //creates formatter
    df.applyPattern(PATTERN);  //applies pattern to formatter
    
    return df.format(n);       //returns integer with new pattern as a String
  }
}