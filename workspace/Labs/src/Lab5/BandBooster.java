package Lab5;

import java.util.Scanner;

public class BandBooster {
	private int boxesSold;
	private String name;
	public BandBooster(int initBoxes, String owner)
	{
	boxesSold = initBoxes;
	name = owner;
	}
	public String getName()
	{
		return(name);
	}
	public int updateSales(int Sales)
	{
		boxesSold = boxesSold + Sales;
		return(boxesSold);
	}
	public String toString()
	{
		return(name + ":    " + boxesSold + " boxes");
	}
public static void main(String[] args)
	{
	int Sales = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Name of first band booster:");
	String owner1 = scan.next();
	System.out.println("Name of second band booster:");
	String owner2 = scan.next();
	BandBooster object1, object2;
	object1 = new BandBooster(0,owner1);
	object2 = new BandBooster (0,owner2);
	System.out.println("How many boxes did you sell this week");
	Sales = scan.nextInt();
	object1.updateSales(Sales);
	System.out.println("How many boxes did you sell this week");
	Sales = scan.nextInt();
	object1.updateSales(Sales);
	System.out.println("How many boxes did you sell this week");
	Sales = scan.nextInt();
	object1.updateSales(Sales);
	System.out.println(object1.toString());
	//Object 2
	System.out.println("How many boxes did you sell this week BandBooster 2");
	Sales = scan.nextInt();
	object2.updateSales(Sales);
	System.out.println("How many boxes did you sell this week BandBooster 2");
	Sales = scan.nextInt();
	object2.updateSales(Sales);
	System.out.println("How many boxes did you sell this week BandBooster 2");
	Sales = scan.nextInt();
	object2.updateSales(Sales);
	System.out.println(object2.toString());;
	scan.close();
	}
}
