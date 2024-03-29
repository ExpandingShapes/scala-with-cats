package introduction.exercises

/**
 * * 1.3 Printable Library
 */
object PrintableSyntax {
  implicit class PrintableOps[A](value: A){
    def format(implicit printable: Printable[A]): String = printable.format(value)
    def print(implicit printable: Printable[A]): Unit = println(value)
  }
}
