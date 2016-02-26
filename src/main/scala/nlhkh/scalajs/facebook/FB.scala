package nlhkh.scalajs.facebook

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by kha on 2/26/16.
  */
@js.native
object FB extends js.Object {
  def getLoginStatus(callback: js.Function1[LoginStatus, Unit]): Unit = js.native

  def getAuthResponse(callback: js.Function1[AuthResponse, Unit]): Unit = js.native

  def login(callback: js.Function1[LoginStatus, Unit]): Unit = js.native

  def login(callback: js.Function1[LoginStatus, Unit], scopes: LoginScopes): Unit = js.native

  def logout(callback: js.Function1[LoginStatus, Unit]): Unit = js.native

  def api[R <: js.Object, P <: js.Object](path: String,
                                          method: String,
                                          params: P,
                                          callback: js.Function1[R, Unit]): Unit = js.native
}

@ScalaJSDefined
class LoginStatus(val status: js.UndefOr[String],
                  val authResponse: js.UndefOr[AuthResponse]
                 ) extends js.Object

@ScalaJSDefined
class AuthResponse(val accessToken: String,
                   val expiresIn: Int,
                   val signedRequest: String,
                   val userID: String) extends js.Object

@ScalaJSDefined
class LoginScopes(scopes: String) extends js.Object

object LoginScopes {
  def apply(scopes: Seq[String]) = new LoginScopes(scopes mkString ",")
}

object ApiMethods {
  lazy val GET = "GET"
  lazy val POST = "POST"
  lazy val DELETE = "DELETE"
}