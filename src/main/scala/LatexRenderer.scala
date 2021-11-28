import gitbucket.core.controller.Context
import gitbucket.core.plugin.{RenderRequest, Renderer}
import play.twirl.api.Html

class LatexRenderer extends Renderer {

  def render(request: RenderRequest): Html = {
    import request._
    Html(toHtml(fileContent)(context))
  }

  def shutdown(): Unit = {
  }

  def toHtml(content: String)(implicit context: Context): String = {

    s"""
       |<script type="module">
       |  import { LaTeXJSComponent } from "https://cdn.jsdelivr.net/npm/latex.js/dist/latex.mjs"
       |  customElements.define("latex-js", LaTeXJSComponent)
       |</script>
       |<latex-js>
       |$content
       |</latex-js>
       |""".stripMargin

  }
}
