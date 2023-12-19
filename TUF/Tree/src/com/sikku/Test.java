package com.sikku;

public class Test {
}

interface A{
    void m1();
}

interface B extends A{
    @Override
    void m1();
}
