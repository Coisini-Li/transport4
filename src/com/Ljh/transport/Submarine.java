package com.Ljh.transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/17 21:55
 * @version: 1.0
 * @modified By:
 */
public abstract class Submarine extends MaritimeMeansOfTransport{
    public Submarine(String id) {
        setId(id);
    }

    public Submarine() {
        super();
    }
}
