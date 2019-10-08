// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "scala-ctakes",

    // https://mvnrepository.com/artifact/org.apache.ctakes/ctakes-clinical-pipeline
    libraryDependencies += "org.apache.ctakes" % "ctakes-clinical-pipeline" % "4.0.0" 
  )
