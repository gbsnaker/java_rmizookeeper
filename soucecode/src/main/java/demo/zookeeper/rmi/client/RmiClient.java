package demo.zookeeper.rmi.client;

import java.rmi.Naming;

import demo.zookeeper.rmi.common.IHelloService;

public class RmiClient {
	public static void main(String[] args) throws Exception {
        String url = "rmi://localhost:1099/demo.zookeeper.rmi.server.HelloServiceImpl";
        IHelloService helloService = (IHelloService) Naming.lookup(url);
        while (true) {
            String result = helloService.sayHello("Jack");
            System.out.println(result);
            Thread.sleep(4000);
        }
    }
}
