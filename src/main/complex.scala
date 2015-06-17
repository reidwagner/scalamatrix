//stackoverflow
package packomatrices{
//

case class ComplexNumber(re: Float, im: Float){
	def +(that: ComplexNumber) = ComplexNumber(re + that.re, im + that.im)
	def -(that: ComplexNumber) = ComplexNumber(re - that.re, im - that.im)
	def *(that: ComplexNumber) = ComplexNumber(re*that.re - im*that.im, re*that.im + im*that.re)
}

//implicit def intToComplec(i: Int): ComplexNumber = ComplexNumber(i, 0)

object I extends ComplexNumber(0, 1)


}
