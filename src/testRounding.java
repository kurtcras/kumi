import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class testRounding {


	 public static void main(String k[]) 
	 { 
	 DecimalFormat formatter = new DecimalFormat();
	 formatter.setMaximumFractionDigits(1);
	 formatter.setRoundingMode(RoundingMode.HALF_DOWN);
	 
	 System.out.println("rouding a double: " + formatter.format(10.45)); 
	 System.out.println("rouding a BigDecimal: " + formatter.format(BigDecimal.valueOf(10.45)));
	 
	 }
}
