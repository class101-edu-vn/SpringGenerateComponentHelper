package vn.edu.class101;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import vn.edu.class101.process.ModelProcessor;

public class RunApplication {

	private static String PACKAGE_DOMAIN = "F:\\GenerateComponentSpring\\GenerateComponentSpring\\source_model";
	private static String PACKAGE_JPA = "";
	private static String PACKAGE_SERVICE = "";
	private static String PACKAGE_SERVICE_IMPLEMENT = "";
	private static String PACKAGE_DTO;
	private static String PACKAGE_MAPPER;
	
	public static List<File> filesInFolder;
	public static List<String> fileNamesInFolder;
	
	
	public static void main(String[] args) {
		try {
			ModelProcessor modelProcessor = new ModelProcessor();
			modelProcessor.doProcess(PACKAGE_DOMAIN);
			
			System.out.println("End");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
}
