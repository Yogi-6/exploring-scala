package com.rockthejvm

object FunctionalConcepts extends App {
  class Person(name: String) {
    def apply(age: Int) = println(s"I have aged $age years")
  }

  val john = new Person("John")
  // Callable methods
  john(10)

  val aMap: List[Int] = List(1, 2, 3, 4, 5).map(x => x * 2)
  println(aMap)

  // Filter items that are less than 5
  val filteredList: List[Int] = aMap.filter(x => x <= 5)
  println(filteredList);

  // Create all possible combinations of 1, 2, 3 and a, b, c
  val allPossibleCombinations: List[String] = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(alphabet => s"$number$alphabet"))
  println(allPossibleCombinations)

}
