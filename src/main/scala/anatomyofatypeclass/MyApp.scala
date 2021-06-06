package anatomyofatypeclass

import anatomyofatypeclass.JsonSyntax.JsonWriterOps
import anatomyofatypeclass.JsonWriterInstances.personWriter

object MyApp extends App {
  //interface object usage
  Json.toJson(Person("Dave", "dave@example.com"))
  //interface syntax usage
  Person("Dave", "dave@example.com").toJson
}
