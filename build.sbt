name := "trippy"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "3.0.5",
  "org.twitter4j" % "twitter4j-stream" % "3.0.5",
  "org.scalatest" % "scalatest_2.11" % "2.2.2",
  "com.typesafe" % "config" % "1.3.1",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "com.socrata" % "soda-consumer-scala_2.11" % "2.0.0"
)