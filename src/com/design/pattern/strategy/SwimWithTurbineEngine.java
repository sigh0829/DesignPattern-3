
package com.design.pattern.strategy;

public class SwimWithTurbineEngine implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("swim with turbine engine");
    }
}
