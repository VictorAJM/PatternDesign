/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */

public class CeilingFan {
  String location = "";
  int level;
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
 public static final int OFF = 0;
  public CeilingFan(String location) {
    this.location = location;
    level = OFF;
  }
  
  public void high() {
    level = HIGH;
    System.out.println(location + " ceiling fan is on high");
    
  } 

  public void medium() {
    level = MEDIUM;
    System.out.println(location + " ceiling fan is on medium");
  }

  public void low() {
    level = LOW;
    System.out.println(location + " ceiling fan is on low");
  }
 
  public void off() {
    level = OFF;
    System.out.println(location + " ceiling fan is off");
  }
 
  public int getSpeed() {
    return level;
  }
}
