package decorater;

public class StringWriterDecorator implements StringWriter{
    private StringWriter stringWriter;
    protected String a;

    public StringWriterDecorator(final StringWriter stringWriter) {
        this.stringWriter = stringWriter;
    }

    @Override
    public void write(String str) {
        stringWriter.write(str);
    }
}
