import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author qy
 * @date Created in 2020/8/13
 **/
public class PageTest {

    @Test
    public void pageTest() {
        List<Integer> tempList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int pageNo = 0;
        int tempNo = pageNo + 1;
        int pageSize = 2;
        int startIndex = (tempNo - 1) * pageSize;
        int endIndex = tempNo * pageSize;

        System.out.println(endIndex > tempList.size() ?
                tempList.subList(startIndex, tempList.size()) : tempList.subList(startIndex, endIndex));
    }
}
