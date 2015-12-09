package com.van.count.ejb;

import javax.ejb.Stateless;

/**
 * Created by hvpham on 12/9/2015.
 */
@Stateless(name="statelessCounter")
public class CounterBeanStateless implements Counter {
    private int count = 0;
    @Override
    public int count() {
        return count;
    }

    @Override
    public int increment() {
        return ++count;
    }

    @Override
    public int reset() {
        count =0;
        return count;
    }
}
