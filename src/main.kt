fun main(args:Array<String>){
    println("Для одномерных массивов введите 1 для двумерных введите 2")
    val cont = readLine()!!.toInt()
    if(cont == 1){
        mas1()
    }
    else if (cont == 2){
        mas2()
    }
    else{
        print("вы ошиблись")
    }
}
fun mas1(){
    val size = 10
    val array = IntArray(size){i -> (Math.random() * 100).toInt()}
    println("Массив =  ${array.joinToString()}")
    println("Введите нижний порог промежутка")
    val a = readLine()!!.toInt()
    println("Введите верхний порог промежутка")
    val b = readLine()!!.toInt()
    if (a > b){
        println("B должно быть строго больше A")
    }
    else{
        val filtermas = array.filter{it in a..b }
        println("Фиальный массив = ${filtermas.joinToString()}")
    }
}
fun mas2(){
    val rows = 5
    val cols = 5
    val array = Array(rows) { Array(cols) { (Math.random() * 200 - 100).toInt() } }
    for (row in array) {
        println(row.joinToString())
    }

    val filltr = array.map{it[1]}.filter { it>10 }
    val sum = filltr.sum()
    println("Сумма 2 столбца больше 10 = ${sum}")

    val filltr1 = array.map{it[3]}.filter { it<100 }
    val sum1 = filltr1.sum()
    println("Сумма 4 столбца меньше 100 = ${sum1}")

    val filltr2 = array[3]
    val count1 = filltr2.filter{it < 5}.size
    println("Кол-во элементов 4 строки меньше 5 = ${count1}")

    val filltr3 = array.map{it[1]}.filter { it > 15 }.size
    println("Кол-во элементов второго столбца больше 15 = ${filltr3}")

}