package com.weixiao;

import org.junit.Test;

public class JunitTest {


    @Test
    public void Test() {

        JunitTest jt = new JunitTest();

        System.out.println(jt.Test1(10,20));
        System.out.println(jt.Test2(10,20));
        System.out.println(jt.Test3(10,20));
        System.out.println(jt.Test4(10,20));

    }

    private int Test1(int a, int b) {

        return a + b;

    }
    private int Test2(int x, int y) {

        return x - y;

    }
    private int Test3(int i, int p) {

        return i % p;

    }
    private int Test4(int z, int g) {

        return z * g;

    }


}