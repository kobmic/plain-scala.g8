name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
