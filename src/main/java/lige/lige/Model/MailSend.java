package lige.lige.Model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by liurui on 2018/11/26.
 */
@ComponentScan
public class MailSend implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public void sendMail(String to)
    {
        System.out.println("MaildSend：模拟发送邮件");
        MailSendEvent mse = new MailSendEvent(this.applicationContext,to);
        applicationContext.publishEvent(mse);//向容器中所有注册了该事件的监听器发送该事件
    }
    public ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }
}
