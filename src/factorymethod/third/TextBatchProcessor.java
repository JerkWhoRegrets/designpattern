package factorymethod.third;

public class TextBatchProcessor extends BatchProcessor {
    @Override
    protected Parser getParser() {
        return new TextParser();
    }
}
