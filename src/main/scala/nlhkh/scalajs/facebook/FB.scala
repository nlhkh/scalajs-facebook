package nlhkh.scalajs.facebook

import scala.scalajs.js

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

  def api[T <: js.Object](path: String, callback: js.Function1[T, Unit]): Unit = js.native
}

@js.native
class LoginStatus(val status: js.UndefOr[String],
                  val authResponse: js.UndefOr[AuthResponse]
                 ) extends js.Object

@js.native
class AuthResponse(val accessToken: String,
                   val expiresIn: Int,
                   val signedRequest: String,
                   val userID: String) extends js.Object

@js.native
class LoginScopes(scopes: String) extends js.Object

object LoginScopes {
  def apply(scopes: Seq[String]) = new LoginScopes(scopes mkString ",")
}
