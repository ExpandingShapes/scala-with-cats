package introduction.exercises

/**
 * 1.3 Printable Library
 * Scala provides a toString method to let us convert any value to a String.
 * However, this method comes with a few disadvantages:
 * it is implemented for every type in the language,
 * many implementations are of limited use,
 * and we can’t opt-in to specific implementations for specific types.
 * Let’s define a Printable type class to work around these problems:
 * 1. Define a type class Printable[A] containing a single method format.
 *    format should accept a value of type A and return a String.
 * 2. Create an object PrintableInstances containing instances of Printable
 *    for String and Int.
 * 3. Define an object Printable with two generic interface methods:
 *    format accepts a value of type A and a Printable of the corresponding type.
 *    It uses the relevant Printable to convert the A to a String.
 *    print accepts the same parameters as format and returns Unit.
 *    It prints the formatted A value to the console using println.
 */
trait Printable[A] {
  def format(value: A): String
}

object Printable{
  def format[A](value: A)(implicit printable: Printable[A]): String =
    printable.format(value)

  def print[A](value: A)(implicit printable: Printable[A]): Unit =
    println(printable.format(value))
}
