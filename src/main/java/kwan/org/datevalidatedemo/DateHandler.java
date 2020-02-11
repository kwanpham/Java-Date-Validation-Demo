package kwan.org.datevalidatedemo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by https://github.com/kwanpham
 */
class DateHandler extends StdDeserializer<String> {

    public DateHandler() {
        this(null);
    }

    public DateHandler(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public String deserialize(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String date = jsonparser.getText();
        try {
            return date.replace("-" , "");
        } catch (Exception e) {
            return null;
        }
    }

}