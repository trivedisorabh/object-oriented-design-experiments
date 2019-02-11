package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled laptop");
    }
    
    @Override
    protected void testDevice() {
        System.out.println("Tested laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored laptop");
    }

}
