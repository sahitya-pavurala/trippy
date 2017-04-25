name := "trippy"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "3.0.5",
  "org.twitter4j" % "twitter4j-stream" % "3.0.5",
  "org.scalatest" % "scalatest_2.11" % "2.2.2",
  "com.typesafe" % "config" % "1.3.1"
)