name := "scala-with-cats"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies +=
  "org.typelevel" %% "cats-core" % "2.6.1"

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)
