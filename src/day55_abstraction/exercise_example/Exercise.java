package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){//non_abstract method
        System.out.println("Warming up and starting the exercise");
    }
  /*
  _abstract method- method without body/impl, just signature
  -purpose- letting sub classes implement/override their own way
   */
    public abstract void perform();

    /**
     * another abstract method that concrete sub classes will override/implement
     * @param minutes- how long is exercise is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}