/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.templatemethod;

/**
 *
 * @author victor
 */
public class Tea extends CaffeineBeverage {
  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }
  @Override
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}
