name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
