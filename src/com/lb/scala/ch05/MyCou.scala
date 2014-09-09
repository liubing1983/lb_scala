package com.lb.scala.ch05

object MyCou {

  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment
    println(myCounter.current)
    
    
    //myCounter.privateName ("lb")
    println(myCounter.name)
    
  }

}