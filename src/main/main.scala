package packomatrices
import packomatrices.Matrix

object Main{
	def main(args: Array[String]) = {
		val m = new Matrix(Vector(Vector(1,2,3,75,1,40,2,4),Vector(3,4,20,2,4,6,1,3),Vector(1,6,3,7,2,7,9,1)))	
		val a = new Matrix(Vector(Vector(0,1), Vector(1,0)))
		val b = new Matrix(Vector(Vector(1), Vector(2)))

		val trans = m.transpose
		println("original: ")
		m.disp
		println("transposed: ")
		trans.disp
		print("row 2: "); println(m.row(2))
		print("column 2: "); println(m.column(2))
	
		val acted = a.operate(b)
		a.disp
		b.disp
		acted.disp
	}

}
