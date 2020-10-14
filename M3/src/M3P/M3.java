package M3P;
import java.util.*;

public class M3 {

	public static void main(String[] args) {
		
		//Phase 1
		
		System.out.println("\n" + "Phase 1. Inputs and Outputs." + "\n");
		
		//Variables
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String city6;
		
		//Console input
		
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("City 1:");
		city1 = myObj1.next();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("City 2:");
		city2 = myObj2.next();
		
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("City 3:");
		city3 = myObj3.next();
		
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("City 4:");
		city4 = myObj4.next();
		
		Scanner myObj5 = new Scanner(System.in);
		System.out.println("City 5:");
		city5 = myObj5.next();
		
		Scanner myObj6 = new Scanner(System.in);
		System.out.println("City 6:");
		city6 = myObj6.next();
		
		//Console output
		
		System.out.println("Cities: " + city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ", " + city6 + ".");
		
		//Phase 2
		
		System.out.println("\n" + "Phase 2. Cities alphabeticly sorted." + "\n");
		
		//Array
		
		ArrayList<String> aCities = new ArrayList<>();
		aCities.add(city1);
		aCities.add(city2);
		aCities.add(city3);
		aCities.add(city4);
		aCities.add(city5);
		aCities.add(city6);
		
		//Sort and print
		
		Collections.sort(aCities); 
        for (String city : aCities) {
        	System.out.println(city);
        }
        
        //Phase 3
        
		System.out.println("\n" + "Phase 3. 'A' replaced for '4'." + "\n");
        
        //Replace 'a' and 'A' for '4'
        
		ArrayList<String> ax4Cities = new ArrayList<>();
		for (String i : aCities) {
            i=i.replace('a', '4').replace('A', '4');
            ax4Cities.add(i);
        }
		
		Collections.sort(ax4Cities); 
        for (String i : ax4Cities) {
            System.out.println(i);
        }
        
        //Phase 4
		
        System.out.println("\n" + "Phase 4. Inverted names." + "\n");
        
        //1 array per city. Print name and inverted name.
             
        System.out.print(city1 + " - ");
        char[] cCity1 = city1.toCharArray();
        for(int i=city1.length()-1; i>=0; i--) {
            System.out.print(cCity1[i]);
        }
        
        System.out.print("\n" + city2 + " - ");
        char[] cCity2 = city2.toCharArray();
        for(int i=city2.length()-1; i>=0; i--) {
            System.out.print(cCity2[i]);
        }
        
        System.out.print("\n" + city3 + " - ");
        char[] cCity3 = city3.toCharArray();
        for(int i=city3.length()-1; i>=0; i--) {
            System.out.print(cCity3[i]);
        }
        
        System.out.print("\n" + city4 + " - ");
        char[] cCity4 = city4.toCharArray();
        for(int i=city4.length()-1; i>=0; i--) {
            System.out.print(cCity4[i]);
        }
        
        System.out.print("\n" + city5 + " - ");
        char[] cCity5 = city5.toCharArray();
        for(int i=city5.length()-1; i>=0; i--) {
            System.out.print(cCity5[i]);
        }
        
        System.out.print("\n" + city6 + " - ");
        char[] cCity6 = city6.toCharArray();
        for(int i=city6.length()-1; i>=0; i--) {
            System.out.print(cCity6[i]);
        }    
       
	}

}
