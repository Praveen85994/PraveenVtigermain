package practice;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Fetchdatafrmcsv {
	public static void main(String[]args) throws Throwable {
		String cell[];
		try {
			//to read the data from csv file
			
			FileReader fr=new FileReader("./src/test/resources/data.csv");
			CSVReader reader=new CSVReader(fr);
			
			//navigate to each celldata
			while((cell=reader.readNext())!=null) {
				String keyword=cell[0];
				String keyword1=cell[1];
				System.out.println(keyword);
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
