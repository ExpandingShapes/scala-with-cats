package functors.examples

import cats.Functor

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import cats.syntax.functor._

object FunctorsChapter extends App {
  val future: Future[String] =
    Future(123)
      .map(n => n + 1)
      .map(n => n * 2)
      .map(n => s"${n}!")

  Await.result(future, 1.second)

  //mapping over Function1 is a function composition
  val func1: Int => Double = (x: Int) => x.toDouble
  val func2: Double => Double = (y: Double) => y * 2

  //the composition itself
  (func1 map func2)(1)
  (func1 andThen func2)(1)
  func2(func1(1))

  //We can think of this as lazily queueing up operations similar to Future
  val func = ((x: Int) => x.toDouble)
    .map(x => x + 1)
    .map(x => x * 2)
    .map(x => s"${x}!")

  val list1 = List(1, 2, 3)
  val list2 = Functor[List].map(list1)(_ * 2)

  val option1 = Option(123)
  val option2 = Functor[Option].map(option1)(_.toString)

  val func3 = (x: Int) => x + 1
  val liftedFunc3 = Functor[Option].lift(func3)
  liftedFunc3(Option(1))

  Functor[List].as(list1, "As")

  /**
   * Apply an equation to a number no matter what functor context it’s in
   */
  def doMath[F[_]](start: F[Int])(implicit functor: Functor[F]): F[Int] =
    start.map(n => n + 1 * 2)

  doMath(Option(20))
  doMath(List(1, 2, 3))
}
