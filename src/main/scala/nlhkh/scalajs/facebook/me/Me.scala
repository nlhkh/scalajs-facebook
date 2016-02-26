package nlhkh.scalajs.facebook.me

import nlhkh.scalajs.facebook.{ApiMethods, FB}
import nlhkh.scalajs.facebook.me.Me.{AboutMe, AboutMeParams}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by kha on 2/26/16.
  */
class Me {
  def me(params: AboutMeParams,
         callback: js.Function1[AboutMe, Unit]): Unit = FB.api[AboutMe, AboutMeParams]("/me", ApiMethods.GET, params, callback)
}

object Me {

  @ScalaJSDefined
  class AboutMe(val name: String,
                val id: String) extends js.Object

  @ScalaJSDefined
  class AboutMeParams(fields: String) extends js.Object

}


