package SOLID;

public class DIP_01 {
    
    // an interface for switchable devices
    public interface SwitchableDevice {
        void turnOn();
        void turnOff();
    }

    // LightBulb
    public static class LightBulb implements SwitchableDevice {
        @Override
        public void turnOn() {
            System.out.println("Light is ON!");
        }

        @Override
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    // Switch now depends on the abstraction, not a specific class
    public static class Switch {
        private SwitchableDevice device;

         // DIP applied: inject interface, not concrete class
        public Switch(SwitchableDevice device) {
            this.device = device;
        }

        public void turnOnDevice() {
            device.turnOn();
        }

        public void turnOffDevice() {
            device.turnOff();
        }
    }

    // Main method
    public static void main(String[] args) {
        SwitchableDevice bulb = new LightBulb();
        Switch bulbSwitch = new Switch(bulb);
        bulbSwitch.turnOnDevice();
        System.out.println("-------");
        bulbSwitch.turnOffDevice();

    }
}
