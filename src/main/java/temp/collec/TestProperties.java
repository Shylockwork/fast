package temp.collec;



import java.io.IOException;
import java.util.Properties;

/**
 * @author Administrator
 */
public class TestProperties {

    public static void main(String[] args){

        TestProperties.showP();



    }

    public static void showP(){
        Properties p = new Properties();
        try {
            p.load(TestProperties.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = p.getProperty("url");
        System.out.println(url);
    }

}
