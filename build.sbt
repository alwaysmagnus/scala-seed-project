import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.alwaysmagnus",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Scala Seed Project",
    libraryDependencies ++= Seq(scalaTest % Test,
      "org.apache.spark" %% "spark-sql" % "2.3.0"
    )
  )
