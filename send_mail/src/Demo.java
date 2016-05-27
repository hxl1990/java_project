/**
 * Created by han on 2016/4/15.
 */

    import AuthenticatorGenerator;
    import HostType;
    import MessageParser;
    import SimpleMailReceiver;

    /**
     * 邮件测试类
     *
     * @author athena
     *
     */
    public class Demo {

        public static void main(String[] args) {
            MessageParser.parse(SimpleMailReceiver.fetchInbox(HostType.NETEASE.getProperties(),
                    AuthenticatorGenerator.getAuthenticator("youraccount", "yourpassword")));
        }
    }
