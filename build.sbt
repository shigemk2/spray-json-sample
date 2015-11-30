organization  := "com.example"

version       := "0.1"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "repo.typesafe.com" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  Seq(
    "io.spray"            %%  "spray-json"    % "1.3.2"
  )
}
