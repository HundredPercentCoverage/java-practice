package formatting;

/**
 *
 * @author bunglenutter
 */

import static java.lang.System.out;

public class Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	out.printf("%s%d%s", ">>", 7, "<<\n");		//Decimal int
	out.printf("%s%10d%s", ">>", 7, "<<\n");	//Right justified by 10
	out.printf("%s%-10d%s", ">>", 7, "<<\n");	//Left justified by 10
	out.printf("%s%010d%s",">>", 7, "<<\n");	//10 spaces width
	out.printf("%s%+d%s", ">>", 7, "<<\n");		//Show + or -
	out.printf("%s%+d%s", ">>", -7, "<<\n");	//Show + or -
	out.printf("%s%(d%s", ">>", -7, "<<\n");	//Bracket -ve number
	out.printf("%s%10.5f%s", ">>", 7.0, "<<\n");	//10 width 5 decimal places
	out.printf("%s%S%s", ">>", "Hello", "<<\n");	//Capitalise
	out.printf("%s%c%s", ">>", 'x', "<<\n");	//Show char
	out.printf("%s%C%s", ">>", 'x', "<<\n");	//Capital char
    }
    
}
