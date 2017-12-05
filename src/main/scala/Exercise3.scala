import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import java.util.TimeZone

import scala.collection.{JavaConverters, mutable}
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Exercise3 extends App {

  def randomIntegersArray(size : Int): Array[Int] = {
    new Array[Int](size).map(_ => Random.nextInt(size))
  }

  def adjacentSwap(array : Array[Int]) : Array[Int] = {
    for (i <- array.indices if i % 2 == 0) {
      if (i + 1 < array.length) {
        val tmp = array(i)
        array(i) = array(i + 1)
        array(i + 1) = tmp
      }
    }
    array
  }

  def adjacentSwapYield(array: Array[Int]) : Array[Int] = {
    (for (i <- array.indices) yield
      if (i % 2 == 0 && i + 1 == array.length) array(i)
      else if (i % 2 == 0) array(i + 1)
      else array(i - 1)
      ).toArray
  }

  def positiveToNegativeOriginalSort(array : Array[Int]) : Array[Int] = {
    array.filter(i => i > 0) ++ array.filter(i => i <= 0)
  }

  def computeAverage(array : Array[Double]) : Double = {
    array.sum  / array.length
  }

  def rearrange(array : Array[Int]) : Array[Int] = {
    array.sortWith(_ > _)
  }

  def rearrange(buffer : ArrayBuffer[Int]) : ArrayBuffer[Int] = {
    buffer.sortWith(_ > _)
  }

  def removeDuplicates(array : Array[Int]) : Array[Int] = {
    array.distinct
  }

  def removeNegativeElementsExceptFirst(buffer : ArrayBuffer[Int]) : ArrayBuffer[Int] = {
    val positionOfNegatives = buffer.indices.filter(i => buffer(i) < 0).drop(1).reverse
    for (i <- positionOfNegatives.indices) buffer.remove( positionOfNegatives(i))
    buffer
  }

  def availableAmericaTimezones() : Array[String] = {
    val america = "America/"
    TimeZone.getAvailableIDs.filter(_.startsWith(america)).map(_.stripPrefix(america))
  }

  def datatransfer() : mutable.Buffer[String] = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    JavaConverters.asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
  }
}
