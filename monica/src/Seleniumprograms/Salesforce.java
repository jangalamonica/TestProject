package Seleniumprograms;

import java.util.Scanner;

public class Salesforce extends Salesparent {

	public static void main(String[] args) throws Exception {
		
		
		Salesforce obj=new Salesforce();
		     String browser;
		     System.out.println("Enter the browser name");
		     Scanner sc=new Scanner(System.in);
		     browser=sc.nextLine();
		     
		     if(browser.contains("chrome"))
		     {
		    	 obj.invokeChromeBrowser();
		     }
		     else
		     {
		    	 obj.invokeIEBrowser();
		     }
		obj.salesLogin();
	}

}
