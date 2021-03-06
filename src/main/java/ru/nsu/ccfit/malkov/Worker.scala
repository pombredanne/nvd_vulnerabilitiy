package ru.nsu.ccfit.malkov

import io.{OntoboxInserter, XmlWriter}
import model.VirusPrecedent
import netscanners.{NvdScanner, CveScanner}
import ru.nsu.ccfit.malkov.analysers.Analyser

/**
 * @author matveyka
 */
object Worker {
  def main(args: Array[String]) {
    NvdScanner(args(0)) setPostgreUser args(1) setPostgrePasswd args(2) initializeAdapter() run()
    //new Analyser().analyseFromFile("./results/CVE-2014-0058")
  }

}
