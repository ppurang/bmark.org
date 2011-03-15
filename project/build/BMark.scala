import sbt._

class BMark(info: ProjectInfo) extends DefaultWebProject(info) with IdeaProject {
  val liftJson = "net.liftweb" %% "lift-json" % "2.2" withSources()
  val scalatest = "org.scalatest" % "scalatest" % "1.3" % "test" withSources()

  val scalaToolsRepo = "scala tools repo" at "http://www.scala-tools.org/repo-releases"

  val mavenLocal = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"
  val ivyLocal = "Local Ivy Repository" at "file://" + Path.userHome + "/.ivy2/cache"
}
