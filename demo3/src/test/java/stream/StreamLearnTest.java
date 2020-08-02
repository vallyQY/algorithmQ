package stream;

import com.xzkingdee.stream.StreamLearn;
import org.junit.Test;

/**
 * @author qy
 * @date 2020/7/20
 */
public class StreamLearnTest {

    @Test
    public void testConsumer() {
        StreamLearn.consumerDemo();
    }

    @Test
    public void testFuncion() {
        StreamLearn.functionDemo();
    }

    @Test
    public void testPredicate() {
        StreamLearn.predicateDemo();
    }

    @Test
    public void testStreamConstruction() {
        StreamLearn.streamConstruction();
        StreamLearn.streamIterate();
        StreamLearn.streamGenerate();
    }

    @Test
    public void testStreamMap(){
        StreamLearn.streamMap();
    }

    @Test
    public void testFlatMap(){
        StreamLearn.streamFlatMap();
    }

    @Test
    public void testStreamStat(){
        StreamLearn.streamMaxMinAvg();
    }
}
