package he.learning.jdk.demo.java.design;

/**
 * IP工具类
 *
 * @author 禾绪
 */
public class IPUtil {

    private static final Integer TRUE = 1;
    private static final Integer FALSE = -1;

    /**
     * 比较IP地址的大小
     *
     * @param ip1 待比较IP1
     * @param ip2 待比较IP2
     * @return 比较结果。
     * <ul>
     *     <li>1: ip1小于或者等于ip2</li>
     *     <li>-1: ip1大于ip2</li>
     * </ul>
     */
    public static int compareIpV4s(String ip1, String ip2) {
        int ipValue1 = getIpV4Value(ip1);
        int ipValue2 = getIpV4Value(ip2);
        if (ipValue1 > ipValue2) {
            return FALSE;
        }
        return TRUE;
    }

    /**
     * 获取IP的32为bit值
     *
     * @param ipOrMask IP地址
     * @return IP的32为bit值
     */
    public static int getIpV4Value(String ipOrMask) {
        byte[] addr = getIpV4Bytes(ipOrMask);
        int address1 = addr[3] & 0xFF;
        address1 |= ((addr[2] << 8) & 0xFF00);
        address1 |= ((addr[1] << 16) & 0xFF0000);
        address1 |= ((addr[0] << 24) & 0xFF000000);
        return address1;
    }

    public static byte[] getIpV4Bytes(String ipOrMask) {
        try {
            String[] addrs = ipOrMask.split("\\.");
            int length = addrs.length;
            byte[] addr = new byte[length];
            for (int index = 0; index < length; index++) {
                addr[index] = (byte) (Integer.parseInt(addrs[index]) & 0xff);
            }
            return addr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[4];
    }

    public static void main(String[] args) {
        System.out.println(compareIpV4s("192.169.101.1", "192.169.101.2"));
    }

}
