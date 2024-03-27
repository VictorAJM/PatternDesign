/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.templatemethod;

/**
 *
 * @author victor
 */
public class Coffee extends CaffeineBeverage {
  @Override
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }
  @Override
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}
