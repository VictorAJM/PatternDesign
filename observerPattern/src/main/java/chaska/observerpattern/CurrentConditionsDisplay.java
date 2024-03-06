/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.observerpattern;

/**
 *
 * @author victor
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float humidity;
    private float temperature;
    private float pressure;
    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display(){
        System.out.println("la temperatura es: "+ temperature+ "C grados y la humedad es : " + humidity + " y la presion es: " + pressure);
    }
    @Override
    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}