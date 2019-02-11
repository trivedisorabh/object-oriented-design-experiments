package processes;

// Don't Ask Just Tell
public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();


    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    // Template Design Pattern
    public void launchProcess() {
        if (null != processName && processName.length() > 1) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }
        else {
            System.out.println("Invalid process name");
        }
    }
}
