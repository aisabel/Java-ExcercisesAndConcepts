package Concepts;

public class TrafficLights implements trafficLightsInterface {
    /*Interface uses the reserved word 'implements'
      Note: One class can also implement more than one interface

      This class uses the interface trafficLightsInterface
     */

    public static void main(String[] args) {

        trafficLightsInterface a= new TrafficLights();
        a.redLight();
        a.yellowLight();
        a.greenLight();

        TrafficLights at=new TrafficLights();
        trafficLightsInterface ct=new TrafficLights();
        at.walkOnSignal();
        ct.trainSignal();

    }

    @Override
    public void redLight() {
        System.out.println(" Red light implementation");
    }
    public void walkOnSignal()
    {
        System.out.println(" walking");
    }
    @Override
    public void yellowLight() {
        System.out.println(" Yellow light implementation");
    }

    @Override
    public void greenLight() {
        System.out.println(" Green light implementation");
    }

    public void trainSignal() {
        System.out.println(" Wait: Train passing first");
    }

}
