
package demo.som.view

import javax.swing._
import java.awt._

import myutils.debug.Debug
import myutils.lang.Worker

object MainFrame {
  /**
   * Launch the application.
   */
  def start(title: String) {
    EventQueue.invokeLater(new Runnable {
      override def run(): Unit = {
        try {
          val window = new MainFrame()
          window.frame.setVisible(true)
          Worker.forkAndStart({
            window.contentPane.contentPanel.somCanvas.start()
          }, 1000)
        } catch {
          case e: Exception => Debug.loge("MainFrame", e)
        }
      }
    })
  }
}

class MainFrame {
  private var frame: JFrame = null
  val contentPane: MainPanel = new MainPanel

  /**
   * Create the application.
   */
  def this(title: String) {
    this()
    initialize(title)
  }

  /**
   * Initialize the contents of the frame.
   */
  private def initialize(title: String) {
    frame = new JFrame(title)
    frame.setBounds(100, 100, 800, 600)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setContentPane(contentPane)
  }
}