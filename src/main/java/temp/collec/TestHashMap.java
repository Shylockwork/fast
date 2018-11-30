package temp.collec;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<A,String> hashMap = new HashMap<A,String>();
        A a1 = new A();
        A a2 = new A();
        a1.setCode("No:");
        a1.setName("shylock");
        a2.setCode("No:");
        a2.setName("shylock");

        System.out.println(hashMap.put(a1,"18"));

        System.out.println(hashMap.put(a2,"18"));

//        System.out.println(hashMap.put(a1,"20"));
//
        for(Map.Entry entry : hashMap.entrySet())
        System.out.println(hashMap.entrySet());


    }

}
class A{
     String code;
    private String name;
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return code.hashCode()+name.hashCode();
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return code.toString()+name.toString();
    }

}
