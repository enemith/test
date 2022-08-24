package com.example.myapplication

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RubiksCubeTest {
    private lateinit var rubiksCube: RubiksCube
    @Before
    fun setUp() {
        rubiksCube = RubiksCube()
    }
    @Test
    fun `生成テスト`() { // z,y,x ?
        println(rubiksCube.cubes[0][0][0].number)
        println(rubiksCube.cubes[1][0][0].number)
        println(rubiksCube.cubes[0][1][0].number)
        println(rubiksCube.cubes[0][0][1].number)
    }

    @Test
    fun `成功するテスト`() {
        var result = true
        assert(result)
    }
//    @Test
//    fun `失敗するテスト`() {
//        var result = false
//        assert(result)
//    }

    @After
    fun tearDown() {

    }
}