package ch3_class_demos;

import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		
		// Number Format --v-- calling on the Number Format Class
        NumberFormat cf = NumberFormat.getCurrencyInstance();
       NumberFormat pf = NumberFormat.getPercentInstance();
        pf.setMinimumFractionDigits(2);
        pf.setMaximumFractionDigits(4);
        
        
        double d12 = .25333333;
        
        System.out.println(cf.format(d12));
        System.out.println(pf.format(d12));

	}

}
