import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class testIpGet {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip1 = InetAddress.getLocalHost();

        System.out.println(ip1.getHostName()); //获取主机名
        System.out.println(ip1.getHostAddress()); //获取IP地址

        //通过指定ip域名获取信息
        InetAddress ip2 = Inet4Address.getByName("www.baidu.com");

        System.out.println(ip2.getHostName()); //获取主机名
        System.out.println(ip2.getHostAddress()); //获取IP地址
    }
}
