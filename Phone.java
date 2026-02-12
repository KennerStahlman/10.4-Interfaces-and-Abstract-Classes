public class Phone implements Electronic {
    private boolean on;
    private int processorCores;

    public Phone(int processorCores) {
        this.on = false;
        this.processorCores = processorCores;
    }

    @Override
    public void turnOn() {
        this.on = true;
        System.out.println("Phone is now ON.");
    }

    @Override
    public void turnOff() {
        this.on = false;
        System.out.println("Phone is now OFF.");
    }

    @Override
    public int getProcessorCores() {
        return processorCores;
    }

    public boolean isOn() {
        return on;
    }
}
