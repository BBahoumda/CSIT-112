
public class Christmas {
	public static void main(String[] args) {
int days;
days = 12;
System.out.println();

for(int day=1; day <= days; day++) {
	System.out.print("On the " + "");
	switch(day) {
	case 1: System.out.print("1st"); break;
	case 2: System.out.print("2nd"); break;
	case 3: System.out.print("3rd"); break;
	default: System.out.print(day +"th");
	}
System.out.print(" day of Chritsmas my true love gave to me");
switch(day) {
case 12: System.out.print(" Twelve drumers drumming,"); 
case 11: System.out.print(" Eleven pipers piping,"); 
case 10: System.out.print(" Ten lords a-leaping,"); 
case 9:  System.out.print(" Nine ladies dancing,"); 
case 8:  System.out.print(" Eight maids a-milking,"); 
case 7:  System.out.print(" Seven swans a-swimmming,"); 
case 6:  System.out.print(" Six geese a-laying,"); 
case 5:  System.out.print(" Five golden rings,"); 
case 4:  System.out.print(" Four Calling birds,"); 
case 3:  System.out.print(" Three French hens,"); 
case 2:  System.out.print(" Two turtle doves, and "); 
case 1:  System.out.print(" A partridge in a pear tree,"); 
}
	System.out.println();	
	}
}

}