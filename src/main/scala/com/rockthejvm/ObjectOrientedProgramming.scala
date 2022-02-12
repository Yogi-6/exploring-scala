package com.rockthejvm

object ObjectOrientedProgramming extends App {

  class Animal {
    val age = 4

    def eat() = println("eating")
  }

  val animal = new Animal
  println(s"Animal's age is ${animal.age}")
  animal.eat()

  class Dog(val name: String) extends Animal

  val lassie = new Dog("Lassie")
  println(s"Hi, I am a dog and my name is ${lassie.name}.")
}
