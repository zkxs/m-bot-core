import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.6"
    )),
    organization := "net.michaelripley",
    name := "m-bot-module-api",
    version := "0.1.1-SNAPSHOT",
    resolvers ++= extraResolvers,
    libraryDependencies ++= testLibraries,
    libraryDependencies ++= dependencies,
    scalacOptions ++= Seq("-unchecked", "-deprecation")
  )
