package kwan.org.datevalidatedemo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import kwan.org.datevalidatedemo.validate.CustomDateConstraint;
import kwan.org.datevalidatedemo.validate.CustomDateValidator;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import sun.util.resources.LocaleData;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * Created by https://github.com/kwanpham
 */
@Data
public class MyDate {


    @CustomDateConstraint
    private String date1;

}
