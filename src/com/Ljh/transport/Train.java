package com.Ljh.transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/18 17:00
 * @version: 1.0
 * @modified By:
 */
public abstract class Train extends LandTransport{
    public Train(String id) {
        setId(id);
    }

    public Train() {
        super();
    }
}
