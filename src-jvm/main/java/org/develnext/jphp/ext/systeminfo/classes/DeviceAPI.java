package org.develnext.jphp.ext.systeminfo.classes;

import org.develnext.jphp.ext.systeminfo.SystemAPIExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.software.os.OperatingSystem;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;

@Reflection.Namespace(SystemAPIExtension.NS)
public class DeviceAPI extends BaseObject {
    private static final SystemInfo systemInfo = new SystemInfo();
    private static final HardwareAbstractionLayer hal = systemInfo.getHardware();
    private static final OperatingSystem os = systemInfo.getOperatingSystem();

    public DeviceAPI(Environment env) {
        super(env);
    }

    protected DeviceAPI(ClassEntity entity) {
        super(entity);
    }

    public DeviceAPI(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public static String getDeviceName() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        return addr.getHostName();
    }

    @Signature
    public static String getOsName() {
        return System.getProperty("os.name");
    }

    @Signature
    public static String getOsVersion() {
        return os.getVersionInfo().getVersion();
    }

    @Signature
    public static String getUserName() {
        return System.getProperty("user.name");
    }

    @Signature
    public static String getMacAddress() throws SocketException, UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(addr);
        byte[] mac = ni.getHardwareAddress();
        if (mac != null) {
            StringBuilder sb = new StringBuilder();
            for (byte b : mac) {
                sb.append(String.format("%02X:", b));
            }
            return sb.toString().substring(0, sb.length() - 1);
        } else {
            return "Unknown";
        }
    }

    @Signature
    public static String getIpAddress() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        return addr.getHostAddress();
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
    public static long getUptime() {
        return os.getSystemUptime();
    }

    @Signature
    public static String getArchitecture() {
        return System.getProperty("os.arch");
    }
}
