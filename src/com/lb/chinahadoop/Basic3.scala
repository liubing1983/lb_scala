package com.lb.chinahadoop

class Basic3 {

}

abstract class Persion1{
  def speak
}

class Studend1 extends Persion1{
  def speak{
    print("lb")
  }
}


object Basic3 extends App{
  val s = new Studend1
  s.speak
}