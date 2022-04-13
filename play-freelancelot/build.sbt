name := """play-freelancelot"""
organization := "com.freelancelot"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

lazy val akkaVersion = "2.6.18"

scalaVersion := "2.13.8"

libraryDependencies += guice

libraryDependencies ++= Seq(
  javaWs,
 "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
 "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion,
 "ch.qos.logback" % "logback-classic" % "1.2.3"
)
libraryDependencies += "org.mockito" % "mockito-core" % "4.1.0" % "test"

libraryDependencies += ehcache

libraryDependencies += ws

jacocoExcludes := Seq(
  "controllers.Reverse*",
  "controllers.javascript.*",
  "Module",
  "router.Routes*",
  "*.routes*"
)