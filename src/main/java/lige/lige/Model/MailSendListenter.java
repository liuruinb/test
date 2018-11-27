package lige.lige.Model;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by liurui on 2018/11/26.
 */
@ComponentScan
public class MailSendListenter implements ApplicationListener<MailSendEvent>
{
    //对MailSendEvent事件进行处理
    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent mailSendEvent1 = (MailSendEvent) mailSendEvent;
        System.out.println("MailSendListenter:向"+mailSendEvent1.getTo()+"发送完一封邮件");
    }
}
