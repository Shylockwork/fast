package shylock.aop.schema.advice;

/**
 * @author Administrator
 */
public class FitImpl implements  Fit{
    @Override
    public void filter() {

        System.out.println("FitImpl filter");
    }
}
