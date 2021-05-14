package he.learning.jdk.demo.java.design.adapter2;

import he.learning.jdk.demo.java.design.PhysicalRocket;

/**
 * @author 朱科睿
 */
public class OozinozSkyRocket extends SkyRockey{

    private final PhysicalRocket rocket;

    public OozinozSkyRocket(PhysicalRocket rocket) {
        super(rocket.getMass(0), rocket.getThrust(0), rocket.getBurnTime());
        this.rocket = rocket;
    }

    @Override
    double getMass() {
        return rocket.getMass(simTime);
    }

    @Override
    double getThrust() {
        return rocket.getThrust(simTime);
    }

}
