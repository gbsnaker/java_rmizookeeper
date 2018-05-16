package demo.zookeeper.rmi.common;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class getHostAddresses {


    public static String getHostAddresses() {

        Set<String> HostAddresses = new HashSet<>();
        try {
            for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!ni.isLoopback() && ni.isUp() && ni.getHardwareAddress() != null) {
                    for (InterfaceAddress ia : ni.getInterfaceAddresses()) {
                        if (ia.getBroadcast() != null) {  //If limited to IPV4
                            HostAddresses.add(ia.getAddress().getHostAddress());
                        }
                    }
                }
            }
        } catch (SocketException e) {

        }
        Pattern p = Pattern.compile("192.168.99.*");
//        Pattern p = Pattern.compile("172.20.*");
        String Hoststr = "";
        String[] HostList = HostAddresses.toArray(new String[0]);
        for (int i = 0; i <= HostList.length - 1; i++) {
            Matcher m = p.matcher(HostList[i]);
            boolean isTrue = m.matches();
            if (isTrue) {
                Hoststr = HostList[i];
            } else {
                Hoststr = "";
            }
        }
//        return HostAddresses.toArray(new String[0]);
        return Hoststr;
    }
}