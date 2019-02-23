package practiceTestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArraysLearningExecution {
	
	@Test
	public void testarrays(){
		ArraysLearning ob = new ArraysLearning();	
		
		System.out.println(ob.ab);
		System.out.println(ob.ac);
		ob.ad[0]='a';
		ob.ad[1]='d';
		ob.ad[2]='d';	
		System.out.println(ob.ad);
		System.out.println("ob.ad "+ob.ad[0]);
		System.out.println("ob.ad "+ob.ad[1]);
		System.out.println("ob.ad "+ob.ad[2]);
		System.out.println("---arrayList-----");
		ob.ae.add('h');
		ob.ae.add('h');
		ob.ae.add('i');
		ob.ae.add('j');
		ob.ae.add('j');
		System.out.println(ob.ae);
		System.out.println("ob.ae 2:-  "+ob.ae.get(2));
		System.out.println("---Set Aarrays -----");
		ob.af.add('h');
		ob.af.add('h');
		ob.af.add('i');
		ob.af.add('j');
		ob.af.add('j');
		System.out.println(ob.af);
	List<Character>af2=new ArrayList<>(ob.af);
		System.out.println(af2.get(2));		
		System.out.println("----ob.ag: ----");
		System.out.println(ob.ag[2][2]);
		System.out.println("----ob.ah: ----");
		ob.ah[0][0]='x';
		ob.ah[0][1]='y';
		ob.ah[2][2]='z';
		System.out.println(ob.ah[0][1]);
		System.out.println("----ob.ai: ----");
		ob.ai.put('l', 1);
		ob.ai.put('m', 1);
		ob.ai.put('n', 1);
		ob.ai.put('m', 2);
		System.out.println(ob.ai);
		System.out.println(ob.ai.get('m'));
		System.out.println("----ob.aj: ----");
		System.out.println(ob.bigTable());
		
		System.out.println("----object array 1: ----");
		
		for (int i = 0; i<ob.ak.length; i++){			
				System.out.println(ob.ak[i]);			
		}
		
		
		System.out.println("----object array 2: ----");
		Object[][] newData = ob.objectData();
		for (int i = 0; i<newData.length; i++){
			for(int j=0; j<newData[i].length; j++){
				System.out.println(newData[i][j]);
			}
		}
		System.out.println("=========Object Practice===========");
		Object []data[]= new Object[4][4];									//13
		data[0][0]= 100;
		data[1][0]= 'a';
		data[2][0]= "Anowar";
		data[3][0]= 100.23;
		for(int i=0; i<data.length; i++){
		System.out.println(data[i][0]);
		}		
		System.out.println("=========Object Practice===========");
		
		System.out.println("=====14. Make a one column variable with unknown size and Store char, int, double, and String value in the same variable====");
		ArrayList ar = new ArrayList<>();
		ar.add("Anowar");
		ar.add(100);
		ar.add(200.65); //2
		ar.add('f');
		ar.add("Anowar");
		ar.add(100);				
		ar.add(200.65);	//6
		ar.add('f');		
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.get(6));
		System.out.println(ar.size());
		
		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(100);
		
		System.out.println("=====15.1 Hashteble test all together");
		System.out.println(ob.hasTableTest1());
		System.out.println("=====15.2 Hashteble test seperating with boundary");
		System.out.println(ob.hasTableTest2());
		
		System.out.println("=====16.1  HashMap");
		System.out.println(ob.hashMaptest1());
		System.out.println("=====16.2  HashMap");
		System.out.println(ob.hashMaptest2());
		
		System.out.println("=====16.3  Map");
		System.out.println(ob.hashMaptest3());
		
		
		System.out.println("=====List chceck");
		System.out.println(ob.listcheck());
		
		System.out.println("===== hashSet1");
		System.out.println(ob.hashSet1());
		
		System.out.println("===== hashSet2");
		System.out.println(ob.hashSet2());
		
		System.out.println("===== hashSet3");
		System.out.println(ob.hashSet3());
	}


}
