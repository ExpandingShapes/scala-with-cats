package anatomyofatypeclass.exercise

import anatomyofatypeclass.exercise.PrintableInstances.catFormatter
import anatomyofatypeclass.exercise.PrintableSyntax.PrintableOps

object MyApp extends App {
  val cat = Cat("Bob", 4, "black")

  Printable.print(cat)

  cat.print
}
