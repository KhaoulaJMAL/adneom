import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CommonTest {

    @Test
    public void testPartition() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(3, 4),
                        Arrays.asList(5)),
                Common.partition(Arrays.asList(1, 2, 3, 4, 5), 2));
    }

    @Test
    public void testPartitionEmpty() {
        List<Integer> orig = Arrays.asList();
        assertEquals(Arrays.<List<Object>>asList(), Common.partition(orig, 2));
    }


    @Test
    public void testPartitionSizeZero() {
        List<Integer> orig = Arrays.asList(1, 2, 3);
        assertEquals(Arrays.asList(orig), Common.partition(orig, 0));
    }

    @Test
    public void testPartitionSizeInferiorToZero() {
        List<Integer> orig = Arrays.asList(1, 2, 3);
        assertEquals(Arrays.asList(orig), Common.partition(orig, -10));
    }

    @Test
    public void testPartitionSizeBiggerThanTaille() {
        List<Integer> orig = Arrays.asList(1, 2, 3);
        assertEquals(Arrays.asList(orig), Common.partition(orig, 25));
    }
}