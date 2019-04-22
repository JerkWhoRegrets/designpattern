package adapter.phone;

public class Main {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.output5V();
    }
}
