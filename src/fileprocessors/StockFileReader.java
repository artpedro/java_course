package fileprocessors;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath;
	
	public StockFileReader(String filePath){
		this.filePath = filePath;
	}
	
	public List<String> getHeaders() throws IOException{
		String line = readFirstLine(filePath);
		String [] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}
	
	static String readFirstLine(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}

	public List<String> readFileData() throws IOException{
		List<String> lines = new ArrayList<String>();
		File csv = new File("table.csv");
		try(FileReader fileReader = new FileReader(csv);
		    BufferedReader reader = new BufferedReader(fileReader);) {
			reader.readLine();
			String line = reader.readLine();
			while (line != null) {
				lines.add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Couldn't read csv");
		}
	    return lines;
	}
	

}
