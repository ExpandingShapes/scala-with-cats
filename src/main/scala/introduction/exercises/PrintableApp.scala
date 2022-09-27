package introduction.exercises

import introduction.exercises.PrintableInstances.catFormatter
import introduction.exercises.PrintableSyntax.PrintableOps

/**
 * 1.3 Printable Library
 * Let’s make our printing library easier to use by
 * defining some extension methods to provide better syntax:
 * 1. Create an object called PrintableSyntax.
 * 2. Inside PrintableSyntax define an implicit class PrintableOps[A]
 *    to wrap up a value of type A.
 * 3. In PrintableOps define the following methods:
 *    format accepts an implicit Printable[A] and returns a String representation of the wrapped A;
 *    print accepts an implicit Printable[A] and returns Unit. It prints the wrapped A to the console.
 * 4. Use the extension methods to print the example Cat you created
 * in the previous exercise.
 */
object PrintableApp extends App {
  val cat = Cat("Plambus", 21, "ginger")

  Printable.print(cat)

  //the same but with a better syntax
  cat.print
}
