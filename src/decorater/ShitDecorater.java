package decorater;

public class ShitDecorater extends StringWriterDecorator{
    public ShitDecorater(StringWriter stringWriter) {
        super(stringWriter);
    }

    @Override
    public void write(String str) {
        System.out.println("shit");
        super.write(str);
        System.out.println("shit");
    }
}
