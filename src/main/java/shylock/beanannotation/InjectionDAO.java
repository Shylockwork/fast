package shylock.beanannotation;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAO {

public void say(){
    System.out.println("DAO speaking !!");
}

}
