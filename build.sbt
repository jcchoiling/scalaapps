name := "scalaapps"

version := "1.0"

scalaVersion := "2.11.8"

val kafkaVersion = "0.10.1.1"
val scalaActorVersion = "2.11.8"

libraryDependencies ++= Seq(
    "com.typesafe.akka" % "akka-actor_2.11" % "2.4.16",
    "org.scala-lang" % "scala-actors" % scalaActorVersion,
    "org.postgresql" % "postgresql" % "9.4.1212.jre6"
)




