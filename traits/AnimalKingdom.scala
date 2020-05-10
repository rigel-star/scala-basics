object AnimalKingdom {

	def main(args: Array[String]) = {

		var dog = new Dog("Woof woof")
		println(s"Type ${dog.makeSound}")

		var rpanda = new RedPanda("\nMoooohh")
		println(s"Name: ${rpanda.name}")
		println(s"Type: ${findType(rpanda)}")
		println(s"Count left: ${rpanda.countLeft}")
		println(s"Sound: ${rpanda.makeSound}")

	}

	def findType(animal: Animal) = animal.animalType
}



class Dog(var sound: String) extends Animal {

	def this(){
		this("No sound");
	}

	def makeSound() = println(sound)
	
	def walk() = println("Dog is walking")
	
	def animalType() = "Domestic"
}


class RedPanda(var sound: String) extends RareAnimal {

	def this(){
		this("No sound")
	}

	def makeSound() = println(sound)

	def walk() = println("Red panda is waling")

	def animalType() = "Wild"

	def countLeft() = 10000

	def name() = "Red panda"
}


trait Animal {

	def makeSound() : Unit
	def walk() : Unit
	def animalType() : String
}


trait RareAnimal extends Animal {

	def countLeft() : Int
	def name() : String
}