package he.learning.jdk.demo.java.design;

/**
 * @author 朱科睿
 */
public class PhysicalRocket {

    double burnArea;
    double burnRate;
    double fuelMass;
    double totalMass;

    public PhysicalRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    public double getBurnTime() {
        return this.burnArea;
    }

    public double getMass(double time) {
        return (this.fuelMass + this.totalMass)*time;
    }

    public double getThrust(double time) {
        return this.burnRate*time;
    }
}
