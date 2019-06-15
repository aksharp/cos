name := "cos"

version := "0.1"

scalaVersion := "2.11.12"



PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

//libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"

PB.protocVersion := "-v380"