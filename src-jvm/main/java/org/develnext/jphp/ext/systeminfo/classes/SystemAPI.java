package org.develnext.jphp.ext.systeminfo.classes;

import org.develnext.jphp.ext.systeminfo.SystemAPIExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.GraphicsCard;
import oshi.hardware.NetworkIF;
import oshi.hardware.UsbDevice;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OSProcess;
import java.util.Comparator;
import java.util.List;

@Reflection.Namespace(SystemAPIExtension.NS)
public class SystemAPI extends BaseObject {
    private static final SystemInfo systemInfo = new SystemInfo();
    private static final HardwareAbstractionLayer hal = systemInfo.getHardware();
    private static final OperatingSystem os = systemInfo.getOperatingSystem();

    public SystemAPI(Environment env) {
        super(env);
    }

    protected SystemAPI(ClassEntity entity) {
        super(entity);
    }

    public SystemAPI(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public static String getProcessorName() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getProcessorIdentifier().getName();
    }

    @Signature
    public static int getPhysicalProcessorCount() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getPhysicalProcessorCount();
    }

    @Signature
    public static int getLogicalProcessorCount() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getLogicalProcessorCount();
    }

    @Signature
    public static long getTotalMemory() {
        return hal.getMemory().getTotal();
    }

    @Signature
    public static long getAvailableMemory() {
        return hal.getMemory().getAvailable();
    }

    @Signature
    public static String getGraphicsCardName() {
        List<GraphicsCard> graphicsCards = hal.getGraphicsCards();
        if (!graphicsCards.isEmpty()) {
            return graphicsCards.get(0).getName();
        }
        return "No graphics card found";
    }

    @Signature
    public static String getNetworkInterfaces() {
        StringBuilder sb = new StringBuilder();
        List<NetworkIF> networkIFs = hal.getNetworkIFs();
        for (NetworkIF net : networkIFs) {
            sb.append(net.getName()).append("\n");
        }
        return sb.toString();
    }

    @Signature
    public static String getUsbDevices() {
        StringBuilder sb = new StringBuilder();
        List<UsbDevice> usbDevices = hal.getUsbDevices(true);
        for (UsbDevice device : usbDevices) {
            sb.append(device.getName()).append("\n");
        }
        return sb.toString();
    }



    @Signature
    public static String getRunningProcesses() {
        StringBuilder sb = new StringBuilder();
        List<OSProcess> processes = os.getProcesses();
        processes.sort(Comparator.comparing(OSProcess::getName));
        for (OSProcess process : processes) {
            sb.append(process.getProcessID()).append(" - ").append(process.getName()).append("\n");
        }
        return sb.toString();
    }


    @Signature
    public static double getProcessorBaseFrequency() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getProcessorIdentifier().getVendorFreq() / 1_000_000_000.0;
    }

    @Signature
    public static double getProcessorMaxFrequency() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getMaxFreq() / 1_000_000_000.0;
    }

    @Signature
    public static String getProcessorVendor() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getProcessorIdentifier().getVendor();
    }

    @Signature
    public static String getProcessorIdentifier() {
        CentralProcessor processor = hal.getProcessor();
        return processor.getProcessorIdentifier().getIdentifier();
    }

}
