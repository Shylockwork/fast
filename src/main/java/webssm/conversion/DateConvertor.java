package webssm.conversion;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import java.util.Date;

@Component
public class DateConvertor implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        System.out.println("DateConvertor: "+s);
        return new Date("6/13/2018");
    }
}
