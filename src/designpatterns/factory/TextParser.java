package designpatterns.factory;

import java.io.File;
import java.util.List;

public class TextParser implements Parser {
	public TextParser() {
	}

	public TextParser(File file) {
		System.out.println("Creating Text Parser..");
	}

	public List<Record> parse() {
		System.out.println("Parsing Text and creating record list..");
		return null;
	}

}
