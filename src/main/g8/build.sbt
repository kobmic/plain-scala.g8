name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.3.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
