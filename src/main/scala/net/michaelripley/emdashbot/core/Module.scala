package net.michaelripley.emdashbot.core

import net.dv8tion.jda.core.hooks.EventListener

/** A module consisting of commands and event listeners
  */
trait Module {

  /** @return All of the commands this module provides
    */
  def commands: Iterable[Command]

  /** @return If this module requires listening to custom events, it should provide a listener here.
    */
  def eventListener: Option[EventListener]
}
