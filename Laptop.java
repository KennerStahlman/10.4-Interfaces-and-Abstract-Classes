public class Laptop extends Computer{
    public Laptop(String n){
        super(n);
    }

    @Override
    public int getProcessorCores() {
        return 4;
    }

    @Override
    public void runDoom() {
        System.out.println(name + " is running Doom!");
    }
}