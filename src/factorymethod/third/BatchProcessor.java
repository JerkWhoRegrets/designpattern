package factorymethod.third;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
    public final void processBatch(String fileName) {
        File file = openFile(fileName);
        Parser parser = getParser();
        if(parser == null){
            throw new RuntimeException("not supported!");
        }
        List<Record> records =  parser.parse(file);
        processRecords(records);
        writeSummary();
        closeFile(file);

    }

    private void closeFile(File file) {
        System.out.println("Closing file.");
    }

    private void writeSummary() {
        System.out.println("Writing batch summary - 0 failed.");
    }

    private void processRecords(List<Record> records) {
        for (Record record : records){
            System.out.println("Processing record..");
        }
    }

    protected abstract Parser getParser();

    private File openFile(String fileName) {
        System.out.println("Opened file .. " + fileName);
        return null;
    }
}
