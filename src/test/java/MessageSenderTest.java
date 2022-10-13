import com.nhnacademy.edu.springframework.messagesender.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MessageSenderTest {

    User user = new User("a@b.com", "820109");
    String msg = "hi hello";
    @InjectMocks
    private MessageSenderService messageSenderService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEmailMessageSenderToAnnotation() {
//        ReflectionTestUtils.setField(messageSenderService, "messageSender", new EmailMessageSender());
//        when(messageSender.sendMessage(user, msg)).thenReturn(false); // 안에 로직 상관없이 결과를 뱉어냄
        boolean acutal = messageSenderService.doSendMessage(user, msg);

        Assertions.assertThat(acutal).isEqualTo(true);
    }

    @Test
    public void testSmsMessageSenderToMethod() {
        MessageSender sender = mock(MessageSender.class);
        MessageSenderService service = new MessageSenderService(sender);
//        ReflectionTestUtils.setField(service, "messageSender", new SmsMessageSender());

        when(sender.sendMessage(user, msg)).thenReturn(false);
        boolean actual = service.doSendMessage(user, msg);
        Assertions.assertThat(actual).isEqualTo(false);
    }
}
