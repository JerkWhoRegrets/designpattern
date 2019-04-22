package factorymethod.third;

public class JsonBatchProcessor extends BatchProcessor{
    @Override
    protected Parser getParser() {
        return new JsonParser();
    }
}
