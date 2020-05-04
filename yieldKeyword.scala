object yieldKeyword {

	def main(args: Array[String]) = {

		val names = List("ramesh", "june", "maya", "hello")

		//what yield keyword does is, it returns the foreach element by doing some work on it
		//like below newNames var is storing every element that is yield in for loop
		val newNames = for(name <- names) yield {
			
			name.drop(1).capitalize
		}
		
		newNames.foreach(println)
	}
}