package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

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
		int[] number_of_customers = new int[items_in_store];
		int[] quant_of_purchase = new int[items_in_store];
	
		
		
		for (int i=0; i < num_of_customers; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int purchase_num = scan.nextInt(); //3
			int[] items_touched = new int[purchase_num];
			Arrays.fill(items_touched, -1);
			int counter = 0; //start counter at 0
			//Begin nested for loop
			
			for (int z=0; z < purchase_num; z++) { //3
				int quant_of_item = scan.nextInt(); //2
				String bought_item = scan.next(); //banana
				//System.out.println(quant_of_item + " " + bought_item); 
				
			
				for (int x=0; x < item_name.length; x++) { //loop 6 times
					
					//System.out.println(item_name[x] + " " + x);
					//System.out.println(item_name[x] + " " + bought_item);
					if (item_name[x].equals(bought_item)) { //if item name equals banana
						quant_of_purchase[x] += quant_of_item; //then update quantity to 2
						boolean decider = true; //decider true by default
						for (int b=0; b < purchase_num; b++) { //loop 3 times
							if (items_touched[b] == x) { //check if x is already in items touched //x is index value of the item_name
								decider = false;
								//System.out.println(bought_item);
							}
						}
						if (decider) { //decider is true
							//System.out.println(counter + " " + x);
							items_touched[counter] = x; //0'th element of items touched equals 1
							counter += 1;
							
						}
						
					}
						    
				}
				
				
			}
			for (int d=0; d < counter; d++) {
				number_of_customers[items_touched[d]] += 1;
			}	
		}

		for (int i=0; i < item_name.length; i++) {
			if (number_of_customers[i] == 0) {
				System.out.println("No customers bought " + item_name[i]);
			} 
			else {
				System.out.println(number_of_customers[i] + " customers bought " + quant_of_purchase[i] + " " + item_name[i]);
			}				
			
		}
		
		
		// Your code follows here.
		
	}
}
