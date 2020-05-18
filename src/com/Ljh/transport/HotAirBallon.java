package com.Ljh.transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/18 17:00
 * @version: 1.0
 * @modified By:
 */
public abstract class HotAirBallon extends AirTransport{
    public HotAirBallon(String id) {
        setId(id);
    }

    public HotAirBallon() {
        super();
    }
}
