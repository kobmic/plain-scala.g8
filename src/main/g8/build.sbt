name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "3.6.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
