package com.lb.scala.ch03

import scala.collection.mutable.ArrayBuffer

object TestArray {

  def main(args: Array[String]): Unit = {
    
    //arraybuffer();
    testFun()
    
  }
  
  // 定长数组
  def array(){
    val a = new Array[Int] (10);
    
    val b = new Array[String](10);
    
    val c = Array("Hello", "World");
    println(c(0))
  }
  
  // 变长数组
  def arraybuffer(){
    val a = new ArrayBuffer[Int]()
    
    println(a)
    a += 1
    println(a.size)
    // 使用 += 在数组在尾部添加数据
    a += (1, 2, 3, 6, 7)
    println(a)
    // 使用 ++=  追加集合
    a ++= Array(10, 111)
    println(a)
    // 移除最后四个元素
    a.trimEnd(4)
    println(a)
    
    for(i <- 0 until a.size)
      println(a(i))
      
    for(elem <- a)
      println(elem)
    
  }

  def testFun(){
    val a = ArrayBuffer(1, 2,7, 9, 3, 4)
    println(a.sum)
    println(a.max)
    // val b = a.sortBy(_<_)
    
    
    
  }
}