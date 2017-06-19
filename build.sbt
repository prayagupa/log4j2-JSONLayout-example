name := "log4j2-jsonlayout-example"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.mavenLocal

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.8.2"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.8.2"

libraryDependencies += "com.log4j2.jsonised" % "log4j2-jsonised" % "1.0.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"