package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int customer_count = scan.nextInt(); //3
		 
		int i = 0;
		do {
			String first_name = scan.next(); //Carrie
			String last_name = scan.next();  //Brownstein
			int num_of_items = scan.nextInt(); //3 items
			double sum = 0.0;
			
			
			for (int z=0; z < num_of_items; z++) {
				int quant_of_items = scan.nextInt();
				String item_name = scan.next();

				double price_of_item = scan.nextDouble();
				//System.out.println("price" + price_of_item);

				double cost = quant_of_items * price_of_item; 
				sum += cost; //9.05
			}
			char first_letter = first_name.charAt(0);
			System.out.println(first_letter + ". " + last_name + ": " + String.format("%.2f", sum));
			
			i++;
			
		}
		while (i < customer_count);
		scan.close();	
		
		
	}
}
