package helpers

fun Helpers.writeClosestString(string: String): Long {
	val spot = if (vm.heap != null) {
		vm.heap!!.alloc(size = string.length + 1)
	} else throw NullPointerException("Expression 'vm.heap' must not be null")
	for (i in string.indices) {
		val ascii = string[i].code.toLong()
		vm.heap!!.set(i + spot, ascii)
	}
	vm.heap!!.set(spot + string.length, 0)
	return spot
}