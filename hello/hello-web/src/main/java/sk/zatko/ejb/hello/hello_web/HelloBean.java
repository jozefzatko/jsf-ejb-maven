package sk.zatko.ejb.hello.hello_web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sk.zatko.ejb.hello.hello_backend.HelloService;

@ManagedBean(name = "helloBean")
@SessionScoped
public class HelloBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7155232757585953527L;

	@EJB
	HelloService helloService;

	private String name;
	
	public String getMessage() {
		
		return helloService.sayHello(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
