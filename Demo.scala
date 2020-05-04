object Demo {

	def main(args: Array[String]) = {		

		var arr = Array(1, 2, 3, 4)

		printall(arr)
	}

	def add(n1: Int, n2: Int) : Int = {
		return n1 + n2;
	}

	def printall(args: Array[Int]) = {

		for(i <- args)
			println(args(i))
	}

}