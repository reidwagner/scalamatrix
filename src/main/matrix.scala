//Supports NxM

package packomatrices{

class Matrix(rows: Vector[Vector[Float]]){
	type T
	val N = rows.size
	val M = rows(0).size
	
//	def initempty

	def row(n: Int): Vector[Float] = rows(n-1)

	def column(m: Int): Vector[Float] = transpose.row(m)

	def transpose: Matrix = {
		var outer = Vector.fill(M,N)(0.0f) //Not functional
		for (m <- 0 to (M-1)){
			var inner: Vector[Float] = outer(m)
			for (n <- 0 to (N-1)){
				inner = inner.updated(n,rows(n)(m))
			}
			outer = outer.updated(m,inner)
		}	
		new Matrix(outer)
	}

	def operate(opd: Matrix): Matrix = {
		var outer = Vector.fill(N,opd.M)(0.0f)
		for (n <- 0 to (N-1)){
			var inner: Vector[Float] = outer(n)
			for (m <- 0 to (opd.M-1)){
				val vr = row(n+1); val oc = opd.column(m+1)
				inner = inner.updated(m,(0.0f /: (for ((a, b) <- vr zip oc )yield a * b)) (_ + _))
			}
			outer = outer.updated(n,inner)
		}
		new Matrix(outer)
	}

	def disp: Unit = rows.foreach((v: Vector[Float]) => println(vts(v)))
	
	def vts(v: Vector[Float]): String = v match{
		case _ if v.size == 1 => (v(0).toString + " ") 
		case _ => (v(0).toString + " " + (vts (v.tail)))  
	}	
}
}

