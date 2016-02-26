name := "scalajs-facebook"

version := "2.5"

scalaVersion := "2.11.7"

lazy val root = project in file(".") enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "utest" % "0.3.1"
)