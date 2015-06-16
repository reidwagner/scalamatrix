package packomatrices
import packomatrices.Matrix

object Main{
	def main(args: Array[String]) = {
		val m = new Matrix(Vector(Vector(1,2,3,75,1,40,2,4),Vector(3,4,20,2,4,6,1,3),Vector(1,6,3,7,2,7,9,1)))	
		val trans = m.transpose
		println("original: ")
		m.disp
		println("transposed: ")
		trans.disp
		
	}
}
