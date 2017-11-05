import sbt._

object Dependencies {

  lazy val dependencies = Seq(
    "net.dv8tion" % "JDA" % "3.3.1_295" % Provided
  )

  lazy val testLibraries: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.0.3"
  ).map(_ % Test)

  lazy val extraResolvers = Seq(
    Resolver.jcenterRepo
  )

}
