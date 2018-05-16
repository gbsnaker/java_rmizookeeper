package demo.zookeeper.rmi.client;

import demo.zookeeper.rmi.common.Constant;
import demo.zookeeper.rmi.common.IHelloService;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();
        IHelloService helloService = consumer.lookup();

        while (true) {
            String result = helloService.sayHello("Jack");
            System.out.println(result);
//            System.out.println(Arrays.toString(Constant.Host));
            System.out.println(Constant.Host);
            Thread.sleep(3000);
        }
    }
}