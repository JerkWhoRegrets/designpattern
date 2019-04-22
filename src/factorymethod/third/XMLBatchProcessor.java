package factorymethod.third;

public class XMLBatchProcessor extends BatchProcessor{
    @Override
    protected Parser getParser() {
        return new XMLParser();
    }
}
