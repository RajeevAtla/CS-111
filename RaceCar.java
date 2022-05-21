public class RaceCar {
    private int currentFuel;
    private int currentSpeed;
    private int speedLimit;
    private int maxFuelCapacity;

    public RaceCar(int currentFuel, int currentSpeed, int speedLimit, int maxFuelCapacity){
        this.currentFuel = currentFuel;
        this.currentSpeed = currentSpeed;
        this.speedLimit = speedLimit;
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public boolean increaseSpeed(int speedFactor){
        if(currentSpeed + speedFactor <= speedLimit)
        {
            currentSpeed += speedFactor;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean decrease(int speedFactor)
    {
        if(currentSpeed - speedFactor >= 0)
        {
            currentSpeed -= speedFactor;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean increaseFuel(int fuel)
    {
        if(currentFuel + fuel <= maxFuelCapacity)
        {
            currentFuel += fuel;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean decreaseFuel(int fuel)
    {
        if(currentFuel - fuel >= 0)
        {
            currentFuel -= fuel;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void emptyFuel()
    {
        currentFuel = 0;
    }

    public int getSpeed()
    {
        return currentSpeed;
    }

    public int getFuel()
    {
        return currentFuel;
    }
}
