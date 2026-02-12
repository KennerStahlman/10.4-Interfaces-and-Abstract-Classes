public abstract class Computer implements Electronic{
    protected String name;
    protected Boolean on;

    public Computer(String n){
        this.name = n;
        this.on = false;
    }

    @Override
    public void turnOn(){
        this.on = true;
    }

    @Override
    public void turnOff(){
        this.on = false;
    }

    public abstract void runDoom();

}