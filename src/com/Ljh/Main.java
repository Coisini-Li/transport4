package com.Ljh;

import com.Ljh.Person.Person;
import com.Ljh.transport.Airship;
import com.Ljh.transport.Automobile;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person tom = new Person("tom.201902208");

        Airship tomairship = new Airship("airship1") {
            @Override
            public void drivingMethod() {

            }

            @Override
            public void load() {

            }

            @Override
            public void maintain() {

            }

            @Override
            public void addGas() {

            }
        };

        Automobile tomautomobile = new Automobile("automobile1") {
            @Override
            public void drivingMethod() {

            }

            @Override
            public void load() {

            }

            @Override
            public void maintain() {

            }

            @Override
            public void addGas() {

            }
        };

        tom.drivingTransprot(tomairship);
        tom.drivingTransprot(tomautomobile);

    }
}
