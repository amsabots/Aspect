package com.github.amsabots.programming_paradigms;

import com.github.amsabots.programming_paradigms.Singleton.SingletonA;
import com.github.amsabots.programming_paradigms.Singleton.SingletonB;
import com.github.amsabots.programming_paradigms.prototype.ProtoFalse;
import com.github.amsabots.programming_paradigms.prototype.ProtoTrue;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProgrammingParadigmsApplicationTests {
    @Autowired
    SingletonB singletonB1;
    @Autowired
    SingletonB singletonB2;

    @Autowired
    ProtoFalse protoFalse1;
    @Autowired
    ProtoFalse protoFalse2;

    @Autowired
    ProtoTrue protoTrue1;
    @Autowired
    ProtoTrue protoTrue2;

    @Test
    public void testSingleton() {
        SingletonA one = SingletonA.getInstance();
        SingletonA two = SingletonA.getInstance();
        Assert.assertNotNull(one);
        Assert.assertSame(one, two);
        Assert.assertNotNull(singletonB1);
        Assert.assertSame(singletonB1, singletonB2);

    }

    @Test
    public void testPrototypes(){
      Assert.assertSame(protoFalse1, protoFalse2);
      Assert.assertNotSame(protoTrue1, protoTrue2);
    }

}
