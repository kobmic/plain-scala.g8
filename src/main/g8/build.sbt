name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "2.3.7" % "test",
  "org.scalatest" %% "scalatest" % "2.0" % "test"
)
