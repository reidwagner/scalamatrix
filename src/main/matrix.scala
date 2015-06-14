//Supports only 2x2

package packomatrices{

class Matrix(rows: Vector[Vector[Float]]){
	type T
	val N = rows.size
	val M = rows(0).size
		
	def transpose: Matrix = new Matrix(Vector(Vector(rows(0)(0),rows(1)(0)),Vector(rows(0)(1),rows(1)(1))))

//	def operate(operand: Matrix): Matrix = ne

	def disp: Unit = rows.foreach((v: Vector[Float]) => println(vts(v)))
	
	def vts(v: Vector[Float]): String = v match{
		case _ if v.size == 1 => (v(0).toString + " ") 
		case _ => (v(0).toString + " " + (vts (v.tail)))  
	}	
}
}

