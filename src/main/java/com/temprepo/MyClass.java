package com.temprepo;

public class MyClass {
    private int x;

    public MyClass(final int x) {
        this.x = x;
    }

    public int incr() {
        return this.x++;
    }
}

