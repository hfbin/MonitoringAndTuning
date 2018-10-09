package cn.hfbin.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: HuangFuBin
 * Date: 2018/7/21
 * Time: 16:33
 * Such description: -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
 */
public class UnStackOverflow {
    public static void main(String[] args) {
        List<Class<?>> classList = new ArrayList<Class<?>>();
        while(true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
//我根本不知道，我将来，想过什么样的生活，去哪个城市做什么工作，我只是知道，我自己不想要什么，我不想要那种循规蹈矩，安安分分平平淡淡的日子，我不想要一个一眼就可以看到死的生活，