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
