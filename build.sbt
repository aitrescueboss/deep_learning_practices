name := "deep_learning_practices"

version := "1.0"

scalaVersion := "2.11.4"

// ND4S: ND4JのScalaバインディング.
// Scala 2.11.xとnd4j 0.8.0の組み合わせでないと，
// 今(2017/5/28現在)は依存解決できないっぽい
val nd4jVersion = "0.8.0"
val dl4jVersion = "0.8.0"

libraryDependencies ++= Seq(
  "org.deeplearning4j" % "deeplearning4j-core" % dl4jVersion,
  "org.nd4j" %% "nd4s" % nd4jVersion,
  "org.nd4j" % "nd4j-native" % nd4jVersion classifier "" classifier "macosx-x86_64"
)

// ScalaTest
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// SLF4J
// Javaの各種ロギングサービスの抽象ファサードとか何とか
// (これを追加しとかないとND4Jで怒られる)
// 以下メモ:
//    適当なjarをbuild.sbtの管理下に置きたい時は
//    lib/ディレクトリを掘ってその下において完了.
libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.25",
  "org.slf4j" % "slf4j-simple" % "1.7.25")