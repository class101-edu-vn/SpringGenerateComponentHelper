package vn.edu.class101.process;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import vn.edu.class101.RunApplication;

public class ModelProcessor {

	public void doProcess(String packageDomain) throws IOException {
		RunApplication.filesInFolder = Files.walk(Paths.get(packageDomain)).filter(Files::isRegularFile)
				.map(Path::toFile).collect(Collectors.toList());
		RunApplication.fileNamesInFolder = RunApplication.filesInFolder.stream().map(File::getName).collect(Collectors.toList());
	}
}
