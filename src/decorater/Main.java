package decorater;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriterDecorator(new ShitDecorater(new UrineDecorator(new SimpleStringWriter())));
        writer.write("hello");
    }
}
