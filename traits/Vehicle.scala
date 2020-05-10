object Vehicle {

	def main(args: Array[String]) = {

		var jeep = new Jeep(45)
		printf("Jeep model: %s\n", jeep.modelName())
		jeep.capacity()

		var bike = new Bike(60)
		printf("\nBike model: %s ", bike.modelName())
	}
}



class Bike(millage: Int) extends AutoMobile {

	def this(){
		this(45)
	}

	def getType() = "Bike"
	def modelName() = "KTM DUKE 100"
	def millage() = millage
}



class Jeep(millage: Int) extends TransportMedium with AutoMobile {

	def this(){
		this(45)
	}

	def getType() = "Jeep (made for goods transportation)"
	def modelName() = "RTX 100"
	def millage() = millage

	override def capacity(sit: Int = 6) = {
		printf("Sit capacity of %d", sit)
	}
}



class TransportMedium() {

	def capacity(sit: Int) = {
		printf("Sit capacity of: %d", sit)
	}
}

trait AutoMobile {

	def getType() : String
	def modelName() : String
	def millage () : Int
}
