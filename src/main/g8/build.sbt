name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.1.1" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
