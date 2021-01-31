import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ConsoleTextEditor {
	
	private static final String EXIT = "exit";
	private File fileToWrite;
	
	
	public void setFileToWrite(File fileToWrite) {
		this.fileToWrite = fileToWrite;
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			String inputText = sc.nextLine();
			if(inputText.equalsIgnoreCase(EXIT)) {
				saveTextToFile(sb);
				return;	
			}
			sc.close();
			sb.append(inputText).append(System.lineSeparator());
		}
	}
	private void saveTextToFile(StringBuilder sb) {
		// TODO Auto-generated method stub
		try {
			Files.write(fileToWrite.toPath(), sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
