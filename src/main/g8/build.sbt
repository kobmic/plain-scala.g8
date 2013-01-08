name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test",
  "org.specs2" %% "specs2" % "1.13" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)