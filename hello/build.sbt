lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
libraryDependencies += "io.reactivex" %% "rxscala" % "0.24.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "0.9.2"
