package vn.edu.class101.process;

import com.github.javaparser.ast.AccessSpecifier;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

public class GenerateDTO implements IProcessor{

	
	public void doProcessor(String packageDTO) {
		CompilationUnit compilationUnit = new CompilationUnit();
		ClassOrInterfaceDeclaration myClass = compilationUnit
		        .addClass("MyClass")
		        .setPublic(true);
		myClass.addField(int.class, "A_CONSTANT", AccessSpecifier.PUBLIC, AccessSpecifier.STATIC);
		myClass.addField(String.class, "name", AccessSpecifier.PRIVATE);
		String code = myClass.toString();
	}
}
