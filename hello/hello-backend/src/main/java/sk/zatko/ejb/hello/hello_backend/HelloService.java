package sk.zatko.ejb.hello.hello_backend;

import javax.ejb.Remote;

@Remote
public interface HelloService {

	public String sayHello(String name);
}
