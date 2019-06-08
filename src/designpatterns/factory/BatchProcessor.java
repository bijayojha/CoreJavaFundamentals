package designpatterns.factory;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	public final void processBatch(String fileName) {

		File file = OpenFile(fileName);
		Parser parser = createParser(file); // Factory Method
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}

	private void processRecords(List<Record> records) {
		System.out.println("processing each records...");

	}

	private void closeFile(File file) {

		System.out.println("closed file");

	}

	private void writeSummary() {

		System.out.println("Wrote batch summary - 0 - failed");

	}

	public abstract Parser createParser(File file);

	private File OpenFile(String fileName) {

		System.out.println("Opened.. file..");
		return null;
	}

}