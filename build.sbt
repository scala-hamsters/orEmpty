scalaVersion := "2.13.1"
name := "orEmpty"
organization := "io.github.scala-hamsters"
version := "1.0.0"

libraryDependencies ++= Seq(
    organization.value %% "hamsters-core" % version.value,
    "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)
