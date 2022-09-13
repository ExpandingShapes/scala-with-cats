package introduction.exercises

import introduction.exercises.PrintableInstances.catFormatter
import introduction.exercises.PrintableSyntax.PrintableOps

object PrintableApp extends App {
  val cat = Cat("Plambus", 21, "ginger")

  Printable.print(cat)

  //the same but with a better syntax
  cat.print
}
