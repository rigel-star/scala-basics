object forloop {

	def main(args: Array[String]) = {

		var list: Seq[Int] = Seq(1, 2, 3, 4,  5, 6)

		printSeq(list)
	}


	private def printSeq(seq: Seq[Int]) = {

		for(element <- seq) println(element)
	}
}