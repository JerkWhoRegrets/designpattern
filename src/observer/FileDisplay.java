package observer;

public class FileDisplay implements Display {
    @Override
    public void display(double humidity, double temperature) {
        String weatherInfo = String.format("Temperature is %f,humidity is %f",temperature,humidity);
        write2File("",weatherInfo);
    }

    private void write2File(String filePath,String content){
        System.out.print("Writing to file: ");
        System.out.println(content);
        //TODO
    }
}
