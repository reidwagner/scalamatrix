//Supports NxM

package packomatrices{

class Matrix(rows: Vector[Vector[Float]]){
	type T
	val N = rows.size
	val M = rows(0).size
	println(N);println(M)
	
//	def initEmpty:

	def transpose: Matrix = {
		var inner = Vector.fill(M,N)(0.0f) //Not functional
		for (m <- 0 to (M-1)){
			var temp: Vector[Float] = inner(m)
			for (n <- 0 to (N-1)){
				temp = temp.updated(n,rows(n)(m))
			}
			inner = inner.updated(m,temp)
		}	
		new Matrix(inner)
	}

//	def operate(operand: Matrix): Matrix = ne

	def disp: Unit = rows.foreach((v: Vector[Float]) => println(vts(v)))
	
	def vts(v: Vector[Float]): String = v match{
		case _ if v.size == 1 => (v(0).toString + " ") 
		case _ => (v(0).toString + " " + (vts (v.tail)))  
	}	
}
}

