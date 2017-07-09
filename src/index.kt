import org.w3c.dom.HTMLElement
import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "hello kotlin/javascript world!"
    println(message)
    printToDom(message)
    printToDom(message)
    printToDom(message)
    printToDom(message)
    printToDom(message)
}

private fun printToDom(message: String) {
    val content = document.getElementById("content") as HTMLElement
    content.textContent = "${content.textContent} $message"
}