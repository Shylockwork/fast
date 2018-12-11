package proxy.jdkproxy;

public class MyExecutor {

    public static void main(String[] args) {
            UserService   userService = new UserServiceImpl();
            MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
            ((UserService) invocationHandler.bind()).add(5,5);



    }
}
