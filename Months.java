import javax.swing.JOptionPane;

public class Months {

	public enum Month {
		January, February, March, April, May, June, July, August, September, November, October, December
	}
	public static void main(String [] args){
		Month[] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, 
				Month.August, Month.September, Month.November, Month.October, Month.December
				
		};
while (true) {Month input = (Month)JOptionPane.showInputDialog(null, "Select a Month", "Month",
		JOptionPane.QUESTION_MESSAGE, null, choices, choices[11].equals(JOptionPane.CANCEL_OPTION));
switch(input){
case December:
case January:
case February:
	JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
	break;
case March:
case April:
case May:
	JOptionPane.showMessageDialog(null, "Happy Spring Days");
	break;
case June:
case July:
case August:
	JOptionPane.showMessageDialog(null,  "its a summertime");
	break;
case September:
case November:
case October:
	JOptionPane.showMessageDialog(null, "Welcome to a foliage season!");
	break;
default:
	JOptionPane.showMessageDialog(null, "Wrong Month");
}

}

}
}
