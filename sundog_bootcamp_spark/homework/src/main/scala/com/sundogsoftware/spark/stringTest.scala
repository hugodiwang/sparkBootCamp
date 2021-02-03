package com.sundogsoftware.spark

import scala.util.matching.Regex

object stringTest {
  def main(args: Array[String]) {
    val pattern = new Regex("(S|s)cala")  // 首字母可以是大写 S 或小写 s
    val str = "Scala is scalable and cool"
    println((pattern findAllIn str).mkString(","))   // 使用逗号 , 连接返回结果
  }
}
