package cn.hfbin.oom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by: HuangFuBin
 * Date: 2018/7/21
 * Time: 16:33
 * Such description: -Xmx32M -Xms32M
 */
public class StackOverflow {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        int i = 0;
        while (true){
            personList.add(new Person(i++ , UUID.randomUUID().toString()));
        }
    }
}
