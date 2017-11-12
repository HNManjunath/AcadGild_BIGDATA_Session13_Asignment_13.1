package com
object calGCD {
  def CalGCD(num1: Int, num2: Int): Int = {
    if (num2 != 0) {
      CalGCD(num2, num1 % num2);
    } else {
      num1;
    }
  }

  def main(args: Array[String]) {

    print("Enter num1 : ");
    val num1 = scala.io.StdIn.readInt();

    print("Enter num2 : ");
    val num2 = scala.io.StdIn.readInt();

    println("GCD is of 2 numbers is : "
      + CalGCD(num1, num2));

  }
}