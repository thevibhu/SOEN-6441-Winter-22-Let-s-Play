name := """play-freelancelot"""
organization := "com.freelancelot"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies += guice

libraryDependencies ++= Seq(
  javaWs
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