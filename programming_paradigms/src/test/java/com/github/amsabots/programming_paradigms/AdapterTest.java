package com.github.amsabots.programming_paradigms;

import com.github.amsabots.programming_paradigms.AdapterPattern.Apple;
import com.github.amsabots.programming_paradigms.AdapterPattern.AppleAdapter;
import com.github.amsabots.programming_paradigms.AdapterPattern.GMOrange;
import com.github.amsabots.programming_paradigms.AdapterPattern.Orange;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    public void testAdapterPattern(){
        Orange orange = new GMOrange();
        Apple appleAdapter = new AppleAdapter(orange);

        appleAdapter.getVariety();
        appleAdapter.eat();
    }
}
