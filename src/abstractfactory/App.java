package abstractfactory;

public class App {
    public static void main(String[] args) {
        String fileName = null;
        try {
            fileName = args[1];
        }catch (Exception e){
            System.exit(1);
        }

        BatchProcessor batchProcessor = new BatchProcessor();
        batchProcessor.processBatch(fileName,ParserType.JSON_PARSER);

        //new text type, have to modify BatchProcessor
    }
}
