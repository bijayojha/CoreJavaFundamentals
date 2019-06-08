package designpatterns.factory;

public class App {

	public static void main(String[] args) {
		BatchProcessor batchProcessor = createBatchProcessor(args[1]);
		batchProcessor.processBatch(args[0]);
	}

	private static BatchProcessor createBatchProcessor(String arg) {
		if (arg.equals("text"))	return new TextBatchProcessor();
		//if (arg.equals("CSV"))  return new csvBatchProcessor();
		return null;
	}

}