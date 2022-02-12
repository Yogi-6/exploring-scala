package com.rockthejvm

object Factorial extends App {
  def factorial(number: Int): Int = if (number == 1) 1 else number * factorial(number - 1)
  println(factorial(5))
}
