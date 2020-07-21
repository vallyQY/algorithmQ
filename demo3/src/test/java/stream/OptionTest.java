package stream;

import com.xzkingdee.stream.OptionalLearn;
import org.junit.Test;

/**
 * @author qy
 * @date 2020/7/21
 */
public class OptionTest {

    @Test
    public void testOptionConstrution(){
        OptionalLearn.optionConstrution(null);
    }

    @Test
    public void testOptionOrElse(){
        OptionalLearn.optionOrElse(null);
    }

    @Test
    public void testOptionThrows(){
        try{
            OptionalLearn.optionOrThrow(null);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
