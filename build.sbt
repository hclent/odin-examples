name := "odin-examples"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.clulab" %% "processors" % "5.7.0",
  "org.clulab" %% "processors" % "5.7.0" classifier "models"
)
