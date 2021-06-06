package anatomyofatypeclass

import anatomyofatypeclass.JsonSyntax.JsonWriterOps
import anatomyofatypeclass.JsonWriterInstances.{personWriter, stringWriter}
import anatomyofatypeclass.JsonWriters.optionWriter

object MyApp extends App {
  //interface object usage
  Json.toJson(Person("Dave", "dave@example.com"))
  //interface syntax usage
  Person("Dave", "dave@example.com").toJson
  //Option[A] usage
  Json.toJson(Option("A string"))
}
