package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic ligh object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; not this way today
        //we will assign/update the value of color
        trafficLight.changeColor("red");
        //system.out.println(trafficLight.color); direct access to variable.not
        //call method to access the variable;
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();
    }
}
