package com.polysoft

import org.chasen.mecab.Tagger

object MecabSample {
  def main(args: Array[String]) = {
    System.load("/Users/kenta/Documents/workspace_lib/mecab-java-0.996/libMecab.dylib")
    val tagger = Tagger.create("-d /usr/local/lib/mecab/dic/mecab-ipadic-neologd")
    println(tagger.parse("アラレちゃん"))
  }
}
