package com.lb.scala.ch02


object TestFun {

  def main(args: Array[String]): Unit = {

    // 使用decorate默认参数值
    val str = decorate("快学scala")
    println(str)

    // 传递参数
    val str2 = decorate("快学scala", "{", "}")
    println(str2)

    // 指定参数名
    val str3 = decorate(left = "left[", str = "快学scala", right = "]right")
    println(str3)

    // 指定参数名
    val str4 = decorate("快学scala", "]right")
    println(str4)
    
    sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

  }
    // 待命参数
  def decorate(str: String, left: String = "[", right: String = "]") =
    left + str + right
  // 变长参数
  def sum(args : Int *)  = {
     args.foreach(println)
  }

}