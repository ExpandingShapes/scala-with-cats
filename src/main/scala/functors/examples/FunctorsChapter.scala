package functors.examples

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

}
