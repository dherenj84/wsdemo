package com.demo.wsdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.wsdemo.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}

}
