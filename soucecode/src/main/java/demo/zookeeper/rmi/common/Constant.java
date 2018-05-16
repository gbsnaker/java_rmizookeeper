package demo.zookeeper.rmi.common;


public interface Constant {
//    String[] Host = getHostAddresses1.getHostAddresses();
    String Host = getHostAddresses.getHostAddresses();
	String ZK_CONNECTION_STRING = "192.168.0.176:2181";
	int ZK_SESSION_TIMEOUT = 5000;
	String ZK_REGISTRY_PATH = "/registry";
	String ZK_PROVIDER_PATH = ZK_REGISTRY_PATH + "/provider";
}
