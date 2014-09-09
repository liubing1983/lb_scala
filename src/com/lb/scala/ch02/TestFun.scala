package com.lb.scala.ch02


object TestFun {

  def main(args: Array[String]): Unit = {

    // ʹ��decorateĬ�ϲ���ֵ
    val str = decorate("��ѧscala")
    println(str)

    // ���ݲ���
    val str2 = decorate("��ѧscala", "{", "}")
    println(str2)

    // ָ��������
    val str3 = decorate(left = "left[", str = "��ѧscala", right = "]right")
    println(str3)

    // ָ��������
    val str4 = decorate("��ѧscala", "]right")
    println(str4)
    
    sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

  }
    // ��������
  def decorate(str: String, left: String = "[", right: String = "]") =
    left + str + right
  // �䳤����
  def sum(args : Int *)  = {
     args.foreach(println)
  }

}