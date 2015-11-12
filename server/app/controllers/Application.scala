package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

import services._
import models._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def allProfils = Action {
    //TODO
    Ok("")
  }

  /**
   * Controller to update a profil after validating JSON request body.
   * Use `/api/profil` as call endpoint from front end API.
   * @return the update profil
   */
  def updateProfil = Action(BodyParsers.parse.json)  { implicit request =>
    //TODO
    Ok("")
  }


}
