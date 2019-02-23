package practiceTestNG;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.utility.ExcelUtil;

public class Nothing {
	
	@Test
	public void nothingNew(){
		
		
		
		
		
/*		String path = "E:\\Work\\mavenProjectFive\\Random.xlsx";
		//ExcelUtil.excelReader("E:\\Business\\B.orders\\shipping infor\\TT Details.xlsx", "Sheet1", 47, 2);
		System.out.println("printing excell value");
		//ExcelUtil exObj = new ExcelUtil();  
		System.out.println(ExcelUtil.excelReaderString("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, 6, 0));
		System.out.println(ExcelUtil.excelReaderIntiger("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, 2, 0));
		System.out.println(ExcelUtil.excelReaderDouble("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, 2, 0));
		ExcelUtil.excelWriteString("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, 2, 4, "anowar");
		System.out.println(ExcelUtil.excelReaderString("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, 2, 2));
		int rowcnt = ExcelUtil.getRowCount(path, 0);
		System.out.println("rowcnt "+rowcnt);
		for (int i =0; i<=rowcnt; i++){			
			System.out.println(ExcelUtil.excelReaderString("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, i, 0));
			ExcelUtil.excelWriteString("E:\\Work\\mavenProjectFive\\Random.xlsx", 0, i, 5, "Pass");
		}*/
		


		//String a = exObj.excelReader("E:\\Work\\mavenProjectFive\\TestData.xlsx", 0, 1, 1);
		//System.out.println(a);
		
		ArrayList<Object[]> ss = ExcelUtil.getDataFromExcel();
		
		
		for (Object[] s : ss) {/*	
			
			for(int i = 0; i<s.length; i++){					
				System.out.println(s[i]  );
			}	
		
		*/}
		
		
	}

}
