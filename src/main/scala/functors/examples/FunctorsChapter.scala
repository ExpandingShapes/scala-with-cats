package functors.examples

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt

object FunctorsChapter extends App {
  val future: Future[String] =
    Future(123)
      .map(n => n + 1)
      .map(n => n * 2)
      .map(n => s"${n}!")

  print(Await.result(future, 1.second))
}
