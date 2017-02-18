name := "scalaapps"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.16",
  "org.scala-lang" % "scala-actors" % "2.11.8",
  "org.apache.kafka" % "kafka_2.11" % "0.10.1.1",
  "org.postgresql" % "postgresql" % "9.4.1212.jre6"
)
