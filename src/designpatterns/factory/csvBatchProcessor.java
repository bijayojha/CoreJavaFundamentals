package designpatterns.factory;

import java.io.File;

public class csvBatchProcessor extends BatchProcessor {
	@Override
	public Parser createParser(File file) {

		return new csvParser(file);
	}
}