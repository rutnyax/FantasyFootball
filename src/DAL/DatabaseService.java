package DAL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseService {

    private List<String> data = new ArrayList<String>();
    private File aFile;
    private Scanner aScanner;
    private String filename;

	////////////////////Constructor\\\\\\\\\\\\\\\\\\\\
	
    public DatabaseService(String filename) {
        this.filename =  filename;
        openFile(filename);       
        readFile();
    }                      
	
	////////////////////Core Methods\\\\\\\\\\\\\\\\\\\\
	
	private void openFile(String filename) {
        
		try {
            aFile = new File(filename);
            aScanner = new Scanner(aFile);
        } 
		catch(FileNotFoundException e) {
            System.out.println("Exception: " + e + "\n Exiting program.");
            System.exit(0);
        }	
    }
	
	private void readFile() {
		
        try {
            while (aScanner.hasNext()) {
                data.add(aScanner.next());
            }
        } 
		catch (NullPointerException e) {
			System.out.println("Exception: " + e + "\n Exiting program.");
            System.exit(0);
        }
    }
	
	////////////////////Public Methods\\\\\\\\\\\\\\\\\\\\
	
	public List<String> getData() {					//Returns data in file in a String List
        return data;      
    }
	
	public void deleteData(int id) {				//Deletes row beginning with ID passed
        deleteFileRow(id);
    }		
	
	public void changeData(String changedRow) { 	//Changes row with corresponding ID
		changeFileRow(changedRow);    
    }                 
	
	public void addData(String info) {				//Adds a new row to the text file
        data.add(info);
        writeData(data);
    }
	
	public String[] getRowData(int id) {			//Returns row beginning with ID passed
		String[] fetchedRow;
		fetchedRow = fetchFileRow(id);
		return fetchedRow;
	}
	
/*	public boolean checkData(String UserID){		//This method may/may-not be used
													//Check for injuries (STATE)???
	List<String> cus = getData();
    for (int i = 0; i < cus.size(); i++) {
        String[] detail = cus.get(i).split(",");
        if (Integer.parseInt(detail[0]) == Integer.parseInt(UserID)) {
            return true;
        }
    }
    return false;
}

	////////////////////METHODS TO BE DELETED BUT CURRENTLY IN USE BY OTHERS\\\\\\\\\\\\\\\\\\\\

/*	public String[] readFileRow(int id) {
		
        String[] rowElements;
        boolean complete = false;
        for(int i = 0; i < data.size() && complete == false; i++) {
            rowElements = data.get(i).split(",");
            try {
                if (Integer.parseInt(rowElements[0]) == id) {
                    return rowElements;
                }
            } catch (NumberFormatException e) {
            	System.out.println("Exception: " + e + "\n Exiting program.");
				System.exit(0);
			}
        }

        return null;
    }
*/	
/*	private void updateFileRow(String[] newRow) {
        
		String newLine = "";
        String[] rowElements;
        for(int i = 0; i < data.size(); i++) {
            rowElements = data.get(i).split(",");
            if(Integer.parseInt(rowElements[0]) == Integer.parseInt(newRow[0])) {
                for (int j = 0; j < newRow.length; j++) 
				{
                    newLine += newRow[j];
                    if (j != (newRow.length - 1)) {
                        newLine += ",";
                    }
                }
                data.add(newLine);
                data.remove(i);
                newLine = "";
            }
        }
    }
*/		
	////////////////////Private Methods\\\\\\\\\\\\\\\\\\\\
	
	public void writeData(List<String> newData) {

		try {
				FileWriter aFileWriter = new FileWriter(filename);
				for (int i = 0; i < newData.size(); i++) {
					aFileWriter.write(newData.get(i) + "\n");
				}
				aFileWriter.close();
		} 
		catch (IOException e) {
			System.out.println("Exception: " + e + "\n Exiting program.");
			System.exit(0);
		}
	}

	private void deleteFileRow(int id) {

		String[] rowElements;
		boolean complete = false;
		for(int i = 0; i < data.size() && complete == false; i++) {
			rowElements = data.get(i).split(",");
			if(Integer.parseInt(rowElements[0]) == id) 
			{
				data.remove(i);
				writeData(data);
				complete = true;
			}
		}
	}
	
	private void changeFileRow(String changedRow) {
        
		List<String> fileData = getData();

        for (int i = 0; i < fileData.size(); i++) 
		{
            String[] detail = fileData.get(i).split(",");
            if (Integer.parseInt(detail[0]) == Integer.parseInt(changedRow.substring(0, changedRow.indexOf(",")))) {
                fileData.set(i, changedRow);
                break;
            }
        }
        writeData(fileData);
    }
	
	private String[] fetchFileRow(int id) {
		
		String rowElements[];
        boolean complete = false;
        for(int i = 0; i < data.size() && complete == false; i++) {
            rowElements = data.get(i).split(",");
			if (Integer.parseInt(rowElements[0]) == id) {
				complete = true;
				return rowElements;
			}
		}
        return null;
	}
}