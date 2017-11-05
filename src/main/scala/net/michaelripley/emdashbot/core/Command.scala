package net.michaelripley.emdashbot.core

/** A command invoked from a chat message (e.g. !kick DingusDave#1234)
  */
trait Command {
  /** @return Usage information for this command
    */
  def usage: String

  /** @return The name of this command
    */
  def name: String

  /** @return Aliases for this command
    */
  def aliases: Iterable[String]
}
