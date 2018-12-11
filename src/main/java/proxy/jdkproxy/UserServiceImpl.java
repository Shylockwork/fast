package proxy.jdkproxy;

public class UserServiceImpl implements UserService {
    @Override
    public void add(Integer num1,Integer num2) {
        System.out.println("----------------add--------------");
        System.out.println(num1+num2);
    }
}
