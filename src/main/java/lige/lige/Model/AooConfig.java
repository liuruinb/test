package lige.lige.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;

/**
 * Created by liurui on 2018/11/16.
 */
@Configuration
public class AooConfig
{
    @Value("${liu.rui}")
    public String rui;
}
