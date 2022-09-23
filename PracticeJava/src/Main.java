import java.util.ArrayList;
import java.util.HashMap;

class Dish{
	public String name;
	public int cost;
	public Dish(String name,int cost) {
		this.name=name;
		this.cost=cost;
	}
}

class Restaurant{
	public HashMap<Integer, ArrayList<Dish>> table = new HashMap<Integer, ArrayList<Dish>>();
	
	public String addtable(int no , Dish dish) {
		ArrayList<Dish> lst = new ArrayList<Dish>();
		if(table.containsKey(no)) {
			lst.add(dish);
			table.put(no, lst);
			return "Added to the old Order";
		}
		else {
			lst.add(dish);
			table.put(no, lst);
			return "Added to a new Order";
		}
	}
	public int calculate(int no) {
		ArrayList<Dish> lst = this.table.get(no);
		int sum=0;
		for(Dish d: lst) {
			sum+=d.cost;
		}
		return sum;
	}
}
public class Main {
	public static void main(String[] args) {
		Dish d1 = new Dish("burg",150);
		Dish d2 = new Dish("burger",100);
		Restaurant rest = new Restaurant();
		System.out.println(rest.addtable(1, d1));
		System.out.println(rest.calculate(1));
	}
	
	
}
