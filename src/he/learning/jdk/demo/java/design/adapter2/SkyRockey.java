package he.learning.jdk.demo.java.design.adapter2;

/**
 * @author 朱科睿
 */
public class SkyRockey {

    protected double simTime;
    private final double mass;
    private final double thrust;
    private final double burnTime;

    public SkyRockey(double mass, double thrust, double burnTime) {
        this.mass = mass;
        this.thrust = thrust;
        this.burnTime = burnTime;
    }

    double getMass() {
        return mass;
    }

    double getThrust() {
        return thrust;
    }

    void setSimTime(double time) {
        this.simTime = time;
    }
}
