package com.Ljh.transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/18 17:00
 * @version: 1.0
 * @modified By:
 */
public abstract class Aircraft extends AirTransport{
    public Aircraft(String id) {
        setId(id);
    }

    public Aircraft() {
        super();
    }
}
