name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.10" % "test",
  "org.scalatest" %% "scalatest" % "2.1.0" % "test"
)
