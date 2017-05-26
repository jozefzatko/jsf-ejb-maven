package sk.zatko.ejb.hello.hello_backend;

import javax.ejb.Stateful;

@Stateful
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

}
