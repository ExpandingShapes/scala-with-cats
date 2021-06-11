package meetcats.exercise

import cats.Show
import cats.syntax.show._

object CatShowApp extends App {
  implicit val catShow: Show[Cat] = Show.show(cat =>
    s"${cat.name} is a ${cat.age} year-old ${cat.color} cat.")

  Cat("Bob", 4, "black").show
}
