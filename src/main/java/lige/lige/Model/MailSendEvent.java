package lige.lige.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * Created by liurui on 2018/11/26.
 */
//事件
@ComponentScan
public class MailSendEvent extends ApplicationContextEvent{
    private String to;
    public MailSendEvent(ApplicationContext source, String to) {
        super(source);
        this.to = to;
    }
    public String getTo()
    {
        return to;
    }
}
