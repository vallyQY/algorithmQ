package hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.ObjectUtil;
import com.xzkingdee.hutool.clone.Cat;
import com.xzkingdee.hutool.clone.Dog;
import com.xzkingdee.hutool.clone.Mouse;
import com.xzkingdee.hutool.transfer.TransferDemo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author qy
 * @date Created in 2020/8/11
 **/
public class testClone {

    @Test
    public void testCloneInterface() {
        Cat cat = new Cat();
        Cat clone = cat.clone();
        System.out.println(clone.getName());
    }

    @Test
    public void testCloneSupport() {
        Dog dog = new Dog();
        Dog clone = dog.clone();
        System.out.println(clone.getName());
    }

    @Test
    public void testDeepCopy() {
        Mouse mouse = new Mouse();
        mouse.setCat(new Cat());
        System.out.println(mouse.getCat());

        Mouse mouseDeepClone = ObjectUtil.cloneByStream(mouse);
        mouseDeepClone.setCat(new Cat("Yran", 7));
        System.out.println(mouseDeepClone.getCat());

        Mouse mouseLightclone = mouse.clone();
        Cat cat = mouseLightclone.getCat();
        cat.setName("Aime");
        cat.setAge(11);
        mouseLightclone.setCat(cat);
        System.out.println(mouseLightclone.getCat());
        System.out.println(mouse.getCat());
    }

    @Test
    public void testTransfer() {
        TransferDemo transferDemo = new TransferDemo(1, new String[]{"1", "2", "3"},
                "2020-08-11", new Object[]{4, 5, 6});
        System.out.println(Convert.toStr(transferDemo.getIntToString()));
        System.out.println(Arrays.toString(Convert.toIntArray(transferDemo.getStrArrToIntArr())));
        System.out.println(Convert.toDate(transferDemo.getStrToDate()));
        System.out.println(Convert.toList(transferDemo.getObjToList()));
    }

    @Test
    public void testTransferType() {
        TransferDemo transferDemo = new TransferDemo();
        Object[] objArr = new Object[]{3, 4, 5};
        transferDemo.setObjToList(objArr);

        List<Double> doubleList = Convert.convert(new TypeReference<List<Double>>() {
        }, objArr);
        List<String> strList = Convert.convert(new TypeReference<List<String>>() {
        }, objArr);
        System.out.println(doubleList);
        System.out.println(strList);
    }

    @Test
    public void unicodeToChina() {
        String str = "中文";
        String unicode = Convert.strToUnicode(str);
        System.out.println(unicode);
        System.out.println(Convert.unicodeToStr(unicode));
    }

    @Test
    public void testCharSet(){
        String str = "乱码";
        String chaos = Convert.convertCharset(str, CharsetUtil.UTF_8,CharsetUtil.ISO_8859_1);
        System.out.println(chaos);
        String raw = Convert.convertCharset(chaos,CharsetUtil.ISO_8859_1,CharsetUtil.UTF_8);
        System.out.println(raw);
    }

    @Test
    public void testConverTime(){
        long a = 4535345;
        long l = Convert.convertTime(a, TimeUnit.MILLISECONDS, TimeUnit.HOURS);
        System.out.println(l);
    }
}
