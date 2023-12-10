package Food_menus;
import java.util.*;
public class Menu_card 
{

	public static void main(String[] args) 
	{
		int choice , Item_choice;
		float Bill=0;
		char ans;
		int quantity;
		String bill_item="";
		Scanner sc = new Scanner(System.in);
		System.out.println("------- Welcome to Rohit's Hotel -----------");
		do
			{
			//Hotel Menus
			System.out.println("Please choice your Order  :");
			System.out.println("1.Starter :");
			System.out.println("2.Main Course :");
			System.out.println("3.Desert :");
			System.out.println("4.Drinks:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				do
				{
				//Starter for you
				System.out.println("Please Select Your Favourite Starter :");
				System.out.println(" 1.Paneer Tikka \t\t\t 70/-");
				System.out.println(" 2.Malai Paneer Tikka \t\t\t 90/-");
				System.out.println(" 3.Soya Tandoori Tikka\t\t\t 70/-");
				System.out.println(" 4.Tandoori Aloo \t\t\t 80/-");
				Item_choice = sc.nextInt();
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();
					switch(Item_choice)
					{
					case 1:
						Bill+=70*quantity;
						bill_item+="\nPaneer Tikka \t\t\t 70Rs."+"\t\t"+quantity+"\n";
						break;
						
					case 2:
						Bill+=90*quantity;
						bill_item+="\nMalai Paneer Tikka \t\t 90Rs"+"\t\t"+quantity+"\n";
						break;
					
					case 3:
						Bill+=70*quantity;
						bill_item+="\nSoya Tandoori Tikka \t\t\t 70Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 4:
						Bill+=80*quantity;
						bill_item+="\nTandoori Aloo \t\t\t 80Rs"+"\t\t"+quantity+"\n";
						break;
					}
					System.out.println("Do You Want To add any item from Starter menu Y/N");
					ans=sc.next().charAt(0);
				}
				while(ans=='Y'||ans=='y');
				break;
			
				
			
			case 2:
				do
				{
				//Main Course for you
				System.out.println("Please Select Your Favourite Main Course :");
				System.out.println("1.Chicken Tandoori \t\t\t 140/-");
				System.out.println("2.Chicken Rise     \t\t\t 120/-");
				System.out.println("3.Manchurian Gravy \t\t\t 170/-");
				System.out.println("4.Bangan Masala    \t\t\t 120/-");
				Item_choice = sc.nextInt();
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();
					switch(Item_choice)
					{
					case 1:
						Bill+=140*quantity;
						bill_item+="\nChicken Tandoori \t\t 140Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 2:
						Bill+=120*quantity;
						bill_item+="\nChicken Rise \t\t\t 120Rs"+"\t\t"+quantity+"\n";
						break;
					
					case 3:
						Bill+=170*quantity;
						bill_item+="\nManchurian Gravy \t\t\t 170Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 4:
						Bill+=120*quantity;
						bill_item+="\nBangan Masala \t\t\t 120Rs"+"\t\t"+quantity+"\n";
						break;
					}
					System.out.println("Do You Want To add any item from Main Course menu Y/N");
					ans=sc.next().charAt(0);
				}
				while(ans=='Y'||ans=='y');
				break;
			
			case 3:
				do
				{
				//Desert for you
				System.out.println("Please Select Your Favourite Desert :");
				System.out.println("1.Puran Poli \t\t\t 120/-");
				System.out.println("2.Shrikhand  \t\t\t 90/-");
				System.out.println("3.Modak      \t\t\t 90/-");
				System.out.println("4.Mango Mastani \t\t80/-");
				Item_choice = sc.nextInt();
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();
					switch(Item_choice)
					{
					case 1:
						Bill+=120*quantity;
						bill_item+="\nPuran Poli \t\t\t 120Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 2:
						Bill+=90*quantity;
						bill_item+="\nShrikhand \t\t\t 90Rs"+"\t\t"+quantity+"\n";
						break;
					
					case 3:
						Bill+=90*quantity;
						bill_item+="\nModak \t\t\t 90Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 4:
						Bill+=80*quantity;
						bill_item+="\nMango Mastani \t\t\t 80Rs"+"\t\t"+quantity+"\n";
						break;
					}
					System.out.println("Do You Want To add any item from Desert menu Y/N");
					ans=sc.next().charAt(0);
				}
				while(ans=='Y'||ans=='y');
				break;
			
			
			case 4:
				//Drinks for you
				do
				{
				System.out.println("Please Select Your Favourite Drinks :"); 
				System.out.println(" 1.Pepsi    \t\t\t 60/-");
				System.out.println(" 2.CocaCola \t\t\t 40/-");
				System.out.println(" 3.Sprite   \t\t\t 50/-");
				System.out.println(" 4.Thums Up \t\t\t 40/-");
				Item_choice = sc.nextInt();
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();
					switch(Item_choice)
						{
						case 1:
							Bill+=60*quantity;
							bill_item+="\nPepsi \t\t\t 60Rs"+"\t\t"+quantity+"\n";
							break;
							
						case 2:
							Bill+=40*quantity;
							bill_item+="\nCocaCola \t\t\t 40Rs"+"\t\t"+quantity+"\n";
							break;
						
						case 3:
							Bill+=50*quantity;
							bill_item+="\nSprite \t\t\t 50Rs"+"\t\t"+quantity+"\n";
							break;
							
						case 4:
							Bill+=40*quantity;
							bill_item+="\nThums Up \t\t\t 40Rs"+"\t\t"+quantity+"\n";
							break;
						}
					System.out.println("Do You Want To add any item from Drinks menu Y/N");
					ans=sc.next().charAt(0);
				}
				while(ans=='Y'||ans=='y');	
				break;

			default:
				System.out.println("Invalid choice");
				
			}
				System.out.println("Do you want to add another Item Y/N");
				ans=sc.next().charAt(0);
			}
		while(ans=='Y'||ans=='y');
			System.out.println("Thank you For coming , plese visit agin.");
			System.out.println("You are Billing Details.");
			System.out.println("\nYou are Orders\t\t\t Your Orders Quantities "+bill_item);
			System.out.println("You Are Total Bill is :\t\t\t"+Bill);		

	}

}
