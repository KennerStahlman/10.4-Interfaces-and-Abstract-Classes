public class Desktop extends Computer{
    public Desktop(String n){
        super(n);
    }

    @Override
    public int getProcessorCores() {
        return 8;
    }

    @Override
    public void runDoom() {
        System.out.println(name + " is running Doom!");
    }
}