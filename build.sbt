name := "scala-with-cats"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies +=
  "org.typelevel" %% "cats-core" % "2.8.0"

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)
