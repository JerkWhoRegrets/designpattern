package decorater;

public class UrineDecorator extends StringWriterDecorator {
    public UrineDecorator(StringWriter stringWriter) {
        super(stringWriter);
    }

    @Override
    public void write(String str) {
        System.out.println("urine");
        super.write(str);
        System.out.println("urine");
    }
}
