package demo.zookeeper.rmi.common;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class getHostAddresses1 {


    public static String[] getHostAddresses() {


        //    Matcher m = p.matcher(inputstring);
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

        return HostAddresses.toArray(new String[0]);
    }
}