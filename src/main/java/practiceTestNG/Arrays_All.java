package practiceTestNG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arrays_All {

	public static void main(String[] args) {
		char char1 = 'a'; 												// Regular 1				
				System.out.print(" ---char1=  ");	
				System.out.println(char1); 
		
		char char2[] = {'a', 'b','c'}; 										
				System.out.print(" ---char2=  "); 						// Regular 2
				System.out.println(char2);	
		
		char char3[] = new char[2]; 									// Regular 3
		char3[0]='a'; char3[1]='a'; 										
				System.out.print(" ---char3=  ");  
				System.out.println(char3);		
		
		char[][] char4 = {{'a', 'b','c'}, {'d', 'e','f'}, {'a', 'b','c'}}; 	// Regular 4
				System.out.print(" ---char4=  "); 
				System.out.println( char4[0][0]);		
		
		char[][] char5 = new char[2][2];									// Regular 5
		char5[0][0] = 'k';			
				System.out.print(" ---char5=  ");  
				System.out.println(char5[0][0]);	
		
		char[][][] char6 = {{{'x', 'b','c'}, {'d', 'e','f'}}, {{'a', 'b','c'},{'a', 'b','c'}}};		// Regular 6
		char6[0][0][0] = 'k';												
				System.out.print(" ---char6=  "); 
				System.out.println(char6[0][0][0]);	
		
		char[][][] char7 = new char[2][2][1];												// Regular 7
		char7[0][0][0] = 'k';												
				System.out.print(" ---char7=  ");  
				System.out.println(char7[0][0][0]);	
		
				System.out.println("======object variable=======");
		
		Object ob1 = 1;System.out.print(" ---ob1=  ");						//Object				
				System.out.println(ob1);
		
		Object ob2[] = {2,"anowar", 'l'	};									//Object						
				System.out.print(" ---ob2=  ");	
				System.out.println(ob2[0]);
		
		Object ob3[] = new Object[2];ob3[0]="Jinan";						//Object				
				System.out.print(" ---ob3=  ");	
				System.out.println(ob3[0]);
		
		Object ob4[][] ={{'a',5,"saiful"},{'b',6,"zaman"}};					//Object		
				System.out.print(" ---ob4=  ");	
				System.out.println(ob4[1][2]);
				
		Object ob5[][] = new Object[2][2];									//Object
		ob5[1][1] = "john";												
				System.out.print(" ---ob5=  ");	
				System.out.println(ob5[1][1]);
				
		Object ob6[][][] ={{{'a',5,"saiful"},{'b',6,"zaman"}}};				//Object	
				System.out.print(" ---ob6=  ");	
				System.out.println(ob6[0][0][2]);
				
		Object ob7[][][] = new Object[2][2][2];								//Object
		ob7[1][1][1] = "phil";											
				System.out.print(" ---ob7=  ");	
				System.out.println(ob7[1][1][1]);
		
		System.out.println("======List variables=======");
		
		List list1 = new ArrayList<>();									//ArrayList	1
		list1.add(100); list1.add(200.65); 
		list1.add('l'); list1.add("Jinia"); 
				System.out.print(" ---list1=  ");	
				System.out.println(list1);
		
		List <Integer>list2 = new ArrayList<>();						//ArrayList	2
		list2.add(100); 
		list2.add(600);	
		list2.add(600);							
		System.out.print(" ---list2=  ");	
		System.out.println(list2);
		
		ArrayList ArList1 = new ArrayList<>();							//ArrayList 3
		ArList1.add(100); 
		ArList1.add(200.65); 
		ArList1.add('l'); 
		ArList1.add("Jinia"); 
		System.out.print(" ---ArList1=  ");	
		System.out.println(ArList1);
		
		ArrayList <String> ArList2 = new ArrayList<>();					//ArrayList 4
		ArList2.add("Jinan"); 
		ArList2.add("Jinan"); 
		ArList2.add("Jinan"); 		 
		System.out.print(" ---ArList2=  ");	
		System.out.println(ArList2);
		
		System.out.println("======Set variables=======");
		Set Sets1 = new HashSet();											//HashSet	1
		Sets1.add(200.65); 
		Sets1.add(200.65); 
		Sets1.add('l'); 
		Sets1.add("Jinia"); 
		System.out.print(" ---Sets1=  ");	
		System.out.println(Sets1);
		
		Set <String> Sets2 = new HashSet<>();								//HashSet	2
		Sets2.add("Jinan"); 
		Sets2.add("Jinan"); 
		Sets2.add("Jinan"); 		 	
		System.out.print(" ---Sets2=  ");	
		System.out.println(Sets2);
		
		System.out.println("======HashSet variables=======");
		HashSet Hsets1 = new HashSet();										//HashSet	3
		Hsets1.add(200.65); 
		Hsets1.add(200.65); 
		Hsets1.add('l'); 
		Hsets1.add("Jinia"); 
		System.out.print(" ---Hsets1=  ");	
		System.out.println(Hsets1);
		
		HashSet <String> HSets2 = new HashSet<>();							//HashSet	4
		HSets2.add("Jinan"); 
		HSets2.add("Jinan"); 
		HSets2.add("Jinan"); 		 	
		System.out.print(" ---HSets2=  ");	
		System.out.println(HSets2);
		
		System.out.println("======Map variables=======");
		Map map1= new HashMap<>();											//HashMap
		map1.put("Anowar", "Ullah");
		map1.put("Anowar", 200);
		map1.put(33.56, "Ullah"); 
		System.out.print(" ---map1=  ");	
		System.out.println(map1);
		
		Map <String, Integer> map2= new HashMap<>();							//HashMap
		map2.put("Jinan", 100);
		map2.put("Jinia", 100); 
		map2.put("anowar", 100);	
		System.out.print(" ---map2=  ");	
		System.out.println(map2);
		
		System.out.println("======HashMap variables=======");
		HashMap Hmap1= new HashMap<>();												//HashMap
		Hmap1.put("Anowar", "Ullah");
		Hmap1.put("Anowar", 200);
		Hmap1.put(33.56, "Ullah"); 
		System.out.print(" ---Hmap1=  ");	
		System.out.println(Hmap1);
		
		HashMap<Integer, String> Hmap2= new HashMap<>();								//HashMap
		Hmap2.put(500, "Ullah");
		Hmap2.put(600, "Johb");
		Hmap2.put(500, "Ullah"); 
		System.out.print(" ---Hmap2=  ");	
		System.out.println(Hmap2);
		
		System.out.println("======HashTable variables=======");
		Hashtable Htable1= new Hashtable<>();												//Hashtable
		Htable1.put("Anowar", "Ullah");
		Htable1.put("Anowar", 200);
		Htable1.put(33.56, "Ullah"); 
		System.out.print(" ---Htable1=  ");	
		System.out.println(Htable1);
		
		Hashtable<Integer, String> Htable2= new Hashtable<>();								//Hashtable
		Htable2.put(500, "Ullah");
		Htable2.put(600, "Johb");
		Htable2.put(500, "Ullah"); 
		System.out.print(" ---Htable2=  ");	
		System.out.println(Htable2);
		
		
	}

}
