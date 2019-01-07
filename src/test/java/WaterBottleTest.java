import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    @Test
    public void getVolume(){
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.getVolume());

    }

    @Test
    public void drink(){
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty(){
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fill(){
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.fill());
    }


}