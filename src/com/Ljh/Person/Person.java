package com.Ljh.Person;

import com.Ljh.transport.Transport;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/18 17:00
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public void drivingTransprot(Transport transport){
        System.out.print(this.id+" ");
        System.out.println("driving   "+transport.getId());
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }
}
