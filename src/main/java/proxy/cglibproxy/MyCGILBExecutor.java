package proxy.cglibproxy;




public class MyCGILBExecutor {
    public static void main(String[] args) {
        //先准备目标对象
        UserInterfaceImpl uii = new UserInterfaceImpl();
        //创建第一个代理对象
        PersonCGLIB pc = new PersonCGLIB();
        //设置
        pc.setTargetObj(uii);
        //创建第二个代理对象
        UserInterfaceImpl uii2 = (UserInterfaceImpl) pc.createProxy();
        uii2.save();

    }
}
