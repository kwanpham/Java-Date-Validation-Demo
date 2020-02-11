package kwan.org.datevalidatedemo.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by https://github.com/kwanpham
 */
public class CustomDateValidator implements
        ConstraintValidator<CustomDateConstraint, String> {

    private static final String DATE_PATTERN = "yyyyMMdd";

    @Override
    public void initialize(CustomDateConstraint customDate) {

    }

    @Override
    public boolean isValid(String customDateField,
                           ConstraintValidatorContext cxt) {

        try
        {

            Date date1=new SimpleDateFormat(DATE_PATTERN).parse(customDateField);

            Calendar currentDateBefore1Months = Calendar.getInstance();
            currentDateBefore1Months.add(Calendar.MONTH, -1);

            if (!date1.after(currentDateBefore1Months.getTime())){
                return false;
            }

            Calendar currentDate = Calendar.getInstance();

            if(!date1.before(currentDate.getTime())){
                return false;
            }

            return true;
        }
        catch (ParseException e)
        {
            return false;
        }
    }

}