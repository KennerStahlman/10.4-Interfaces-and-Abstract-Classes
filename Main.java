public class Main {
    public static void main(String[] args) {

        Desktop homeDesktop = new Desktop("Home Desktop");
        Laptop schoolLaptop = new Laptop("School Laptop");

        Phone smartphone = new Phone(6);

        homeDesktop.turnOn();
        homeDesktop.runDoom();
        System.out.println(homeDesktop.name + " cores: " + homeDesktop.getProcessorCores());

        schoolLaptop.turnOn();
        schoolLaptop.runDoom();
        System.out.println(schoolLaptop.name + " cores: " + schoolLaptop.getProcessorCores());

        smartphone.turnOn();
        System.out.println("Phone cores: " + smartphone.getProcessorCores());
        smartphone.turnOff();

        Electronic[] devices = { homeDesktop, schoolLaptop, smartphone };
        for (Electronic device : devices) {
            device.turnOn();
            System.out.println("Device has " + device.getProcessorCores() + " cores.");
            device.turnOff();
        }
    }
}
