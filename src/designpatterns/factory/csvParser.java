package designpatterns.factory;

import java.io.File;
import java.util.List;

public class csvParser implements Parser {
	public csvParser() {
	}

	public csvParser(File file) {
		System.out.println("Creating csv Parser..");
	}

	public List<Record> parse() {
		System.out.println("Parsing csv and creating record list..");
		return null;
	}
}