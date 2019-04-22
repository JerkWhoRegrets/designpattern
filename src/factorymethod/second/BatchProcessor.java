package factorymethod.second;

import java.io.File;
import java.util.List;

public class BatchProcessor {
    public void processBatch(String fileName, ParserType parserType) {
        File file = openFile(fileName);
        Parser parser = getParser(parserType);
        if(parser == null){
            throw new RuntimeException(parserType.name() + "is not supported");
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

    private Parser getParser(ParserType parserType) {
        Parser parser = null;
        switch (parserType) {
            case XML_PARSER:
                parser = new XMLParser();
                break;
            case JSON_PARSER:
                parser = new JsonParser();
                break;
            case TEXT_PARSER:
                parser = new TextParser();
                break;
            default:
                parser = null;
                break;

        }
        return parser;
    }

    private File openFile(String fileName) {
        System.out.println("Opened file .. " + fileName);
        return null;
    }
}
