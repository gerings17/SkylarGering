import java.util.ArrayList;
import java.util.Scanner;

public class rangeFinder{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	int largest;
	int smallest;
	
	public static void main(String[]args){
		int num;
		boolean tf = true;
		rangeFinder a = new rangeFinder();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter in a list of numbers. When you wish to stop, type in zero.");
		while(tf==true){
			num = reader.nextInt();
			if(num == 0){
				tf = false;
			}
			else{
				a.numbers.add(num);
			}
		}
		a.largest = a.findLargest();
		a.smallest = a.findSmallest();
		System.out.println("The smallest number in your list is: " + a.smallest + " The largest number is " + a.largest +".");
	}
	int findLargest(){
		largest = numbers.get(0);
		for(int i = 0; i<numbers.size();i++){
			if(largest< numbers.get(i)){
				largest = numbers.get(i);
			}
		}
		return largest;
	}
	int findSmallest(){
		smallest = numbers.get(0);
		for(int i = 0; i<numbers.size();i++){
			if(smallest> numbers.get(i)){
				smallest = numbers.get(i);
			}
		}
		return smallest;
	}
}
