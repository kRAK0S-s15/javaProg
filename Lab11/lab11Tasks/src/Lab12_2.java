enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "🔴 Red light - STOP";
            case YELLOW:
                return "🟡 Yellow light - WAIT";
            case GREEN:
                return "🟢 Green light - GO";
            default:
                return super.toString();
        }
    }
}

class TrafficLightSimulator {

    private TrafficLight currentLight;

    public TrafficLightSimulator(TrafficLight startLight) {
        this.currentLight = startLight;
    }

    public void changeColor(TrafficLight light) {
        switch (light) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
        }
    }

    public TrafficLight getCurrentLight() {
        return currentLight;
    }

    @Override
    public String toString() {
        return "Current traffic light: " + currentLight;
    }
}

public class Lab12_2 {
    public static void main(String[] args) {

        TrafficLightSimulator simulator =
                new TrafficLightSimulator(TrafficLight.RED);

        while (true) {

            System.out.println(simulator);

            simulator.changeColor(simulator.getCurrentLight());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}