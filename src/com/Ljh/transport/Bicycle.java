package com.Ljh.transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/17 21:53
 * @version: 1.0
 * @modified By:
 */
public abstract class Bicycle extends LandTransport {
    public Bicycle(String id) {
        setId(id);
    }

    public Bicycle() {
        super();
    }
}
