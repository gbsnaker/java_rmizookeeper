package demo.zookeeper.rmi.server;

import demo.zookeeper.rmi.common.Constant;
import demo.zookeeper.rmi.common.IHelloService;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("please using command: java Server <rmi_host> <rmi_port>");
			System.exit(-1);
		}

		System.out.println(Constant.Host);

//		String host = args[0];
		String host = Constant.Host;
		int port = Integer.parseInt(args[0]);

		ServiceProvider provider = new ServiceProvider();

		IHelloService helloService = new HelloServiceImpl();
		provider.publish(helloService, host, port);

		System.out.println("start");

		Thread.sleep(Long.MAX_VALUE);
	}
}
