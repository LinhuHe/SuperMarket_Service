package cqdx.finall.supertmarket;

public class RandomUtils {

    private static final String charlist = "0123456789abcdefghijklmnopqrstuvwxyz";  //

    public static String createRandomString(int len) {
        String str = new String();
        for (int i = 0; i < len; i++) {
            str += charlist.charAt(getRandom(charlist.length())); //随机取 参数长度 的字符串
        }
        return str;
    }

    public static int getRandom(int mod) { //取  0-参数 范围随机数
        if (mod < 1) {
            return 0;
        }
        int ret = getInt() % mod;
        return ret;
    }

    private static int getInt() {  //得到一个较大int
        int ret = Math.abs(Long.valueOf(getRandomNumString()).intValue());
        return ret;
    }

    private static String getRandomNumString() {  //取一个double [0-1)之间 并去掉小数点转为字符串
        double d = Math.random();
        //System.out.println("d: "+d);
        String dStr = String.valueOf(d).replaceAll("[^\\d]", ""); //正则表达式 ^:行开头， \d：数字， +：出现至少1次，？：出现0或1次
        if (dStr.length() > 1) {
            dStr = dStr.substring(0, dStr.length() - 1);
        }
        //System.out.println("dstr: "+dStr);
        return dStr;
    }

}
