package demo.zookeeper.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import demo.zookeeper.rmi.common.Constant;
public class RmiServer {
	public static void main(String[] args) throws Exception {

		int port = 1099;
		String url = "rmi://192.168.99.5:1099/demo.zookeeper.rmi.server.HelloServiceImpl";
		// JNDI 中创建注册表
		LocateRegistry.createRegistry(port);
		// unbind() 与 bind()
		Naming.rebind(url, new HelloServiceImpl());
	}
}