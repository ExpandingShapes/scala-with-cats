package anatomyofatypeclass.exercise

trait Printable[A] {
  def format(value: A): String
}

object Printable {
  def format[A](value: A)(implicit formatter: Printable[A]): String =
    formatter.format(value)

  def print[A](value: A)(implicit formatter: Printable[A]): Unit =
    println(formatter.format(value))
}
