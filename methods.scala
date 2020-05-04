
import java.util.ArrayList;
import java.util.List;

object methods {

	def main(args: Array[String]) = {

		println(factorial(5))
	}


	def addition(n1: Int, n2: Int) : Int = {
		return n1 + n2
	}


	def factorial(n: Int) : Int = {

		if(n <= 1){
			return 1
		}

		return n * factorial(n - 1)
	}
}