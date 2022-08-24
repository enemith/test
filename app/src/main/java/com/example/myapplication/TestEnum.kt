package com.example.myapplication

//============================================================
// ルービックキューブをコードで再現できるか？
//============================================================
fun create() {

}
enum class Color() {
    WHITE,
    RED,
    BLUE,
    ORANGE,
    GREEN,
    YELLOW,
    LESS // 色あっても問題ない可能性あり
}
class Cube(
    val number: Int,
    var top: Color = Color.WHITE,
    var leftSide: Color = Color.ORANGE,
    var front: Color = Color.GREEN,
    var rightSide: Color = Color.RED,
    var back: Color = Color.BLUE,
    var bottom: Color = Color.YELLOW) {

    fun rotateForward(): Cube { // 手前側に回転
        val temporary = top
        top = back
        back = bottom
        bottom = front
        front = temporary
        return this
    }

    fun rotateBack(): Cube { // 奥側に回転
        val temporary = top
        top = front
        front = bottom
        bottom = back
        back = temporary
        return this
    }

    fun rotateRight(): Cube { // 右方向に回転
        val temporary = front
        front = leftSide
        leftSide = back
        back = rightSide
        rightSide = temporary
        return this
    }

    fun rotateLeft(): Cube { // 左方向に回転
        val temporary = front
        front = rightSide
        rightSide = back
        back = leftSide
        leftSide = temporary
        return this
    }
}
class RubiksCube { // xyz
//    var cubes = Any()
    var cubes :MutableList<MutableList<MutableList<Cube>>>
    init {
        var rowOfcubes1 = mutableListOf(Cube(1), Cube(2), Cube(3))
        var rowOfCubes2 = mutableListOf(Cube(4), Cube(5), Cube(6))
        var rowOfCubes3 = mutableListOf(Cube(7), Cube(8), Cube(9))
        var planeOfCubes1 = mutableListOf(rowOfcubes1, rowOfCubes2, rowOfCubes3)
        var rowOfcubes4 = mutableListOf(Cube(10), Cube(11), Cube(12))
        var rowOfcubes5 = mutableListOf(Cube(13), Cube(14), Cube(15))
        var rowOfcubes6 = mutableListOf(Cube(16), Cube(17), Cube(18))
        var planeOfCubes2 = mutableListOf(rowOfcubes4, rowOfcubes5, rowOfcubes6)
        var rowOfcubes7 = mutableListOf(Cube(19), Cube(20), Cube(21))
        var rowOfcubes8 = mutableListOf(Cube(22), Cube(23), Cube(24))
        var rowOfcubes9 = mutableListOf(Cube(25), Cube(26), Cube(27))
        var planeOfCubes3 = mutableListOf(rowOfcubes7, rowOfcubes8, rowOfcubes9) // 底面
        cubes = mutableListOf(planeOfCubes1, planeOfCubes2, planeOfCubes3)
    }
    fun create() {
    }

    fun getNumberOfGreenPlane() {

    }

    fun rotateGreenPlaneRight() {
        var outerCubes = listOf(cubes[0][0][0], cubes[0][0][1], cubes[0][0][2],
            cubes[1][0][2], cubes[2][0][2], cubes[2][0][1], cubes[2][0][0], cubes[1][0][0])
        cubes[0][0][2] = outerCubes[0].rotateRight()
        cubes[1][0][2] = outerCubes[1].rotateRight()
        cubes[2][0][2] = outerCubes[2].rotateRight()
        cubes[2][0][1] = outerCubes[3].rotateRight()
        cubes[2][0][0] = outerCubes[4].rotateRight()
        cubes[1][0][0] = outerCubes[5].rotateRight()
        cubes[0][0][0] = outerCubes[6].rotateRight()
        cubes[0][0][1] = outerCubes[7].rotateRight()
        cubes[1][0][1].rotateRight() // やらなくてもいい説

//        var rowOfCubes1 = listOf(cubes[0][0][0],cubes[0][0][1],cubes[0][0][2])
//        var rowOfCubes2 = listOf(cubes[1][0][0],cubes[1][0][1],cubes[1][0][2])
//        var rowOfCubes3 = listOf(cubes[2][0][0],cubes[2][0][1],cubes[2][0][2])
//        var planeOfCubes = listOf(rowOfCubes1, rowOfCubes2, rowOfCubes3)
//
//        var leftSideCubes:ArrayList<Cube> = ArrayList()
//        for (i in 0..2) { leftSideCubes.add(planeOfCubes[0][i]) }
//        var topCubes:ArrayList<Cube> = ArrayList()
//        for (i in 0..2) { topCubes.add(planeOfCubes[i][2]) }
//        var rightSideCubes:ArrayList<Cube> = ArrayList()
//        for (i in 2..0) { rightSideCubes.add(planeOfCubes[2][i]) }
//        var bottomCubes:ArrayList<Cube> = ArrayList()
//        for (i in 2..0) { bottomCubes.add(planeOfCubes[i][0]) }
//
//        var planeOfCubes2 =

            // .rotateRight()を忘れずに
    }

}


//============================================================
// 麻雀の役をコードで再現できるか？
//============================================================
enum class TestEnum {

}

fun createCard(): Boolean {

    return true
}

class Card(val type: CardType, val value: Any) {
}
// 牌の種類
enum class CardType(val string: String, val shortStr: String, val sound: String) {
    MANZU("萬子","萬", "マン"),
    SOHZU("索子", "索", "ソー"),
    PINZU("筒子", "筒" ,"ピン"),
    FONPAI("風牌", "",""),
    SANGENPAI("三元牌", "","")
}


enum class Num(val string: String, val sound: String) {
    ONE("一", "イー"),
    TWO("二","リャン"),
    THREE("三","サン"),
    FOUR("四","スー"),
    FIVE("五","ウー"),
    SIX("六","ロー"),
    SEVEN("七","パー"),
    EIGHT("八","キュー")
}

enum class Fon(val string: String, val sound: String) {
    TON("東","トン"),
    NAN("南","ナン"),
    SHA("西","シャー"),
    PEI("北","ペー")
}
enum class Sangen(val string: String, val sound: String) {
    HAKU("白","ハク"),
    HATSU("發","ハツ"),
    CHUN("中","チュン")
}

// 数牌 or 字牌
// ヤオチュー牌(1,9,字牌) or 中張牌
// 牌は34種類、各4牌