package com.github.aitrescueboss.deep_learning_practices.chap02.layer

import org.nd4j.linalg.factory.Nd4j
import org.nd4s.Implicits._

/**
 * p.27のAND()実装.
 */
case class AndLayer() extends Layer {
  override def forward(a1: Double, a2: Double): Int = {
    val tInputs = Array(a1, a2).toNDArray
    val tWeights = Array(0.5, 0.5).toNDArray
    val tBias = -0.7

    val tWeightedSumArray = Nd4j.sum(tWeights * tInputs) + tBias
    val tWeightedSum = tWeightedSumArray.getFloat(0,0)

    if (tWeightedSum <= 0)
      0
    else
      1
  }
}

/**
 * 同 NAND()実装.
 */
case class NandLayer() extends Layer {
  override def forward(a1: Double, a2: Double): Int = {
    val tInputs = Array(a1, a2).toNDArray
    val tWeights = Array(-0.5, -0.5).toNDArray
    val tBias = 0.7

    val tWeightedSumArray = Nd4j.sum(tWeights * tInputs) + tBias
    val tWeightedSum = tWeightedSumArray.getFloat(0,0)

    if (tWeightedSum <= 0)
      0
    else
      1
  }
}

/**
 * 同 OR()実装.
 */
case class OrLayer() extends Layer {
  override def forward(a1: Double, a2: Double): Int = {
    val tInputs = Array(a1, a2).toNDArray
    val tWeights = Array(0.5, 0.5).toNDArray
    val tBias = -0.2

    val tWeightedSumArray = Nd4j.sum(tWeights * tInputs) + tBias
    val tWeightedSum = tWeightedSumArray.getFloat(0,0)

    if (tWeightedSum <= 0)
      0
    else
      1
  }
}