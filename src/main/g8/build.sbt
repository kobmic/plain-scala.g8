name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
