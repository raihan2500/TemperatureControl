public class RangeInput {
    private int currentTemperature, minTemperature, maxTemperature;

    public RangeInput(){
        minTemperature = 60;
        maxTemperature = 80;
        calculateTemperature();
    }

    public RangeInput(int min, int max){
        minTemperature = min;
        maxTemperature = max;
        calculateTemperature();
    }

    private void calculateTemperature() {
        currentTemperature = (minTemperature + maxTemperature) / 2;
    }

    public void up(){
        currentTemperature = Math.min(currentTemperature +1 , maxTemperature);
    }

    public void down(){
        currentTemperature = Math.max(currentTemperature -1 , minTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
