package com.github.aitrescueboss.deep_learning_practices.chap02.layer

import org.scalatest.FunSuite

/**
 *
 */
class AndLayerTest extends FunSuite {

  test("AND") {
    val tAddLayer = AndLayer()
    val tActual_0_and_0 = tAddLayer.forward(0.0, 0.0)
    val tActual_0_and_1 = tAddLayer.forward(0.0, 1.0)
    val tActual_1_and_0 = tAddLayer.forward(1.0, 0.0)
    val tActual_1_and_1 = tAddLayer.forward(1.0, 1.0)

    assert(tActual_0_and_0 == 0)
    assert(tActual_0_and_1 == 0)
    assert(tActual_1_and_0 == 0)
    assert(tActual_1_and_1 == 1)
  }

  test("OR") {
    val tOrLayer = OrLayer()
    val tActual_0_and_0 = tOrLayer.forward(0.0, 0.0)
    val tActual_0_and_1 = tOrLayer.forward(0.0, 1.0)
    val tActual_1_and_0 = tOrLayer.forward(1.0, 0.0)
    val tActual_1_and_1 = tOrLayer.forward(1.0, 1.0)

    assert(tActual_0_and_0 == 0)
    assert(tActual_0_and_1 == 1)
    assert(tActual_1_and_0 == 1)
    assert(tActual_1_and_1 == 1)
  }

  test("NAND") {
    val tNandLayer = NandLayer()
    val tActual_0_and_0 = tNandLayer.forward(0.0, 0.0)
    val tActual_0_and_1 = tNandLayer.forward(0.0, 1.0)
    val tActual_1_and_0 = tNandLayer.forward(1.0, 0.0)
    val tActual_1_and_1 = tNandLayer.forward(1.0, 1.0)

    assert(tActual_0_and_0 == 1)
    assert(tActual_0_and_1 == 1)
    assert(tActual_1_and_0 == 1)
    assert(tActual_1_and_1 == 0)
  }
}
