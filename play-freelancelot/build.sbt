name := """play-freelancelot"""
organization := "com.freelancelot"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies += guice

libraryDependencies ++= Seq(
  javaWs
)

libraryDependencies += ehcache

libraryDependencies += ws

libraryDependencies += "org.mockito" % "mockito-core" % "4.4.0" % "test"