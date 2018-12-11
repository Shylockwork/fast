package webservice.ws.impl;

import webservice.ws.inter.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+"welcome to webservice";
    }
}
