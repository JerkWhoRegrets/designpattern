package decorater;

public class SimpleStringWriter implements StringWriter {
    @Override
    public void write(String str) {
        System.out.println(str);
    }
}
