package practiceTestNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ArraysLearning {
	
	


	char ab= 'a';											//1
	char []ac= {'a','b','c'};								//2
	char [] ad= new char[3];								//3
	List<Character>ae= new ArrayList<>();					//4
	public List listcheck(){
		List lists = new ArrayList<>();
		lists.add(100);
		lists.add(200.32);
		lists.add('H');
		lists.add("String");
		return lists;
	}
	Set<Character> af = new HashSet<>();					//5
	char[][] ag = {{'a','b','c'},{'d','e'},{'f','g','h'}};	//6	 2D
	char[][]ah=new char[3][3];								//7  2D
	Map<Character, Integer> ai = new HashMap<>();			//8  2D
	
	Map<String, String> aj = new HashMap<>();				//9  2D
	String val1 = "this is text"; 
	int val2 = 5;
	char val3 = 'p';
	double val4 = 100.23;
	public Map<String, String> bigTable(){
		aj.put("column1", val1);
		aj.put("column2", Integer.toString(val2));
		aj.put("column3", Character.toString(val3));
		aj.put("column4", Double.toString(val3));
		return aj;		
	}
	
	Object ak[]={"column1","column2","column3","column4"};		//10  2D
	
	public Object[][] objectData(){						//11  2D
		Object[][] data = new Object[3][2];
		data[0][0]= "UID";		data[0][1]= "PWD";
		data[1][0]= "UUMA";		data[1][1]= "BTRM2016";
		data[2][0]= "UTQO";		data[2][1]= "DTST2016";
		return data;
	}
	
	
	//14
	public Hashtable hasTableTest1(){
		Hashtable hp1 = new Hashtable<>();
		hp1.put("anowar", 100);
		hp1.put('A', "anowar");
		hp1.put(100, 200.65);
		return hp1;
	}
	
	public Hashtable<String, Integer> hasTableTest2(){
		Hashtable<String, Integer> hp1 = new Hashtable<>();
		hp1.put("anowar", 100);
		//hp1.put('A', "anowar");
		return hp1;
	}
	

	public HashMap hashMaptest1(){
		HashMap map1 = new HashMap<>();
		map1.put("anowar", 100);
		map1.put('A', "anowar");
		map1.put(100, 200.65);
		return map1;
	}
	

	public HashMap hashMaptest2(){
		HashMap <String, Integer>map1 = new HashMap<>();
		map1.put("anowar", 100);	
		return map1;
	}
	
	public Map hashMaptest3(){
		Map <String, Integer>map1 = new HashMap<>();
		map1.put("anowar", 100);	
		return map1;
	}
	
	public HashSet hashSet1(){
		HashSet set1 = new HashSet<>();
		set1.add(100);
		set1.add(200.65);	
		set1.add('A');
		set1.add("String");
		set1.add(100);
		set1.add(200.65);	
		set1.add('A');
		set1.add("String");
		System.out.println("HashSet.size() " +set1.size());
		return set1;
	}
		
	public Set hashSet2(){
		Set set1 = new HashSet<>();
		set1.add(100);
		set1.add(200.65);	
		set1.add('A');
		set1.add("String");
		set1.add(100);
		set1.add(200.65);	
		set1.add('A');
		set1.add("String");
		System.out.println("Set.size() " +set1.size());
		return set1;
	}
	public HashSet<Integer> hashSet3(){
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(100);	
		set1.add(100);	
		System.out.println("HashSet.size() " +set1.size());
		return set1;
	}

}
