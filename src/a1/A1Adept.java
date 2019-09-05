package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int items_in_store = scan.nextInt();
		String[] item_name = new String[items_in_store];
		double[] item_price = new double [items_in_store];
		
		//Make two arrays the length as the items in store
		
		for (int i=0; i < items_in_store; i++) {
			item_name[i] = scan.next();
			item_price[i] = scan.nextDouble();
			//System.out.println(item_name[i] + " " + item_price[i]);
			}
		
		//fill in the appropriate values to each array
		
		int num_of_customers = scan.nextInt();
		double[] purch_amounts = new double[num_of_customers];
		String biggest = "";
		String smallest = "";
		double biggest_sum = 0.0;
		double smallest_sum = 0.0;
		
		for (int i=0; i < num_of_customers; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int purchase_num = scan.nextInt();
			double sum = 0.0;
			
			
			
			
			//Begin nested for loop
			
			for (int z=0; z < purchase_num; z++) {
				int quant_of_item = scan.nextInt();
				String bought_item = scan.next();
				double total = 0.0;
				//System.out.println(bought_item + " " + quant_of_item); 
			
				for (int x=0; x < item_name.length; x++) {
					//System.out.println(item_name[x] + " " + bought_item + " " + item_name[x].equals(bought_item));
					if (item_name[x].equals(bought_item)) {
						total = item_price[x] * quant_of_item;
					}
					    //System.out.println(item_price[x] + " " + quant_of_item);
					    //System.out.println(total);
				}
				sum += total; //4.55
				//System.out.println(sum);	
					
			}
				
			purch_amounts[i] = sum; //add 4.55 to array
			
			if (i==0) {	
				smallest_sum = sum; //4.55
				biggest = first_name + " " + last_name;
	    		smallest = first_name + " " + last_name;	
			}
	    	else { 
	    		if (sum > biggest_sum) {
	    		
	    			biggest_sum = sum;
	    			biggest = first_name + " " + last_name;
	    		}
	    		else if (sum < smallest_sum) {
	    			smallest_sum = sum;
	    			smallest = first_name +" " + last_name;
	    		}    		
	    	}	
	   }
	   double costs = 0.0;
	   double average_costs = 0.0;
		for (int w=0; w < purch_amounts.length; w++) {
			 costs += purch_amounts[w];	 
		}
		average_costs = costs / purch_amounts.length;
		
		System.out.println("Biggest: " + biggest + " (" + String.format("%.2f", biggest_sum) + ")");
		System.out.println("Smallest: " + smallest + " (" + String.format("%.2f", smallest_sum) + ")");
		System.out.println("Average: " + String.format("%.2f", average_costs));
		
		
		// Your code follows here.
		
	}
}
