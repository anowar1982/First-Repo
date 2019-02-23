package practiceTestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

import gherkin.lexer.Lt;




public class IteratorTest {
	@Test
	public void IteratorTesting(){
		//https://www.youtube.com/watch?v=Plob9dBGyEY&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=17
	Employee e1 = new Employee("anowar", 39, "QA");
	Employee e2 = new Employee("John", 29, "Dev");
	Employee e3 = new Employee("Peter", 35, "Admin");
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	Iterator <Employee> it = ar4.iterator();
	while(it.hasNext()){
		Employee emp1= it.next();
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.name); 		 
	}
	System.out.println("===linked list");
	LinkedList<String> ll = new LinkedList<>();
	ll.add("anowar");
	ll.add("anowar");
	ll.add("nazmul");
	ll.add("australia");
	ll.addLast("john");
	ll.addFirst("January");
	ll.add(1, "flight");
	System.out.println(ll);
	
	System.out.println("==linked list iterator ");
	Iterator<String>ite = ll.iterator();
	while(ite.hasNext()){
		System.out.println(ite.next());
	}
	System.out.println("==linked list in advanced for loop");
	for (String str : ll) {
	System.out.println(str);
}
	System.out.println("==linked list in for loop");
for (int i =0; i<ll.size(); i++){
	System.out.println(ll.get(i));
}

System.out.println("==linked list iterator in while  loop");
int i =0; 
	while(i<ll.size()){
		System.out.println(ll.get(i));
		i++;
	}
	
	System.out.println("====testing iterator");
	ArrayList<Integer>al= new ArrayList<>();
	al.add(2);al.add(3);al.add(4);al.add(2);	
	
	for (Iterator<Integer>iter = al.iterator();iter.hasNext();){
		System.out.println(iter.next());
	}
	
	
		Iterator<Integer>iter = al.iterator();
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
}
}
 