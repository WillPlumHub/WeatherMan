//C0490418
//William Plummer
//Comp 132, section 1B
//2019-11-
/*Creates objects that represents weather with a current temperature,
the maximum temperature of the day, the minimum temperature of the day,
the average temperature of the day, and a description of the current
weather. It places these objects in an array and displays them one at a time*/
package lab.pkg7;

public class Lab7 {

    public static void main(String[] args) {
        DailyWeather[] weatherObjects = new DailyWeather[3];
        /*creates an array called weatherObjects to store the objects in*/
        DailyWeather firstObj = new DailyWeather("Sunny", 6);
        /*creates a new object "firstObj" and sets the descrition to Raining
        and the currentTemp to 6*/
        DailyWeather secondObj = new DailyWeather("Cloudy", 9);
        /*creates a new object "secondObj" and sets the descrition to Raining
        and the currentTemp to 9*/
        DailyWeather thirdObj = new DailyWeather("Raining", 32);
        /*creates a new object "thirdObj" and sets the descrition to Raining
        and the currentTemp to 32*/

        firstObj.setTemp(12);
        /*references DailyWeather.setTemp to change the temp to 12*/
        secondObj.setTemp(5);
        /*references DailyWeather.setTemp to change the temp to 5*/
        thirdObj.setTemp(2);
        /*references DailyWeather.setTemp to change the temp to 2*/

        weatherObjects[0] = firstObj;
        /*stores firstObj in array weatherObjects*/
        weatherObjects[1] = secondObj;
        /*stores secondObj in array weatherObjects*/
        weatherObjects[2] = thirdObj;
        /*stores thirdObj in array weatherObjects*/

        for (int col = 0; col < weatherObjects.length; col++) {
            /*for every element of the array*/
            System.out.println("Obj " + (col + 1) + ": \nDescription: "
                    + weatherObjects[col].getDescription());
            /*display an weather object and the objects discription*/
            System.out.println("Current Temp: "
                    + weatherObjects[col].getTemp());
            /*display the objects current temperature*/
            System.out.println("Max Temp: " + weatherObjects[col].getMax());
            /*display the objects maximum temperature*/
            System.out.println("Min Temp: " + weatherObjects[col].getMin());
            /*display the objects minimum temperature*/
            System.out.println("Average: " + weatherObjects[col].getAverage()
                    + "\n");
            /*display the objects average temperature*/
        }
    }
}

class DailyWeather {

    /*variables*/
    private String description; //description of the weather type
    int currentTemp; //the current temperature
    int minTemp; //the minimum temperature of the day
    int maxTemp; //the maximum temperature of the day

    /*Sets up the current temp, the weathers description,
    the minTemp, and the maxTemp
    *Receives the description of the weather and the current temp
    *Returns nothing, it just sets up some of the variables
     */
    public DailyWeather(String description, int currentTemp) {
        this.description = description; //set description
        this.currentTemp = currentTemp; //set surrent temp
        minTemp = currentTemp; //set min temp as the current temp
        maxTemp = currentTemp; //set max temp as the current temp
    }

    /*Sets and returns a new description
    *Receives the description of the  current weather
    *Returns the value of the description
     */
    public String setDescription(String newDescription) {
        description = newDescription; //allow user to set new description
        return description; //return the value of the description
    }

    /*Sets and returns a new current temp and sets the max/min temp if needed
    *Receives the current temp
    *Returns nothing
     */
    public void setTemp(int newCurrentTemp) {
        currentTemp = newCurrentTemp; //allow user to set new current temp
        if (currentTemp < minTemp) {
            /*if the current temp is lower then
            the minimum of the day*/
            minTemp = currentTemp; //then set a new minimum temp
        }
        if (currentTemp > maxTemp) {
            /*if the current temp is lower then
            the minimum of the day*/
            maxTemp = currentTemp; //then set a new minimum temp
        }
    }

    /*Returns the description of the current weather
    *Receives nothing
    *Returns the description of the weather
     */
    public String getDescription() {
        return description; //return description
    }

    /*Returns the current temperature
    *Receives nothing
    *Returns the current temperature
     */
    public int getTemp() {
        return currentTemp; //return the current temperature
    }

    /*Returns the maximum temperature of the day
    *Receives nothing
    *Returns the maximum temperature
     */
    public int getMax() {
        return maxTemp; //return the maximum temperature
    }

    /*Returns the minimum temperature of the day
    *Receives nothing
    *Returns the minimum temperature
     */
    public int getMin() {
        return minTemp; //return the minimum temperature
    }

    /*Returns and calculates the average temperature of the day
    *Receives nothing
    *Returns the average temperature
     */
    public int getAverage() {
        int averageTemp = (maxTemp + minTemp) / 2;
        /*calculate the average
        temperature of the day*/
        return averageTemp; //return the average temperature
    }
}
