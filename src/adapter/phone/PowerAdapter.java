package adapter.phone;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(final AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC22V();
        int adapterOutput = adapterInput / 44;
        System.out.println(String.format("input %d,output %d", adapterInput, adapterOutput));
        return adapterOutput;
    }
}
