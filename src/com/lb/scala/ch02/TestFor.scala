package com.lb.scala.ch02

object TestFor {

  def main(args : Array[String]) : Unit = {
    
    for (i <- 1 to 11){
      print(11 - i)
    }
    
    for (i <- 1 to 3; j <- 2 to 5) {
      //println(i +" "+ j)
    }
    
     for (i <- 1 to 3; j <- 2 to 5 if i != j) {
      //println(i +" "+ j)
    }
  }

}