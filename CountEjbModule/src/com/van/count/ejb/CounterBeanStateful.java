package com.van.count.ejb;

import javax.ejb.Stateful;

/**
 * Created by hvpham on 12/9/2015.
 */
@Stateful(name="statefullCounter")
public class CounterBeanStateful implements Counter {
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
