package monoidsandsemigroups.exercises

import cats.kernel.Semigroup
import cats.instances.option._
import monoidsandsemigroups.exercises.Order.orderSemigroup
//import monoidsandsemigroups.exercises.Semigroup

/**
 * 2.5.4
 * The cutting edge SuperAdder v3.5a-32
 * is the world’s first choice for adding together numbers.
 * The main function in the program has signature
 * def add(items: List[Int]): Int.
 * In a tragic accident this code is deleted!
 * Rewrite the method and save the day!
 * Well done! SuperAdder’s market share continues to grow,
 * and now there is demand for additional functionality.
 * People now want to add List[Option[Int]]. Change add so this is possible.
 * The SuperAdder code base is of the highest quality,
 * so make sure there is no code duplication!
 * SuperAdder is entering the POS (point-of-sale, not the other POS) market.
 * Now we want to add up Orders:
 * case class Order(totalCost: Double, quantity: Double)
 * We need to release this code really soon so we can’t make any modifications to add.
 * Make it so!
 */
object AddingAllTheThings extends App {
  def addV1(items: List[Int]): Int =
    items.reduce(Semigroup[Int].combine(_, _))

  def addV2(items: List[Option[Int]]): Option[Int] =
    items.reduce(Semigroup[Option[Int]].combine(_, _))

  def addV3[A](items: List[A])(implicit semigroup: Semigroup[A]): A =
    items.reduce(Semigroup.apply[A].combine(_, _))

  println(addV1(List(4, 4, 3, 5, 2)))
  println(addV2(List(Some(3), Some(7), None, None, Some(5))))
  println(addV3(List(Some(3), Some(7), None, None, Some(5))))
  println(addV3(List(Order(3.5, 0.6), Order(3.2, 7.3))))
}
