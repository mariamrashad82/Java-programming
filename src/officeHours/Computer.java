package officeHours;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Computer {
    public static void main(String[] args) {
        String brand = "APPLE MacBook Air";
        String Processor = "1.8 GHZ";
        int ramMemory = 8;
        short storageMemory = 256;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        double price = 1350.0;
        String color = "gold";
        byte NumberOfMonitors = 2;
        byte usbSlot = 2;
        String description = "The MacBook Air is ideal for business owner and employees";
        System.out.println("Brand:\t\t\t\t\t\t\t\t" + brand);
        System.out.println("Processor:\t\t\t\t\t\t\t"+Processor+ "GHZ" );
        System.out.println("RamMemory:\t\t\t\t\t\t\t" + ramMemory+ "GB" );
        System.out.println("storageMemory:\t\t\t\t\t\t" + storageMemory +"GB" );
        System.out.println("is MacBook has Monitor:\t\t\t\t"+ hasMonitor );
        System.out.println("is MacBook has Wifi card:\t\t\t"+ hasWifiCard);
        System.out.println( "price:\t\t\t\t\t\t\t\t" + "$"+ price );
        System.out.println("Color:\t\t\t\t\t\t\t\t" + color);
        System.out.println("The Number Of Monitors:\t\t\t\t" +NumberOfMonitors );
        System.out.println("usb Slot:\t\t\t\t\t\t\t" + usbSlot);
        System.out.println(" Description:\t\t\t\t\t\t" +description );



    }
}
