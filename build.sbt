name := "log4j2-jsonlayout-example"

version := "1.0"

scalaVersion := "2.12.1"

//libraryDependencies += "net.json.log4j2" % "log4j2-jsonlayout" % "4.1.0"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.5"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.5"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

resolvers += Resolver.mavenLocal

mainClass in (Compile,run) := Some("com.dontcome.Bootstrap")
