package packomatrices
import packomatrices.Matrix

object Main{
	def main(args: Array[String]) = {
		val m = new Matrix(Vector(Vector(1,2),Vector(3,4)))	
		val trans = m.transpose
		println("original: ")
		m.disp
		println("transposed: ")
		trans.disp
		
	}
}
