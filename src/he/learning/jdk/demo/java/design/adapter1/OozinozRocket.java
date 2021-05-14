package he.learning.jdk.demo.java.design.adapter1;

import he.learning.jdk.demo.java.design.PhysicalRocket;

/**
 * @author 朱科睿
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim {

    private double time;

    public OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    @Override
    public double getMass() {
        return getMass(this.time);
    }

    @Override
    public double getThrust() {
        return getThrust(this.time);
    }

    @Override
    public void setSimTime(double time) {
        this.time = time;
    }

}
