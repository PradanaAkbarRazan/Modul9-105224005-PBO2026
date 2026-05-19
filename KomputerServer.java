public class KomputerServer {
    private Harddisk harddisk;
    private Monitor[] 
    kumpulanMonitor;

    // Constructor
    public KomputerServer(String kapasitasHD, Monitor[] monitorInput) {
        
    
        this.harddisk = new Harddisk(kapasitasHD);

        this.kumpulanMonitor = monitorInput;
    }
}

