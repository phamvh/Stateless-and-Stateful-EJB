package com.van.count.ejb;

import javax.ejb.Local;

/**
 * Created by hvpham on 12/9/2015.
 */
@Local
public interface Counter {
    public int count();
    public int increment();
    public int reset();
}
