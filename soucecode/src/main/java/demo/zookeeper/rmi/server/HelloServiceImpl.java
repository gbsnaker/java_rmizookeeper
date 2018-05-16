package demo.zookeeper.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import demo.zookeeper.rmi.common.IHelloService;

public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {
	// 远程接口的类必须继承 UnicastRemoteObject
	protected HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return String.format("Hello %s", name);
    }
}
