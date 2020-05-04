object anonymousFunc {

	def main(args: Array[String]) = {


		//Any is as like Object class in Java
		//list can also take anonymous functions
		var list: List[Any] = List("a string", true, 1.2, 45, () => "hello this is anonymous function")

		list.foreach(e => println(e))

		//anonymous function
		def name = println("Warning plz go back")
	}
}