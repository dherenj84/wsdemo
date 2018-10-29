package com.demo.wsdemo;

import javax.jws.WebService;

@WebService
public interface HelloWorldService {

	public String greet(String name);
}
