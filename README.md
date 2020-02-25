# Default values for options (orEmpty)

Default values for options avoid repeating the same `getOrElse` code again and again : 

```scala
import io.github.hamsters.EmptyOptionValues._

val noneString: Option[String] = None
noneString.orEmpty  // ""

val noneInt: Option[Int] = None
noneInt.orEmpty // 0 

val noneList: Option[List[String]] = None
noneList.orEmpty  // List[String]()
```

To support other types, you have to declare a new implicit monoid for this types.

Example with the BigDecimal type (already supported) : 
 
 ```scala
implicit val bigDecimalMonoid: Monoid[BigDecimal] = new Monoid[BigDecimal] {
  // method used by orEmpty
  override def empty: BigDecimal = BigDecimal(0)
  
  override def compose(l: BigDecimal, r: BigDecimal): BigDecimal = l + r
}
```

# Install

Add this to you build.sbt : 

```scala
resolvers += Resolver.bintrayRepo("loicdescotte", "Hamsters") 
libraryDependencies += "io.github.scala-hamsters" % "orEmpty" % "1.0.0"
```

