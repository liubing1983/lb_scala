package com.lb.scala.ch02

object TestException {

  def main(args: Array[String]) {
    
     try{
      1 / 0
    }catch{
       case ex: Exception =>  ex.printStackTrace()
      case _: Exception => println(" 1 / 0")
    }finally{
      println(" finally  ")
    }

    val x = 0.9
    if (x >= 1) {
      print(x)
    } else {
      throw new Exception("x >= 1")
    }
    
    
   
  }

}