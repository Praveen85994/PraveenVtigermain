package practice;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.FileUtility;

public class Genericutilitypractice {
	public static void main(String[] args) throws Throwable {
		//to import the data from one package to another package we have to create object
		FileUtility futil=new FileUtility();
		String URL=futil.getDataFromProperty("url");
		System.out.println(URL);
		String Username=futil.getDataFromProperty("username");
		System.out.println(Username);
		String Pass=futil.getDataFromProperty("password");
		System.out.println(Pass);
		
		
		
		ExcelUtility eutil=new ExcelUtility();
		String orgname=eutil.getTheDataIntoExcel("Sheet1", 0, 0);
		System.out.println(orgname);
		
		//we have to give key it will give value
		
		
		//in exploratory ===feature as defect and defect as a feature*/
		//dis of agile==Sdlc 
		//synchronisation ==what is ,why happen ,how we can handle ==java wait,selenium wait,more than 5 min
		//in that case i pass the value in url
		//chromeoptions is a class in webdriver ==desiredcapability
		//try new app and find locator
		//company name
		/*year ,skills,tools you familiar,strrength,achievement in my journey i awarded two times,*/
		
	}

}
